import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Meyve Değişkenleri Oluşturduk
        double armut,elma,domates,muz,patlican;
        //Meyvenin Kg Degeri Değişkenlerini Oluşturduk
        double armutKgF = 2.14;
        double elmaKgF = 3.67;
        double domatesKgF = 1.11;
        double muzKgF = 0.95;
        double patlicanKgF =5.00;
        // Kullanıcıdan Veri Almak için Scanner Sınıfı Oluşturduk
        Scanner input = new Scanner(System.in);


        //Kullanıcıdan Değer Girmesini İstedik ve Girdigi deger ile meyvenin Kg fiyatını Çarptık
        System.out.println("Armut Kg Giriniz :");
        armut=input.nextDouble();
        double armutT = armut*armutKgF;

        System.out.println("Elma Kg Giriniz :");
        elma=input.nextDouble();
        double elmaT = elma*elmaKgF;

        System.out.println("Domates Kg Giriniz :");
        domates=input.nextDouble();
        double domatesT = domates*domatesKgF;


        System.out.println("Muz Kg Giriniz :");
        muz=input.nextDouble();
        double muzT = muz*muzKgF;

        System.out.println("Patlican Kg Giriniz :");
        patlican=input.nextDouble();

        double patlicanT = patlican*patlicanKgF;
        //Bütün Fiyatları topladık ToplamFiyat Değişkenine Atadık
        double ToplamFiyat = armutT+elmaT+domatesT+muzT+patlicanT;
        //Toplam Fiyatı Yazdırdık
        System.out.println("Toplam Fiyatınız :" + ToplamFiyat);
    }
}
