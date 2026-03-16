package com.chaitanya.RESTAPI3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fid;
    private String fname;
    private String fpass;
    private String femail;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFpass() {
        return fpass;
    }

    public void setFpass(String fpass) {
        this.fpass = fpass;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    @Override
    public String toString() {
        return "Farmers{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fpass='" + fpass + '\'' +
                ", femail='" + femail + '\'' +
                '}';
    }
}
