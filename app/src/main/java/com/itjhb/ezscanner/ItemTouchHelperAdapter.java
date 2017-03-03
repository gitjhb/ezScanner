package com.itjhb.ezscanner;

/**
 * Created by hongbin.jia on 2/23/2017.
 */

public interface ItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}