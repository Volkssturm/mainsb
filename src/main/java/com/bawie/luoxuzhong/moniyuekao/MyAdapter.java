package com.bawie.luoxuzhong.moniyuekao;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

    private List<String> list;
    private Context context;
    private MyOnClickCallback myOnClickCallback;
    private int adapterIndex;


    public MyAdapter(Context context, List<String> list, MyOnClickCallback myOnClickCallback, int adapterIndex) {
        this.list = list;
        this.context = context;
        this.myOnClickCallback = myOnClickCallback;
        this.adapterIndex = adapterIndex;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item, null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.textView.setText(list.get(position));
        //单机事件
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 把点击的控件在集合中的下标传过去
                 */
                myOnClickCallback.clickCallBack(position, adapterIndex);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.itemText);


        }
    }
}
