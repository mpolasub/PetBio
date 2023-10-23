package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView breadView;
    private ImageView fishView;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breadView = (ImageView) findViewById(R.id.breadViewId);
        fishView = (ImageView) findViewById(R.id.fishViewId);
        title = (TextView) findViewById(R.id.appTitleId);

        breadView.setOnClickListener(this);
        fishView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.breadViewId:
                Intent breadIntent = new Intent(MainActivity.this, BioActivity.class);
                breadIntent.putExtra("name", "Bread");
                breadIntent.putExtra("bio", "Fan-favorite Hamster who loved apples and pistachios. Born in July 2021 and sadly passed away in October 2023.");
                startActivity(breadIntent);
                Toast.makeText(MainActivity.this, "bread", Toast.LENGTH_LONG).show();
                break;
            case R.id.fishViewId:
                Intent fishIntent = new Intent(MainActivity.this, BioActivity.class);
                fishIntent.putExtra("name", "Dad's Fish");
                fishIntent.putExtra("bio", "Nobody really liked them too much besides my dad, who gave them away after a few years. They are fun to look at.");
                startActivity(fishIntent);
                Toast.makeText(MainActivity.this, "fish", Toast.LENGTH_LONG).show();
                break;
        }
    }
}