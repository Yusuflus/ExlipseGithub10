package javaWork1;

import java.util.Scanner;

public class javawork1 {

	public static void main(String[] args) {
		//	1 den 100 e kadar olan çift sayıları ekrana yazdıran program kodu	
		for(int a= 1; a<=100; a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
//		girilen bir tam sayının  sayının çiftmi tekmi olduğunu gösteren program kodu 
		Scanner input= new Scanner(System.in);
	 	System.out.println("Bir pozitif tam sayı giriniz:");
		int sayı= input.nextInt();
		if(sayı%2==0)
		{
			System.out.println("Girdiğiniz sayı çiftir");
		}
		else {
			System.out.println("Girdiğiniz sayı tektir");
		}
//		girilen bir sayının pozitifmi negatifmi veya sıfırmı olduğunu gösteren program kodu
		System.out.println("Bir sayı giriniz:");
		double sayı1= input.nextDouble();
		if(sayı1<0)
		{
			System.out.println("Girdiğiniz sayı negatiftir");
		}
		else if(sayı==0)
		{
			System.out.println("Girdiğiniz sayı sıfırdır");
		}
		else {
			System.out.println("Girdiğiniz sayı pozitiftir");
		}
//		girilen iki sayının küçükten büyüğe karşılaştırılması
		System.out.println("Birinici sayınızı giriniz:");
		double a= input.nextDouble();
		System.out.println("İkinci sayınızı giriniz:");
		double b= input.nextDouble();
		if(a>b)
		{
			System.out.println(a +" " + "Büyüktür");
			System.out.println(b +" " + "Küçüktür");
		}
		else {
			System.out.println(b +" " + "Büyüktür");
			System.out.println(a +" " + "Küçüktür");
		}
//		vize ve final not ortalaması (vize %40, final %60)
		System.out.println("Vize notunuzu giriniz:");
		double vize= input.nextDouble();
		System.out.println("Final notunuzu giriniz:");
		double finalN= input.nextDouble();
		double ortalama= (vize*4/10)+(finalN*6/10);
		if(ortalama>50)
		{
			System.out.println("Dersi geçtiniz ortalamanız:"+" "+ ortalama);
		}
		else {
			System.out.println("Dersi geçemediniz ortalamnız:"+" "+ ortalama);
		}
		// yarıçapı girilen çemberin çevre ve alan hesaplarını veren programın kodu
		System.out.println("Yarıçap degerini giriniz:");
		double yarıcap= input.nextDouble();
		double PiSayısı= 3.14;
		double cevre= 2*PiSayısı*yarıcap;
		double alan= PiSayısı*yarıcap*yarıcap;
		System.out.println("Çevre degerini görmrk için(0), alan degerini görmrk için(1) basınız");
		int deger= input.nextInt();
		if(deger==0)
		{
			System.out.println("Çevre degeriniz:"+" "+ cevre);
		}
		else if(deger==1)
		{
			System.out.println("Alan degeriniz:"+" "+ alan);
		}
		else {
		System.out.println("Çevre degerini görmrk için(0), alan degerini görmrk için(1) basınız");
		}
		// girilen tam sayı kadar adını yazdıran program kodu
		System.out.println("Adınızı giriniz:");
		String ad= input.nextLine();
		System.out.println("Bir tam sayı giriniz");
		int sayı2= input.nextInt();
		for(int i= 1; a<=sayı2; a++)
		{
			System.out.println(ad + " "+ i);
		}
		// kulanıcıdan cinsiyet kilo boy degerlerini alan ve BKİ hesabı yapan program kodu
		//(erkekler için 25 ve üstü kilolu, kadınlar için 23 ve üstü kilolu)
		System.out.println("Kilonuzu giriniz (kg):");
		double kilo= input.nextDouble();
		System.out.println("Boyunuzu giriniz (m):");
		double boy= input.nextDouble();
		double BKİ= kilo/(boy*boy);
		System.out.println("Cinsiyetiniz erkekse(1),kadınsa(2) basınız");
		int deger1= input.nextInt();
		if(deger1==1)
		{
			System.out.println((BKİ>25)?"Kilolusunuz BKİ degeriniz:"+ BKİ:"BKİ degeriniz:"+ BKİ);
		}
		else if(deger1==2)
		{
			System.out.println((BKİ>23)?"Kilolusunuz BKİ degeriniz:"+ BKİ:"BKİ degeriniz:"+ BKİ);
		}
		else {
			System.out.println("Cinsiyetiniz erkekse(1),kadınsa(2) basınız");
		}
		// girilen sayının faktöriyel hesabı
		System.out.println("Faktöriyeli alınacak sayıyı giriniz:");
		double sayı3= input.nextDouble();
		int faktor= 1;
		for(int k= 1; k<=sayı3; k++)
		{
			faktor= faktor*k;
		}
	    System.out.println("faktöriyel:" + " "+ faktor);
	     // haftanın günleri (switch case)
	    System.out.println("1-7 arsında bir tam sayı giirniz");
	    int sayı4= input.nextInt();
	    switch(sayı4)
	    {
	    case 1 :
	    	System.out.println("pazartesi");
	    	break;
	    case 2 :
	    	System.out.println("salı");
	    	break;
	    case 3 :
	    	System.out.println("çarşamba");
	    	break;
	    case 4 :
	    	System.out.println("perşembe");
	    	break;
	    case 5 :
	    	System.out.println("cuma");
	    	break;
	    case 6 :
	    	System.out.println("cumartesi");
	    	break;
	    case 7 :
	    	System.out.println("pazar");
	    	break;
	    default :
	    	System.out.println("1-7 arsında bir tam sayı giirniz");
	    }	

	}

}
