//guess number using java
import java.util.Scanner;
import java.util.Random;
class guess_number
{
    public static void main(String args[])
    {
        System.out.println("Guess Number");
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //generating random number
        int number_to_guess = random.nextInt(10)+1; //to make 0 1 and include 10
        int choice=1;
        do{
            System.out.print("Guess the number between 1 to 10 and win the game: ");
            int user_guess = input.nextInt();
            if (user_guess == number_to_guess)
                System.out.println("You win!");
            else
                System.out.println("You loss!");

            System.out.print("Want to play more (1->yes/0->no)? ");
            choice = input.nextInt();
            if(choice==0)
                break;
        }while(choice==1);
        //System.out.println(number_to_guess);
    }
}