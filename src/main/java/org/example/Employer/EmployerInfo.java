package org.example.Employer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployerInfo {

    public List<Employer> list3 = List.of(new Employer("Alex", 21, 69000, 3),
            new Employer("Alexander", 27,  150000, 7),
            new Employer("George", 35, 250000, 10));

    Stream<Employer> stream = list3.stream();

    Comparator<Employer> ageComparator = new Comparator<Employer>() {
        @Override
        public int compare(Employer o1, Employer o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    };
    Comparator<Employer> expComparator = new Comparator<Employer>() {
        @Override
        public int compare(Employer o1, Employer o2) {
            return Integer.compare(o1.getExperience(), o2.getExperience());
        }
    };
    Comparator<Employer> paymentComparator = new Comparator<Employer>() {
        @Override
        public int compare(Employer o1, Employer o2) {
            return Integer.compare(o1.getPayment(), o2.getPayment());
        }
    };

    public void returnEmployers(){
        stream.forEach(System.out::println);
    }

    public void returnMaxPayment(){
        Stream<Employer> stream = list3.stream();
        System.out.println(stream.max(paymentComparator));
    }

    public void getAveragePayment(){
        Stream<Employer> stream = list3.stream();
        System.out.println(stream.mapToInt(Employer::getPayment).average());
    }

    public void getSumPayment(){
        Stream<Employer> stream = list3.stream();
        System.out.println(stream.mapToInt(Employer::getPayment).sum());
    }

    public void getSomePayment(){
        Stream<Employer> stream = list3.stream();
       // System.out.println(stream.filter();
    }
}
