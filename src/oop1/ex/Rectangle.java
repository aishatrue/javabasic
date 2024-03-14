package oop1.ex;

public class Rectangle {
    int width;
    int height;
    void calculateArea(int width,int height){
        System.out.println("넓이: "+width*height);

    }
    void calculatePerimeter(int width,int height){

        System.out.println("둘레 길이: "+2*(width+height));
    }
    void isSquare(int width,int height){
        if(width==height){
            System.out.println("정사각형 여부: "+ true);
        }else{
            System.out.println("정사각형 여부: "+ false);
        }


    }



}
