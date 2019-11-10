package com.example.calkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button titik;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button tambah;
    private Button hasil;
    private TextView info;
    private final char TAMBAH = '+';
    private final char KURANG = '-';
    private final char BAGI = '/';
    private final char KALI = '*';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private TextView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+ "9");
            }
        });



        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = TAMBAH;
                back.setText(String.valueOf(val1)+ "+");
                info.setText(null);

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = KURANG;
                back.setText(String.valueOf(val1)+ "-");
                info.setText(null);

            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = BAGI;
                back.setText(String.valueOf(val1)+ "/");
                info.setText(null);

            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = TAMBAH;
                back.setText(String.valueOf(val1)+ "*");
                info.setText(null);

            }
        });


        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                    ACTION = EQU;
                    back.setText(back.getText().toString()+ String.valueOf(val2)+ "=" + String.valueOf(val1));

            }
        });




    }

    private void setupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        zero = (Button)findViewById(R.id.btn0);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        titik = (Button)findViewById(R.id.btnTitik);
        tambah = (Button)findViewById(R.id.btnPlus);
        kali = (Button)findViewById(R.id.btnKali);
        kurang = (Button)findViewById(R.id.btnKurang);
        bagi = (Button)findViewById(R.id.btnBagi);
        hasil = (Button)findViewById(R.id.btnhasil);
        info = (TextView)findViewById(R.id.info);
        back=(TextView)findViewById(R.id.back);


    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION){
                case TAMBAH:
                    val1 = val1 + val2;
                    break;
                case KALI:
                    val1 = val1 * val2;
                    break;
                case KURANG:
                    val1 = val1 - val2;
                    break;
                case BAGI:
                    val1 = val1 / val2;
                    break;

                case EQU:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(info.getText().toString());

        }
    }
}
