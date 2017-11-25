package com.example.alondra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imageView = (ImageView) findViewById(R.id.idImageView);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main5Activity.this,"Image was Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}
