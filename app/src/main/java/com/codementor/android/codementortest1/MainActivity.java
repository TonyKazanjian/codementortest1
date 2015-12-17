package com.codementor.android.codementortest1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ViewAdapter mViewAdapter;

    List<Name> mNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(this,"add a name", Toast.LENGTH_SHORT).show();
            }
        });

        initializeNameList();

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_namelist);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mViewAdapter = new ViewAdapter(mNames);
        mRecyclerView.setAdapter(mViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeNameList(){
        mNames = new ArrayList<>();
        mNames.add(new Name("Ryan"+ " ","Simon"));
        mNames.add(new Name("Tony","Kazanjian"));
        mNames.add(new Name("Luke","Skywalker"));
        mNames.add(new Name("Han","Solo"));
        mNames.add(new Name("Jabba","The Hutt"));
    }

    private void addNewName(Name name){
        mNames.add(name);
    }
}
