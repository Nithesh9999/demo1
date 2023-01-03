package demo.p1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
     public static void main(String[] args) {
      List<Integer> l1=Arrays.asList(9,2,9,3,1,4,5,1,6,3);
      List<Integer> s1 = l1.stream().distinct().collect(Collectors.toList());
      System.out.println(s1);
     }
     
}
