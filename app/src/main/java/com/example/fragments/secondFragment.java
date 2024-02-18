package com.example.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn2 =  view.findViewById(R.id.btn2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView text = view.findViewById(R.id.text2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "welcome to second fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}