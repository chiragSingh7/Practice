abstract class container {
    protected String capacity;

    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public String getCapacity(){
        return this.capacity;
    }

    public abstract void fill(String capacity, String temperature);
}
