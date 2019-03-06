package ca.nait.jliu73.tasklist.models;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Hank on 2019-03-05.
 */

public class TaskHeader extends ExpandableGroup
{
    public TaskHeader(String title, List items)
    {
        super(title, items);
    }
}
