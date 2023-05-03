package org.example;

import org.example.Employer.EmployerInfo;
import org.example.StreamTask.CollectionsListof;
import org.example.StringTasks.Collections;
import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Students> list = List.of(new Students("Вася", 16, Sex.MAN), new Students("Петя", 23, Sex.MAN),
            new Students("Елена", 42, Sex.WOMEN), new Students("Иван петрович", 69, Sex.MAN));
    static List<String> list2 = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public static void main(String[] args) {
        EmployerInfo employerInfo = new EmployerInfo();
        Collections collections = new Collections();
        CollectionsListof listOF = new CollectionsListof();

        System.out.println(collections.getCollection(new ArrayList<>()));

        System.out.println(collections.getNumberoftwo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));

        System.out.println(collections.compareString("ABCDEFDefd", "ABCFEDDedf"));

        System.out.println(collections.compressBad("AAABBBBBBLLLDCCCDSASfffssssssssssssaaaaaaaaaa "));

        System.out.println(collections.getChar("aaabsssssffffff"));

        System.out.println(collections.validateString("a((s)dv)sx"));

        System.out.println(collections.addBrackets(new StringBuilder("Miserable")));

        System.out.println(collections.mergeSpace("         asdasd    asd           asd                 das      asd         "));

        System.out.println(collections.countCouple(new int[]{1, 3, 5, 3, 6, 7, 3, 2, 1, 8, 5}));

        System.out.println("-------------------------------------------------");
        listOF.getTask2(list);
        listOF.addToString(list2);
        listOF.sortCollection(list2);
        listOF.getArray(list2);
        listOF.sortDeleteString(list2);
        employerInfo.returnEmployers();
        employerInfo.returnMaxPayment();
        employerInfo.getAveragePayment();
        employerInfo.getSumPayment();
    }
}
