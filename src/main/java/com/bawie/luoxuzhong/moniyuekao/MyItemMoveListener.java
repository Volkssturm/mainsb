package com.bawie.luoxuzhong.moniyuekao;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;



public class MyItemMoveListener extends ItemTouchHelper.Callback {

    private MyItemThouchHelperCallBack callBack;

    public MyItemMoveListener(MyItemThouchHelperCallBack viewHolder){
        this.callBack = viewHolder;
    }

    @Override
    /**
     * 设置可以上下左右移动
     *
     */
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int falgs = ItemTouchHelper.UP|ItemTouchHelper.DOWN|ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT;
        return makeMovementFlags(falgs,0);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        callBack.onItemMove(viewHolder,target,1);
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        callBack.onItemSelected(viewHolder,1);
    }
}
