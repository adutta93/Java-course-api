package com.courseapp.topic;

public class Topic {
    
    private String id;
    private String name;
    private String description;


    public Topic() {}
    
    public Topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String description) {
        this.description  = description ;
    }
}
