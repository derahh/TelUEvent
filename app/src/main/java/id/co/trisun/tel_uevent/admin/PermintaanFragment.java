package id.co.trisun.tel_uevent.admin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.co.trisun.tel_uevent.Acara;
import id.co.trisun.tel_uevent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PermintaanFragment extends Fragment {


    public PermintaanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_list_acara, container, false);

        ArrayList<Acara> data = new ArrayList<>();
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", R.drawable.ic_launcher_background));

        RecyclerView recyclerView = view.findViewById(R.id.list_acara);
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayout);
        PermintaanAdapter adapter = new PermintaanAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
