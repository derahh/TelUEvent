package id.co.trisun.tel_uevent.User;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.co.trisun.tel_uevent.R;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TabLayout tabLayout = findViewById(R.id.tabsUser);
        ViewPager viewPager = findViewById(R.id.viewPagerUser);

        CategoryUserAdapter adapter = new CategoryUserAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
