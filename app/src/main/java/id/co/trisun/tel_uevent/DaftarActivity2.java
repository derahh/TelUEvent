package id.co.trisun.tel_uevent;

import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.co.trisun.tel_uevent.User.User;

public class DaftarActivity2 extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextEmail;
    EditText editTextPassword;

    TextInputLayout textInputLayoutUsername;
    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutPassword;

    Button buttonRegister;

    SqliteHelper sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar2);

        sqliteHelper = new SqliteHelper(this);
        initViews();
        buttonRegister = findViewById(R.id.button2);
        buttonRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (validate()) {
                    String UserName = editTextUsername.getText().toString();
                    String Email = editTextEmail.getText().toString();
                    String Password = editTextPassword.getText().toString();
                    String hakAkses = "User";

                    if (!sqliteHelper.isUsernameExists(UserName)) {
                        sqliteHelper.addUser(new User(null, UserName, Password, null, null, null, null, "Aktif", "User", Email));
                        Toast.makeText(DaftarActivity2.this, "Berhasil daftar", Toast.LENGTH_SHORT).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                finish();
                            }
                        }, Snackbar.LENGTH_LONG);
                    } else {
                        Toast.makeText(DaftarActivity2.this, "Username sudah ada", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void initViews() {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        buttonRegister = (Button) findViewById(R.id.button);
    }

    public boolean validate() {
        boolean valid = false;

        //Get values from EditText fields
        String UserName = editTextUsername.getText().toString();
        String Email = editTextEmail.getText().toString();
        String Password = editTextPassword.getText().toString();

        //Handling validation for UserName field
        if (UserName.isEmpty()) {
            valid = false;
            textInputLayoutUsername.setError("Please enter valid username!");
        } else {
            valid = true;
        }

        //Handling validation for Email field
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            valid = false;
            Toast.makeText(this, "Input email dengan benar", Toast.LENGTH_SHORT).show();
        } else {
            valid = true;
//            textInputLayoutEmail.setError(null);
        }

        //Handling validation for Password field
        if (Password.isEmpty()) {
            valid = false;
            Toast.makeText(this, "Input password dengan benar", Toast.LENGTH_SHORT).show();
        } else {
            if (Password.length() > 5) {
                valid = true;
//                textInputLayoutPassword.setError(null);
            } else {
                valid = false;
                Toast.makeText(this, "Password terlalu pendek", Toast.LENGTH_SHORT).show();
            }
        }


        return valid;
    }
}
