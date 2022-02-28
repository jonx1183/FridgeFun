package Demo;

import java.util.Scanner;

public class FridgeFun {
  Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    new FridgeFun().go();
  }

  int askUserHowManyFoods(){

      int numOfFoods;
      System.out.print("How many foods?: ");
      numOfFoods = in.nextInt();
      in.nextLine(); //Scanner Bug
      return numOfFoods;
    }

    String[] askUserToInputFoods(int num){
      String[] inputFoods = new String[num];

      for (int i = 0; i < num; i++) {
        System.out.print("Enter food #" + (i + 1) + ":");
        inputFoods[i] = in.nextLine();
      }
      return inputFoods;

    }
    void printList(String[] foods){
      System.out.println("\nList of foods: ");

      for (int i = 0; i < foods.length; i++)
        System.out.println("#" + (i + 1) + ":" + foods[i]);
    }
    void go(){
    //String food
      int numFoods;
      String[] foods;

      numFoods = askUserHowManyFoods();
      foods =  askUserToInputFoods(numFoods);
      printList(foods);
   }
}

