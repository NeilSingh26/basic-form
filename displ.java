package com.example.hp.twentyfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.onClick;
import static android.R.id.list;

public class displ extends AppCompatActivity {
    ListView lv;
    List<String> friends = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displ);
        lv = (ListView) findViewById(R.id.list1);
        //List<String> friends=new ArrayList<String>();
        friends.add("Abhi");
        friends.add("Vivek");
        friends.add("Tarun");

        final ArrayAdapter<String> fAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, friends);
        lv.setAdapter(fAdapter);


        registerForContextMenu(lv);


    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);


    }

    @Override
    public boolean onContextItemSelected(final MenuItem item) {

       // ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,list);
        ArrayAdapter<String> fAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, friends);
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        //     lv.setOnClickListener(new View.OnClickListener()
        //    {
        //      public void onClick (View v) {

        if (item.getItemId() == R.id.item1) {


            /*SparseBooleanArray checkedItem=getListView().getContextItemPositions();
            int itemCount=getListView().getCount();
            for(int i=itemCount-1;i>=0;i--)
            {
                if(checkedItem.get(i))
                {
                    adapter.remove(list.get(i));
                }

            }
            checkedItem.clear();
            adapter.notifyDataSetChanged();*/


            //friends.remove(0);
            fAdapter.remove(fAdapter.getItem(info.position));
            Toast toast = Toast.makeText(displ.this, "deleted", Toast.LENGTH_SHORT);
            toast.show();

        }
        //  }

        //});
        return super.onContextItemSelected(item);


    }


}