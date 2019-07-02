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
public class SettingsFragment extends Fragment {


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewSettingsFragment = inflater.inflate(R.layout.fragment_settings, container, false);
        TextView tvSettings = viewSettingsFragment.findViewById(R.id.tvSettings);

        return viewSettingsFragment;
    }


}
