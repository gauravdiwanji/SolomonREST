package com.solomon.rest.model;

public class Items
{
    private String _100;

    public String get100 ()
    {
        return _100;
    }

    public void set100 (String _100)
    {
        this._100 = "100";
    }

    @Override
    public String toString()
    {
        return "ClassPojo [100 = "+100+"]";
    }
}
