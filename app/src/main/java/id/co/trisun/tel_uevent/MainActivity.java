package id.co.trisun.tel_uevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import id.co.trisun.tel_uevent.admin.AdminActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void admin(){
        Button btnAdmin = findViewById(R.id.button3);
        Intent intent = new Intent(this, AdminActivity.class);
        startActivity(intent);
    }
}
