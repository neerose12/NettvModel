package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

public class ChannelModel {
    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;
    @SerializedName("description")
    String description;
    @SerializedName("channel_number")
    int channelNumber;
    @SerializedName("enabled")
    boolean enabled;
    @SerializedName("price")
    double price;
    @SerializedName("language_id")
    int languageId;
    @SerializedName("country")
    String country;
    @SerializedName("platforms")
    int platforms;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlatforms() {
        return platforms;
    }

    public void setPlatforms(int platforms) {
        this.platforms = platforms;
    }
}


