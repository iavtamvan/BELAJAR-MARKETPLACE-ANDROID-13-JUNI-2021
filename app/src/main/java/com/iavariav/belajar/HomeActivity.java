package com.iavariav.belajar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();

        btnLogin.setOnClickListener(v -> {
            // ini untuk menampilkan peringatan
            Toast.makeText(this, "Berhasil di klik", Toast.LENGTH_SHORT).show();

            // intent Explicit (berpindah layar di dalam aplikasi)
            //untuk berpindah layar (cara jadul)
            // berpindah layar dari HomeActivity ke(,) MainActivity
//            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
//            startActivity(intent);

            // username=  asd dan passwrod  = 123 . bisa gak? GAK
            if (edtUsername.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty()){
                Toast.makeText(this, "Lengkapi data dulu", Toast.LENGTH_SHORT).show();
            } else if (edtUsername.getText().length() <= 3){
                Toast.makeText(this, "Username kurang", Toast.LENGTH_SHORT).show();
            } else {
                // cara cepat
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }

        });
    }

    private void initView() {
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
    }
}