package id.co.trisun.tel_uevent.User;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import id.co.trisun.tel_uevent.R;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Jadwal> mData;

    public JadwalAdapter(Context context, ArrayList<Jadwal> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_acara, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Jadwal acara = mData.get(i);
        viewHolder.namaAcaraTextView.setText(acara.getNamaAcaraWord());
        viewHolder.deskrispAcaraTextView.setText(acara.getDeskripsiAcaraWord());
        viewHolder.waktuAcaraTextView.setText(acara.getWaktuAcaraWord());
        viewHolder.fotoAcara.setImageResource(acara.getFotoAcara());
        viewHolder.iconWaktu.setImageResource(acara.getIconWaktu());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView namaAcaraTextView, deskrispAcaraTextView, waktuAcaraTextView;
        final ImageView fotoAcara, iconWaktu;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaAcaraTextView = itemView.findViewById(R.id.namaAcara_tv);
            deskrispAcaraTextView = itemView.findViewById(R.id.deskripsiAcara_tv);
            waktuAcaraTextView = itemView.findViewById(R.id.waktuAcara_tv);
            fotoAcara = itemView.findViewById(R.id.gambarAcara_iv);
            iconWaktu = itemView.findViewById(R.id.iconWaktu_iv);
        }
    }
}
