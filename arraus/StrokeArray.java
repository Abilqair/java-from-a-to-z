package arraus;
/** Класс убирает дубликаты из массива строк
* @author B.W.
*@since 23.05.16
*/
public class StrokeArray {
   private String[] dc;
	
public StrokeArray(String[] dc){
   this.dc = dc;
}
	
public void comics(){
  boolean mask[] = new boolean[dc.length];
  int remove = 0;

  for (int i = 0; i < dc.length; i++) {
  if (!mask[i]) {
  String tmp = dc[i];

  for (int j = i + 1; j < dc.length; j++) {
  if (tmp == dc[j]) {
  mask[j] = true;
  remove++;
  }
}
}
}

String[] marvel = new String[dc.length - remove];
  for (int i = 0, j = 0; i < dc.length; i++) {
  if (!mask[i]) {
  marvel[j++] = dc[i];
  System.out.println(dc[i]);
  }
}
}
public static void main(String[] args) {
   new StrokeArray(new String[]{"Batman", "Superman", "Wonderwoman", "Flash", "Aquaman", "Cyborg", "Greenlight", "Batman", "Batman", "Batman"}).comics();       
}
}
