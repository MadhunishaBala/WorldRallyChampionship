package com.example.worldrallychampionship;

public class Race {  //Defines the attributes in a race class
    private String Date;
    private String Location;
    private int ChampionId;
    public Race(String Date, String Location,int ChampionId) //Constructors
    {
        this.Date=Date;
        this.Location=Location;
        this.ChampionId=ChampionId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getLocation()
    {
        return Location;
    }
    public void setLocation(String Location)
    {
        this.Location=Location;
    }
    public int getChampionId()
    {
        return ChampionId;
    }

    public void setChampionId(int ChampionId)
    {
        this.ChampionId=ChampionId;
    }


}
