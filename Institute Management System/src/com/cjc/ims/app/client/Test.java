package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
	Karvenagar k=new Karvenagar();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println(".....select.....\n"
				+"1. AddCourse \n"
				+"2. ViewCourse \n"
				+"3. AddFaculty \n"
				+"4. ViewFaculty \n"
				+"5. AddBatch \n"
				+"6. ViewBatch \n"
				+"7. AddStudent \n"
				+"8. ViewStudent \n"
				+"9. Exit");
		
		System.out.println("Enter enter your choice");
		int ch=sc.nextInt();
		if(ch==1) 
			k.addCourse();
		else if(ch==2) 
				k.viewCourse();
		else if(ch==3) 
			k.addFaculty();
		else if(ch==4) 
			k.viewFaculty();
		else if(ch==5) 
			k.addBatch();
		else if(ch==6) 
			k.viewBatch();
		else if(ch==7) 
			k.addStudent();
		else if(ch==8) 
			k.viewStudent();
		else if(ch==9) 
			break;
		else
			System.out.println("wrong choice");
		
		}

		
	}
				
				
	}

