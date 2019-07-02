package com.example.helloactionbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {


    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewNewFragment = inflater.inflate(R.layout.fragment_new, container, false);
        TextView tvHome = viewNewFragment.findViewById(R.id.tvNew);

        return viewNewFragment;
    }

}