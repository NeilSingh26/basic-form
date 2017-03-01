package com.example.hp.twentyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class form1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
    }
    public void jump(View v)
    {
        Intent inte = new Intent(getApplicationContext(),dispf.class);
        startActivity(inte);
    }
    public void jump2(View w)
    {
        Intent inte = new Intent(getApplicationContext(),displ.class);
        startActivity(inte);
    }
}
