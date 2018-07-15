package com.example.niloofar.progresscheckbox;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){

        EditText maxObj=findViewById(R.id.txt_max);
        EditText progressObj=findViewById(R.id.txt_progress);

        TextView textObj=findViewById(R.id.txv_text);

        CheckBox viewObj=findViewById(R.id.cb_textv);
        CheckBox barObj=findViewById(R.id.cb_progressb);

        RadioButton toastObj=findViewById(R.id.rb_toast);
        RadioButton textvObj=findViewById(R.id.rb_textv);

        ProgressBar pbObj=findViewById(R.id.pb_main);

        int max=Integer.parseInt(maxObj.getText().toString());
        int progress=Integer.parseInt(progressObj.getText().toString());

        if(progress<=max){

            if(viewObj.isChecked()){

                textObj.setText("progress is"+progress+"out of"+max);
            }
            if(barObj.isChecked()){
               pbObj.setMax(max);
               pbObj.setProgress(progress);
            }


        }else{

           if(toastObj.isChecked()){
               Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
           }else{
               textObj.setText("Error");
               textObj.setTextColor(Color.RED);
           }










        }
















    }


}
