public class Main_Practice {

    public static void main(String[] args) {

       fish fish = new fish();
       rabbit rabbit = new rabbit();
       eagle eagle = new eagle();

       rabbit.flee();
       eagle.hunt();
       fish.flee();
       fish.hunt();

       Student student = new Student("Chirag");
       student.prof();

       Teacher teacher = new Teacher("Minal");
       teacher.prof();

       System.out.printf("%d\n", Calculator.add(3,4));
       System.out.printf("%d\n", Calculator.add(1,2,3));

       Dog d = new Dog();
       d.makeSound();

       Cat c = new Cat();
       c.makeSound();

       Shape circle = new Circle(5);
       System.out.printf("%f\n", circle.area());

       Shape rect = new Rectangle(4,5);
       System.out.printf("%f\n", rect.area());

       My name = new My("Chirag");
    }
}
