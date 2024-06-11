package com.example.user_list;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainxml);
        ArrayList<String> array = new ArrayList<String>();
        ArrayAdapter<String> AA = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,array);
        EditText et = findViewById(R.id.ET_id);
        ListView lv = findViewById(R.id.LV_id);
        Button bt=findViewById(R.id.BT_id);
        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                array.add(name);
                et.setText("");
                AA.notifyDataSetChanged();

            }
        };

        bt.setOnClickListener(listener);
        lv.setAdapter(AA);

    }
}
