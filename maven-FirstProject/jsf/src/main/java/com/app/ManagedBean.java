package com.app;

import javax.faces.bean.ViewScoped;

@javax.faces.bean.ManagedBean(name = "mbCalc")
@ViewScoped
public class ManagedBean {
	private int number1;
	private int number2;
	private int result;

	public String add() {
		result = number1 + number2;
		return null;
	}
	public String sub() {
		result = number1 - number2;
		return null;
	}
	public String mul() {
		result = number1 * number2;
		return null;
	}
	public String divi() {
		result = number1 / number2;
		return null;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

	

}