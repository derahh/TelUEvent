package id.co.trisun.tel_uevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

import id.co.trisun.tel_uevent.admin.AdminActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Acara> data = new ArrayList<>();

        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));
        data.add(new Acara("Nama Acara", "Himadira", "31 MAret 2019", R.drawable.ic_launcher_background));

        RecyclerView recyclerView = findViewById(R.id.mainListAcara);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayout);
        AcaraAdapter adapter = new AcaraAdapter(this, data);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_user, menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.login:
                Intent intent = new Intent(this, LoginActivity.class);
                this.startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
