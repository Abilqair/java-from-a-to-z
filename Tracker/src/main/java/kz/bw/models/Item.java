/** Класс содержит документ заявки
* @author B.W.
*@since 08.07.16
*/
package kz.bw.models;

public class Item {
	private String id;
	
	private String name;
	
	private String description;
	
	private long create;
	
	private String[] comment = new String[10];
	private int current = 0;
	
	
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
	
	public Item(){}
	
	public Item(String name, String description){
		this.name = name;
		this.description = description;
		
	}
	
	public Item (String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getName(){
		return this.name;	
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public String getDescription(){
		return this.description;	
	}
	
	public void setDescription(String description){
			this.description = description;
	}
	
	public long getCreate(){
		return this.create;	
	}
	
	public void setCreate(long data){
			this.create = data;
	}
	
	public String getId(){
		return this.id;	
	}
	
	public void setId(String id){
			this.id = id;
	}
	
}