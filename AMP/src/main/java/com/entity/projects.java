package com.entity;

public class projects {
	
	private int id;
    private String name;
    private String description;
    private String field;
    private String status;
    private String pdate;
    private int hid; // Added for the foreign key

    public projects() {
        super();
    }

    public projects(String name, String description, String field, String status, String pdate, int hid) {
        super();
        this.name = name;
        this.description = description;
        this.field = field;
        this.status = status;
        this.pdate = pdate;
        this.hid = hid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

}
