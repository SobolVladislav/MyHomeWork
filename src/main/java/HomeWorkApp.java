import com.sun.jdi.PathSearchingVirtualMachine;

public class HomeWorkApp {
    /**
     * Home Work Lesson 1
     * Sobol Vladislav
     */

    // the task 2
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor(110);
        compareNumbers(1813756,209854761);


    }

    static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple ");
    }
    // the task 3

    static void checkSumSign() {
        boolean bool = true;
        int a = 3;
        int b = -3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // the task 4

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }


    }
    // the task 5
       static void compareNumbers(int a, int b){
        if(a >= b){
            System.out.println("a >= b");
        }
        else if (a < b){
            System.out.println("a < b");
        }

    }
}

