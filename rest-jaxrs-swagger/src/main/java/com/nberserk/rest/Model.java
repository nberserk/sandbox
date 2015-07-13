package com.nberserk.rest;

/**
 * Created by darren on 2015. 7. 13..
 */
public class Model {
    String id;
    String desc;

    public Model(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
