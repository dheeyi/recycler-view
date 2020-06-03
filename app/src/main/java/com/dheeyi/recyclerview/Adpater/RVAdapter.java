package com.dheeyi.recyclerview.Adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dheeyi.recyclerview.R;
import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<String> imagesName;
    private ArrayList<String> imagesURI;

    public RVAdapter(Context context, ArrayList<String> imagesName, ArrayList<String> imagesURI) {
        this.context = context;
        this.imagesName = imagesName;
        this.imagesURI = imagesURI;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //gets resource file rl_list_item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(
                        R.layout.rl_list_item,
                        viewGroup,
                        false
                );
        //viewHolder class
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String URI = "https://i.imgur.com/";
        //set image
        Glide
                .with(context)
                .asBitmap()
                .load(URI + imagesURI.get(position) + ".png")
                .into(holder.getCivItem());
        //set text
        holder.getTvImage().setText(imagesName.get(position));
        //onclick RVContainer
        holder.getRlContainer().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, imagesName.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imagesName.size();
    }
}
