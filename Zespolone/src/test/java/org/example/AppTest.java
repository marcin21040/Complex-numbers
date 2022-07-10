package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{
    Zespolone z1 = new Zespolone(14,7);
    Zespolone z2 = new Zespolone(7,3.5);
    Zespolone z3 = new Zespolone(3,4);


    @Test
    public void testSuma()
    {
        assertEquals(new Zespolone(21,10.5),z1.suma(z2));
    }
    @Test
    public void testRoznica()
    {
        assertEquals(new Zespolone(7,3.5),z1.roznica(z2));
    }
    @Test
    public void testIloczyn()
    {
        assertEquals(new Zespolone(98,24.5),z1.iloczyn(z2));
    }
    @Test
    public void testIloraz()
    {
        assertEquals(new Zespolone(2,2),z1.iloraz(z2));
    }
    @Test
    public void testSprzezenie()
    {
        assertEquals(new Zespolone(14,-7),z1.sprzezenie(z1));
    }
    @Test
    public void testModul()
    {
        assertEquals(new Zespolone(5,0.0),z3.modul(z3));
    }
}
