package com.databiz.dbdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Storeinformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeDetail;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Storeinformation{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeDetail='" + storeDetail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Storeinformation() {
    }

    public Storeinformation( String storeName, String storeDetail, String phoneNumber) {

        this.storeName = storeName;
        this.storeDetail = storeDetail;
        this.phoneNumber = phoneNumber;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetail() {
        return storeDetail;
    }

    public void setStoreDetail(String storeDetail) {
        this.storeDetail = storeDetail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
