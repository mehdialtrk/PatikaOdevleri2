import java.util.Scanner;

public class Main {
    /* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih,Müzik derslerinin sinav puanlarini kullanicidan alan ve
    ortalamalarini hesaplayip ekrana bastirilan programi yazin.*/

    /*Ayni program içerisinde koşullu ifadeler kullanilarak, eğer kullanicinin ortalamasi 60'dan buyuk ise ekrana
    "Sinifi Gecti" , küçük ise "Sinifta Kaldi" yazsin.*/


    public static void main(String[] args) {


        int mat, fizik, kimya, turkce, tarih, muzik;


        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = sc.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = sc.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double ort = toplam / 6.0;



        String str=ort>60 ? "Sinifi Gectiniz..": "Sinifta Kaldiniz...";
        System.out.println(str);
    }
}
