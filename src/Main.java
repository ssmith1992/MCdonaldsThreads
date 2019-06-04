public class Main {

    public static void main(String[] args) {

        Slider resource = new Slider(2);
        Thread prodThread = new Thread(new PersonB(resource));
        prodThread.start();
        Thread consThread = new Thread(new PersonA(resource));
        consThread.start();
    }
}
