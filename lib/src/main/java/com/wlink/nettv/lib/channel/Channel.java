package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public class Channel {

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
    enum type{
        HD(1),
        SD(2);

        int mtype;

        type(int type) {
            this.mtype = type;
        }

        public int getType() {
            return mtype;
        }
  }
}
