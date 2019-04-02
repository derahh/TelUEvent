package id.co.trisun.tel_uevent.admin;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.co.trisun.tel_uevent.AcaraFragment;

public class CategoryAdminAdapter extends FragmentPagerAdapter {

    private String[] judulTab = {"Acara", "Permintaan", "Daftar User"};
    private Context mContext;

    @Override
    public CharSequence getPageTitle(int position) {
        return judulTab[position];
    }

    public CategoryAdminAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new AcaraFragment();
        }else if (i == 1){
            return new PermintaanFragment();
        }else {
            return new DaftarUserFragment();
        }
    }

    @Override
    public int getCount() {
        return judulTab.length;
    }
}
