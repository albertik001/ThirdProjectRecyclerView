package com.geektech.thirdprojectrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<String> names;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        names = new ArrayList<>();
        names.add("C#");
        names.add("HTML");
        names.add("Kotlin");
        names.add("CSS");
        names.add("Java");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }
}