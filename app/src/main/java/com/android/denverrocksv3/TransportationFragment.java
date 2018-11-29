package com.android.denverrocksv3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.denverrocksv3.Data.DataModel;
import com.android.denverrocksv3.DataAdapter.EventAdapter;

import java.util.ArrayList;

public class TransportationFragment extends Fragment {

    public TransportationFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.denver_list, container,  false);
        final ArrayList<DataModel> transportationArrayList = new ArrayList<DataModel>();

        transportationArrayList.add(new DataModel(this.getString(R.string.airport_rail), this.getString(R.string.airport_rail_description), R.drawable.denveraline));
        transportationArrayList.add(new DataModel(this.getString(R.string.lightrail), this.getString(R.string.lightrail_description), R.drawable.denver_rail));
        transportationArrayList.add(new DataModel(this.getString(R.string.mall_shuttle), this.getString(R.string.mall_shuttle_description), R.drawable.wash_park));
        transportationArrayList.add(new DataModel(this.getString(R.string.Bustang), this.getString(R.string.Bustang_description), R.drawable.rtd));
        transportationArrayList.add(new DataModel(this.getString(R.string.Amtrak), this.getString(R.string.Amtrak_description), R.drawable.bistro));
        transportationArrayList.add(new DataModel(this.getString(R.string.BCycle), this.getString(R.string.BCycle_description), R.drawable.bcycle));
        transportationArrayList.add(new DataModel(this.getString(R.string.share_rides), this.getString(R.string.share_rides_description), R.drawable.unionstation));


        EventAdapter funAdapter = new EventAdapter(getActivity(), 0, transportationArrayList);
        ListView transportationListView = rootVeiw.findViewById(R.id.list);
        transportationListView.setAdapter(funAdapter);

        return rootVeiw;
    }
}

