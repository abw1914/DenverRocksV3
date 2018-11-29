package com.android.denverrocksv3.Data;

public class DataModel {
    private String name;
    private String description;
    private int imageResourceId = NO_IMAGE_AVAILABLE;
    private static final int NO_IMAGE_AVAILABLE = -1;

    private String address;
    private String phone;

    public DataModel(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public DataModel(String name, String description, int imageResourceId, String address, String phone) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_AVAILABLE;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
