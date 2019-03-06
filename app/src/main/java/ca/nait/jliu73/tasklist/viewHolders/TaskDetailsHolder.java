package ca.nait.jliu73.tasklist.viewHolders;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import org.w3c.dom.Text;

import ca.nait.jliu73.tasklist.R;

/**
 * Created by Hank on 2019-03-05.
 */
// id, foregin key, description, date, completed -- database fields
public class TaskDetailsHolder extends ChildViewHolder
{
    private TextView description;
    public TaskDetailsHolder(View itemView)
    {
        super(itemView);
        description = (TextView)itemView.findViewById(R.id.tv_description);

    }

    public void setDescription(String desc)
    {
        description.setText(desc);
    }
}

