public abstract class phone {
    protected String model = "not mentioned";
    protected String battery = "not mentioned";

    public void setModel(String model){
        if(!model.isEmpty()) {
            this.model = model;
        }
        else{
            System.out.println("Enter the model!!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setBattery(String battery){
        if(!battery.isEmpty()){
            this.battery = battery;
        }
        else{
            System.out.println("Enter the battery!!");
        }
    }

    public String getBattery(){
        return this.battery;
    }

    public abstract void makeCall(String number);
    public abstract void detail();
}
