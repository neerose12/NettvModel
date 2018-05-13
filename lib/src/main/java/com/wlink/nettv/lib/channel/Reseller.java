package com.wlink.nettv.lib.channel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Reseller {

    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;

    @SerializedName("users")
    List<User> users;

    @SerializedName("categories")
    List<Categorie> categories;
}
