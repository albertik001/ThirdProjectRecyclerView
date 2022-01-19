package com.geektech.thirdprojectrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ContactHolder> {
    ArrayList<String> names = new ArrayList<>();
    int[] imageview = {R.drawable.csharp, R.drawable.css, R.drawable.kotlin, R.drawable.htmlss, R.drawable.java, R.drawable.python};


    public Adapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder holder, int position) {
        holder.bind(names.get(position), position);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private ImageView imageView;

        public ContactHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            tv_name = itemView.findViewById(R.id.name);
        }

        public void bind(String name, int position) {
            if (imageview.length > position){
                imageView.setImageResource(imageview[position]);
            }else{
                imageView.setImageResource(R.drawable.ic_baseline_code_24);
            }
                tv_name.setText(name);
        }
    }

}

