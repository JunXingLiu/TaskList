package ca.nait.jliu73.tasklist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import ca.nait.jliu73.tasklist.R;
import ca.nait.jliu73.tasklist.models.TaskDetails;
import ca.nait.jliu73.tasklist.viewHolders.TaskDetailsHolder;
import ca.nait.jliu73.tasklist.viewHolders.TaskHeaderHolder;

/**
 * Created by Hank on 2019-03-05.
 */

public class TaskHeaderAdapater extends ExpandableRecyclerViewAdapter<TaskHeaderHolder, TaskDetailsHolder>
{
    public TaskHeaderAdapater(List<? extends ExpandableGroup> groups)
    {
        super(groups);
    }

    @Override
    public TaskHeaderHolder onCreateGroupViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_header, parent, false);
        return new TaskHeaderHolder(view);
    }

    @Override
    public TaskDetailsHolder onCreateChildViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_details, parent, false);
        return new TaskDetailsHolder(view);
    }

    @Override
    public void onBindChildViewHolder(TaskDetailsHolder holder, int flatPosition, ExpandableGroup group, int childIndex)
    {
        TaskDetails details = (TaskDetails) group.getItems().get(childIndex);

        holder.setDescription(details.getDescription());
    }

    @Override
    public void onBindGroupViewHolder(TaskHeaderHolder holder, int flatPosition, ExpandableGroup group)
    {
        holder.setTaskTitle(group.getTitle());
    }
}
