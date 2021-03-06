package de.tum.in.tumcampusapp.component.ui.news;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import org.joda.time.DateTime;

import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.component.ui.overview.CardManager;
import de.tum.in.tumcampusapp.component.ui.overview.card.Card;
import de.tum.in.tumcampusapp.component.ui.overview.card.CardViewHolder;
import de.tum.in.tumcampusapp.utils.Const;
import de.tum.in.tumcampusapp.utils.DateTimeUtils;
import de.tum.in.tumcampusapp.utils.Utils;

/**
 * Shows important news
 */
public class TopNewsCard extends Card {
    private ImageView imageView;
    private ProgressBar progress;
    private Context context;

    public TopNewsCard(Context context) {
        super(CardManager.CARD_TOP_NEWS, context, "top_news");
        this.context = context;
    }

    public static CardViewHolder inflateViewHolder(ViewGroup parent) {
        return new CardViewHolder(LayoutInflater.from(parent.getContext())
                                                .inflate(R.layout.card_top_news, parent, false));
    }

    private void updateImageView() {
        String imageURL = Utils.getSetting(context, Const.NEWS_ALERT_IMAGE, "");
        if (imageURL.isEmpty() || imageView == null) {
            return;
        }
        Picasso.get()
               .load(imageURL)
               .into(imageView, new Callback() {
                   @Override
                   public void onSuccess() {
                       // remove progress bar
                       progress.setVisibility(View.GONE);
                   }

                   @Override
                   public void onError(Exception e) {
                       discardCard();
                   }
               });
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public Intent getIntent() {
        String url = Utils.getSetting(getContext(), Const.NEWS_ALERT_LINK, "");
        if (!url.isEmpty()) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        }

        // if there is not link don't react to clicks
        return null;

    }

    @Override
    public void updateViewHolder(@NonNull RecyclerView.ViewHolder viewHolder) {
        super.updateViewHolder(viewHolder);
        imageView = viewHolder.itemView.findViewById(R.id.top_news_img);
        progress = viewHolder.itemView.findViewById(R.id.top_news_progress);
        updateImageView();
    }

    @Override
    protected boolean shouldShow(SharedPreferences p) {
        // don't show if the showUntil date does not exist or is in the past
        String untilDateString = Utils.getSetting(context, Const.NEWS_ALERT_SHOW_UNTIL, "");
        DateTime until = DateTimeUtils.INSTANCE.parseIsoDateWithMillis(untilDateString);

        if (until == null) {
            return false;
        }
        return Utils.getSettingBool(context, CardManager.SHOW_TOP_NEWS, true)
               && until.isAfterNow();
    }

    @Override
    public void discard(@NonNull SharedPreferences.Editor editor) {
        Utils.setSetting(this.getContext(), CardManager.SHOW_TOP_NEWS, false);
    }
}
