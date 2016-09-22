package com.example.cloyster23.chatapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayAdapter<String> adapter;
    ListView listView;
    Toolbar toolbar;
    private Toolbar supportActionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  //      adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayOfKontakt);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
   //     listView.setAdapter(adapter);


        ArrayList<Kontakt> arrayOfKontakt = new ArrayList<Kontakt>();
        Kontakt kontakt1 = new Kontakt("Jon");
        Kontakt kontakt2 = new Kontakt("Didrik");
        Kontakt kontakt3 = new Kontakt("Thom");

        arrayOfKontakt.add(kontakt1);
        arrayOfKontakt.add(kontakt2);
        arrayOfKontakt.add(kontakt3);

        kontaktAdapter kontAdapter = new kontaktAdapter(this, arrayOfKontakt);
        ListView listView = (ListView) findViewById(R.id.lvContacts);
        listView.setAdapter(kontAdapter);
    }

    public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;

    }
}
