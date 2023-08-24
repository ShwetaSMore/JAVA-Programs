package com.LoopingStatements;
import java.util.*;

public class PowerInp 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		int total = 1;
		
		System.out.println("Give number N^m where N : ");
		int N = sobj.nextInt();
		
		System.out.println("m : ");
		int m = sobj.nextInt();
		
		for(int i = 1 ; i<=m;i++)
		{
			total = total*N;
		}
		
		System.out.println(N+"^"+m+" = "+total);
		
	}

}
