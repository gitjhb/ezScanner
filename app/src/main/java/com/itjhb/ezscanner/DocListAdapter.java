package com.itjhb.ezscanner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Collections;

/**
 * Created by hongbin.jia on 2/23/2017.
 */

public class DocListAdapter extends RecyclerView.Adapter<DocHolder> implements ItemTouchHelperAdapter {
    private static final java.lang.String TAG = "DocListAdapter";
    private Context mContext;
    private RecyclerView mRecyclerview;

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        Log.d("onItemMove ",  fromPosition + " - " + toPosition);
//        if (fromPosition < toPosition) {
//            for (int i = fromPosition; i < toPosition; i++) {
//                int pos1=mMembershipCards.get(i-ID_SIZE).getCardIndex();
//                int pos2=mMembershipCards.get(i+ 1-ID_SIZE).getCardIndex();
//                mMembershipCards.get(i - ID_SIZE).setCardIndex(pos2);
//                mMembershipCards.get(i + 1 - ID_SIZE).setCardIndex(pos1);
//                Collections.swap(mMembershipCards, i - ID_SIZE, i + 1 - ID_SIZE);
//            }
//            updateCardOrder(mMembershipCards.get(fromPosition - ID_SIZE));
//            updateCardOrder(mMembershipCards.get(toPosition - ID_SIZE));
//
//        } else {
//            for (int i = fromPosition; i > toPosition; i--) {
//                int pos1=mMembershipCards.get(i-ID_SIZE).getCardIndex();
//                int pos2=mMembershipCards.get(i- 1-ID_SIZE).getCardIndex();
//                mMembershipCards.get(i - ID_SIZE).setCardIndex(pos2);
//                mMembershipCards.get(i - 1 - ID_SIZE).setCardIndex(pos1);
//                Collections.swap(mMembershipCards, i - ID_SIZE, i - 1 - ID_SIZE);
//            }
//            updateCardOrder(mMembershipCards.get(fromPosition - ID_SIZE));
//            updateCardOrder(mMembershipCards.get(toPosition - ID_SIZE));
//        }
        notifyItemMoved(fromPosition, toPosition);
    }

//    private void updateCardOrder(MemberShipCard card) {
//        Subscription mSubscription = ValueAddServiceFramework.Companion.getInstance().valueAddServiceFunction(new BaseValueAddServiceRequest(ValueAddServiceType.UPDATE_MEMBERSHIP_CARD_ORDER, card)).
//                subscribe(new Action1<Object>() {
//                    @Override
//                    public void call(Object o) {
//
//                    }
//                });
//        addCompositSubscription(mSubscription);
//    }

    @Override
    public void onItemDismiss(int position) {

    }

    public enum TYPE {
        FOLDER,
        DOCUMENT
    }

    DocListAdapter(Context ctx, RecyclerView recyclerView) {
        super();
        mContext = ctx;
        mRecyclerview = recyclerView;
    }

    @Override
    public DocHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_document, parent, false);
        return new DocHolder(v);
    }

    @Override
    public void onBindViewHolder(DocHolder holder, int position) {

        Log.d(TAG,"onBindViewHolder");

    }

    @Override
    public int getItemViewType(int position) {

        return 0;
    }

    @Override
    public int getItemCount() {
        Log.d(TAG,"getItemCount");
        return 10;
    }


}
