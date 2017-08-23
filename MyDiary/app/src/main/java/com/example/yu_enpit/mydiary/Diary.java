package com.example.yu_enpit.mydiary;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Prof.Hamamoto on 2017/08/21.
 */

public class Diary extends RealmObject {
    @PrimaryKey
    public long id;
    public String title;
    public String bodyText;
    public String date;
    public byte[] image;
}