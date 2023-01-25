package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private CheckBox shmal,gnop, westa,gaza,khan ;
    private EditText editText;
    private Button chick ,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        shmal=findViewById(R.id.shmal1);
        gnop=findViewById(R.id.gnop2);
        westa=findViewById(R.id.westa3);
        gaza=findViewById(R.id.gaza4);
        khan=findViewById(R.id.khan5);
        chick=findViewById(R.id.btnchick);
        chick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shmal.isChecked()){
                    Toast.makeText(MainActivity3.this, "الشمال", Toast.LENGTH_SHORT).show();
                }else if (gnop.isChecked()){
                    Toast.makeText(MainActivity3.this, "الجنوب", Toast.LENGTH_SHORT).show();
                }else if (westa.isChecked()){
                    Toast.makeText(MainActivity3.this, "الوسطى", Toast.LENGTH_SHORT).show();
                }else if (gaza.isChecked()){
                    Toast.makeText(MainActivity3.this, "غزة", Toast.LENGTH_SHORT).show();
                }else if (khan.isChecked()){
                    Toast.makeText(MainActivity3.this, "خانيونس", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity3.this, "لم يتم اختيار محافظة", Toast.LENGTH_SHORT).show();
                }

            }
        });  editText=findViewById(R.id.edt);

        next=findViewById(R.id.btnta);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  String thetext=editText.getText().toString();
                Intent btn3= new Intent(MainActivity3.this,MainActivity4.class);
                btn3.putExtra("nextactivity",thetext);
                startActivity(btn3);

            }
        });

    }
}