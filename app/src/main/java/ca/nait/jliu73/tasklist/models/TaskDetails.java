package ca.nait.jliu73.tasklist.models;

/**
 * Created by Hank on 2019-03-05.
 */

public class TaskDetails
{
    private String description;

    public TaskDetails(String description)
    {
        this.description = description;
    }

    public TaskDetails()
    {

    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
