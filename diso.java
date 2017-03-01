package com.example.hp.twentyfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class diso extends AppCompatActivity {
TextView tt,tt1,tt2,tt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diso);
        tt=(TextView)findViewById(R.id.textView5);
        tt1=(TextView)findViewById(R.id.textView6);
        tt2=(TextView)findViewById(R.id.textView7);
        tt3=(TextView)findViewById(R.id.textView8);
        String name,name1,name2,name3;
        name=getIntent().getExtras().getString("Name").toString();
        name1=getIntent().getExtras().getString("lastName").toString();
        name2=getIntent().getExtras().getString("no").toString();
        name3=getIntent().getExtras().getString("state").toString();
        tt.setText(name);
        tt1.setText(name1);
        tt2.setText(name2);
        tt3.setText(name3);
    }
}
