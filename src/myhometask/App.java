/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhometask;
import java.util.Scanner;
import tasks.TemperatureConverter;
/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        boolean repeat=true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println('0');
            System.out.println('1');
            System.out.println('2');
            int task =scanner.nextInt();scanner.nextLine();
            switch (task){
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                    
                case 1:
                    System.out.println("");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter();
                    temperatureConverter.doConvert();
            }
            
            
            
        }while(repeat);
        System.out.println("BYE");
    }
    
}
