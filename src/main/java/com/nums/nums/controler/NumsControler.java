package com.nums.nums.controler;

//import gr.codehub.college.model.Courses;
//import gr.codehub.college.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Scanner;

@RestController
public class NumsControler {

@GetMapping("numbers/sum")
    public int findSum(){
    Scanner in = new Scanner(System.in);
    System.out.println();
    System.out.println("Addition of Two Numbers");
    System.out.println("\n");
    System.out.print("Enter First Value : ");
    int a = in.nextInt();
    System.out.print("Enter Second Value : ");
    int b = in.nextInt();
    int sum = (a + b);
    System.out.println("\n");
    System.out.print("The sum of " + a + " and " + b + " is " + sum +".");
    return sum;

}


    @GetMapping("numbers/max")
    public int findMax(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Max of Two Numbers");
        System.out.println("\n");
        System.out.print("Enter First Value : ");
        int a = in.nextInt();
        System.out.print("Enter Second Value : ");
        int b = in.nextInt();
        if (a > b) {

            System.out.println("\n");
            System.out.print("The number " + a + " is greater than " + b +".");
        }
        else if (a < b){
            System.out.print("The number " + b + " is greater than " + a +".");
        }
        else{
            System.out.print("The numbers " + b + " and " + a + " are equals");
          }


        return Math.max(a,b);
    }

    @GetMapping("numbers/min")
    public int findMin(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Min of Two Numbers");
        System.out.println("\n");
        System.out.print("Enter First Value : ");
        int a = in.nextInt();
        System.out.print("Enter Second Value : ");
        int b = in.nextInt();
        if (a < b) {

            System.out.println("\n");
            System.out.print("The number " + a + " is lower than " + b +".");
        }
        else if (a > b){
            System.out.print("The number " + a + " is lower than " + b +".");
        }
        else {
            System.out.print("The numbers " + b + " and " + a + " are equals.");

        }

        return Math.min(a,b);
    }

}
