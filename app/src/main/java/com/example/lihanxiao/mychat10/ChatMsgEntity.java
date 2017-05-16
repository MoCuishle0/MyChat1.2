package com.example.lihanxiao.mychat10;

import android.text.SpannableString;

/**
 * Created by lihanxiao on 2017/5/14.
 */

public class ChatMsgEntity {
    private String name;
    private String date;
    private SpannableString message;
    private boolean isSend = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SpannableString getMessage() {
        return message;
    }

    public void setMessage(SpannableString message) {
        this.message = message;
    }

    public boolean getMsgType() {
        return isSend;
    }

    public void setMsgType(boolean isSend) {
        this.isSend = isSend;
    }

    public ChatMsgEntity() {

    }

    public ChatMsgEntity(String name, String date, SpannableString message, boolean isSend) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.isSend = isSend;
    }
}
