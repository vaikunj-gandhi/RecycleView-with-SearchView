package com.example.aum.busroute;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder{

    public TextView personName;
    public TextView personAddress;


    public RecyclerViewHolders(View itemView) {
        super(itemView);

        personName = (TextView)itemView.findViewById(R.id.person_name);
        personAddress = (TextView)itemView.findViewById(R.id.person_address);
    }
}
