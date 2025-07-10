public class Rectangle extends Shape{
    int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return length*breadth;
    }
}
