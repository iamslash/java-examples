public class Main {

    @RepeatableAnnotation("Hello")
    @RepeatableAnnotation("World")
    private void performAction() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.performAction();
    }
}
