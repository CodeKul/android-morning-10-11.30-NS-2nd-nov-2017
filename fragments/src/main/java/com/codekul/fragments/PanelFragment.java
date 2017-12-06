package com.codekul.fragments;


//import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PanelFragment extends Fragment {


    public PanelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_panel, container, false);
        view.findViewById(R.id.btnBike).setOnClickListener(
                v -> ((MainActivity)getActivity()).loadFragment(mkFrag(R.drawable.ic_cycle))
        );
        view.findViewById(R.id.btnCar).setOnClickListener(
                v -> ((MainActivity)getActivity()).loadFragment(mkFrag(R.drawable.ic_buses))
        );
        view.findViewById(R.id.btnPlane).setOnClickListener(
                v -> ((MainActivity)getActivity()).loadFragment(mkFrag(R.drawable.ic_chopper))
        );

        return view;
    }

    private ImgFragment mkFrag(int imgId) {

        Bundle bndl = new Bundle();
        bndl.putInt(ImgFragment.IMG_NM, imgId);

        ImgFragment frag = new ImgFragment();
        frag.setArguments(bndl);

        return frag;
    }
}
