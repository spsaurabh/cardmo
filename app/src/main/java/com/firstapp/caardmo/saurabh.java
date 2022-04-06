package com.firstapp.caardmo;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class saurabh extends RecyclerView.Adapter<saurabh.RRR>{
    @NonNull
    @Override
    public RRR onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hhhh,parent,false);
        RRR r1 = new RRR(view);
        return r1;
    }

    @Override
    public void onBindViewHolder(@NonNull RRR holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class RRR extends RecyclerView.ViewHolder{
        TextView tv1;
        ImageView imageView;
        TextView tv2;

        public RRR(@NonNull View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            tv1 = itemView.findViewById(R.id.name);
            tv2 = itemView.findViewById(R.id.add);
        }
    }
}
