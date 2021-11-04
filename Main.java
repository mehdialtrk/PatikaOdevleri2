import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar,kdvliTutar,kdvTutari;
        // tutar 0 ile 1000 TL arasında ise KDV oranı=%18
        double kdvOran=0.18;

        //tutar 1000 TL den buyuk ise KDV oranı= %8
        double kdvOran2=0.08;

        Scanner sc=new Scanner(System.in);

        System.out.print("Ucret Tutarini Giriniz: ");
        tutar=sc.nextDouble();

        // Tutar 1000 tl üstünde ise %8 KDV orani ile,1000 Tl nin altinda ise %18 KDV orani ile KDVlendirme
        double kdv=tutar<1000 ?kdvOran:kdvOran2;

        double dbl=tutar<1000 ? tutar*kdv: tutar*kdv;
        kdvliTutar=dbl+tutar;

        kdvTutari=tutar*kdv;

        System.out.println("\t   Paranizin KDVsi: "+kdvTutari+" TLdir"+"\nParanizin KDVli Tutari: "+kdvliTutar+" TLdir");


    }
}