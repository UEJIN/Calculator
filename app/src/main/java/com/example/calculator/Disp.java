package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.calculator.Operator.add;
import static com.example.calculator.Operator.div;
import static com.example.calculator.Operator.multi;
import static com.example.calculator.Operator.sub;


public class Disp extends AppCompatActivity implements OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpeFlag_1 = (Button)findViewById(R.id.btnOpeFlag_1);
        Button btnOpeFlag_2 = (Button)findViewById(R.id.btnOpeFlag_2);
        Button btnOpeFlag_3 = (Button)findViewById(R.id.btnOpeFlag_3);
        Button btnOpeFlag_4 = (Button)findViewById(R.id.btnOpeFlag_4);

        btnOpeFlag_1.setOnClickListener(this);
        btnOpeFlag_2.setOnClickListener(this);
        btnOpeFlag_3.setOnClickListener(this);
        btnOpeFlag_4.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        //出力値
        String strOutputNum = "";
        //入力値
        int iInputNum1;
        int iInputNum2;
        int iInputOpeFlag = 0;

        // 数値を表示するテキスト
        TextView tvOutputNum = findViewById(R.id.tvOutputNum);

        //　入力値
        EditText etInputNum1 = findViewById(R.id.etInputNum1);
        SpannableStringBuilder sb1 = (SpannableStringBuilder) etInputNum1.getText();
        String string1 = sb1.toString();
        iInputNum1 = Integer.parseInt(string1);

        EditText etInputNum2 = findViewById(R.id.etInputNum2);
        SpannableStringBuilder sb2 = (SpannableStringBuilder) etInputNum2.getText();
        String string2 = sb2.toString();
        iInputNum2 = Integer.parseInt(string2);

        //演算子のフラグ
        switch (v.getId()){
            case R.id.btnOpeFlag_1:
                iInputOpeFlag=add;
                showMessage("+");
                break;
            case R.id.btnOpeFlag_2:
                iInputOpeFlag=sub;
                showMessage("-");
                break;
            case R.id.btnOpeFlag_3:
                iInputOpeFlag=multi;
                showMessage("*");
                break;
            case R.id.btnOpeFlag_4:
                if(iInputNum2!=0) {
                    iInputOpeFlag = div;
                    showMessage("/");
                }else{showMessage("0で除算することはできません。");
                }
                break;
        }


        Calc Calc = new Calc(iInputNum1, iInputNum2, iInputOpeFlag);

        //テキストを設定して表示
        tvOutputNum.setText(Calc.strCalcNum());
    }

    protected void showMessage(String msg){
        Toast.makeText(
            this,
            msg,Toast.LENGTH_SHORT).show();

    }

}
