package com.example.akumar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s1="";
    double x,y;
    int l,i,flag=-1;
    TextView text1;
    Button button,button2,button13,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button14,button15,button16,button17,button18;
    void evaluate(String t){
        l=t.length();
        i=0;
        if(t.contains("+")) {
            y = Double.parseDouble(t.substring(t.indexOf('+') + 1));
            x = x + y;
            s1 = "" + x;
            text1.setText(s1);
        }
        else if(t.contains("*")){
            y=Double.parseDouble(t.substring(t.indexOf('*')+1));
            x=x*y;
            s1=""+x;
            text1.setText(s1);
        }
        else if(t.contains("/")){
            y=Double.parseDouble(t.substring(t.indexOf('/')+1));
            x=x/y;
            s1=""+x;
            text1.setText(s1);
        }
        else if(t.contains("-") && t.lastIndexOf('-')!=0 ){
            y=Double.parseDouble(t.substring(t.lastIndexOf('-')+1));
            x=x-y;
            s1=""+x;
            text1.setText(s1);
        }
        else
        {
            x = Double.parseDouble(t);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        button18=(Button) findViewById(R.id.button18);
        button13=(Button) findViewById(R.id.button13);
        text1 = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"7";
                text1.setText(s1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"8";
                text1.setText(s1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"9";
                text1.setText(s1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1=="" || s1.charAt(s1.length()-1)=='.'|| s1.charAt(s1.length()-1)=='+'|| s1.charAt(s1.length()-1)=='-'|| s1.charAt(s1.length()-1)=='*'|| s1.charAt(s1.length()-1)=='/'){}
                else {
                    evaluate(s1);
                    if(s1.contains(".")){flag=s1.lastIndexOf('.');}
                    else{flag=-1;}
                    s1 = s1 + "+";
                    text1.setText(s1);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"4";
                text1.setText(s1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"5";
                text1.setText(s1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"6";
                text1.setText(s1);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1.equals("")){
                    s1=s1+"-";
                    text1.setText(s1);
                }
                else {
                    if (s1.charAt(s1.length() - 1) == '.' || s1.charAt(s1.length() - 1) == '+' || s1.charAt(s1.length() - 1) == '-' || s1.charAt(s1.length() - 1) == '*' || s1.charAt(s1.length() - 1) == '/') {
                    } else {
                        evaluate(s1);
                        if (s1.contains(".")) {
                            flag = s1.lastIndexOf('.');
                        } else {
                            flag = -1;
                        }
                        s1 = s1 + "-";
                        text1.setText(s1);
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"1";
                text1.setText(s1);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"2";
                text1.setText(s1);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"3";
                text1.setText(s1);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1==""|| s1.charAt(s1.length()-1)=='.'|| s1.charAt(s1.length()-1)=='+'|| s1.charAt(s1.length()-1)=='-'|| s1.charAt(s1.length()-1)=='*'|| s1.charAt(s1.length()-1)=='/'){}
                else {
                    evaluate(s1);
                    if(s1.contains(".")){flag=s1.lastIndexOf('.');}
                    else{flag=-1;}
                    s1 = s1 + "*";
                    text1.setText(s1);
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                s1=s1+"0";
                text1.setText(s1);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1=="" || s1.charAt(s1.length()-1)=='.'|| s1.charAt(s1.length()-1)=='+'|| s1.charAt(s1.length()-1)=='-'|| s1.charAt(s1.length()-1)=='*'|| s1.charAt(s1.length()-1)=='/'){}
                else {
                    evaluate(s1);
                    if(s1.contains(".")){flag=s1.lastIndexOf('.');}
                    else{flag=-1;}
                    s1 = s1 + "/";
                    text1.setText(s1);
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1.length()>0 && s1.charAt(s1.length()-1)=='.'){}
                else {
                    if((flag==-1 && s1.lastIndexOf('.')>-1) || (flag!=s1.lastIndexOf('.'))){}
                    else{
                        s1 = s1 + ".";
                        text1.setText(s1);}
                }
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(s1=="" || s1.charAt(s1.length()-1)=='+'|| s1.charAt(s1.length()-1)=='-'|| s1.charAt(s1.length()-1)=='*'|| s1.charAt(s1.length()-1)=='/' || s1.charAt(s1.length()-1)=='.'){}
                else {
                    evaluate(s1);
                    text1.setText(s1);
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                s1="";
                x=0;
                y=0;
                flag=-1;
                text1.setText(s1);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(!s1.equals("")) {
                    char x1=s1.charAt(s1.length()-1);
                    if(x1=='+' || x1=='-' || x1=='*' || x1=='/')
                    {
                        flag=-1;
                    }
                    s1 = s1.substring(0, s1.length() - 1);
                    if(s1.equals(""))
                    {
                        s1="";
                        x=0;
                        y=0;
                        flag=-1;
                        text1.setText(s1);
                    }
                    text1.setText(s1);
                }
                else
                {
                    s1="";
                    x=0;
                    y=0;
                    flag=-1;
                    text1.setText(s1);
                }
            }
        });
    }
}
