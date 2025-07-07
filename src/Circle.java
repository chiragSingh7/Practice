public class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}
