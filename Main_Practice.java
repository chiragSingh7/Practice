public class Main_Practice {

    public static void main(String[] args) {

        System.out.println("Interfaces and Multiple Inheritance");
       fish fish = new fish();
       rabbit rabbit = new rabbit();
       eagle eagle = new eagle();

       rabbit.flee();
       eagle.hunt();
       fish.flee();
       fish.hunt();
        System.out.print("\n");

        System.out.println("Abstraction and using set and get");

       person student = new person();
       student.setName("Chirag");
       System.out.println("The name of the person is " + student.getName());
       System.out.print("\n");

        System.out.println("Polymorphism (Runtime) / Method Overriding");
       car car = new car();
       boat boat = new boat();

       vehicle[] vehicles = {car,boat};

       for(vehicle it : vehicles){
           it.go();
       }

       System.out.print("\n");

        System.out.println("Polymorphism(Compiletime) / Method overloading");

       Operations.sum(1,2);
       Operations.sum(1.99, 2.01);
       Operations.sum(4,5,6);

        System.out.print("\n");

        System.out.println("Hierarchial Inheritance");
        animal a = new animal();
        bird b = new bird();

        a.Living();
        a.walk();

        b.Living();
        b.fly();

        System.out.print("\n");
        System.out.println("Multilevel Inheritance");

        square sq = new square();
        sq.s();
        sq.area(5,5);
        sq.colour("yellow");

        System.out.print("\n");
        System.out.println("OOPS with project example");

        user u1 = new intern();
        user u2 = new intern();
        user u3 = new HR();

        u1.Name("Chirag");
        u1.ID(202211014);
        u1.role("Intern");

        u2.Name("Minal");
        u2.ID(202211015);
        u2.role("Intern");

        u3.Name("Gagan");
        u3.ID(202251030);
        u3.role("HR");

        user[] users = {u1, u2,u3};

        for(user it : users){
            it.details();
        }
    }
}
