package com.example.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
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

public class firstFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        
        super.onAttach(context);
        Toast.makeText(context, "onattach is called", Toast.LENGTH_SHORT).show();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_first, container, false);

          @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn = view.findViewById(R.id.btn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txt = view.findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "welcome to first fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}