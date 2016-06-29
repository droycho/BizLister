package com.example.guest.bizlister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LaptopActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;
    private String[] laptop = new String[] {"GeForce GTX 980", "GeForce GT 755M", "GeForce 945M"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, laptop);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String laptop = ((TextView)view).getText().toString();
                Toast.makeText(LaptopActivity.this, laptop, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();

    }
}
