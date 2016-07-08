/**Класс тестирвочный тестирует класс трэкер.
* @author B.W.
*@since 08.07.16
*/
package kz.bw.start;

import kz.bw.models.*;

public class StartUI{
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		
		Task task1 = new Task("order number 1", "this is request 1");
		Task task2 = new Task("order number 2", "this is request 2");
		Task task3 = new Task("order number 3", "this is request 3");
		Task task4 = new Task("order number 4", "this is request 4");
		Task task5 = new Task("order number 5", "this is request 5");
		Task task6 = new Task("order number 6", "this is request 6");
		Task task7 = new Task("order number 7", "this is request 7");
		Task task8 = new Task("order number 8", "this is request 8");
		Task task9 = new Task("order number 9", "this is request 9");
		
		//ввод данных
		tracker.add(task1);
		tracker.add(task2);
		tracker.add(task3);
		tracker.add(task4);
		tracker.add(task5);
		tracker.add(task6);
		
		
		//редактирование данных
		task9.setId(task1.getId());
		tracker.edit(task7);
		
		//удаление данных	
		tracker.delete(task2);
		tracker.delete(task5);
		System.out.println("Print all tasks");
		
		//print all tasks			
		for(Task item : tracker.getAll()){
			System.out.println(item.getName() + "   " + item.getDescription());
			System.out.println();
		}
		System.out.println("Print filtered tasks");
		//распечатка филтрованных заявок	
		for(Task item : tracker.findByFilter("6")){
			System.out.println();
			System.out.println(item.getName() + "  " + item.getDescription());
			System.out.println();
		}
		
		//комментарий
		tracker.addComments(task1,"first comment");
		tracker.addComments(task2,"second comment");
		tracker.addComments(task3,"third comment");
		tracker.addComments(task4,"fourth comment");
		tracker.addComments(task5,"fifth comment");
		tracker.addComments(task6,"sixth comment");		
		System.out.println("Print comments");
		System.out.println();
		//распечатка комментарий
		System.out.println(tracker.getComments(task1));
		System.out.println(tracker.getComments(task3));
	}
}