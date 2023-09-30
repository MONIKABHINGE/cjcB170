package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.service.Cjc;

public class Karvenagar implements Cjc {

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	
	Course c = new Course();
	Faculty f = new Faculty();
	Batch b = new Batch();
	Student s = new Student();
	Scanner sc = new Scanner(System.in);

	public void addCourse() {
		
		System.out.println("Enter your course id");
		c.setCid(sc.nextInt());
		System.out.println("Enter your course name");
		c.setCname(sc.next());
		clist.add(c);
		
	}
		
	public void viewCourse() {
	
		Iterator<Course> citr = clist.iterator();
		while(citr.hasNext()) {
		Course c1=citr.next();
		System.out.println("Course id  = " +   c1.getCid());
		System.out.println("Course name = "  +   c1.getCname());
		
		
		}
		
	}
	
	
	        public void addFaculty() {
	        	
	        System.out.println("Enter your faculty id");
			f.setFid(sc.nextInt());
			System.out.println("Enter your faculty name");
			f.setFname(sc.next());
			flist.add(f);
			
			}
	        
	    	
	    	public void viewFaculty() {
	    			
	    		Iterator<Faculty> fitr = flist.iterator();
	    		while(fitr.hasNext()) {
	    		Faculty f1= fitr.next();
	    		System.out.println("Faculty id = + " + f1.getFid());
	    		System.out.println("Faculty name = + " + f1.getFname());
	    		
	    		System.out.println(f1.getCourse());
	    		
	    		}
	    	}
			
	    		
		        public void addBatch() {
		        	
		        System.out.println("Enter your batch id");
				b.setBid(sc.nextInt());
				System.out.println("Enter your batch name");
				b.setBname(sc.next());
				blist.add(b);
			
				}
		        
		        public void viewBatch() {
	    			
	    	
	    		Iterator <Batch>bitr = blist.iterator();
	    		while(bitr.hasNext()) {
	    		Batch b1= bitr.next();
	    		System.out.println("Batch id = + " + b1.getBid());
	    		System.out.println("Batch name = + " + b1.getBname());
	    		
	    		System.out.println(b1.getFaculty());
	    		}
	    	}
			
		        

		        public void addStudent() {
		        	
		        System.out.println("Enter your student id");
				s.setSid(sc.nextInt());
				System.out.println("Enter your student name");
				s.setSname(sc.next());
				slist.add(s);
			
				}
		        
		    	
		    	public void viewStudent() {
		    			
		    		Iterator<Student> sitr = slist.iterator();
		    		while(sitr.hasNext()) {
		    		Student s1=(Student) sitr.next();
		    		System.out.println("Student id = + " + s1.getSid());
		    		System.out.println("Student name = + " + s1.getSname());
		    		
		    		System.out.println(s1.getBatch());
		    		}
		    	}
				
		
		}

		
	
	
	
			
	
		
		
	