package com.zjh.bean;

import org.apache.ibatis.type.Alias;

@Alias("Student")
public class Student {
    private int id;
    private String name;
    private int tid;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(int id, String name, int tid, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.teacher = teacher;
    }

    private Teacher teacher;
}
