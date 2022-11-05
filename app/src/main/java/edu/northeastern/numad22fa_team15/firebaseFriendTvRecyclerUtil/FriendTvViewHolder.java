package edu.northeastern.numad22fa_team15.firebaseFriendTvRecyclerUtil;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.northeastern.numad22fa_team15.R;

public class FriendTvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemFriend;
    public FriendTvAdapter.OnFriendClickListener onFriendClickListener;

    public FriendTvViewHolder(@NonNull View itemView, FriendTvAdapter.OnFriendClickListener onFriendClickListener) {
        super(itemView);

        itemFriend = itemView.findViewById(R.id.friend_nameTV);

        this.onFriendClickListener = onFriendClickListener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onFriendClickListener.onFriendClick(getAdapterPosition());
    }
}
