package arraus;
public class StrokeArray {
    public static void main(String[] args) {

        String[] dc = new String[10];

        dc[0] = "Batman";
        dc[1] = "Superman";
        dc[2] = "Wonderwoman";
        dc[3] = "Flash";
        dc[4] = "Aquaman";
        dc[5] = "Cyborg";
        dc[6] = "Greenlight";
        dc[7] = "Batman";
        dc[8] = "Batman";
        dc[9] = "Batman";

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
}