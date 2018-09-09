package com.mukesh.design.test;

import java.util.Scanner;

import com.mukesh.design.factory.ComputerFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter computer type(\"PC\",\"Server\")");
		String type=scanner.nextLine();
		System.out.println("Enter ram");
		String ram=scanner.nextLine();
		System.out.println("Enter hdd");
		String hdd=scanner.nextLine();
		System.out.println("Enter cpu type");
		String cpu=scanner.nextLine();
		System.out.println("Factory "+type+" config:: "+ComputerFactory.getComputer(type, ram, hdd, cpu));
		
		
	}

}