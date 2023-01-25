package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

        private Button next,play;
        private TextView txv1;
        private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txv1=findViewById(R.id.tx1);
        Bundle exstra= getIntent().getExtras();
        String com = exstra.getString("nextactivity");
        txv1.setText(com);


        spinner=findViewById(R.id.spen);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.city, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text= parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        next=findViewById(R.id.but1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        play=findViewById(R.id.btnsot);
        MediaPlayer med=MediaPlayer.create(MainActivity4.this,R.raw.slat);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                med.start();
            }
        });
        play=findViewById(R.id.btnstop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                med.pause();
            }
        });


    }
}