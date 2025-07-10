public class smartPhone extends phone implements app{

    smartPhone(String model){
        setModel(model);
    }

    smartPhone(String model, String battery){
        setModel(model);
        setBattery(battery);
    }

    public void makeCall(String number){
        System.out.println("Calling the number " + number);
    }

    public void detail(){
        System.out.println("The model of this phone is " + getModel() + " with a battery of " + getBattery());
    }

    public void clicksPicture(int megaPixel){
        System.out.println("This phone clicks picture with a " + megaPixel + "mega pixel camera.");
    }
}
