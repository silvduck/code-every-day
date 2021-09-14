// to compile (terminal):
// javac nameClass.java
// java nameClass

import java.util.*;

public class Sep12th2021 {

  // 1. Find the last element of a list
  static int myLast(List<Integer> list) {
    return list.get(list.size() - 1);
  }

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4);
    System.out.println(myLast(list));
  }

}
