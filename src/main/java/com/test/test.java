package com.test;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class test 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	double salary;
		try {
			System.out.println("�����빤�ʣ�");
			salary = Double.parseDouble(scanner.nextLine());
			double tax = getTax(salary);
	    	System.out.println("����Ҫ���ɵ�˰��Ϊ��" + tax);
		} catch (NumberFormatException e) {
			System.out.println("��������ȷ��нˮ��");
//			e.printStackTrace();
		}
    }
    
    
    public static double getTax(double salary){
    	double balance = salary - 3500;
    	double tax = 0;
    	if( (balance > 0) && (balance <= 1500)){
    		tax += balance*0.03;
    	} else if( (balance > 1500) && (balance <= 4500)){
    		tax = balance*0.1;
    	} else if( (balance > 4500) && (balance <= 9000)){
    		tax = balance*0.2;
    	} else if( (balance > 9000) && (balance <= 35000)){
    		tax = balance*0.25;
    	} else if( (balance > 35000) && (balance <= 55000)){
    		tax = balance*0.3;
    	} else if( (balance > 55000) && (balance <= 80000)){
    		tax = balance*0.35;
    	} else if( balance > 80000 ){
    		tax = balance*0.45;
    	}
    	return tax;
    }
}
