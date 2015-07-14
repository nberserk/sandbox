package com.nberserk.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(description="Model")
@XmlRootElement
public class Model {

    @XmlElement(name="id")
    String id;
    String desc;

    public Model(String id){
        this.id = id;
    }

    @ApiModelProperty(required = true, value = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @ApiModelProperty(value = "description")
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "id: " + id + ", desc: " + desc;
    }
}
