package com.example.aum.busroute;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> implements Filterable {

    List<ItemObject> itemList,itemList2;
    private Context context;
    CustomFilter filter;


    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
        this.itemList2=itemList;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.personAddress.setText(itemList.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


    public Filter getFilter() {
        if(filter==null)
        {
            filter=new CustomFilter(itemList2,this);

        }

        return filter;
    }
}

