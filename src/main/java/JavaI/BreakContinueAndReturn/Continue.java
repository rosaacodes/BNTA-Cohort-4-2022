package JavaI.BreakContinueAndReturn;

public class Continue {
    public static void main(String[] args){

        for (int i = 0; i < 11; i++) {
            if (i <= 4) {
                continue;
            }
            System.out.println(i);
        }


    }

}