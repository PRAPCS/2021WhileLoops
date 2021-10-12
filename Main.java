import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num1 = 0;
    int count = 0;
    int sum = 0;

    while (count < 10) {
      num1 = (int) (Math.random() * 20) + 1;
      sum += num1; // Running sum -- sum = sum + num1
      System.out.println(num1);
      count++; // count = count +1
    }
    System.out.println("The sum of all rolls is: " + sum);

    // Sentinal value loop
    Scanner input = new Scanner(System.in);
    int num2 = 0;
    int sum2 = 0;
    System.out.println("Please enter a number or -99 to quit ");
    num2 = input.nextInt();

    while (num2 != -99) {
      sum2 += num2; // sum2= sum2+num2;
      System.out.println("Please enter a number or -99 to quit ");
      num2 = input.nextInt();
    }
    System.out.println("Your sum is: " + sum2);

    // variable controlled loop
    int counterNum = 1;
    int stopValue = 100;

    while (counterNum <= stopValue) {
      System.out.print(counterNum + "\t");
      if (counterNum % 10 == 0)
        System.out.println();
      counterNum++;
    }

  }
}