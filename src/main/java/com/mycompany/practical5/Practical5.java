/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical5;

/**
 *
 * @author vladc
 */
import java.util.*;
public class Practical5 {
    public static void main(String[] args){
        System.out.println("Вариант 5");
        System.out.println("ФИО: Чугунов Владислав Владимирович");
        List<Integer> numbers = new ArrayList<>();
        RandomNumberGenerator generator = new RandomNumberGenerator(numbers);
        NumberSorter sorter = new NumberSorter(numbers);

        Thread thread1 = new Thread(generator);
        Thread thread2 = new Thread(sorter);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
