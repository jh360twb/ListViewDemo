package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> mFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ListView listView = findViewById(R.id.listView_main);
        initData();
        //adapter是适配器,让数据和listView结合起来,起到桥梁的作用
        FruitAdapter fruitAdapter = new FruitAdapter(MainActivity.this,mFruits);
        listView.setAdapter(fruitAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "当前下标位置为"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        mFruits = new ArrayList<>();
        for (int i=0;i<3;i++) {
            Fruit fruit = new Fruit("苹果", R.mipmap.apple);
            mFruits.add(fruit);
            Fruit fruit1 = new Fruit("橘子", R.mipmap.orange);
            mFruits.add(fruit1);
            Fruit fruit2 = new Fruit("梨", R.mipmap.pear);
            mFruits.add(fruit2);
            Fruit fruit3 = new Fruit("草莓", R.mipmap.strawberry);
            mFruits.add(fruit3);
            Fruit fruit4 = new Fruit("香蕉", R.mipmap.banana);
            mFruits.add(fruit4);
            Fruit fruit5 = new Fruit("芒果", R.mipmap.mango);
            mFruits.add(fruit5);
        }
    }
}
