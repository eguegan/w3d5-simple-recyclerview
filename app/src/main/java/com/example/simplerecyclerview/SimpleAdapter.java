package com.example.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by evin on 4/19/16.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private ArrayList<String> mArrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView textViewName;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.r_item_text);
        }
    }

    public SimpleAdapter(ArrayList<String> arrayList) {
        this.mArrayList = arrayList;
    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View termView = inflater.inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(termView);
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {
        String string = mArrayList.get(position);

        TextView textViewName = holder.textViewName;
        textViewName.setText(string);
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

}
