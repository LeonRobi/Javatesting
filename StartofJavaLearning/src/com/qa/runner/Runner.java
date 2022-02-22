package com.qa.runner;

import com.qa.addNums.Calculator;
import com.qa.addNums.Nums;
import com.qa.datatypes.DataTypes;
import com.qa.methodprint.printstuff;

public class Runner {

	
	public static void main(String[] args) {
		printstuff.helloWorld();
		printstuff.printing();
		System.out.println(DataTypes.returnStr());
		System.out.println(DataTypes.returnInt());
		System.out.println(DataTypes.returnBool());
		System.out.println(DataTypes.number1);
		System.out.println(DataTypes.string1);
		System.out.println(DataTypes.floating);
		System.out.println(DataTypes.testtest());
		System.out.println(Nums.addNumber());
		System.out.println(DataTypes.truefalseBool());
		System.out.println(Calculator.addParams(5, 6));
		Calculator.helloWorld("Leon");
		System.out.println(Calculator.isRed("red"));
		System.out.println(Calculator.trueFalseevenOddParams(0));
		Calculator.evenOddParams(56);
	}
	
}
