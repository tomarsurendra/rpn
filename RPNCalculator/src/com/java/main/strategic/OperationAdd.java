package com.java.main.strategic;

public class OperationAdd implements StrategicIF{
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
