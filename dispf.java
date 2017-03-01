package com.example.hp.twentyfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class dispf extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText t1,t2,t3;
    Spinner sp;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispf);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
        sp=(Spinner)findViewById(R.id.sp);
        sp.setOnItemSelectedListener(this);

        List<String> categories=new ArrayList<String>();
        categories.add("Maharashtra");
        categories.add("Gujarat");
        categories.add("Rajasthan");
        categories.add("Punjab");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(dataAdapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
      s=parent.getItemAtPosition(position).toString();

    }

    public void sub(View v)
    {
        Intent inte = new Intent(getApplicationContext(),diso.class);
        inte.putExtra("Name",t1.getText().toString());
        inte.putExtra("lastName",t2.getText().toString());
        inte.putExtra("no",t3.getText().toString());
        inte.putExtra("state",s);
        startActivity(inte);
    }
}
