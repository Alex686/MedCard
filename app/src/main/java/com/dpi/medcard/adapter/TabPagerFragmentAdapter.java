package com.dpi.medcard.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dpi.medcard.fragment.PriemsFragment;

public class TabPagerFragmentAdapter extends FragmentPagerAdapter{

    private String [] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Приёмы",
                "Tab 1",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PriemsFragment.getInstance();
            case 1:
                return PriemsFragment.getInstance();
            case 2:
                return PriemsFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
