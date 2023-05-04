package org.example;

import org.example.Employer.EmployeeInfo;
import org.example.StreamTask.CollectionsListOf;
import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;
import org.example.domain.Animal;
import org.example.domain.Cat;

import java.util.ArrayList;
import java.util.List;

import static org.example.StringTasks.BracketsInsertion.addBrackets;
import static org.example.StringTasks.EqualPairs.countCouple;
import static org.example.StringTasks.Iterator.getIterator;
import static org.example.StringTasks.MostRepeatingChar.getChar;
import static org.example.StringTasks.NumberOfTwo.getNumberoftwo;
import static org.example.StringTasks.SpaceMerging.mergeSpace;
import static org.example.StringTasks.StringComparing.compareString;
import static org.example.StringTasks.StringCompressing.compressBad;
import static org.example.StringTasks.StringValidation.validateString;
import static org.example.StringTasks.Сollection.getCollection;

public class Main {

    static List<Students> list = List.of(new Students("Вася", 16, Sex.MAN), new Students("Петя", 23, Sex.MAN),
            new Students("Елена", 42, Sex.WOMEN), new Students("Иван петрович", 69, Sex.MAN));
    static List<String> list2 = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public static void main(String[] args) {
        EmployeeInfo employerInfo = new EmployeeInfo();
        CollectionsListOf listOF = new CollectionsListOf();
        Animal cat = new Cat("Cat", "mammal", "British cat", "Gray");

        System.out.println(getCollection(new ArrayList<>()));

        getIterator();

        System.out.println(getNumberoftwo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));

        System.out.println(compareString("ABCDEFDefd", "ABCFEDDedf"));

        System.out.println(compressBad("AAABBBBBBLLLDCCCDSASfffssssssssssssaaaaaaaaaa "));

        System.out.println(getChar("aaabsssssffffff"));

        System.out.println(validateString("a((s)dv)sx"));

        System.out.println(addBrackets(new StringBuilder("Miserable")));

        System.out.println(mergeSpace("         asdasd    asd           asd                 das      asd         "));

        System.out.println(countCouple(new int[]{1, 3, 5, 3, 6, 7, 3, 2, 1, 8, 5}));

        System.out.println("-------------------------------------------------");
        listOF.getTask2(list);
        listOF.addToString(list2);
        listOF.sortCollection(list2);
        listOF.getArray(list2);
        listOF.sortDeleteString(list2);
        employerInfo.returnEmployees();
        employerInfo.returnMaxPayment();
        employerInfo.getAveragePayment();
        employerInfo.getSumPayment();
        employerInfo.getSomePayment();
    }
}
