package id.co.trisun.tel_uevent.User;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.co.trisun.tel_uevent.AcaraFragment;

public class CategoryUserAdapter extends FragmentPagerAdapter {
    private String[] judulTab = {"Acara", "Jadwal Saya"};
    private Context mContext;

    public CategoryUserAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return judulTab.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return judulTab[position];
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0)
            return new AcaraFragment();
        else
            return new JadwalSayaFragment();
    }
}
