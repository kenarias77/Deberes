package review.main;
import review.data.Business;
import review.data.Review;
import review.data.Users;

import java.util.Arrays;

import java.util.Scanner;

public class Main {
    static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Managment managment = new Managment();
        String login,password;
        managment.Initialice();
        System.out.println("Enter your credentials");
        do{
           login=sc.next();
           password=sc.next();
            if(managment.Login(login,password)==null)
            {
                System.out.println("Error trying to log, try again");
            }
        }while(managment.Login(login,password)==null);
        Users user=new Users(login,password);
        int option;
        do{
            System.out.println("1.My reviews");
            System.out.println("2.Business list");
            System.out.println("3.Top rated Business");
            System.out.println("4.Edit My review");
            System.out.println("5.Quit");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    managment.showReviews(user);
                    break;
                case 2:

                        managment.sortBusinessesByName();
                    break;
                case 3:
                    System.out.println("enter the type of business to see its rating \n1.Restaurants\n2.Hairdressers\n2.Garages");
                    int type=sc.nextInt();
                        managment.sortBusinessesByRating(type);
                    break;
                case 4:
                        managment.EditReview(user);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default :
                    System.out.println("Error choosing (1-5)");
                    break;
            }
        }while(option!=5);
    }
}
