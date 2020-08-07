package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView kigou;
    private BigDecimal n = new BigDecimal("0.0");
    private BigDecimal i = new BigDecimal("0.0");
    private BigDecimal keta = new BigDecimal("10.0");
    private BigDecimal reset = new BigDecimal("0.0");
    private int cnt = 0;
    private int kigou_check = 0; //0:なし 1:足し算 2:引き算 3:掛け算 4:割り算
    private DecimalFormat format = new DecimalFormat("##,###,###.#######");
    private int decimal_seisu = 0;
    private boolean decimal_flg = false;
    private int decimal_cnt = 0;
    private BigDecimal decimal_hozon = new BigDecimal("0");
    private String zero_set = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.first_text);
        text2 = findViewById(R.id.second_text);
        text3 = findViewById(R.id.third_text);
        kigou = findViewById(R.id.kigou);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button clear = findViewById(R.id.clear);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multi = findViewById(R.id.multi);
        Button div = findViewById(R.id.div);
        Button equ = findViewById(R.id.equ);
        Button decimal = findViewById(R.id.decimal);

        if(kigou_check != 0){
            text3.setText(String.valueOf(format.format(n)));
        } else {
            text1.setText(String.valueOf(format.format(n)));
        }

        one.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){
                        decimal_hozon = new BigDecimal("1");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;
                    }else{
                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("1"));
                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        two.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){
                        decimal_hozon = new BigDecimal("2");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;
                    }else{
                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("2"));
                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        three.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("3");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("3"));

                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        four.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("4");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("4"));

                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        five.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("5");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{
                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("5"));
                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        six.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("6");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("6"));

                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        seven.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){

                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("7");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("7"));

                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        eight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){
                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("8");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("8"));

                    }

                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        nine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){
                    if(decimal_flg){

                        decimal_hozon = new BigDecimal("9");
                        for(int a = 0; a <= decimal_cnt; a++){
                            decimal_hozon = decimal_hozon.divide(keta);
                        }
                        n = n.add(decimal_hozon);
                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);
                        n = n.add(new BigDecimal("9"));

                    }
                    if(kigou_check != 0){
                        text3.setText(String.valueOf(format.format(n)));
                    } else{
                        text1.setText(String.valueOf(format.format(n)));
                    }
                    cnt++;
                    zero_set = String.valueOf(format.format(n));
                }
            }
        });

        zero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cnt < 8){
                    if(decimal_flg){

                        zero_set = zero_set + "0";


                        if(kigou_check != 0){
                            text3.setText(zero_set);
                        }else{
                            text1.setText(zero_set);
                        }

                        decimal_cnt++;

                    }else{

                        n = n.multiply(keta);

                        if(kigou_check != 0){
                            text3.setText(String.valueOf(format.format(n)));
                        } else{
                            text1.setText(String.valueOf(format.format(n)));
                        }

                    }

                    cnt++;

                }
            }
        });

        clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                n = reset;
                i = reset;
                text1.setText(String.valueOf(format.format(n)));
                text2.setText(null);
                text3.setText(null);
                kigou.setText(null);
                cnt = 0;
                kigou_check = 0;
                decimal_flg = false;
                decimal_cnt = 0;

            }
        });

        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(kigou_check){
                    case 0:
                        i = n;
                        break;
                    case 1:
                        i = i.add(n);
                        break;
                    case 2:
                        i = i.subtract(n);
                        break;
                    case 3:
                        i = i.multiply(n);
                        break;
                    case 4:
                        i = i.divide(n,8, BigDecimal.ROUND_HALF_UP);
                        break;
                }

                n = reset;
                text1.setText(null);

                if(i.compareTo(new BigDecimal("99999999")) <= 0 && i.compareTo(new BigDecimal("-99999999")) > 0){

                    text2.setText(String.valueOf(format.format(i)));
                    kigou.setText("＋");
                    kigou_check = 1;

                }else{

                    text1.setText("エラー！");
                    n = reset;
                    i = reset;
                    text2.setText(null);
                    kigou.setText(null);
                    kigou_check = 0;

                }

                text3.setText(null);
                cnt = 0;
                decimal_cnt = 0;
                decimal_flg = false;

            }
        });

        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(kigou_check){
                    case 0:
                        i = n;
                        break;
                    case 1:
                        i = i.add(n);
                        break;
                    case 2:
                        i = i.subtract(n);
                        break;
                    case 3:
                        i = i.multiply(n);
                        break;
                    case 4:
                        i = i.divide(n,8, BigDecimal.ROUND_HALF_UP);
                        break;
                }

                n = reset;
                text1.setText(null);

                if(i.compareTo(new BigDecimal("99999999")) <= 0 && i.compareTo(new BigDecimal("-99999999")) > 0){

                    text2.setText(String.valueOf(format.format(i)));
                    kigou.setText("－");
                    kigou_check = 2;

                }else{

                    text1.setText("エラー！");
                    n = reset;
                    i = reset;
                    text2.setText(null);
                    kigou.setText(null);
                    kigou_check = 0;

                }

                text3.setText(null);
                cnt = 0;
                decimal_cnt = 0;
                decimal_flg = false;

            }
        });

        multi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(kigou_check){
                    case 0:
                        i = n;
                        break;
                    case 1:
                        i = i.add(n);
                        break;
                    case 2:
                        i = i.subtract(n);
                        break;
                    case 3:
                        i = i.multiply(n);
                        break;
                    case 4:
                        i = i.divide(n,8, BigDecimal.ROUND_HALF_UP);
                        break;
                }

                n = reset;
                text1.setText(null);

                if(i.compareTo(new BigDecimal("99999999")) <= 0 && i.compareTo(new BigDecimal("-99999999")) > 0){
                    text2.setText(String.valueOf(format.format(i)));
                    kigou.setText("×");
                    kigou_check = 3;
                }else{
                    text1.setText("エラー！");
                    n = reset;
                    i = reset;
                    text2.setText(null);
                    kigou.setText(null);
                }

                text3.setText(null);
                cnt = 0;
                decimal_cnt = 0;
                decimal_flg = false;

            }
        });

        div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(kigou_check){
                    case 0:
                        i = n;
                        break;
                    case 1:
                        i = i.add(n);
                        break;
                    case 2:
                        i = i.subtract(n);
                        break;
                    case 3:
                        i = i.multiply(n);
                        break;
                    case 4:
                        i = i.divide(n,8, BigDecimal.ROUND_HALF_UP);
                        break;
                }

                n = reset;
                text1.setText(null);

                if(i.compareTo(new BigDecimal("99999999")) <= 0 && i.compareTo(new BigDecimal("-99999999")) > 0){
                    text2.setText(String.valueOf(format.format(i)));
                    kigou.setText("÷");
                    kigou_check = 4;
                }else{
                    text1.setText("エラー！");
                    n = reset;
                    i = reset;
                    text2.setText(null);
                    kigou.setText(null);
                    kigou_check = 0;
                }

                text3.setText(null);
                cnt = 0;
                decimal_cnt = 0;
                decimal_flg = false;

            }
        });

        equ.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(kigou_check){
                    case 0:
                        i = n;
                        break;
                    case 1:
                        i = i.add(n);
                        break;
                    case 2:
                        i = i.subtract(n);
                        break;
                    case 3:
                        i = i.multiply(n);
                        break;
                    case 4:
                        i = i.divide(n,8, BigDecimal.ROUND_HALF_UP);
                        break;
                }

                decimal_seisu = String.valueOf(i.setScale(0,BigDecimal.ROUND_DOWN)).length();
                n = i.setScale(8 - decimal_seisu, BigDecimal.ROUND_HALF_UP);

                if(n.compareTo(new BigDecimal("99999999")) <= 0 && n.compareTo(new BigDecimal("-99999999")) > 0){
                    text1.setText(String.valueOf(format.format(n)));
                }else{
                    text1.setText("エラー！");
                }

                text2.setText(null);
                text3.setText(null);
                kigou.setText(null);
                cnt = 0;
                kigou_check = 0;
                decimal_flg = false;
                decimal_cnt = 0;

            }
        });

        decimal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                decimal_flg = true;
                zero_set = String.valueOf(format.format(n))+ ".";

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("back_now", n.toString());
        outState.putString("back_before", i.toString());
        outState.putInt("kigou_flg", kigou_check);
        outState.putInt("back_cnt", cnt);
        outState.putBoolean("decimal_flg", decimal_flg);
        outState.putString( "zero_set" , zero_set);

    }

    @Override
    protected void onRestoreInstanceState(Bundle saved) {
        super.onRestoreInstanceState(saved);

        if(saved.getInt("kigou_flg") != 0){

            text1.setText(null);
            n = new BigDecimal(saved.getString("back_now"));
            i = new BigDecimal(saved.getString("back_before"));
            text2.setText(String.valueOf(format.format(i)));
            text3.setText(String.valueOf(format.format(n)));
            kigou_check = saved.getInt("kigou_flg");

            switch(kigou_check){
                case 1:
                    kigou.setText("＋");
                    break;
                case 2:
                    kigou.setText("－");
                    break;
                case 3:
                    kigou.setText("×");
                    break;
                case 4:
                    kigou.setText("÷");
                    break;
            }

        } else{
            text1.setText(String.valueOf(format.format(n)));
        }

        n = new BigDecimal(saved.getString("back_now"));
        cnt = saved.getInt("back_cnt");
        decimal_flg = saved.getBoolean("decimal_flg");
        zero_set = saved.getString("zero_set");

    }
}
