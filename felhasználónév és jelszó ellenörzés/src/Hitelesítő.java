import javax.swing.JOptionPane; 

class Hitelesítõ {
	

public static void main(String args[]) {
	
	String felhasználónév =
			JOptionPane.showInputDialog("Felhasználónév: "); 
	String jelszó =
			JOptionPane.showInputDialog("Jelszó: ");
	if ( felhasználónév != null &&
			jelszó != null &&
			( 
					(felhasználónév.equals("füli") && 
							jelszó.equals("kardhal")) ||
					(felhasználónév.equals ("laci") && 
							jelszó.equals("pajzs"))
			) 
	)
	{ 
		JOptionPane.showMessageDialog (null, "Bent vagy.");
	}
else { 
		JOptionPane.showMessageDialog (null, "Gyanús vagy.");
		} 
	}
}

