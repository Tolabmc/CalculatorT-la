package Day3;

public class IctExercise{

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 9, 4};
        System.out.println("Is the number present: " + checkNumber());
        System.out.println("The number appears :" + numberCount() + " times in the array.");
    }
    public static boolean checkNumber() {
        int[] numbers = {2, 4, 6, 9, 4};
        boolean exists = false;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 4) return true;
            {

            }

        }
        return exists;
    }
    public static int numberCount(){
            int numberCounter = 0;
        int[] numbers = {2, 4, 6, 9, 4};
            for (int i=0; i < numbers.length; i++){
                if( i == 4){
                    numberCounter++;
                }
                else{

                }

        }
        return numberCounter;
        }
    }


