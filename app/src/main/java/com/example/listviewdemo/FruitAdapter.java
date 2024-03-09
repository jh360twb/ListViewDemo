package com.example.listviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian
 * @description
 * @date :2020/6/24 22:46
 */
public class FruitAdapter extends BaseAdapter {
    List<Fruit> fruits = new ArrayList<>();
    Context context;

    public FruitAdapter(Context context, List<Fruit> fruits) {
        this.context = context;
        this.fruits = fruits;
    }

    //用来获取数据集的数量
    @Override
    public int getCount() {
        return fruits.size();
    }

    //用来返回指定position的哪一个item
    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    //获取item的下标
    @Override
    public long getItemId(int position) {
        return position;
    }

    //用来获取item的布局
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = View.inflate(context,R.layout.item_fruit,null);
            viewHolder.fruitName_item = convertView.findViewById(R.id.fruitName_item);
            viewHolder.fruitPicture_item = convertView.findViewById(R.id.fruitPicture_item);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Fruit fruit = fruits.get(position);
        viewHolder.fruitName_item.setText(fruit.getFruitName());
        viewHolder.fruitPicture_item.setImageResource(fruit.getFruitPictureId());
        return convertView;
    }

    //static静态内部类没有对外部类有引用,避免内存泄漏
    static class ViewHolder{
        ImageView fruitPicture_item;
        TextView fruitName_item;
    }
}
