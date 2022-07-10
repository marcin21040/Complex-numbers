package org.example;


public class App 
{
    public static void main( String[] args )
    {
      Zespolone z1 = new Zespolone(14,7);
        Zespolone z2 = new Zespolone(7,3.5);
      Zespolone z3 = new Zespolone(3,4);
        System.out.println("suma: " + z1.suma(z2));
        System.out.println("roznica: " + z1.roznica(z2));
        System.out.println("iloczyn: " + z1.iloczyn(z2));
        System.out.println("iloraz: " + z1.iloraz(z2));
        System.out.println("sprzezenie: " + z1.sprzezenie(z1));
        String a;
        a=z3.modul(z3).toString();
        System.out.println("modul: " + a.charAt(0)+""+a.charAt(1)+""+a.charAt(2));
    }
}
