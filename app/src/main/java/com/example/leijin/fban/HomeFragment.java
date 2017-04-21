package com.example.leijin.fban;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by leijin on 4/19/17.
 */


public class HomeFragment extends Fragment implements View.OnClickListener{
    EditText content;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        content=(EditText)view.findViewById(R.id.keyword);


        Button buttonClear = (Button) view.findViewById(R.id.Clear);
        buttonClear.setOnClickListener(this);
        Button buttonSearch = (Button) view.findViewById(R.id.Search);
        buttonSearch.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Search On FB");
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id==R.id.Clear)
            clearContent();
        else search();

//        Log.d("in","id");

    }
    private void clearContent(){
        content.setText("");
    }
    private void search(){
        Intent intent = new Intent(getActivity(), ResultActivity.class);
        startActivity(intent);
    }
}
