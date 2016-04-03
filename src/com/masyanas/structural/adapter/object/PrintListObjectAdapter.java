package com.masyanas.structural.adapter.object;

import com.masyanas.structural.adapter.PrintList;
import com.masyanas.structural.adapter.PrintString;

import java.util.ArrayList;

public class PrintListObjectAdapter implements PrintList {

    PrintString printString = new PrintString();

    @Override
    public void printList(ArrayList<String> list) {

        String listString = "";

        for (String s : list) {
            listString += s + "\t";
        }

        printString.print(listString);
    }

}
