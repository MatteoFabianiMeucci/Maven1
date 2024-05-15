package maven1;

public class Main {
    public static void main(String[] args) {
        MioThread m = new MioThread();
        m.start();

        for(int i = 0; i <= 9; i++){
            System.out.println(i);
        }
    }


}