package com.yatutarsa.pratikprojeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText birinciBar,ikinciBar;
    private int sonuc;
    private int sayi1,sayi2;
    private Hesapla hesapla;
    private TextView txtSonuc;
    private Button topla,cikar,carp,bol,esittir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        birinciBar=(EditText) findViewById(R.id.birinciBar);
        ikinciBar=(EditText) findViewById(R.id.ikinciBar);
        txtSonuc=(TextView)findViewById(R.id.txtSonuc);
        topla=findViewById(R.id.topla);
        cikar=findViewById(R.id.cikar);
        carp=findViewById(R.id.carp);
        bol=findViewById(R.id.bol);
        esittir=findViewById(R.id.esittir);





        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayi1=Integer.valueOf(birinciBar.getText().toString());
                sayi2=Integer.valueOf(ikinciBar.getText().toString());
                hesapla=new Hesapla(sayi1,sayi2);
                txtSonuc.setText(Integer.toString(hesapla.toplama()));
            }
        });

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayi1=Integer.valueOf(birinciBar.getText().toString());
                sayi2=Integer.valueOf(ikinciBar.getText().toString());
                hesapla=new Hesapla(sayi1,sayi2);
                txtSonuc.setText(Integer.toString(hesapla.cikarma()));
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Integer.valueOf(birinciBar.getText().toString());
                sayi2=Integer.valueOf(ikinciBar.getText().toString());
                hesapla=new Hesapla(sayi1,sayi2);
                txtSonuc.setText(Integer.toString(hesapla.carpma()));
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1=Integer.valueOf(birinciBar.getText().toString());
                sayi2=Integer.valueOf(ikinciBar.getText().toString());
                hesapla=new Hesapla(sayi1,sayi2);
                txtSonuc.setText(Integer.toString(hesapla.bolme()));
            }
        });


    }




        }
