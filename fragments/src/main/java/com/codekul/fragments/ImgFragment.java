package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImgFragment extends Fragment {


    public static final String IMG_NM = "imgNm";

    public ImgFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_img, container, false);

        Bundle bndl = getArguments();
        if(bndl != null)
        ((ImageView)view.findViewById(R.id.imgVw)).setImageResource(bndl.getInt(IMG_NM));

        return view;
    }

}
