package com.example.lad1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMygtukas(View view) {
        TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setText("Hello");
        TextView tvMain1 = (TextView)findViewById(R.id.tvMain1);
        tvMain1.setText("WORLD");
    }
    public void onBtnMainColor(View view) {
        TextView tvMain = (TextView) findViewById(R.id.tvMain);
        tvMain.setTextColor(Color.parseColor("#FF3700B3"));
        TextView tvMain1 = (TextView) findViewById(R.id.tvMain1);
        tvMain1.setTextColor(Color.parseColor("#FF018786"));
    }
}