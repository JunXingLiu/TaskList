package ca.nait.jliu73.tasklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import ca.nait.jliu73.tasklist.adapter.TaskHeaderAdapater;
import ca.nait.jliu73.tasklist.models.TaskDetails;
import ca.nait.jliu73.tasklist.models.TaskHeader;

public class MainActivity extends BaseActivity implements View.OnClickListener
{
    private static final String TAG = "Main";
    private RecyclerView rv;
    private TaskHeaderAdapater adapater;
    private List<TaskHeader>  headerList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.rv);
        getHeaderList();
        adapater = new TaskHeaderAdapater(headerList);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rv.setAdapter(adapater);
    }

    @Override
    public void onClick(View v) {

    }

    public void getHeaderList()
    {
        Log.d(TAG, "Get List");
        headerList = new ArrayList<>(6);
        for(int i = 0; i < 6; i++)
        {
            List<TaskDetails> details = new ArrayList<>(3);
            details.add(new TaskDetails("LOL"));
            details.add(new TaskDetails("LOL1"));
            details.add(new TaskDetails("LOL1111"));
            headerList.add(new TaskHeader("this is " + i, details));
        }

    }
}
