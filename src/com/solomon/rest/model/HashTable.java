package com.solomon.rest.model;

import java.util.List;
import java.util.Map;

public class HashTable
{
	private List<Map<String, String>> items;

    private String length;

    public List<Map<String, String>> getItems ()
    {
        return items;
    }

    public void setItems (List<Map<String, String>> items)
    {
        this.items = items;
    }

    public String getLength ()
    {
        return length;
    }

    public void setLength (String length)
    {
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [items = "+items+", length = "+length+"]";
    }
}
