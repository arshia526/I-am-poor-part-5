package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button button;
    Button button1;
    TextView text;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button3);
        button1 = (Button)findViewById(R.id.button4);
        text = findViewById(R.id.textView2);
        image = findViewById(R.id.imageView2);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                text.setText("I AM RICH");
                text.setTextColor(Color.GREEN);
                //image.setImageResource(R.drawable.diamond);
            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                text.setText("I AM POOR");
                text.setTextColor(Color.RED);
                //image.setImageResource(R.drawable.coal);
            }
        });
    }
}
