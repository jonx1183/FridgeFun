

import java.util.Scanner;

  public class FridgeFun {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public class fridge {

      int askUserHowManyFoods(){

        int numOfFoods;
        System.out.println("How many foods?: ");
        numOfFoods = in.nextInt();
        return numOfFoods;
      }

      String[] askUserToInputFoods(int num){
        String[] inputFoods = new String[num];

        for (int i = 0; i < num; i++) {

          System.out.println("foods" + (i + 1) + "");
          inputFoods[1] = in.nextLine();
          in.nextLine();
        }
        return inputFoods;

      }
      void printList (String[] foods){
        System.out.println();
        for (int i = 0; i < foods.length; i++)
          System.out.println("||" + (i + 1) + "||" + foods[1]);
      }
      void go(){
        int numFoods;
        String[] foods;

        numFoods = askUserHowManyFoods();
        foods =  askUserToInputFoods(numFoods);
        printList(foods);

      }
    }
  }

