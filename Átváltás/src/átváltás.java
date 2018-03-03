import static java.lang.System.out; 

class átváltás{

public static void main(String args[]) {
	int teljes = 248; 
	int ötvenes = teljes / 50;
	int amiMaradt = teljes % 50; 
	int tízes = amiMaradt / 10; 
	amiMaradt = amiMaradt % 10;
	int ötös = amiMaradt / 5; 
	amiMaradt = amiMaradt % 5; 
	int egyes = amiMaradt;

	out.println("Ami a " + teljes + " forintodból lett"); 
	out.println(ötvenes + " ötvenes");
	out.println(tízes + " tízes");
	out.println(ötös + " ötös"); 
	out.println(egyes + " egyes"); 
	}
}
