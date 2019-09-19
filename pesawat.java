import java.util.Scanner;
public class pesawat {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int nilai;
		System.out.print("Masukan nilai = ");
		nilai = input.nextInt();
		if (nilai ==1){
			System.out.println("pesawat garuda"); }
	        else 
	    if (nilai ==2){
	    	System.out.println("pesawat batik"); }
	    	else 
	    if (nilai ==3){
	    	System.out.println("pesawat lion"); }
	    	else
	    	System.out.print("kode yang masukan salah");
	    
	}
}