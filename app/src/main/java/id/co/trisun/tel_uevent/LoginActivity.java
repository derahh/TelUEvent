package id.co.trisun.tel_uevent;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.co.trisun.tel_uevent.User.User;
import id.co.trisun.tel_uevent.User.UserActivity;
import id.co.trisun.tel_uevent.admin.AdminActivity;

public class LoginActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPassword;

    TextInputLayout textInputLayoutUsername;
    TextInputLayout textInputLayoutPassword;

    SqliteHelper sqliteHelper;

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sqliteHelper = new SqliteHelper(this);
        initCreateAccountTextView();
        initViews();
        buttonLogin = findViewById(R.id.button);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Check input valid or not
                if (validate()){
                    String username = editTextUsername.getText().toString();
                    String password = editTextPassword.getText().toString();

                    User currentUser = sqliteHelper.Authenticate(new User(null,username,password,null,null,null,null,"Aktif","User",null));

                    if (currentUser != null){
                        Log.d("apalah",currentUser.toString());
                        if (currentUser.getStatus().equals("Aktif")) {
                            if (currentUser.getHak_akses().equals("User")) {
                                //User Berhasil Login dan di pindahkan ke main Activity
                                Intent intent = new Intent(LoginActivity.this, UserActivity.class);
                                startActivity(intent);
                                Toast.makeText(LoginActivity.this, "User", Toast.LENGTH_SHORT).show();
                            }else if (currentUser.getHak_akses().equals("Admin")){
                                Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                                startActivity(intent);
                                Toast.makeText(LoginActivity.this, "Admin", Toast.LENGTH_SHORT).show();
                            }
                        }
                        finish();
                    }else{
                        Toast.makeText(LoginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void initViews() {
        editTextUsername = (EditText) findViewById(R.id.editText);
        editTextPassword = (EditText) findViewById(R.id.editText2);
//        textInputLayoutUsername = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
//        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        buttonLogin = (Button) findViewById(R.id.button);
    }

    private static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;

    }

    private void initCreateAccountTextView() {
        TextView textViewCreateAccount = (TextView) findViewById(R.id.textViewCreateAccount);

        textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, DaftarActivity2.class);
                startActivity(intent);
            }
        });
    }

    public boolean validate(){
        boolean valid = false;

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()){
            valid = false;
            Toast.makeText(this, "Username atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
//            textInputLayoutUsername.setError("Username Error");
        }else{
            valid = true;
//            textInputLayoutUsername.setError(null);
        }

        if (password.isEmpty()){
            valid = false;
//            textInputLayoutPassword.setError("Password Error");
        }else{
            valid = true;
        }
        return valid;
    }
}
