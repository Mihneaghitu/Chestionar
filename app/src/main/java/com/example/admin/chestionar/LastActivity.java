package com.example.admin.chestionar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {


    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Intent intent=getIntent();
        final String message=intent.getStringExtra(ResultActivity.Extra_Mes);
        textView=(TextView)findViewById(R.id.t2);
        textView.setText(message);
    }
}
