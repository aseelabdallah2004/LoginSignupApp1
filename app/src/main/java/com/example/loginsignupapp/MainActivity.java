package com.example.loginsignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUserName, etPasword;
    Button btnIogIn,btnSighnup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPasword = findViewById(R.id.etpasswordMain);
        etUserName = findViewById(R.id.etUserNameMain);
    }
public void login(View view)
{
    String username=etUserName.getText().toString();
    String password = etPasword.getText().toString();
    if(username.trim().isEmpty()|| gddfgdfgdfgdfgdfg().trim().isEmpty())
    {
        Toast.makeText(this, "Username or password is missing", Toast.LENGTH_SHORT).show();
        return;

}
}


    public void Login(View view) {
    }}