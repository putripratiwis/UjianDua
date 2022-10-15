package ujiandua;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j < i; j--){
                if (i % 2 == 0){
                    System.out.print(i+ " ");
                }
                else {
                    System.out.println("_");
                }
            }


        }

    }
}