package com.android.denverrocksv3;

import android.content.Intent;
import android.net.Uri;
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

public class ResturantFragment extends Fragment {

    public ResturantFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.denver_list, container,  false);
        final ArrayList<DataModel> resturantArrayList = new ArrayList<DataModel>();

        resturantArrayList.add(new DataModel(this.getString(R.string.maria), this.getString(R.string.maria_empanada_descripton), R.drawable.empanadas, this.getString(R.string.maria_address), this.getString(R.string.maria_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.acron), this.getString(R.string.acron_descripton), R.drawable.acorn, this.getString(R.string.acron_address), this.getString(R.string.acron_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.oldmajor), this.getString(R.string.oldmajor_descripton), R.drawable.oldmajor, this.getString(R.string.oldmajor_address), this.getString(R.string.oldmajor_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.olive), this.getString(R.string.olive_descripton), R.drawable.olivefinch, this.getString(R.string.olive_address), this.getString(R.string.olive_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.work), this.getString(R.string.work_descripton), R.drawable.wcp, this.getString(R.string.work_address), this.getString(R.string.work_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.ilposto), this.getString(R.string.ilposto_descripton), R.drawable.ilpost, this.getString(R.string.ilposto_address), this.getString(R.string.ilposto_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.bistro), this.getString(R.string.bistro_descripton), R.drawable.bistro, this.getString(R.string.bistro_address), this.getString(R.string.bistro_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.hopalley), this.getString(R.string.hopalley_descripton), R.drawable.hopaley, this.getString(R.string.hopalley_address), this.getString(R.string.hopalley_phone)));
        resturantArrayList.add(new DataModel(this.getString(R.string.fruiton), this.getString(R.string.fruiton_descripton), R.drawable.fruition, this.getString(R.string.fruiton_address), this.getString(R.string.fruiton_phone)));

        EventAdapter funAdapter = new EventAdapter(getActivity(), 0, resturantArrayList);
        ListView resturantListView = rootVeiw.findViewById(R.id.list);
        resturantListView.setAdapter(funAdapter);

        return rootVeiw;


    }
    


}



