package Chapter09;


public class Duck {
    int size;

    public Duck() {
        size = 27;
    }
    
    public Duck(int duckSize) {
        System.out.println("Quack");
        size = duckSize;
        System.out.println("size is " + size);
    }
}