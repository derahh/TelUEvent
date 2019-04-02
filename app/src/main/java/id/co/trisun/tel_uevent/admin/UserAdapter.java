package id.co.trisun.tel_uevent.admin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.co.trisun.tel_uevent.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<User> mData;

    public UserAdapter(Context context, ArrayList<User> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_user, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        User user = mData.get(i);
        viewHolder.namaUser_tv.setText(user.getNamaUser());
        viewHolder.fotoUser_iv.setImageResource(user.getFotoUser());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        final TextView namaUser_tv;
        final ImageView fotoUser_iv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaUser_tv = itemView.findViewById(R.id.txtNamaUser);
            fotoUser_iv = itemView.findViewById(R.id.imgFotoUser);
        }
    }
}
