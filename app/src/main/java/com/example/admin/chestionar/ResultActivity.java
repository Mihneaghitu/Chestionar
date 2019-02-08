package com.example.admin.chestionar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {


    public static final String Extra_Mes="";
     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        final String message=intent.getStringExtra(MainActivity.extrames);
        final Intent nintent=new Intent(this,LastActivity.class);
        button=(Button)findViewById(R.id.rez);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nintent.putExtra(Extra_Mes,message);
                startActivity(nintent);
            }
        });
    }
}
