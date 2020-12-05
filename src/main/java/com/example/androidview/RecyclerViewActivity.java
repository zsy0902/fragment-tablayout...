package com.example.androidview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private  RecyclerView recyclerView;
    private List<RvData> list=new ArrayList<>();
    private RvAdapter rvAdapter=new RvAdapter(list);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.rv_demo);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);
        list.add(new RvData("第一节"));
        list.add(new RvData("第二节"));
        list.add(new RvData("第三节"));
        list.add(new RvData("第四节"));
        list.add(new RvData("第五节"));
        list.add(new RvData("第六节"));
        list.add(new RvData("第七节"));
        list.add(new RvData("第八节"));
        list.add(new RvData("第九节"));
        list.add(new RvData("第十节"));
        list.add(new RvData("第十一节"));
        list.add(new RvData("第十二节"));
        rvAdapter.notifyDataSetChanged();
    }
}