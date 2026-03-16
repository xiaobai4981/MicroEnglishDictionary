package com.leyou.englishdictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leyou.englishdictionary.R;
import com.leyou.englishdictionary.ViewHolders.SynonymViewHolder;

import java.util.List;

public class SynonymAdapter extends RecyclerView.Adapter<SynonymViewHolder> {

    private final Context context;
    private final List<String> synonymsList;

    public SynonymAdapter(Context context, List<String> synonymsList){
        this.context = context;
        this.synonymsList = synonymsList;
    }

    @NonNull
    @Override
    public SynonymViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SynonymViewHolder(LayoutInflater.from(context).inflate(R.layout.synonyms_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SynonymViewHolder holder, int position) {
            holder.tvSynonyms.setText(synonymsList.get(position));
    }

    @Override
    public int getItemCount() {
        return synonymsList.size();
    }
}
