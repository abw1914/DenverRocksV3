package com.android.denverrocksv3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.denverrocksv3.Data.DataModel;
import com.android.denverrocksv3.DataAdapter.EventAdapter;

import java.util.ArrayList;

public class FunFragment extends android.support.v4.app.Fragment {

    public FunFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.denver_list, container,  false);
        final ArrayList<DataModel> funArrayList = new ArrayList<DataModel>();

        funArrayList.add(new DataModel(this.getString(R.string.union), this.getString(R.string.union_station_description), R.drawable.unionstation));
        funArrayList.add(new DataModel(this.getString(R.string.redRocks), this.getString(R.string.red_rocks_description), R.drawable.redrocks));
        funArrayList.add(new DataModel(this.getString(R.string.larimer), this.getString(R.string.larimer_square_description), R.drawable.wash_park));
        funArrayList.add(new DataModel(this.getString(R.string.botantic), this.getString(R.string.denver_botantic_gardens_description), R.drawable.botantic_garden));
        funArrayList.add(new DataModel(this.getString(R.string.natureMuseum), this.getString(R.string.Museum_of_Nature_description), R.drawable.city_park));
        funArrayList.add(new DataModel(this.getString(R.string.coors), this.getString(R.string.coors_field_description), R.drawable.chatfield));

        EventAdapter funAdapter = new EventAdapter(getActivity(), 0, funArrayList);
        ListView funListView = rootVeiw.findViewById(R.id.list);
        funListView.setAdapter(funAdapter);

        return rootVeiw;
    }
}

