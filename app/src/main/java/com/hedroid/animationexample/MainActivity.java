package com.hedroid.animationexample;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtAnim;
    Button btnTranslate,btnAlpha,btnScale,btnRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtAnim = findViewById(R.id.textView);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnScale = findViewById(R.id.btnScale);
        btnRotate = findViewById(R.id.btnRotate);

        btnTranslate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                 txtAnim.startAnimation(move);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);

                txtAnim.startAnimation(alpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);

                txtAnim.startAnimation(rotate);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);

                txtAnim.startAnimation(scale);
            }
        });

    }
}