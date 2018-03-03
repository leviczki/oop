import javax.swing.JFrame;

class keret {
	
public static void main(String args[]) {
	JFrame myFrame = new JFrame (); 
	String myTitle = "Üres Keret";
	myFrame.setTitle(myTitle);
	myFrame.setSize(300, 200);

	myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	myFrame.setVisible(true);
 }
}