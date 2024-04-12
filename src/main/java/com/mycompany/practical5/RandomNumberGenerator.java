/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical5;

/**
 *
 * @author vladc
 */
import java.util.*;
public class RandomNumberGenerator implements Runnable {
   private List<Integer> numbers;

    public RandomNumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(1000));
        }
    }
} 
    

