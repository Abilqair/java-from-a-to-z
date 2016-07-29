/**Класс реализует интерфейс класс Input.
* @author B.W.
*@since 29.07.16
*/
package kz.bw.start;
import java.util.*;

public class ConsoleInput implements Input{
	private Scanner scanner = new Scanner(System.in);
	
	public String ask(String question){
		System.out.print(question);
	return scanner.nextLine();	
	}
}
