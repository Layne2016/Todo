package com.ajx.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private String[] str_name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        str_name=getResources().getStringArray(R.array.itemArr);
        mListView= (ListView) findViewById(R.id.item_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1,
                str_name);
         mListView.setAdapter(arrayAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT).show();
                switch (i){
                    case 0:
                        
                        break;
                }
            }
        });
    }
}
