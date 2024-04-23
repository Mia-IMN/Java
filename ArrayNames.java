//A program to initialize array names

public class ArrayNames {
    public static void main(String[] args){
        String Names[] = {"John", "Amos", "Ada", "Peace"};
        System.out.println("Index Names");
        //output each array elements value.
        for(int i = 0; i < Names.length; i++){
            System.out.printf("%d %s\n", i, Names[i]);
        }
    }
}
