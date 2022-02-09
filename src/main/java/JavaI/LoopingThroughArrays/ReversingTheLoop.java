package JavaI.LoopingThroughArrays;

public class ReversingTheLoop {
    public static void main (String[] args) {
        String[] names = {"Rosalinda", "Nelma","Tome"};



        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("index " + i + " " + names[i].toUpperCase());
        }
    }
}
