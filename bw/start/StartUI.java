/**Класс тестирвочный тестирует класс трэкер.
* @author B.W.
*@since 29.07.16
*/
package kz.bw.start;

import kz.bw.models.*;

public class StartUI{
	private String salute = String.format("\n\n\nWelcome to the application system.\n ");
     
	private String menu = String.format("\n\t1. Add a new application\n\t2. Edit\n\t3. Delete\n\t4. View all\n\t5. FindBy\n\t6. Exit");
	
	private Input input;
	
	public StartUI(Input input){
		this.input = input;
	}
	
	
	public void init(){
	Tracker tracker = new Tracker();
	System.out.println(salute);
        String point = input.ask(String.format("Please press enter to skip.\n"));
        System.out.println("List of actions: ");
        if (point != null) System.out.println(menu);
	   
	   
	int key = 0;
        while (key != 6) {
            key = Integer.parseInt(input.ask("Enter your choice: "));
                if (key == 1) {
                    tracker.add(new Item(input.ask("Add the 'name': "), input.ask("Add the 'description': ")));
                    System.out.println(menu);
                }
			 
			 if (key == 2) {
                    tracker.edit(new Item(  input.ask("Enter Id for edit: "),
                                            input.ask("Enter new name: "),
                                            input.ask("Enter new description: ")));
                    System.out.println(menu);
                }
			 
			 if (key == 3) {
                    tracker.delete(input.ask("Enter Id for delete: "));
                    System.out.println(menu);
                }
                if (key == 4) {
                    tracker.show(tracker.items);
                    System.out.println(menu);
                }
			 
			 if (key == 5) {
                    tracker.search(input.ask("Enter Id or name or description for found: "));
                    System.out.println(menu);
                }
                
                if (key == 6) break;
	}}
	
	public static void main(String[] args) {
		Input input = new ConsoleInput();
		new StartUI(input).init();
}
}
