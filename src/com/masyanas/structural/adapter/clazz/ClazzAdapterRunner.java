package com.masyanas.structural.adapter.clazz;

import com.masyanas.structural.adapter.PrintList;

import java.util.ArrayList;

public class ClazzAdapterRunner {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        PrintList pl = new PrintListClazzAdapter();
        pl.printList(list);

    }

}
