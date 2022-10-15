import java.util.Scanner;

public class Denemeler {
    public static void main(String[] args) {
        int mat, tarih, muzik, ingilizce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz :");
        mat = inp.nextInt();

        System.out.print("Tarih notunu giriniz :");
        tarih = inp.nextInt();

        System.out.print("Müzik notunu giriniz :");
        muzik = inp.nextInt();

        System.out.print("İngilizce notunu giriniz :");
        ingilizce = inp.nextInt();

        int toplam = (mat + tarih + muzik + ingilizce);
        double ortalama = toplam / 4;
        System.out.println("Ortalamanız : "+ ortalama);
        boolean gecti=(ortalama>60);
        boolean kaldi=(ortalama<=60);
        String durum=(gecti)? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.print(durum);










    }
}
