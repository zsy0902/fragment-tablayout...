package com.example.androidview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidview.MainActivity;
import com.example.androidview.R;
import com.example.androidview.RvAdapter;
import com.example.androidview.RvData;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment2 extends Fragment {

    //YYYYY
    private RecyclerView recyclerView;
    private List<RvData> list=new ArrayList<>();
    private RvAdapter rvAdapter=new RvAdapter(list);
    private View view;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment2 newInstance(String param1, String param2) {
        BlankFragment2 fragment = new BlankFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragment_blank2, container, false);
       recyclerView = view.findViewById(R.id.rv_demo);
//        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity);
//        recyclerView.setLayoutManager(layoutManager);
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
        recyclerView.setAdapter(rvAdapter);

        rvAdapter.notifyDataSetChanged();

        return view;
    }
}