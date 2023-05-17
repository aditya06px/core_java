package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.todo.Task;

public class Util {

	public static ArrayList<Task> populateTasks() {
		ArrayList<Task> listOfTasks = new ArrayList<>();
		
		Task t1 = new Task("wake up","at 6 am", LocalDate.parse("2023-04-10"));
		Task t2 = new Task("sleep early","at 10 pm", LocalDate.parse("2023-01-20"));
		Task t3 = new Task("read","one book each week", LocalDate.parse("2023-02-15"));
		Task t4 = new Task("write","daily", LocalDate.parse("2023-03-01"));
		
		listOfTasks.add(t1);
		listOfTasks.add(t2);
		listOfTasks.add(t3);
		listOfTasks.add(t4);
		return listOfTasks;
	}
}
