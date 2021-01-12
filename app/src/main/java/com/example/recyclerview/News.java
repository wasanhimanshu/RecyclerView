package com.example.recyclerview;

public class News {
    public String mTitle;
    public String mDescription;
    public String mDate;
    public News(String title,String description,String date){
        mTitle=title;
        mDescription=description;
        mDate=date;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmDescription() {
        return mDescription;
    }

}
