package com.dpi.medcard.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.dpi.medcard.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;



public class PriemsFragment extends Fragment {

    private static final int LAYOUT = R.layout.fragment_priems;
    private View view;

    public static PriemsFragment getInstance() {
        Bundle args = new Bundle();
        PriemsFragment fragment = new PriemsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }


}
