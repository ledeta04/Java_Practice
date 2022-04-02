package com.day4.operators;

class Assignment_operators1{
public static void main(String as[])
{
    int a = 30;
    int b = 10;
    int c = 0;


      c = a + b;
System.out.println("c = a + b = " + c ); // 40
      c += a ;
System.out.println("c += a  = " + c ); // 70
      c -= a ;
System.out.println("c -= a = " + c ); // 40
      c *= a ;
System.out.println("c *= a = " + c ); // 1200

a = 20;
c = 25;
c %= a ; //c=c%a; 25%20; 5
System.out.println("c %= a  = " + c ); // 5

}}
