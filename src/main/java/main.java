package com.company;

public class main {
  private   float a = 1;
  private   float b = 1;
  private   float c = 1;

    public Imparity(float a,float b,float c) {

        if (a < (b + c)) {
            if (b < (c + a)) {
                if (c < (a + b)) {
                    System.out.println("this is triangle");
                }
            }
        }
        if ((a>0)&&(b>0)&&(c>)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    public Imparity(Imparity imparity){
        this.a = imparity.a;
        this.b = imparity.b;
        this.c = imparity.c;
    }
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }



   /* public static void Orthogonal() {
        if (c < a)&(a > b) {


        }
    }*/
}