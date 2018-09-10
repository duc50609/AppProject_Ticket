package com.boring.a0704myappl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener
{
    RadioGroup rg1,rg2;
    RadioButton half,old,all,one,two,three,four;
    TextView tv2,tv;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        half=findViewById(R.id.half);
        old=findViewById(R.id.old);
        all=findViewById(R.id.all);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        tv=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv2);
        ok=findViewById(R.id.but_ok);
        ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(rg1.getCheckedRadioButtonId()){
            case R.id.all: tv.setText("買全票");break;
            case R.id.half: tv.setText("買半票");break;
            case R.id.old: tv.setText("買敬老票");break;

        }
        switch(rg2.getCheckedRadioButtonId()){
            case R.id.one: tv2.setText("1張");break;
            case R.id.two: tv2.setText("2張");break;
            case R.id.three: tv2.setText("3張");break;
            case R.id.four: tv2.setText("4張");break;
        }
    }
}
