package com.itjhb.ezscanner;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by hongbin.jia on 2/23/2017.
 */

public class DocHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {

    public DocHolder(final View itemView) {
        super(itemView);
    }

    @Override
    public void onItemSelected() {
        itemView.setAlpha(0.6f);
    }

    @Override
    public void onItemClear() {
        itemView.setBackgroundColor(0);
    }
}