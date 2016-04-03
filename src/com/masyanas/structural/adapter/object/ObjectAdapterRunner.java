package com.masyanas.structural.adapter.object;

import com.masyanas.structural.adapter.PrintList;

import java.util.ArrayList;

public class ObjectAdapterRunner {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        PrintList pl = new PrintListObjectAdapter();
        pl.printList(list);

    }
}
