package com.java.main;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RPNOperation {

	public int calculate(String exp) {
		List<String> explist = Arrays.asList(exp.split(","));		
		int first = Integer.parseInt(explist.get(0));
		int second = Integer.parseInt(explist.get(1));
		String operator = explist.get(2);
		int total = 0;
		if (operator.equals("+"))
			total = first + second;
		else if (operator.equals("-"))
			total = first - second;
		else if (operator.equals("*"))
			total = first * second;
		else if (operator.equals("/"))
			total = first / second;
		return total;
	}
	
	public int Operation(String exp){		
		String [] strexp =exp.split(",");
		Stack<String> mystack=new Stack<String>();
		int val=0;
		for(int i=0; i<strexp.length;i++){
			
			if(strexp[i].matches("^(0|[1-9][0-9]*)$")){
				mystack.push(strexp[i]);			
			}
			else{
				if(strexp[i].equals("+"))
				{
					val= Integer.parseInt(mystack.pop()) + Integer.parseInt(mystack.pop());
					mystack.push(String.valueOf(val));
				}
				else if (strexp[i].equals("-")) {
					val= Integer.parseInt(mystack.pop()) - Integer.parseInt(mystack.pop());
					mystack.push(String.valueOf(val));
				}
				else if (strexp[i].equals("*")) {
					val= Integer.parseInt(mystack.pop()) * Integer.parseInt(mystack.pop());
					mystack.push(String.valueOf(val));
				}
				else if (strexp[i].equals("/")) {
					val= Integer.parseInt(mystack.pop()) / Integer.parseInt(mystack.pop());
					mystack.push(String.valueOf(val));
				}
			}
			
		}
		return val;
	}

}
