package com.cudocomm.assetwatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.list_view);

        String[] values = new String[] {"List 1","List 2","List 3","List 4", "List 5", "List 6", "List 7", "List 8", "List 9", "List 10"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //Assign adapter to ListView
        listView.setAdapter(adapter);

        //ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){

                //ListView Clicked item index
                int itemPosition = position;

                //ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                //show Alert
                Toast.makeText(getApplicationContext(),
                        "Position: " + itemPosition + " ListItem: " + itemValue, Toast.LENGTH_LONG).show();
            }
        });

    }
}
