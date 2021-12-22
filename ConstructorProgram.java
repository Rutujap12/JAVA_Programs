class Main {
    private String name;

    Main() {
        System.out.println("Example of Constructor:");
        name = "Rutuja Palav";
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("My name is " + obj.name);
    }
}
