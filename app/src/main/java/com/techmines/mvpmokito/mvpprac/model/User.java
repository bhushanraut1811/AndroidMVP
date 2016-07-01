package com.techmines.mvpmokito.mvpprac.model;

/**
 * Created by bhushan.raut on 6/1/2016.
 *    Model Class
 */


public class User {

    private String mPassword;
    private String mUserName;

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassword() {
        return mPassword;
    }

    public String getmUserName() {
        return mUserName;
    }

    @Override
    public String toString() {
        return "User{" +
                "mPassword='" + mPassword + '\'' +
                ", mUserName='" + mUserName + '\'' +
                '}';
    }


}
