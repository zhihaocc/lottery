package com.lottery.app.config;

public class Test2 {
    private String id;
    private String pid;
    private String name;

    public Test2(String id, String pid, String name) {
        this.id = id;
        this.pid = pid;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpid() {
        return pid;
    }

    public void setpid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "id='" + id + '\'' +
                ", pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}