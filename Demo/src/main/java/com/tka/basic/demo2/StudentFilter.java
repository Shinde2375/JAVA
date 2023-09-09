package com.tka.basic.demo2;

import java.util.ArrayList;

public class StudentFilter {

//	 int countAllFirstClass(Student s1,Student s2,Student s3,Student s4,Student s5)
//	{
//		
//	int  count = 0;
//	
//	if(s1.marks>=60)
//		++count;
//	if(s2.marks>=60)
//		++count;
//	if(s3.marks>=60)
//		++count;
//	if(s4.marks>=60)
//		++count;
//	if(s5.marks>=60)
//		++count;
//	
//	
//		 return count;
	
	
	
	 int countAllFirstClass(ArrayList<Student> list)
		{
			
		int count = 0;
		for(int i=0;i<list.size();i=i+1)
		{
		Student t = list.get(i);
		
		if(t.marks>60) 
			count = count+1;
		}
		
		
			 return count;
		
	}
	 
	 
	 int countDistinction(ArrayList<Student> list)
	 {
			int count = 0;
			for(int i=0;i<list.size();i=i+1)
			{
			Student t = list.get(i);
			
			if(t.marks>=80) 
				count = count+1;
			}
			
			
				 return count;
	 }
	 
	 int countSecondClass(ArrayList<Student> list)
	 {
			int count = 0;
			for(int i=0;i<list.size();i=i+1)
			{
			Student t = list.get(i);
			
			if(t.marks<60) 
				count = count+1;
			}
			
			
				 return count;
	 }
	 
	 
}
