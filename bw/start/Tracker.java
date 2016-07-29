/** Класс обрабатывает все заявки.
* @author B.W.
*@since 08.07.16
*/
package kz.bw.start;

import kz.bw.models.*;
import java.util.*;

public class Tracker{
	public Item[] items = new Item[10];
	private int position = 0;
	private static final Random RN = new Random();
	
	/** Метод вводит заявки*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	
	/** Метод редактирует заявки*/
	public void edit(Item item) {
			for (int i =0; i < this.items.length; i++) {
				if (this.items[i].getId().equals(item.getId())) {
					this.items[i] = item;
					break;
				} else System.out.println("Id is not found");
			}
		}
	
	/** Метод удаляет заявки*/
	public void delete(String id) {
			int index = 0;
			for (int i = 0; i < this.items.length; i++) {
				if(this.items[i].getId().equals(id)) {
					index = i;
					break;
				} else if(!this.items[i].getId().equals(id)) {System.out.println("Such Id is not found");}
			}
			
			if (index >= 0 && index < this.items.length) {
				Item[] copy = new Item[this.items.length-1];
				System.arraycopy(this.items, 0, copy, 0, index);
				System.arraycopy(this.items, index+1, copy, index, this.items.length-index-1);
				this.items = copy;
				this.position--;
			}
		}
	
	
	public void search (String phrase) {
		Item[] sorted = new Item[this.items.length];
			int filterIndex = 0;
			for (int i = 0; i < this.items.length; i++) {
				if (this.items[i] != null && (this.items[i].getName().equals(phrase) | 
				                              this.items[i].getDescription().equals(phrase)| 
				                              this.items[i].getId().equals(phrase))) {
					sorted[filterIndex++] = this.items[i];
					System.out.printf("%s \tName: %s \n\tDescription: %s\n",this.items[i].getId(), 
                                                                                 this.items[i].getName(), 
																 this.items[i].getDescription());
																 break;
				} else if(this.items[i] != null && (!this.items[i].getName().equals(phrase) | 
				                              !this.items[i].getDescription().equals(phrase)| 
				                              !this.items[i].getId().equals(phrase))) {
					System.out.println("Id not found");
				}
			}
	}
	
	
	public void show(Item[] array) {
			System.out.println("================================================================================");

			int cell = 1;
			for (Item item : array) {
				if (item != null) {
					System.out.printf("%s \tName: %s \n\tDescription: %s\n",
							item.getId(),item.getName(),item.getDescription());
					System.out.println();
				}
			}
		System.out.println("================================================================================");
		}
	
	String generateId() {
			return String.valueOf(Math.round(Math.random() * 100));
		}
	
	public Item[] getAll() {
		Item[] result = new Item[this.position];
		for (int index = 0;index != this.position;index++){
			result[index] = this.items[index];
		}
		return result;
	}
}
