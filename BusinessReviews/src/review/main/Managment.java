package review.main;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import review.data.*;

public class Managment {
    Users[] users;
    Business[] businesses;
    Review[] reviews;
    public  void showReviews(Users users)
    {

        for(int i=0;i<businesses.length;i++)
        {
            Review[] reviews=businesses[i].getReviews();
            for(int j=0;j<reviews.length;i++)
            {
                if(reviews[j].getUser().equals(users.getLogin()))
                {
                    System.out.println(reviews[j].toString());
                }
            }
        }
    }
    public void sortBusinessesByName()
    {
        Arrays.sort(businesses);
        for(Business b:businesses)
        {
            System.out.println(b.toString());
        }
    }

    public void sortBusinessesByRating(int option)
    {
        Arrays.sort(businesses);
        switch(option)
        {
            case 1:
                for(Business r:businesses)
                {
                    if(r instanceof Restaurants)
                    {
                        System.out.println(r.toString());
                    }
                }
                break;
            case 2:
                for(Business r:businesses)
                {
                    if(r instanceof Hairdresser)
                    {
                        System.out.println(r.toString());
                    }
                }
                break;
            case 3:
                for(Business r:businesses)
                {
                    if(r instanceof Garage)
                    {
                        System.out.println(r.toString());
                    }
                }
                break;
            default :
                System.out.println("Error in choosing option(1-3)");
                break;
        }
    }
    public void EditReview(Users user)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the business");
        String business=sc.next();
        boolean status=false;
        for(int i=0;i<businesses.length;i++)
        {
            if(businesses[i].getName()==business)
            {
                for(int j=0;j< reviews.length;j++)
                {
                    if(reviews[i].getUser()==user)
                    {
                        System.out.println("Enter your comment");
                        String comment=sc.next();
                        System.out.println("Enter your rating");
                        int rating=sc.nextInt();
                        reviews[i].setComment(comment);
                        reviews[i].setStars(rating);
                        System.out.println("Comment changed succesfully");
                        status=true;
                    }
                }
            }
            if(!status)
            {
                System.out.println("Error in changing your comment");
            }
        }

    }
    public void Initialice()
    {
        Random r=new Random();
        int ran2,ran1;
        for(int i=0;i<10;i++)
        {
            users[i]=new Users("usuario"+i,"contraseña"+i);
        }


        for(int i=0;i<6;i++)
        {
            do{
                ran2=r.nextInt(10);
                ran1=r.nextInt(10);
            }while(ran1==ran2);
            reviews[0]=new Review(users[ran1],"bueno",4);
            reviews[1]=new Review(users[ran2],"malo",1);
            switch (i)
            {
                case 0:
                    businesses[i]=new Restaurants("paco","alicante",reviews,"marisco");
                    break;
                case 1:
                    businesses[i]=new Restaurants("juan","san juan",reviews,"arroces");
                    break;
                case 2:
                    businesses[i]=new Hairdresser("maria","albacete",reviews,true);
                    break;
                case 3:
                    businesses[i]=new Hairdresser("josefina","valencia",reviews,false);
                case 4:
                    businesses[i]=new Garage("pedro","alicante",reviews,30);
                    break;
                case 5:
                    businesses[i]=new Garage("julian","madrid",reviews,100);
            }
        }
    }
    public Users Login(String login,String password)
    {
        for(int i=0;i< users.length;i++)
        {
            if(users[i].getLogin().equals(login)&&users[i].getPassword().equals(password))
            {
                return users[i];
            }
        }
        return null;
    }
}
