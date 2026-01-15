package com.example.designPrinciplesAndAlgo;

public class MyJavaFile {

        public static void main(String[] args){
            int sum =  MyfirstKt.add(1,2);
            System.out.println(sum);

            System.out.println("*****");

            // we are not passing height; now it will support default parameters
            int result = MyfirstKt.findVolume(5,7);
            System.out.println(result);

        }

        public static int getArea(int l, int b){
            return l*b;
        }


}
