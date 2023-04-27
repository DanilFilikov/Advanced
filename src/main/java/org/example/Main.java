package org.example;

import org.example.domain.Collections;
import org.example.domain.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collections collections = new Collections();
        System.out.println(collections.getCollection(new ArrayList<>()));
        collections.getIterator();
        System.out.println(collections.getNumberoftwo(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}));
        System.out.println(collections.compareString("ABCDEFDefd", "ABCFEDDedf"));
        System.out.println(collections.compressBad("AAABBBBBBLLLDCCCDSASfffssssssssssssaaaaaaaaaa "));
        System.out.println(collections.getChar("aaabsssssffffff"));
        System.out.println(collections.validateString("a((s)dv)sx"));
        System.out.println(collections.addBrackets(new StringBuilder("Miserable")));
        System.out.println(collections.mergeSpace("         asdasd    asd           asd                 das      asd         "));
        System.out.println(collections.countCouple(new int[]{1,3,5,3,6,7,3,2,1,8,5}));


    }
}