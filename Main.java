import carDecorator.Bumper.standardbumper;
import carDecorator.Bumper.stepbumper;
import carDecorator.Headlights.hidlights;
import carDecorator.Headlights.laserlight;
import carDecorator.Headlights.ledlights;
import carDecorator.Paint.glossblack;
import carDecorator.Paint.glossred;
import carDecorator.Paint.matteblack;
import carDecorator.Paint.mattered;
import carBody.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.print("AutoParts Select System\n");

    baseBody selectedBody=new hatchback();


    System.out.println("Select Base body of the Auto you need..\n 1.hatchback\n 2.minivan\n3.pickuptruck\n4.sedan\n");
    int choice1 = sc.nextInt();

    if(choice1==1){
        selectedBody = new hatchback();

        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice1==2){
        selectedBody = new minivan();
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice1==31){
        selectedBody = new pickuptruck();
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice1==4){
        selectedBody = new sedan();
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    
    
    System.out.println("Select Bumper Decorators you need..\n 1.standard bumper \n 2.step bumper\n");
    int choice2 = sc.nextInt();
    if(choice2==1){
        selectedBody = new standardbumper(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice2==2){
        selectedBody = new stepbumper(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }

    System.out.println("Select headlights you need..\n 1.HID \n 2.LED\n 3.Laser\n");
    int choice3 = sc.nextInt();
    if(choice3==1){
        selectedBody = new hidlights(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice3==2){
        selectedBody = new ledlights(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }
    if(choice3==3){
        selectedBody = new laserlight(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\tAdded to cart");
    }

    System.out.println("Select car paint you need..\n 1.Gloss Black \n 2.Gloss Red\n 3.Matte Black\n 4.Matte Red\n");
    int choice4 = sc.nextInt();
    if(choice4==1){
        selectedBody = new glossblack(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\n.Thankyou for shopping with us");
    }
    if(choice4==2){
        selectedBody = new glossred(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\n.Thankyou for shopping with us");
    }
    if(choice4==3){
        selectedBody = new matteblack(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\n.Thankyou for shopping with us");
    }
    if(choice4==4){
        selectedBody = new mattered(selectedBody);
        System.out.println(selectedBody.getDescription()+"\tTotal Price $"+selectedBody.getPrice()+"\n.Thankyou for shopping with us");
    }

    }

}
