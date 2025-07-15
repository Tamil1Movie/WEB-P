//Write a java program  to determine the number of multiples of 3 between 20 and 80.


public class MultiplesOfThree {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 20; i <= 80; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Number of multiples of 3 between 20 and 80: " + count);
    }
}
