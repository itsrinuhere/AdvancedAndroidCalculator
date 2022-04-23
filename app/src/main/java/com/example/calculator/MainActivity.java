package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext = (EditText) findViewById(R.id.input);
        Button button = (Button) findViewById(R.id.submit);
        try{
            TextView outputview = (TextView) findViewById(R.id.output);
            button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  int output =0;
                  if(edittext.getText().toString().matches("(.*)+(.*)")){
                      String[] data = edittext.getText().toString().split("[+]");
                      for(String a : data)
                          output = output+Integer.parseInt(a);
                  }
                  outputview.setText(String.valueOf(output));
                  }
          });
        }catch(Exception ex){
            Toast.makeText(this,ex.toString(),Toast.LENGTH_LONG).show();
        }
    }

}