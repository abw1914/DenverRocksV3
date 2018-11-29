package com.android.denverrocksv3.DataAdapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.denverrocksv3.FunFragment;
import com.android.denverrocksv3.HistoryFragment;
import com.android.denverrocksv3.R;
import com.android.denverrocksv3.ResturantFragment;
import com.android.denverrocksv3.TransportationFragment;

public class FragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentPageAdapter(Context context, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
        mContext = context ;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FunFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new TransportationFragment();
        } else {
            return new ResturantFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fun);
        } else if (position == 1) {
            return mContext.getString(R.string.history);
        } else if (position == 2) {
            return mContext.getString(R.string.transportation);
        } else {
            return mContext.getString(R.string.resturant);
        }
    }
}
