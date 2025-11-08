/*
 * Ad Soyad: Avşin Pelin Bilgiç
 * Ogrenci No: 250541067
 * Tarih: 08.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;
public class fizikFormul {
    final static double gravity=9.8;
    public static double calculateVelocity (double distance,double time){
  return distance/time;
    }
public static double calculateAcceleration(double velocityChange, double time) {
return velocityChange/time;
}
public static double calculateForce (double mass, double acceleration){
    return mass*acceleration;
}
public static double calculateWork(double force, double distance){
    return force*distance;
}
public static double calculatePower(double work, double time){
    return work/time;
}
public static double calculateKineticEnergy(double mass ,double velocity){
    return 0.5*mass*(velocity*velocity);
}
public static double calculatePotentialEnergy(double mass, double gravity, double height) {
    return mass*gravity*height;
}
public static double calculateMomentum(double mass, double velocity){
    return mass*velocity;
}

public static void main (String []args ){
     Scanner input=new Scanner (System.in);

     System.out.println("===FİZİK ASİSTANI===");
     System.out.println();

     System.out.print("mesafeyi giriniz:");
     double distance=input.nextDouble();
     

     System.out.print("kütleyi giriniz:");
     double mass=input.nextDouble();

     System.out.print("zamanı giriniz:");
     double time=input.nextDouble();

     System.out.println("ivmeyi giriniz:");
     double velocityChange=input.nextDouble();

     System.out.print("yüksekliği giriniz:");
     double height=input.nextDouble();

     double force= calculateForce(distance, distance);
     double work= calculateForce(mass, force);
     double Power=calculatePower(work, time);
     double velocity=calculateVelocity(distance, time);
     double acceleration= calculateAcceleration(velocityChange, time);
     double kineticEnergy=calculateKineticEnergy(mass, velocity);
     double potentialEnergy=calculatePotentialEnergy(mass, kineticEnergy, height);
     double momentum=calculateMomentum(mass, velocity);



     
         System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf(" velocity (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  velocityChange (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", Power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
     
