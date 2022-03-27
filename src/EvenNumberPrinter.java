public class EvenNumberPrinter {
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printEvenNumbers(int start, int end) {
        if(end < start) {
            System.out.println("Invalid parameters");
            return;
        }

        int i = start;
        int counter = 0;

        while (i <= end) {
            if(!isEven(i)) {
                i++;
                continue;
            } else {
                System.out.println("Even number: " + i);
                i++;
                counter++;

                if(counter == 5) {
                    System.out.println("5 even numbers found. Breaking the loop");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        printEvenNumbers(4, 25);
        System.out.println("*********************************");
        printEvenNumbers(4, 4);
        System.out.println("*********************************");
        printEvenNumbers(4, 2);
        System.out.println("*********************************");
        printEvenNumbers(4, 16);
    }
}
