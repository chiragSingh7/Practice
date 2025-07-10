public class Student extends Person{
    Student(String name){
        super(name);
        System.out.println("Name : " + name);
    }

    @Override
    public void prof(){
        System.out.println("Prof : Student");
    }
}
