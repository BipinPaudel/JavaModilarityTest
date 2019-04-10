package bipin.main;
import com.bipin.Calculator;
import com.bipin.internal.AddHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = calculator.add(3,4);
        System.out.println(a);

        AddHelper helper= new AddHelper();
//        System.out.println("hello");
//
//        List<String> stringList= new ArrayList<>();
//        stringList.add("UNITED STATES OF AMERICA");
//        stringList.add("NEPAL");
//        stringList.add("");
//
//
//        System.out.println(stringList);
//
//
//        System.out.println(stringList.stream()
//        .map(Main::convert)
//        .collect(Collectors.toList())
//        );
//
//        System.out.println("Ab".substring(1));
    }
//
//    private static String convert(String s){
//        return Arrays.stream(s.split(" "))
//                .filter(a->a.length()>0)
//                .map(a->a.charAt(0)+a.substring(1).toLowerCase())
//                .collect(Collectors.joining(" "))
//                ;
//
//    }
}
