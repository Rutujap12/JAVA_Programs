package com.dxc.polymorphism;
class maths{
    static float add(double x,double y){
        return (float) (x + y);
    }

    static int add(int x,int y){
        return x + y;
    }
}
class poly_CT {
    public static void main(String args[]){
        System.out.println(maths.add(12.3,34.5));
        System.out.println(maths.add(12,345));


    }
}
