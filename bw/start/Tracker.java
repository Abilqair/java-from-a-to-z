/** Класс обрабатывает все заявки.
* @author B.W.
*@since 08.07.16
*/
package kz.bw.start;

import kz.bw.models.*;
import java.util.*;

public class Tracker{
	private Task[] items = new Task[10];
	private int position = 0;
	private static final Random RN = new Random();
	
	/** Метод вводит заявки*/
	public Task add(Task item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	
	/** Метод редактирует заявки*/
	public void edit(Task itemToo){
		if(itemToo == null) return;	
					
		for(int index = 0;index != this.position;index++){
			if(itemToo.getId() == (this.items[index].getId())){
				items[index] = itemToo;
			}
		}
	}
	
	/** Метод удаляет заявки*/
	public void delete(Task item){
		String id = item.getId();
		if(id != null){
			for(int index = 0; index < this.items.length; index++){
				if(this.items[index] != null && this.items[index].getId().equals(id)){
				   this.items[index] = null;
				}
			
				if(this.items[index] == null && (index+1) != this.items.length){
				   this.items[index] = this.items[index+1];
				   this.items[index+1] = null;
				   if(this.items[index] != null){
					  this.position = (index+1)<this.items.length?(index+1):index;  
				   }
				   	
				}
			}
		}
	}
	
	/** Метод находит по ID*/
	protected Task findById(String id) {
		Task result = null;
		for (Task item : items) {
			if (item != null && item.getId().equals(id)){
				result = item;
				break;
			}
		
		}
		return result;
	}
	
	
	/** Метод фильтрует по имени*/
	public Task[] findByFilter(String name){
		int length = this.items.length;
		Task[] copy = new Task[length];
		int filterIndex = 0;
		for(int fullIndex = 0;fullIndex < length;fullIndex++){
				if(this.items[fullIndex] != null && this.items[fullIndex].getName().contains(name)){
					copy[filterIndex++] = this.items[fullIndex];
				}
		}
		
		Task[] result = new Task[filterIndex];
		System.arraycopy(copy,0,result,0,filterIndex);
		
		return result;		
	}
	
	/** Метод фильтрует по имени и описанию*/
	public Task[] findByFilter(String name, String description){
	
		int length = this.items.length;
		Task[] copy = new Task[length];
		int filterIndex = 0;
		for(int fullIndex = 0;fullIndex < length;fullIndex++){
				if(this.items[fullIndex] != null && this.items[fullIndex].getName().contains(name)&&this.items[fullIndex].getDescription().contains(description)){
					copy[filterIndex++] = this.items[fullIndex];
				}
		}
		
		Task[] result = new Task[filterIndex];
		System.arraycopy(copy,0,result,0,filterIndex);
		return result;		
	
	}
	
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	
	public Task[] getAll() {
		Task[] result = new Task[this.position];
		for (int index = 0;index != this.position;index++){
			result[index] = this.items[index];
		}
		return result;
	}
	
	/** Метод вводит комментарии*/
	public void addComments(Task item, String comm){
		
		Task itemThree = findById(item.getId());
		if(itemThree != null){
		   itemThree.setComm(comm);
		}
	
	}
	
	public String getComments(Task item){
	
		String result =null;
		Task itemThree = findById(item.getId());
			
		if(itemThree != null){
			result = itemThree.getComm();
		}
			
		return result;
	}
	
	public String getComments(Task item, int pos){
		
		String result = null;
		Task itemThree = findById(item.getId());
			
		if(itemThree != null){
			result = itemThree.getComm(pos);
		}
			
		return result;
	}
}