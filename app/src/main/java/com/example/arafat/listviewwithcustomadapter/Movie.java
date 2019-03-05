package com.example.arafat.listviewwithcustomadapter;

public class Movie {

    private int mImgaeDrawable;
    private String mName;
    private String mRelease;

    public Movie(int mImgaeDrawable, String mName, String mRelease) {
        this.mImgaeDrawable = mImgaeDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public int getmImgaeDrawable() {
        return mImgaeDrawable;
    }

    public void setmImgaeDrawable(int mImgaeDrawable) {
        this.mImgaeDrawable = mImgaeDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }
}
