import java.util.Scanner;
public class GPA {
    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        double prog, net, os, dp, eng, gpa ;
        
        System.out.println("Welcome to use GPA calculator");
        System.out.print("Plesae input your Programming score: ");
        prog = input.nextDouble();
        System.out.print("Please input your Network Fundamentals score: ");
        net = input.nextDouble();
        System.out.print("Please input your OS fundamentals score: ");
        os = input.nextDouble();
        System.out.print("Please input your Database Principles score: ");
        dp = input.nextDouble();
        System.out.print("Please input your English score: ");
        eng = input.nextDouble();
        
        if (prog >= 75) {
            prog = 4;
        } else if (net >= 70) {
            prog = 3.7;
        } else if (prog >= 67) {
            prog = 3.3;
        } else if (prog >= 63) {
            prog = 3;
        } else if (prog >= 60) {
            prog = 2.7;
        } else if (prog >= 57) {
            prog = 2.3;
        } else if (prog >= 53) {
            prog = 2;
        } else if (prog >= 50) {
            prog = 1.7;
        } else if (prog >= 46) {
            prog = 1.3;
        } else if (prog >= 40) {
            prog = 1;
        } else {
            prog = 0;
        }
        
        if (net >= 75) {
            net = 4;
        } else if (net >= 70) {
            net = 3.7;
        } else if (net >= 67) {
            net = 3.3;
        } else if (net >= 63) {
            net = 3;
        } else if (net >= 60) {
            net = 2.7;
        } else if (net >= 57) {
            net = 2.3;
        } else if (net >= 53) {
            net = 2;
        } else if (net >= 50) {
            net = 1.7;
        } else if (net >= 46) {
            net = 1.3;
        } else if (net >= 40) {
            net = 1;
        } else {
            net = 0;
        }
        
        if (os >= 75) {
            os = 4;
        } else if (os >= 70) {
            os = 3.7;
        } else if (os >= 67) {
            os = 3.3;
        } else if (os >= 63) {
            os = 3;
        } else if (os >= 60) {
            os = 2.7;
        } else if (os >= 57) {
            os = 2.3;
        } else if (os >= 53) {
            os = 2;
        } else if (os >= 50) {
            os = 1.7;
        } else if (os >= 46) {
            os = 1.3;
        } else if (os >= 40) {
            os = 1;
        } else {
            os = 0;
        }
        
        if (dp >= 75) {
            dp = 4;
        } else if (dp >= 70) {
            dp = 3.7;
        } else if (dp >= 67) {
            dp = 3.3;
        } else if (dp >= 63) {
            dp = 3;
        } else if (dp >= 60) {
            dp = 2.7;
        } else if (dp >= 57) {
            dp = 2.3;
        } else if (dp >= 53) {
            dp = 2;
        } else if (dp >= 50) {
            dp = 1.7;
        } else if (dp >= 46) {
            dp = 1.3;
        } else if (dp >= 40) {
            dp = 1;
        } else {
            dp = 0;
        }
        
        if (eng >= 75) {
            eng = 4;
        } else if (eng >= 70) {
            eng = 3.7;
        } else if (eng >= 67) {
            eng = 3.3;
        } else if (eng >= 63) {
            eng = 3;
        } else if (eng >= 60) {
            eng = 2.7;
        } else if (eng >= 57) {
            eng = 2.3;
        } else if (eng >= 53) {
            eng = 2;
        } else if (eng >= 50) {
            eng = 1.7;
        } else if (eng >= 46) {
            eng = 1.3;
        } else if (eng >= 40) {
            eng = 1;
        } else {
            eng = 0;
        }
        
        gpa = prog * 13 / 49 + net * 10 / 49 + os * 10 / 49 + dp * 10 / 49 + eng * 6 / 49;
        
        
        System.out.print("Your GPA is: " + gpa);
        
        
        
    }
    
}