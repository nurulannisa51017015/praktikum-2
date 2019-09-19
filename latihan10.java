//contoh program aplikasi sederhana untuk restoran yang menggunakan seleksi looping
import java.util.Scanner;
public class latihan10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		boolean loop = true;
		
		System.out.println("menu pilihan :  ");
		System.out.println("1. sop konro ");
		System.out.println("2. coto  ");
		System.out.println("3. pallubasa ");
		System.out.println("4. sop saudara ");
		System.out.println("5. bakso ");
		System.out.println("6. bakso bakar ");
		System.out.println("7. jeruk peras ");
		System.out.println("8. air mineral ");
		System.out.println("9. nutrisari ");
		System.out.println("pilihan : ");
		pilihan = input.nextInt();
		while(loop){
			switch(pilihan){
				case 1: 
				       System.out.println("Anda memilih sop konro");
				       loop = false;
				       break;
		    	case 2: 
				       System.out.println("Anda memilih coto");
				       loop = false;
				       break;
		    	case 3: 
				       System.out.println("Anda memilih pallubasa");
				       loop = false;
				       break;
			    case 4: 
				       System.out.println("Anda memilih sop saudara");
				       loop = false;
				       break; 
				case 5: 
				       System.out.println("Anda memilih bakso");
				       loop = false;
				       break;
			 	case 6: 
				       System.out.println("Anda memilih bakso bakar");
				       loop = false;
				       break; 
				case 7: 
				       System.out.println("Anda memilih jeruk peras");
				       loop = false;
				       break; 
		    	case 8: 
				       System.out.println("Anda memilih air mineral");
				       loop = false;
				       break;  
				case 9: 
				       System.out.println("Anda memilih nutrisari");
				       loop = false;
				       break; 
				 default:
				       System.out.println("Silahkan pilih menu 1-9"); 
			}
		}
		
	System.out.println("pesanan anada akan diantar sebentar lagi ......!!!");
	}
}