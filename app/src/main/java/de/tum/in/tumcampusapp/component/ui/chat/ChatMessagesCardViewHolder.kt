package de.tum.`in`.tumcampusapp.component.ui.chat

import android.view.View
import android.widget.TextView
import de.tum.`in`.tumcampusapp.R
import de.tum.`in`.tumcampusapp.component.ui.chat.model.ChatMessage
import de.tum.`in`.tumcampusapp.component.ui.overview.card.CardViewHolder
import kotlinx.android.synthetic.main.card_chat_messages.view.*

class ChatMessagesCardViewHolder(itemView: View) : CardViewHolder(itemView) {

    private var didBind = false

    fun bind(roomName: String, roomId: Int, roomIdStr: String, unreadMessages: List<ChatMessage>) {
        with(itemView) {
            chatRoomNameTextView.text = if (unreadMessages.size > 5) {
                context.getString(R.string.card_message_title, roomName, unreadMessages.size)
            } else {
                roomName
            }

            if (!didBind) {
                unreadMessages
                        .map { message ->
                            val memberName = message.member.displayName
                            context.getString(R.string.card_message_line, memberName, message.text)
                        }
                        .map { messageText ->
                            TextView(context).apply { text = messageText }
                        }
                        .forEach { textView ->
                            contentContainerLayout.addView(textView)
                        }
                didBind = true
            }
        }
    }

}