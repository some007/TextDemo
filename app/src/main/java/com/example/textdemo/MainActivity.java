package com.example.textdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        String text = "I want THIS and THIS click";
        SpannableString ss  = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                //Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Actvity.class);
                startActivity(intent);
                finish();

            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                //Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Actvity.class);
                startActivity(intent);
                finish();
            }
        };

        ss.setSpan(clickableSpan1,7,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2,16,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


    }
}