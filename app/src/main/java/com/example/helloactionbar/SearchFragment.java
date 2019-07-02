package com.example.helloactionbar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SearchFragment extends Fragment {

    // private OnFragmentInteractionListener mListener;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewSearchFragment = inflater.inflate(R.layout.fragment_search, container, false);
        TextView tvHome = viewSearchFragment.findViewById(R.id.tvSearch);
      /*  tvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e( "TAG", "THIS IS THE TV OF HOME");
               // mListener.tvHomeClick();
            }
        });*/

        return viewSearchFragment;
    }


/*    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnHomeFragmentListener) context;
    }

    //esto libera memoria
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnHomeFragmentListener {
        void tvHomeClick();
    }*/
}
