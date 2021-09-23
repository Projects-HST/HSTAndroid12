package com.hst.osa_koodaiapp.bean.support;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class AdvertisementList {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("data")
    @Expose
    private ArrayList<com.hst.osa_koodaiapp.bean.support.Advertisement> advertisementArrayList = new ArrayList<>();

    /**
     * @return The count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return The advertisementArrayList
     */
    public ArrayList<com.hst.osa_koodaiapp.bean.support.Advertisement> getAdvertisementArrayList() {
        return advertisementArrayList;
    }

    /**
     * @param advertisementArrayList The advertisementArrayList
     */
    public void setAdvertisementArrayList(ArrayList<com.hst.osa_koodaiapp.bean.support.Advertisement> advertisementArrayList) {
        this.advertisementArrayList = advertisementArrayList;
    }
}
