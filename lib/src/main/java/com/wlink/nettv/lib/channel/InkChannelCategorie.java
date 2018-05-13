package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

public class InkChannelCategorie {

    @SerializedName("id")
    int id;
    @SerializedName("channel_id")
    int channelId;
    @SerializedName("category_id")
    int categoryId;
    @SerializedName("priority")
    int priority;
}
