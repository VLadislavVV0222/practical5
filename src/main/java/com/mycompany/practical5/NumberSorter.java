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
public class NumberSorter implements Runnable{
    private List<Integer> numbers;

    public NumberSorter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Collections.sort(numbers);
    }   
}
