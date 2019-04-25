package com.anagram;

import java.util.Arrays;

public class Anagram
{
	static boolean status;
public static void check(String first,String second)
{
	
	if(first.length()!=second.length())
	{
		status=false;
	}
	else
	{
		char[] ch1=first.toLowerCase().toCharArray();
		char[] ch2=second.toLowerCase().toCharArray();
		Arrays.sort(ch1);
//		//char temp;
//		//for(int i=0;i<ch1.length;i++)
//		{
//			for(int j=i+1;j<ch1.length-1;j++)
//			{
//				temp=ch1[i];
//				ch1[i]=ch1[j];
//				ch1[j]=temp;
//			}
//			
//		}
		
		Arrays.sort(ch2);
		status=Arrays.equals(ch1,ch2);
	}
	if(status==true)
	{
		System.out.println(first+" "+ "and"+" "+second+ " "+"are anagram");
	}
	else {
		System.out.println(first+" "+ "and"+" "+second+ " "+"are not anagram");
	}
}
public static void main(String args[])
{
	check("keep","peek");
	//check("heart","earth");
	check("hearth","earth");
	check("false","true");
}
}
