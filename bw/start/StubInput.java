package kz.bw.start;

public class StubInput implements Input{
	private String[] answers;
	private int position = 0;
	
	public StubInput(String[] answers){
		this.answers = answers;
	}
	public String ask(String qustion){
		return answers[position++];
	}
}