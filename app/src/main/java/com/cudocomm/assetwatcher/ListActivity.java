package com.cudocomm.assetwatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.cudocomm.assetwatcher.adapter.TaskListAdapter;
import com.cudocomm.assetwatcher.model.Model_TaskList;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    TaskListAdapter taskListAdapter;
    private ArrayList<Model_TaskList> taskListArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.list_view);

        taskListAdapter = new TaskListAdapter(this, taskListArray);

        //Assign adapter to ListView
        listView.setAdapter(taskListAdapter);

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

    void populateData(){
        for(int i=0; i <= 10; i++){
            Model_TaskList model_taskList = new Model_TaskList();
            model_taskList.setAtm_type("hardware");
            model_taskList.setSiteid("01");
            model_taskList.setNe_name("Site01");
            model_taskList.setLat("-6.31823272");
            model_taskList.setLon("1.382382382");
            model_taskList.setNoatf("019382");
            model_taskList.setNe_id("02");
            model_taskList.setPending("Pending");
            model_taskList.setProjectid("03");
            model_taskList.setStatus("Active");
            model_taskList.setRemark("Remark");
            model_taskList.setTargetdate("10/01/2017");
            model_taskList.setTaskid("09");
            model_taskList.setSitename("Site Name 01");
            model_taskList.setProjectid("P01");
        }
    }
}
