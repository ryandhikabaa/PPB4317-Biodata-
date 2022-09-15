package com.dc024.biodata_apps8sept22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvMessage;
    private ImageView ivProfile2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvMessage = findViewById(R.id.tvMessage);
        ivProfile2 = findViewById(R.id.ivProfile2);

        Bundle intent = getIntent().getExtras();
        if (intent != null){
            tvMessage.setText(intent.getString("EXTRA_TEXT1"));
            ivProfile2.setImageResource(intent.getInt("EXTRA_IMAGE"));
        }
    }
}