/*
 * Ad Soyad: Hüseyin Enes Demir
 * Ogrenci No: 250541047
 * Tarih: 29.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        return side * side;
    }
    
    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        return 4 * side;
    }
    
    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        return width * height;
    }
    
    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        return 2 * (width + height);
    }
    
    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        return Math.PI * radius * radius;
    }
    
    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        return 2 * Math.PI * radius;
    }
    
    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        return (base * height) / 2.0;
    }
    
    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // HESAPLAMALARI YAP - Metotlari cagir
        
        // Kare Hesaplari
        double sqArea = calculateSquareArea(squareSide);
        double sqPerim = calculateSquarePerimeter(squareSide);
        
        // Dikdortgen Hesaplari
        double rectArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectPerim = calculateRectanglePerimeter(rectWidth, rectHeight);
        
        // Daire Hesaplari
        double circArea = calculateCircleArea(radius);
        double circCircum = calculateCircleCircumference(radius);
        
        // Ucgen Hesaplari
        double triArea = calculateTriangleArea(base, height);
        double triPerim = calculateTrianglePerimeter(side1, side2, side3);
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("  Alan      : %.2f cm²\n", sqArea);
        System.out.printf("  Cevre     : %.2f cm\n", sqPerim);
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("  Alan      : %.2f cm²\n", rectArea);
        System.out.printf("  Cevre     : %.2f cm\n", rectPerim);
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("  Alan      : %.2f cm²\n", circArea);
        System.out.printf("  Cevre     : %.2f cm\n", circCircum);
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("  Alan      : %.2f cm²\n", triArea);
        System.out.printf("  Cevre     : %.2f cm\n", triPerim);
        
        System.out.println("\n========================================");
        
        input.close();
    }
}
