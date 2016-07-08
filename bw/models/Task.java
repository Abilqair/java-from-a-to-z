/** Класс наследует класс Item и служит для записывание комментариев
* @author B.W.
*@since 08.07.16
*/
package kz.bw.models;

public class Task extends Item {
	private String[] comment = new String[10];
	private int current = 0;
	
	public Task(String name, String description){
		this.name = name;
		this.description = description;
		
	}
	
	public void setComm(String comm){
		if(this.current == this.comment.length-1){
			this.current = 0;
		}
		this.comment[this.current++] = comm;
	}
	
	public String getComm(){
		int pos = this.current == 0 ?this.current : this.current  - 1;
		return this.comment[pos];
	}
	
	public String getComm(int position){
		return this.comment[position < this.comment.length?position:this.current];
	}
}