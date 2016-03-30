package com.example.longyuan.beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  public  static  String EXTRA_MESSAGE = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  sendInfo(View view){
        Intent intent = new Intent(this, SecondActivity.class);
       /* EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();*/
        intent.putExtra(EXTRA_MESSAGE, "hello");
        startActivity(intent);

    }
}
