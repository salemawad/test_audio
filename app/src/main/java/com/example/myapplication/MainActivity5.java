package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    private RadioGroup rg1;
    private RadioButton eb1;
    private Button check;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        rg1=findViewById(R.id.rade);

        check=findViewById(R.id.bnn);
        img=findViewById(R.id.imageView2);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int slected=rg1.getCheckedRadioButtonId();
                eb1=findViewById(slected);
                //Toast.makeText(MainActivity5.this, eb1.getText(), Toast.LENGTH_SHORT).show();
                if (eb1.getText().equals("قسم البرمجة")){

                    img.setImageResource(R.drawable.prm);
                      Toast.makeText(MainActivity5.this, "انت في قسم البرمجة", Toast.LENGTH_SHORT).show();
            }else if (eb1.getText().equals("قسم التصميم")){
                    ;

                    img.setImageResource(R.drawable.tsm);
                    Toast.makeText(MainActivity5.this, "انت في قسم التصميم", Toast.LENGTH_SHORT).show();
        }else if (eb1.getText().equals("قسم قواعد البيانات")) {

                    img.setImageResource(R.drawable.qb);
                    Toast.makeText(MainActivity5.this, "انت في قسم قواعد البيانات", Toast.LENGTH_SHORT).show();
                }else if (eb1.getText().equals("قسم الصوت")) {


                    img.setImageResource(R.drawable.sot);
                    Toast.makeText(MainActivity5.this, "انت في قسم الصوت", Toast.LENGTH_SHORT).show();
                }else{
                 img.setVisibility(View.GONE);

                    Toast.makeText(MainActivity5.this, "انت في قسم التحليل", Toast.LENGTH_SHORT).show();
                }

    }
        } );}}