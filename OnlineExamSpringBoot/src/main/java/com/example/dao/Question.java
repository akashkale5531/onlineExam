package com.example.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question implements Serializable {

@Id
public int qno;
public  String qtxt;
public  String qans;
public  String opt1;
public  String opt2;
public  String opt3;

public int getQno() {
	return qno;
}
@Override
public String toString() {
	return "Question [qno=" + qno + ", qtxt=" + qtxt + ", qans=" + qans
			+ ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + "]";
}
public void setQno(int qno) {
	this.qno = qno;
}
public String getQtxt() {
	return qtxt;
}
public void setQtxt(String qtxt) {
	this.qtxt = qtxt;
}
public String getQans() {
	return qans;
}
public void setQans(String qans) {
	this.qans = qans;
}
public String getOpt1() {
	return opt1;
}
public void setOpt1(String opt1) {
	this.opt1 = opt1;
}
public String getOpt2() {
	return opt2;
}
public void setOpt2(String opt2) {
	this.opt2 = opt2;
}
public String getOpt3() {
	return opt3;
}
public void setOpt3(String opt3) {
	this.opt3 = opt3;
}
 
}
