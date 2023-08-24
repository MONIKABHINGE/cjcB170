package com.calculator.test;
import com.calculator.addition.Add;
import com.calculator.division.Div;
import com.calculator.multiplication.Mul;
import com.calculator.subtraction.Sub;

public class Test extends Sub {

	public static void main(String[] args) {
		Add a= new Add();
		Sub s=new Sub();
		Mul m=new Mul();
		Div d=new Div();
	
		Test t=new Test();
		//a.add();//private can't access in another package
		t.sub();//protected can access within another package but by creating child class
		m.mul();//public can access anywhere
		//d.div();//default can access in same package
		

	}
	

	}


