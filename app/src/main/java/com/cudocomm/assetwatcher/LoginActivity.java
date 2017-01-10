package com.cudocomm.assetwatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView login = (TextView) findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LoginActivity.this, ListActivity.class));
            }
        });
    }
}
