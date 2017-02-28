package com.example.sabbib.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sabbib on 28/02/2017.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder>{

    List<ListItem> listItems;
    Context context;

    public TestAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(
                        parent.getContext())
                        .inflate(R.layout.list_item,
                                parent,
                                false));
    }

    @Override
    public void onBindViewHolder(final TestAdapter.ViewHolder holder, final int position) {
        holder.textViewHead.setText(listItems.get(position).getHead());
        holder.textViewDesc.setText(listItems.get(position).getDesc());
        holder.linearLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.v(TestAdapter.class.getSimpleName(),"You clicked " + listItems.get(position).getHead());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public TextView textViewDesc;
        LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.head);
            textViewDesc = (TextView) itemView.findViewById(R.id.desc);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }

}
