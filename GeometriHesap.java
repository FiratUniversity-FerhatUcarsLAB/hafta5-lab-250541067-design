/*
 * Ad Soyad: Avşin Pelin Bilgiç
 * Ogrenci No: 250541067
 * Tarih: 08.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;
public class GeometriHesap {
    public static double calculateSquareArea(double side){
        return side*side;
    }
    public static double CalculateSquarePerimeter(double side){
        return 4*side;
    }
    public static double CalucateRectangleArea(double width, double height){
        return width*height;
    }
    public static double CalculateRecanglePerimeter(double width ,double height){
   
        return 2*(width+height);
    }
    public static double CalculateCircleArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double CalculateCircleperimeter(double radius){
        return 2*Math.PI*radius;
    }
    public static double CalculateTriangleArea( double base ,double triheight){
    return (base*triheight)/2;
    }
    public static double CalculateTrianglePerimeter(double a, double b, double c){
        return a+b+c;
    }
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
    
        //kare
         System.out.print("Kare kenar uzunluğu: ");
        double side = input.nextDouble();
        System.out.printf("Kare Alanı: %.2f%n", calculateSquareArea(side));
        System.out.printf("Kare Çevresi: %.2f%n%n", CalculateSquarePerimeter(side));
        double alan1=calculateSquareArea(side);
        double cevre1=CalculateSquarePerimeter(side);

         // --- Dikdörtgen ---
        System.out.print("Dikdörtgen kısa kenarı: ");
        double width = input.nextDouble();
        System.out.print("Dikdörtgen uzun kenarı: ");
        double height = input.nextDouble();
        System.out.printf("Dikdörtgen Alanı: %.2f%n", CalucateRectangleArea(width, height));
        System.out.printf("Dikdörtgen Çevresi: %.2f%n%n", CalculateRecanglePerimeter(width, height));
        double alan2=CalucateRectangleArea(width, height);
        double cevre2=CalculateRecanglePerimeter(width , height);


         // --- Daire ---
        System.out.print("Daire yarıçapı: ");
        double radius = input.nextDouble();
        System.out.printf("Daire Alanı: %.2f%n", CalculateCircleArea(radius));
        System.out.printf("Daire Çevresi: %.2f%n%n", CalculateCircleperimeter(radius));
        double alan3=CalculateCircleArea(radius);
        double cevre3= CalculateCircleperimeter(radius);

        // --- Üçgen ---
        System.out.print("Üçgen taban uzunluğu: ");
        double base = input.nextDouble();
        System.out.print("Üçgen yüksekliği: ");
        double triHeight = input.nextDouble();
        System.out.printf("Üçgen Alanı: %.2f%n", CalculateTriangleArea( base, triHeight));
       

        System.out.print("1.kenarı giriniz:");
        double a=input.nextDouble();
        System.out.print("2.kenarı giriniz:");
        double b=input.nextDouble();
        System.out.print("3.kenarı giriniz:");
        double c =input.nextDouble();
        System.out.printf("üçgen çevresi: %.2f%n", CalculateTrianglePerimeter(a,b,c));
         double alan4=CalculateTriangleArea(base,triHeight);
         double cevre4=CalculateTrianglePerimeter(a,b,c);

         System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        
        System.out.printf("kare Kenar: %.2f%n", side);
        System.out.printf("kare Alan: %.2f%n", alan1);
        System.out.printf("kare Çevre: %.2f%n", cevre1);
         
        System.out.printf("dikdörtgen Kenar: %.2f%n", width,height);
        System.out.printf("dikdörtgen Alan: %.2f%n", alan2);
        System.out.printf("dikdörtgen Çevre: %.2f%n", cevre2);

        System.out.printf("daire yarıcap: %.2f%n", radius);
        System.out.printf("daire Alan: %.2f%n", alan3);
        System.out.printf("daire Çevre: %.2f%n", cevre3);

        System.out.printf("ucgen yükseklik: %.2f%n", triHeight );
         System.out.printf("ucgen taban: %.2f%n", base );
        System.out.printf("ucgen Alan: %.2f%n", alan4);
        System.out.printf("ucgen Çevre: %.2f%n", cevre4);
          System.out.println("==========================================");
        input.close();

        
    }
    
}

