package com.example.tp2;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CaptionScreen extends AppCompatActivity {
TextView textView;
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caption_screen);
        textView=findViewById(R.id.textView);
        String message=getIntent().getStringExtra("message");
        textView.setText(message);
        back=findViewById(R.id.back);
        back.setOnClickListener(v->{
            finish();
        });
    }
}