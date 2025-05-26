package MethodExample;

class Computer {
    public void playmusic() {
        System.out.println("Playing Music Now....");
    }

    public String pen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else
            return "Not Enough Money";
    }

}

public class MethodExample {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playmusic();
        String tempen = obj.pen(2);
        System.out.println(tempen);
    }
}