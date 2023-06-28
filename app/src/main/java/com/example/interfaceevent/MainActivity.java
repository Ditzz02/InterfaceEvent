package com.example.interfaceevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickHello(View v) {
        TextView hello = findViewById(R.id.txthello);
        hello.setText("Welcome Kominfo");
    }
}