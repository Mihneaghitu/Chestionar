package com.example.admin.chestionar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView QuestionView;
    private Button ButonDa;
    private Button ButonNu;
    private int QuestionNumber = 0;
    public static final String extrames="";
    public String message;
    Intrebari intrebari = new Intrebari();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuestionView = (TextView) findViewById(R.id.intrb);
        ButonDa = (Button) findViewById(R.id.btnda);
        ButonNu = (Button) findViewById(R.id.btnnu);
        final Intent intent = new Intent(this, ResultActivity.class);
        QuestionView.setMovementMethod(new ScrollingMovementMethod());
        ButonDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intrebari.contor[intrebari.num[QuestionNumber]]++;
                if (QuestionNumber < 78) updateQuestion();
                else if(QuestionNumber>=78){
                    sorteaza();
                    intent.putExtra(extrames,message);
                    startActivity(intent);
                }

            }
        });

        ButonNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (QuestionNumber < 78) updateQuestion();
                else if(QuestionNumber>=78){
                    sorteaza();
                    intent.putExtra(extrames,message);
                    startActivity(intent);
                }
            }
        });
    }
    private void updateQuestion() {
        QuestionNumber++;
        QuestionView.setText(intrebari.getQuestion(QuestionNumber));
    }
    private void sorteaza(){
        int maxim=0;
        for(int i=1;i<=8;i++) {
            if (intrebari.contor[i] > maxim) {
                maxim = intrebari.contor[i];
                message = intrebari.mesaje[i];
            }
            System.out.println(intrebari.contor[i]);
            System.out.println(message);
        }
        }

    }
