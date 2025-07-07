public class waterBottle extends container implements measure{
    protected String brand;

    waterBottle(){
        this.capacity = "1 litre";
        this.brand = "any";
    }

    waterBottle(String brand){
        this.capacity = "2 litre";
        this.brand = brand;
    }

    waterBottle(String capacity, String brand){
        this.capacity = capacity;
        this.brand = brand;
    }

    public void fill(String capacity, String temperature){
        System.out.println("Fill the water bottle till " + capacity + " with " + temperature + " water.");
    }

    public void measureUsage(String fills, String currentVol){
        System.out.println("You drank " + fills + " bottles of water today, with " + currentVol + " left.");
    }
}
