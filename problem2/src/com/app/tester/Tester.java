package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.todo.StatusEnum;
import com.app.todo.Task;

import utils.Util;

public class Tester {

	public static void main(String[] args) {
	
		System.out.println("running");
		System.out.println("running");
		System.out.println("running");
	         ArrayList<Task>taskDB = Util.populateTasks();
	         
	         try(Scanner sc = new Scanner(System.in)) {
	        	 boolean exit = false;
	        	 
             while(!exit) {
            System.out.println("a. Add New Task "
            		+ "b. Delete a task "
            		+ "c. Update task status"
            		+ "d. Display all pending tasks "
            		+ "e. Display all pending tasks for today"
            		+ "f.  Display all tasks sorted by taskDate"
            		+ "g. exit");
            	 try {
              	   
            		 switch(sc.next().charAt(0)) {
            		 
            		 case 'a' :
//            			 (String taskName, String description, LocalDate taskDate)
            			 System.out.println("enter a taskName, descriptio, taskDate");
            			Task tempTask = new Task(sc.next(),sc.next(),LocalDate.parse(sc.next()));

            				taskDB.add(tempTask);
            			System.out.println("task added succefully");
            			 break;
            		 case 'b':
            			 System.out.println("enter a task id that you want to delete");
            			 int id = sc.nextInt();
            			 tempTask  = new Task(id);
            			 
            			 if(taskDB.contains(tempTask)) {
            				 int index = taskDB.indexOf(tempTask);
            				 taskDB.remove(index);
            				 System.out.println("task removed succefully");
            			 }else {
            				 System.out.println("Wrong task id");
            			 }
            			 break;
            		 case 'c': 
            			 System.out.println("enter a task id that you want to update");
            			  id = sc.nextInt();
            			 tempTask  = new Task(id);
            			 
            			 if(taskDB.contains(tempTask)) {
            				 int index = taskDB.indexOf(tempTask);
            				 System.out.println("enter status of the task");
            				 taskDB.get(index).setStatus(StatusEnum.valueOf(sc.next().toUpperCase()));
            				 
            				 System.out.println("task updated succefully");
            			 }else {
            				 System.out.println("Wrong task id");
            			 }
            			 break;
            		 case 'd' : 
            		  
            		 taskDB.forEach(task -> {
            			 
            			 if(task.getStatus().equals(StatusEnum.PENDING)) {
            				 System.out.println(task);
            			 }
            		 });
            		    
            		 break;
            		 
            		 case 'e': 
            			 taskDB.forEach(task -> {
                			 
                			if(task.getTaskDate().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                				if(task.getStatus().equals(StatusEnum.PENDING)) {
                   				 System.out.println(task);
                   			 }
                			}
                		 });
            			 break;
            		 case 'f': 
            			 
            			  Collections.sort(taskDB,(t1,t2)-> {
            				 return t1.getTaskDate().compareTo(t2.getTaskDate());
            			 });
            			  
            			  taskDB.forEach(task-> System.out.println(task));
            			 break;
            		 case 'z': 
            			 taskDB.forEach(task->System.out.println(task));
            			 break;
            		 case 'g': 
            			 exit = true;
            			 break;
            		 }
                 }catch(Exception e) {
              	   System.out.println("exception " + e);
                 }
             }
	        	 
	         }
	         }
	}


