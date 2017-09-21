import java.util.Scanner;
	public class Hitung{
	public static void main (String [] args) {

		int pilih, pilihan, nilai1, nilai2;
		double hasil;

		Scanner hitung=new Scanner (System.in);
		System.out.println ("1. a+b");
		System.out.println ("2. a-b");
		System.out.println ("3. a*b");
		System.out.println ("4. formula");
		System.out.print("Masukan Pilihan Anda :");
		pilih=hitung.nextInt ();

		System.out.print("Masukan a : ");
		nilai1=hitung.nextInt ();
		System.out.print("Masukan b : ");
		nilai2=hitung.nextInt ();

		switch(pilih) {
		case 1:
		hasil=nilai1+nilai2;
		System.out.println ("Hasilnya Adalah = "+hasil);
		break;
		
		case 2:
		hasil=nilai1-nilai2;
		System.out.print("Hasilnya Adalah = "+ hasil);
		break;

		case 3:
		hasil=nilai1*nilai2;
		System.out.println("Hasilnya Adalah = "+hasil);
		break;
		
		case 4:
		hasil=( 3 * ( nilai1 * nilai1 ) ) + ( nilai1 * 1 ) - 1;
		System.out.println("Hasilnya Adalah = "+hasil);
		break;
		
}
}
}