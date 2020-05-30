package com.dheeyi.recyclerview.Adpater;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dheeyi.recyclerview.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private RelativeLayout rlContainer;
    private CircleImageView civItem;
    private TextView tvImage;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initComponents(itemView);
    }

    public void initComponents(View view) {
        rlContainer = view.findViewById(R.id.rlContainer);
        civItem = view.findViewById(R.id.civItem);
        tvImage = view.findViewById(R.id.tvImage);
    }

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public void setRlContainer(RelativeLayout rlContainer) {
        this.rlContainer = rlContainer;
    }

    public CircleImageView getCivItem() {
        return civItem;
    }

    public void setCivItem(CircleImageView civItem) {
        this.civItem = civItem;
    }

    public TextView getTvImage() {
        return tvImage;
    }

    public void setTvImage(TextView tvImage) {
        this.tvImage = tvImage;
    }
}
