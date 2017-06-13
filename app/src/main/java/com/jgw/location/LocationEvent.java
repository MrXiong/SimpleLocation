package com.jgw.location;


import com.baidu.location.BDLocation;

/**
 * Created by user on 2017/6/13.
 */

public class LocationEvent {

    private BDLocation mLocation;
    private String mStr;
    public LocationEvent(BDLocation location, String str){
        this.mLocation = location;
        this.mStr = str;
    }

    public BDLocation getLocation() {
        return mLocation;
    }

    public String getStr() {
        return mStr;
    }
}
