package org.example;

import java.util.List;
import java.util.Scanner;

import org.example.Employer.EmployeeInfo;
import org.example.StreamTask.CollectionsListOf;
import org.example.StringTasks.Sex;
import org.example.StringTasks.Students;
import org.example.domain.Animal;
import org.example.domain.Cat;

import static org.example.StringTasks.BracketsInsertion.addBrackets;
import static org.example.StringTasks.EqualPairs.countCouple;
import static org.example.StringTasks.Iterator.getIterator;
import static org.example.StringTasks.MostRepeatingChar.getChar;
import static org.example.StringTasks.NumberOfTwo.getNumberoftwo;
import static org.example.StringTasks.SpaceMerging.mergeSpace;
import static org.example.StringTasks.StringComparing.compareString;
import static org.example.StringTasks.StringCompressing.compressBad;
import static org.example.StringTasks.StringValidation.validateString;
import static org.example.StringTasks.Collection.getCollection;

public class Main {
    public static Scanner in = new Scanner(System.in);
    static List<Students> list = List.of(new Students(Sex.MAN, "Вася", 16), new Students(Sex.MAN, "Петя", 23),
            new Students(Sex.WOMEN, "Елена", 42), new Students(Sex.MAN, "Иван петрович", 69));
    static List<String> list2 = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public static void main(String[] args) {
        EmployeeInfo employerInfo = new EmployeeInfo();
        CollectionsListOf listOF = new CollectionsListOf();
        Animal cat = new Cat("Cat", "mammal", "British cat", "Gray");

        System.out.println(getCollection(in));
        getIterator(in);
        System.out.println(getNumberoftwo(in));
        System.out.println(compareString(in));
        System.out.println(compressBad(in));
        System.out.println(getChar(in));
        System.out.println(validateString(in));
        System.out.println(addBrackets(in));
        System.out.println(mergeSpace(in));
        System.out.println(countCouple(in));
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
