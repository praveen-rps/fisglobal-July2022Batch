package com.logicbig.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyMsg {
    private int id;
    private String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyMsg{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}