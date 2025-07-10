import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main_Practice {

    public static void main(String[] args) {

//       fish fish = new fish();
//       rabbit rabbit = new rabbit();
//       eagle eagle = new eagle();
//
//       rabbit.flee();
//       eagle.hunt();
//       fish.flee();
//       fish.hunt();
//
//       Student student = new Student("Chirag");
//       student.prof();
//
//       Teacher teacher = new Teacher("Minal");
//       teacher.prof();
//
//       System.out.printf("%d\n", Calculator.add(3,4));
//       System.out.printf("%d\n", Calculator.add(1,2,3));
//
//       Dog d = new Dog();
//       d.makeSound();
//
//       Cat c = new Cat();
//       c.makeSound();
//
//       Shape circle = new Circle(5);
//       System.out.printf("%f\n", circle.area());
//
//       Shape rect = new Rectangle(4,5);
//       System.out.printf("%f\n", rect.area());
//
//       My name = new My("Chirag");

        Employee emp = new Employee("Chirag Singh Rathore", "UEH0001", "rathorechirag1213@gmail.com");
        Employee emp1 = new Employee("Minal Jaiswal" , "UAI0001" , "jhdsa@gmail.com");
        Employee emp2 = new Employee("Akshat Gaur" , "UEI0001" , "hsja@gmail.com");

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String myJson = gson.toJson(emp);
//        System.out.println(myJson);

        //Write to a file

//        try{
//            List<Employee> allEmp = new ArrayList<>();
//            FileWriter writer = new FileWriter("User.json");
//            allEmp.add(emp);
//            allEmp.add(emp1);
//            allEmp.add(emp2);
//            gson.toJson(allEmp, writer);
//            writer.close();
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }

        //Read from a file

//        try{
//            FileReader reader = new FileReader("User.json");
//            Employee use = gson.fromJson(reader, Employee.class);
//            System.out.println(use);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//

        //write as list
//        try{
            // as an array
//                FileReader reader = new FileReader("User.json");
//                Employee[] emps = gson.fromJson(reader, Employee[].class);

            // as a list
//            FileReader reader = new FileReader("User.json");
//            Type empListType = new TypeToken<ArrayList<Employee>>(){}.getType();
//            List<Employee> allEmp = gson.fromJson(reader, empListType);
//
//            for(Employee e : allEmp){
//                System.out.println(e);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try{
            FileReader reader = new FileReader("User.json");
            Gson gson = new Gson();
            boolean found = false;

            Type empListType = new TypeToken<ArrayList<Employee>>(){}.getType();
            List<Employee> allEmp = gson.fromJson(reader, empListType);

            for(Employee e : allEmp){
                if(e.getID().equals("UEH0002")){
                    System.out.println("ID found!!");
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("ID not found");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //search in a file
    }
}
