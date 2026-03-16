package com.leyou.englishdictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leyou.englishdictionary.R;

public class SynonymViewHolder extends RecyclerView.ViewHolder {

    public TextView tvSynonyms;

    public SynonymViewHolder(@NonNull View itemView) {
        super(itemView);

        tvSynonyms = itemView.findViewById(R.id.tvSynonyms);
    }
}
