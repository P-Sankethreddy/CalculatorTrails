package com.EPAM_Task3.Calculator;

import java.math.BigInteger;

public class Bussiness {
	
	
	public BigInteger add(BigInteger num1,BigInteger num2)
	{
		BigInteger result=num1.add(num2);
		return result;
	
	}
	
	public BigInteger sub(BigInteger num1,BigInteger num2)
	{
		BigInteger result=num1.subtract(num2);
		return result;
	
	}
	
	public BigInteger mul(BigInteger num1,BigInteger num2)
	{
		BigInteger result=num1.multiply(num2);
		return result;
	
	}
	
	public BigInteger div(BigInteger num1,BigInteger num2)
	{
		BigInteger result=num1.divide(num2);
		return result;
	
	}
	
	public BigInteger mod(BigInteger num1,BigInteger num2)
	{
		BigInteger result=num1.mod(num2)
		return result;
	
	}
	

}
