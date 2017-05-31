package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Glen on 16/05/2017.
 */

public class CatergoryAdapter extends FragmentPagerAdapter {

        /** Context of the app */
        private Context mContext;

        public CatergoryAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;

        }

        @Override
        public Fragment getItem ( int position){
            if (position == 0) {
                return new NumbersFragment();
            } else if (position == 1) {
                return new FamilyFragment();
            } else if (position == 2) {
                return new ColorsFragment();
            } else {
                return new PhrasesFragment();
            }
        }

        @Override
        public int getCount () {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position){
            if (position == 0) {
                return "Numbers";
            } else if (position == 1) {
                return "Family";
            } else if (position == 2) {
                return mContext.getString(R.string.category_colors);
            } else {
                return mContext.getString(R.string.category_phrases);
            }
        }
    }