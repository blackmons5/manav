import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut =2.14;
        double elma = 3.67;
        double domates=1.11;
        double muz=0.95;
        double patlıcan=5.00;
        double armutfiyat,elmafiyat,domatesfiyat,muzfiyat,patlıcanfiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Kilo Armut aldığınızı yazın:");
        double armutkg=input.nextInt();
        System.out.print("Kaç Kilo Elma aldığınızı yazın:");
        double elmakg=input.nextInt();
        System.out.print("Kaç Kilo Domates aldığınızı yazın:");
        double domateskg=input.nextInt();
        System.out.print("Kaç Kilo Patlıcan aldığınızı yazın:");
        double patlıcankg=input.nextInt();
        System.out.print("Kaç Kilo Muz aldığınızı yazın:");
        double muzkg=input.nextInt();
        double toplam=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(patlıcan*patlıcankg)+(muz*muzkg);
        System.out.println("Toplam ücret:"+toplam);


    }
}