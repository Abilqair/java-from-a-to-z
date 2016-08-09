/** Класс определяет является ли слово анограммой.
* @author B.W.
*@since 09.08.16
*/
public class Anogramm{
	/** Метод проверяет является ли входное
	слово анограммой*/
	boolean isAnogramm(String value){
		String value2 = "";
		String repl = value.replace(" ", "");
		char[] arr1 = value.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		for (int i = arr1.length - 1; i >= 0;){
			for (int j = 0; j < arr2.length; j++){
				arr2[j] = arr1[i]; i--;
				 
				value2 = value2 + arr2[j];
			}
		}
		System.out.println(value2);
		System.out.println(repl);
		
		return value2.equalsIgnoreCase(repl);
	}
	
	public static void main (String[] args){
		Anogramm anogramm = new Anogramm();
		System.out.println(anogramm.isAnogramm("Hello"));
		System.out.println();
		System.out.println(anogramm.isAnogramm("level"));
	}
}
