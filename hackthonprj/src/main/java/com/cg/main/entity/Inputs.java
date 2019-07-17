package com.cg.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inputs {
	
Inputs()
{

}
@Id
 private double version;
 private String title;
 private int host;
 private String basePath;
 
 
public double getVersion() {
	return version;
}
public void setVersion(double d) {
	this.version = d;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getHost() {
	return host;
}
public void setHost(int host) {
	this.host = host;
}
public String getBasePath() {
	return basePath;
}
public void setBasePath(String basePath) {
	this.basePath = basePath;
}
@Override
public String toString() {
	return "Inputs [version=" + version + ", title=" + title + ", host=" + host + ", basePath=" + basePath + "]";
}

 
 }


