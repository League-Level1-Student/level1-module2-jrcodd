import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String minutes = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
Popcorn p = new Popcorn(flavor);
Microwave m = new Microwave();
m.putInMicrowave(p);
m.setTime(Integer.parseInt(minutes));
m.startMicrowave();

}
}
