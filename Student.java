package BT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
private String id;
private String name;
private String sex;
private double javaMark;
private double PythonMark;
private double DiemTB;
 private String ketqua;

public double getDiemTB() {
	return DiemTB;
}
public void setDiemTB(double diemTB) {
	DiemTB = diemTB;
}
public String getKetqua() {
	return ketqua;
}
public void setKetqua(String ketqua) {
	this.ketqua = ketqua;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public double getjavaMark() {
	return javaMark;
}
public void setDiemjva(double diemjva) {
	this.javaMark = diemjva;
}
public double getDiempython() {
	return PythonMark;
}
public void setDiempython(double diempython) {
	this.PythonMark = diempython;
}
public Student(String id, String name, String sex, double diemjva, double diempython) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.javaMark= diemjva;
	this.PythonMark = diempython;
}
@Override
public String toString() {
	return   id + ", " + name + "," + sex + ", " + PythonMark + ","
			+ javaMark ;
}
public Student() {
	
}

	

	
}

