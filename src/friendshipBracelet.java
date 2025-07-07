public class friendshipBracelet extends bracelet implements wearable {
    private String threadColor;

    public friendshipBracelet(String size, String threadColor) {
        super(size);
        this.threadColor = threadColor;
    }

    public void style() {
        System.out.println("Casual, colorful friendship bracelet.");
    }

    public void wear() {
        System.out.println("You are wearing a friendship bracelet.");
    }
}
