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

public class HistoryFragment extends Fragment {

    public HistoryFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootVeiw = inflater.inflate(R.layout.denver_list, container,  false);
        final ArrayList<DataModel> historyArrayList = new ArrayList<DataModel>();

        historyArrayList.add(new DataModel(this.getString(R.string.national_monumnet), this.getString(R.string.national_monument_description), R.drawable.unionstation));
        historyArrayList.add(new DataModel(this.getString(R.string.bent), this.getString(R.string.bent_fort_description), R.drawable.redrocks));
        historyArrayList.add(new DataModel(this.getString(R.string.curecanti), this.getString(R.string.curecanti_description), R.drawable.wash_park));
        historyArrayList.add(new DataModel(this.getString(R.string.dino), this.getString(R.string.dinosaur_description), R.drawable.dinosaur));
        historyArrayList.add(new DataModel(this.getString(R.string.Florissant), this.getString(R.string.florissant_description), R.drawable.city_park));
        historyArrayList.add(new DataModel(this.getString(R.string.hovenweep), this.getString(R.string.hovenweep_description), R.drawable.sloan));
        historyArrayList.add(new DataModel(this.getString(R.string.sandcreek), this.getString(R.string.sandcreek_description), R.drawable.wcp));
        historyArrayList.add(new DataModel(this.getString(R.string.yuccahouse), this.getString(R.string.yuccahouse_description), R.drawable.chatfield));


        EventAdapter funAdapter = new EventAdapter(getActivity(), 0, historyArrayList);
        ListView historyListView = rootVeiw.findViewById(R.id.list);
        historyListView.setAdapter(funAdapter);

        return rootVeiw;
    }
}

