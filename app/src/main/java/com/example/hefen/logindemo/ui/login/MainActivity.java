package com.example.hefen.logindemo.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hefen.logindemo.R;

public class MainActivity extends AppCompatActivity implements LoginMVPView{
    EditText editText_mobile, editText_password;
    Button btn_login;
    LoginMVPPresenter loginMvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLogin();
    }

    void initLogin() {
        editText_mobile = findViewById(R.id.editTextMobile);
        editText_password = findViewById(R.id.editTextPassword);
        btn_login = findViewById(R.id.button);
        loginMvpPresenter = new LoginPresenter(MainActivity.this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobile = editText_mobile.getText().toString();
                String password = editText_password.getText().toString();
                if (mobile == null || mobile.length() == 0) {
                    Toast.makeText(MainActivity.this, "Please input your mobile number", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password == null || password.length() == 0) {
                    Toast.makeText(MainActivity.this, "Please input your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                loginMvpPresenter.login_request(mobile, password);
            }
        });
    }

    @Override
    public void showLoginMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
