package Demo;

import java.util.Scanner;

public class TestFridge {
  Scanner in = new Scanner(System.in);

  int askUserHowManyFoods() {
    int numOfFoods;
    System.out.print("How many foods? ");
    numOfFoods = in.nextInt();
    in.nextLine(); // Scanner bug
    return numOfFoods;
  }

  String[] askUserToInputFoods(int num) {
    String[] inputFoods = new String[num];

    for (int i = 0; i < num; i++) {
      System.out.print("Enter food #" + (i + 1) + ": ");
      inputFoods[i] = in.nextLine();
    }

    return inputFoods;
  }

  void printList(String[] foods) {
    System.out.println("\nLIST OF FOODS:");

    for (int i = 0; i < foods.length; i++)
      System.out.println("#" + (i + 1) + ": " + foods[i]);
  }

  void go() {
    // String food;
    int numFoods;
    String[] foods;

    numFoods = askUserHowManyFoods();
    foods = askUserToInputFoods(numFoods);
    printList(foods);
  }

  public static void main(String[] args) {
    new TestFridge().go();
  }
}
