package com.example.laboratorio08.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laboratorio08.R;
import com.example.laboratorio08.finalActivity.FinalActivity;

public class LoginActivity extends AppCompatActivity implements Login.View {
    private EditText user, pass;
    private Login.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.edtUser);
        pass = (EditText) findViewById(R.id.edtPass);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void usuarioValido() {
        startActivity(new Intent(LoginActivity.this, FinalActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this,"Usuario no es valido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return user.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }
}