package com.java.main.strategic.conf;

import java.util.HashMap;
import java.util.Map;

import com.java.main.strategic.OperationAdd;
import com.java.main.strategic.OperationDivide;
import com.java.main.strategic.OperationMultiply;
import com.java.main.strategic.OperationPower;
import com.java.main.strategic.OperationSubstract;

public class OperationObjConf {
	public static Map<String,Object> operationObjMap = new HashMap();
	
	public static void loadObjMap(){
		operationObjMap.put("+",new OperationAdd());
		operationObjMap.put("-",new OperationSubstract());
		operationObjMap.put("/",new OperationDivide());
		operationObjMap.put("*",new OperationMultiply());
		operationObjMap.put("^", new OperationPower());
		
	}		

}
