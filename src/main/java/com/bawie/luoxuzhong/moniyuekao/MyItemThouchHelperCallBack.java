package com.bawie.luoxuzhong.moniyuekao;

import android.support.v7.widget.RecyclerView;



public interface MyItemThouchHelperCallBack {
    //数据选中
    void onItemSelected(RecyclerView.ViewHolder viewHolder, int adapterIndex);
    //数据交换
    void onItemMove(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target, int adapterIndex);
}
