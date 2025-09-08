package Basics_Of_Java;

public class Iteration_of_array {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int sum = 0, sumsq = 0;
        double mean, stdDev;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sumsq += numbers[i] * numbers[i];
        }

        mean = (double) sum / numbers.length;
        stdDev = Math.sqrt((double) sumsq / numbers.length - mean * mean);

        // print with printf function. and while we use printf function we have to use (,) instead of (+) . and other things like %d, %f , %c etc
        System.out.printf("Mean is : %.2f%n", mean); // %.2f%n means 2 decimal of float has been printed
        System.out.printf("The Standard Division is: %.2f%n", stdDev); // same
        System.out.println(" ");

        // we can also do the same thing by using Enhanced for loop:
        int marks[] = {100, 99, 97, 92, 95};
        int sum2 = 0, sumsq2 = 0;
        double mean2, stdDev2;
        for (int items : marks) {
            sum2 += items;
            sumsq2 += items * items;
        }
        mean2 = (double) sum2 / marks.length;
        stdDev2 = Math.sqrt((double) sumsq2 / marks.length - mean2 * mean2);
        System.out.printf("Mean2 is : %.3f%n",mean2);
        System.out.printf("The Standard Division2 is : %.3f%n",stdDev2);
    }
}
