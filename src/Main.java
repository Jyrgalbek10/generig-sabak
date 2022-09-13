public class Main {


    public static void main(String[] args) {
        maethod(new Box<>(1));
    }

     static  <T> void maethod(T elem){
         System.out.println(elem);

    }
}