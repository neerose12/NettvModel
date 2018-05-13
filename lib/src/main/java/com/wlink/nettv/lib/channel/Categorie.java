package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Categorie {

    @SerializedName("id")
    int id;
    @SerializedName("category")
    String category;
    @SerializedName("description")
    String description;
    @SerializedName("logo")
    String logo;
    @SerializedName("priority")
    int priority;
    @SerializedName("reseller_id")
    int resellerId;
    @SerializedName("channel_sort_by")
    String channelSortBy;
    @SerializedName("status")
    boolean status;

}
