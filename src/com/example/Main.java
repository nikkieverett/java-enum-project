package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a month");

        String input = sc.nextLine().toUpperCase();

        List<Month> listOfMonths = new ArrayList<>();

        for(Month month : Month.values()){
            int ordinal = -1;
            if(input.equals(String.valueOf(month))) {
                ordinal = month.ordinal();
            }
            if (ordinal != -1){
                for(int i = ordinal; i < Month.values().length; i ++){
                    listOfMonths.add(Month.values()[i]);
                }
            }
        }

        System.out.println(listOfMonths);

    }
}
