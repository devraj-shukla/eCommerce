package com.example.ecommerce.entities;

import java.util.Date;

public class Transaction {
    int tId;
    int uId;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    int pId;
    int mId;
    int quantity;
    Date timeSpan;
    int state;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Date timeSpan) {
        this.timeSpan = timeSpan;
    }


}
