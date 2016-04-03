package com.masyanas.structural.adapter.clazz;

import com.masyanas.structural.adapter.PrintList;
import com.masyanas.structural.adapter.PrintString;

import java.util.ArrayList;

public class PrintListClazzAdapter
        extends PrintString
        implements PrintList {

    @Override
    public void printList(ArrayList<String> list) {

        String listString = "";

        for (String s : list) {
            listString += s + "\t";
        }

        print(listString);
    }

}
