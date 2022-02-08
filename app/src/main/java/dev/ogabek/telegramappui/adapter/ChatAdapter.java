package dev.ogabek.telegramappui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.telegramappui.R;
import dev.ogabek.telegramappui.model.Chat;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    private final List<Chat> chatList;

    public ChatAdapter(Context context, List<Chat> chatList) {
        this.context = context;
        this.chatList = chatList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat chat = chatList.get(position);

        if (holder instanceof MessageViewHolder) {
            ((MessageViewHolder) holder).fullName.setText(chat.getFullName());
            ((MessageViewHolder) holder).profile.setImageResource(chat.getProfile());
            ((MessageViewHolder) holder).message.setText(chat.getMessage());
        }

    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    private static class MessageViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile;
        TextView fullName, message;

        public MessageViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            fullName = view.findViewById(R.id.tv_full_name);
            message = view.findViewById(R.id.tv_message);

        }
    }
}
