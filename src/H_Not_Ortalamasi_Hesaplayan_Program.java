import java.util.Scanner;
public class H_Not_Ortalamasi_Hesaplayan_Program {
    public static void main(String[] args) {

        // Degişkenlerimiz;
        int mat,turkce,fizik,kimya,biyoloji,tarih;

        // Scanner Sınıfı Tanımlama;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Değeleri Alma;
        System.out.print("Matematik Notunuz:" );
        mat = inp.nextInt();

        System.out.print("Turkce Notunuz:" );
        turkce = inp.nextInt();

        System.out.print("Fizik Notunuz:" );
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:" );
        kimya = inp.nextInt();

        System.out.print("Biyoloji Notunuz:" );
        biyoloji = inp.nextInt();

        System.out.print("Tarih Notunuz:" );
        tarih = inp.nextInt();

        // Degelerle islemler;
        int toplam = (mat + turkce + fizik + kimya + biyoloji + tarih);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz : " + sonuc);

        String str = (sonuc >= 60 ? "Gectiniz" : "Kaldiniz") ;
        System.out.print(str);








    }
}
