package id.co.trisun.tel_uevent.admin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import id.co.trisun.tel_uevent.Acara;
import id.co.trisun.tel_uevent.R;

public class PermintaanAdapter extends RecyclerView.Adapter<PermintaanAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Acara> mData;

    public PermintaanAdapter(Context context, ArrayList<Acara> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_permintaan, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Acara acara = mData.get(i);
        viewHolder.namaAcara.setText(acara.getNamaAcaraWord());
        viewHolder.fotoAcara.setImageResource(acara.getFotoAcara());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView namaAcara;
        final ImageView fotoAcara;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaAcara = itemView.findViewById(R.id.namaAcaraPermintaan_tv);
            fotoAcara = itemView.findViewById(R.id.fotoAcaraPermintaan_iv);
        }
    }
}
