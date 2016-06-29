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

public class DesktopActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;
    private String[] desktop = new String[] {"GeForce GTX 1080", "GeForce GTX 760 Ti", "GeForce GTX 560 Ti"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop);

        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, desktop);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String desktop = ((TextView)view).getText().toString();
                Toast.makeText(DesktopActivity.this, desktop, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();

    }
}
