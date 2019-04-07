package id.co.trisun.tel_uevent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AcaraAdapter extends RecyclerView.Adapter<AcaraAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Acara> mData;
    private int mColorResId;

    public AcaraAdapter(Context context, ArrayList<Acara> mData) {
        this.mContext = context;
        this.mData = mData;
    }

//    public AcaraAdapter(Context mContext, ArrayList<Acara> mData, int mColorResId) {
//        this.mContext = mContext;
//        this.mData = mData;
//        this.mColorResId = mColorResId;
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_acara, viewGroup, false);
//        view.setBackgroundColor(ResourcesCompat.getColor(mContext.getResources(), mColorResId, mContext.getTheme()));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Acara acara = mData.get(i);
        viewHolder.namaAcaraTextView.setText(acara.getNamaAcaraWord());
        viewHolder.pembuatAcaraTextView.setText(acara.getPembuatAcaraWord());
        viewHolder.waktuAcaraTextView.setText(acara.getWaktuAcaraWord());
//        viewHolder.deskripsiAcara.setText(acara.getDeskripsiAcara());
        viewHolder.fotoAcara.setImageResource(acara.getFotoAcara());
//        viewHolder.iconWaktu.setImageResource(acara.getIconWaktu());
//        if (acara.hasImage()){
//            viewHolder.fotoAcara.setVisibility(View.VISIBLE);
//            viewHolder.fotoAcara.setImageResource(acara.getFotoAcara());
//        }else {
//            viewHolder.fotoAcara.setVisibility(View.GONE);
//        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView namaAcaraTextView, pembuatAcaraTextView, waktuAcaraTextView, deskripsiAcara;
        final ImageView fotoAcara, iconWaktu;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaAcaraTextView = itemView.findViewById(R.id.namaAcara);
            pembuatAcaraTextView = itemView.findViewById(R.id.pembuatAcara);
            waktuAcaraTextView = itemView.findViewById(R.id.waktuAcara);
            deskripsiAcara = itemView.findViewById(R.id.deskripsiAcara_tv);
            fotoAcara = itemView.findViewById(R.id.fotoAcara);
            iconWaktu = itemView.findViewById(R.id.iconWaktu_iv);
        }
    }
}
