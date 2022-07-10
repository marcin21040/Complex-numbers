package org.example;

public class Zespolone {
    double real , img;
    Zespolone(double real, double img)
    {
        this.real = real;
        this.img = img;
    }
    @Override
    public String toString() {

        return real +" + "+ img+ "i";
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass()!= obj.getClass())return false;
        Zespolone that=(Zespolone) obj;
        return real==that.real && img==that.img;
    }

    public Zespolone suma(Zespolone z1)
    {
        return new Zespolone(this.real+z1.real,this.img+z1.img);
    }
    public Zespolone roznica(Zespolone z1)
    {
        return new Zespolone(this.real-z1.real,this.img-z1.img);
    }
    public Zespolone iloczyn(Zespolone z1)
    {
        return new Zespolone(this.real*z1.real,this.img*z1.img);
    }
    public Zespolone iloraz(Zespolone z1)
    {
        return new Zespolone(this.real/z1.real,this.img/z1.img);
    }
    public Zespolone sprzezenie(Zespolone z1)
    {
        return new Zespolone(this.real=z1.real,this.img=-(z1.img));
    }
    public Zespolone modul(Zespolone z1)
    {
        return new Zespolone(Math.sqrt(this.real=z1.real*z1.real+z1.img*z1.img),this.img=0);
    }

}
