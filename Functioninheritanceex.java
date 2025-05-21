package day19;

interface Add{
	 int add(int a,int b);
	 
	 }

public class Functioninheritanceex {
	
	public static void main(String[] args) {
		Add add = (int a,int b) -> a+b;
		System.out.println(add.add(20,30));
	} 

}
