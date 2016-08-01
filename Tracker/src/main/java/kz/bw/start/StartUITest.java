package kz.bw.start;
public class StartUITest {

	public static void main(String[] args) {

		Input input = new StubInput(new String[] {	"1", "1", "Batman", "Bruce Wayne",
                                                    "1", "Green Lantern", "Hal Jordan",
										  "1", "Flash", "Barry Allen", "5", "Batman",
										  "4", "6"});
		new StartUI(input).init();


	}
}