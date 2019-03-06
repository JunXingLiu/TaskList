package ca.nait.jliu73.tasklist.viewHolders;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import org.w3c.dom.Text;

import ca.nait.jliu73.tasklist.R;

/**
 * Created by Hank on 2019-03-05.
 */

// id, description/title -- database fields
public class TaskHeaderHolder extends GroupViewHolder
{
    private TextView taskTitle;

    public TaskHeaderHolder(View itemView)
    {
        super(itemView);
        taskTitle = (TextView)itemView.findViewById(R.id.list_task_name);
    }

    public void setTaskTitle(String title)
    {
        taskTitle.setText(title);
    }
}
