package com.example.guest.bizlister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.findDesktopButton) Button mFindDesktopButton;
    @Bind(R.id.findLaptopButton) Button mFindLaptopButton;
    @Bind(R.id.findMobileButton) Button mFindMobileButton;
    @Bind(R.id.findTabletButton) Button mFindTabletButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mFindDesktopButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mFindTabletButton) {
            Intent intent = new Intent(MainActivity.this, TabletActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == mFindMobileButton) {
            Intent intent = new Intent(MainActivity.this, MobileActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == mFindLaptopButton) {
            Intent intent = new Intent(MainActivity.this, LaptopActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        if(v == mFindDesktopButton) {
            Intent intent = new Intent(MainActivity.this, DesktopActivity.class);
            startActivity(intent);
        }
    }

}



