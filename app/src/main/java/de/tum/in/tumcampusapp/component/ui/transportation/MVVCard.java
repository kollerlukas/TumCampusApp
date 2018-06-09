package de.tum.in.tumcampusapp.component.ui.transportation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;

import java.util.List;

import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.component.ui.overview.card.Card;
import de.tum.in.tumcampusapp.component.ui.overview.card.CardViewHolder;
import de.tum.in.tumcampusapp.component.ui.transportation.model.efa.Departure;
import de.tum.in.tumcampusapp.component.ui.transportation.model.efa.StationResult;

import static de.tum.in.tumcampusapp.component.ui.overview.CardManager.CARD_MVV;

/**
 * Card that shows MVV departure times
 */
public class MVVCard extends Card {

    private static final String MVV_TIME = "mvv_time";
    private StationResult mStation;
    private List<Departure> mDepartures;

    MVVCard(Context context) {
        super(CARD_MVV, context, "card_mvv");
    }

    public static CardViewHolder inflateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void updateViewHolder(RecyclerView.ViewHolder viewHolder) {
        super.updateViewHolder(viewHolder);
        setMCard(viewHolder.itemView);
        setMLinearLayout(getMCard().findViewById(R.id.card_view));
        setMTitleView(getMCard().findViewById(R.id.card_title));
        getMTitleView().setText(mStation.getStation());
        getMCard().findViewById(R.id.place_holder)
                  .setVisibility(View.VISIBLE);

        //Remove old DepartureViews
        for (int i = 0; i < getMLinearLayout().getChildCount(); i++) {
            if (getMLinearLayout().getChildAt(i) instanceof DepartureView) {
                getMLinearLayout().removeViewAt(i);
                i--; // Check the same location again, since the childCount changed
            }
        }

        // Fetch transport favorites, can only be updated in the detailed view
        TransportController transportManager = new TransportController(getContext());
        for (int i = 0; i < mDepartures.size() && i < 5; i++) {
            Departure curr = mDepartures.get(i);
            DepartureView view = new DepartureView(getContext());
            if (transportManager.isFavorite(curr.getSymbol())) {
                view.setSymbol(curr.getSymbol(), true);
            } else {
                view.setSymbol(curr.getSymbol(), false);
            }
            view.setLine(curr.getDirection());
            view.setTime(curr.getDepartureTime());
            getMLinearLayout().addView(view);
        }
    }

    @Override
    public Intent getIntent() {
        if (mDepartures.isEmpty()) {
            return null;
        } else {
            return mDepartures.get(0).getIntent(getContext(), mStation);
        }
    }

    @Override
    protected void discard(Editor editor) {
        editor.putLong(MVV_TIME, System.currentTimeMillis());
    }

    @Override
    protected boolean shouldShow(SharedPreferences prefs) {
        final long prevDate = prefs.getLong(MVV_TIME, 0);
        return prevDate + DateUtils.HOUR_IN_MILLIS < System.currentTimeMillis();
    }

    public void setStation(StationResult station) {
        this.mStation = station;
    }

    public void setDepartures(List<Departure> departures) {
        this.mDepartures = departures;
    }

    @Override
    public RemoteViews getRemoteViews(Context context, int appWidgetId) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.cards_widget_card);
        remoteViews.setTextViewText(R.id.widgetCardTextView, mStation.getStation());
        remoteViews.setImageViewResource(R.id.widgetCardImageView, R.drawable.ic_mvv);
        return remoteViews;
    }

}
