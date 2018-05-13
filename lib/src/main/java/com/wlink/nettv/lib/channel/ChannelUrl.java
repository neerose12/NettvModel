package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

public class ChannelUrl {

    @SerializedName("id")
    int id;
    @SerializedName("channel_id")
    int channelId;
    @SerializedName("port")
    int port;
    @SerializedName("path")
    String path;
    @SerializedName("stream_server_id")
    int streamServerId;
}
