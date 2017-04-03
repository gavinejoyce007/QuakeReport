package com.developer.gavinejoyce.quakereport;

/**
 * Created by Gavine on 17-08-2016.
 */
public class Earthquake {

    public double mMagnitude;
    public String mLocation;
    public long mDate;
    public String mUrl;

    public String getMtitle() {
        return mtitle;
    }

    public String mtitle;

    public String getMnop() {
        return mnop;
    }

    public String getMps() {
        return mps;
    }

    public String mnop;
    public String mps;

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmUrl(){ return mUrl;}

    public Earthquake(double magnitude, String location, long date, String Url,String title, String nop, String ps)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = Url;
        mtitle = title;
        mnop = nop;
        mps = ps;
    }
}
