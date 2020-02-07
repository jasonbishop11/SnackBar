package com.company;

public class Complex {

    double a, b;

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex(double a){
        this(a, 0.0);
    }

    public double abs(){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public Complex add(Complex other){
        Complex answer;
        answer = new Complex(this.a+other.a, this.b+other.b);
        return answer;
    }

    public Complex add(double a){
        Complex answer;
        answer = new Complex(this.a+a, this.b);
        return answer;
    }

    public Complex multiply(Complex other){
        double newA = this.a*other.a-(this.b*other.b);
        double newB = this.a*other.b+this.b*other.a;
        return new Complex(newA,newB);
    }

    public Complex multiply(double a){
        double newA = this.a*a;
        double newB = this.b*a;
        return new Complex(newA,newB);
    }

    public String toString(){
        String result;
        if(b!=0) {
            result = this.a + "+" + this.b + "i";
        }else{
            result = this.a+"";
        }
        return result;
    }

    public static void main(String[] args){
        Complex c1 = new Complex(5,6);
        Complex c2 = new Complex(7);
        Complex c3 = new Complex(3,1);

        System.out.println(c1);
        System.out.println(c1.abs());
        System.out.println(c1.add(c3).toString());
        System.out.println(c1.multiply(c3));
        System.out.println(c1.add(7));
        System.out.println(c1.multiply(2));

        System.out.println();
        System.out.println(c2);
        System.out.println(c2.abs());
        System.out.println(c2.add(c3));
        System.out.println(c2.multiply(c3));
        System.out.println(c2.add(5));
        System.out.println(c2.multiply(10));
    }
}

/*
Output:
5.0+6.0i
7.810249675906654
8.0+7.0i
9.0+23.0i
12.0+6.0i
10.0+12.0i

7.0
7.0
10.0+1.0i
21.0+7.0i
12.0
70.0
 */