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

public class MobileActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;
    private String[] mobile = new String[] {"Tegra X1", "Tegra 4", "Tegra 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, mobile);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mobile = ((TextView)view).getText().toString();
                Toast.makeText(MobileActivity.this, mobile, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
}

}