/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class TemperatureConverter {
    private Scanner scanner;
    public TemperatureConverter(Scanner scanner){
    
}

    public TemperatureConverter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void doConvert(){
        boolean repeat = true;
        do{
            System.out.println("Выберите направление конверсии:");
            System.out.println("0.Закончить задачу");
            System.out.println("1.Конвертировать из цельсия в фарингейты");
            System.out.println("2.Конвертировать из фарингейта в цельсии");
            System.out.print("Задача Номер 1");
            int task = scanner.nextInt();scanner.nextLine();
            switch(task){
                case 0:
                    System.out.println("Выбран выход из конвертора");
                    repeat =false;
                    break;
                case 1:
                    System.out.println("Выбрана конверсия из цельсия в фаренгейт");
                    celsiusToFarenheit();
                    break;
                default:
                    System.out.println("--------------");
                 
                    
            }
        }while(repeat);
       
    }

    private void celsiusToFarenheit() {
        System.out.print("Введите температуру(Celsium): ");
        double tCelsium = scanner.nextDouble();scanner.nextLine();
        double tFahrenheit = 0;
        System.out.printf("Рузультат (Fahrenheit): %1f%n",tFahrenheit);
    }
    
}
