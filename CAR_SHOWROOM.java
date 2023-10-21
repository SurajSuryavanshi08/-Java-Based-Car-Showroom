

package com.mycompany.car_showroom;
import java.util.*;
import java.lang.*;
interface utility{
    public void get_details();
    public void set_details();
}
public class CAR_SHOWROOM {
    static void main_menu(){
        System.out.println();
        System.out.println("===========================***WELCOME TO SHOWROOM MANAGMENT SYSTEM***=======================");
        System.out.println();
        System.out.println("=========================================ENTER YOUR CHOISE==================================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars car[] = new Cars[5];
        int car_count=0;
        int showroom_count=0;
        int employees_count = 0;
        int choice =100;
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();
            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_count] = new Showroom();
                        showroom[showroom_count].set_details();
                        showroom_count++;
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_count] = new Employees();
                        employee[employees_count].set_details();
                        employees_count++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_count] = new Cars();
                        car[car_count].set_details();
                        car_count++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroom_count;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_count; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                    
                        for (int i = 0; i < car_count; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break; 
                        
                }
            }
        }
    }
}
