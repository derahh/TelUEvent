package id.co.trisun.tel_uevent.User;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.co.trisun.tel_uevent.Acara;
import id.co.trisun.tel_uevent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JadwalSayaFragment extends Fragment {


    public JadwalSayaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_list_acara, container, false);

        ArrayList<Jadwal> data = new ArrayList<>();

        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));
        data.add(new Jadwal("Nama Acara", "Deskrpisi Acara",
                "31 April 2019", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background));

        RecyclerView recyclerView = view.findViewById(R.id.list_acara);
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayout);
        JadwalAdapter adapter = new JadwalAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
