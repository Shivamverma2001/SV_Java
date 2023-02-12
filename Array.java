import java.util.*;
import java.io.*;

public class Array {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("he");
    al.add("hi");
    ArrayList<String> a2 = new ArrayList<String>();
    a2.add("ho");
    a2.add("a");
    a2.add("u");
    a2.add(a2.remove(3));
    System.out.println(a2.get(3));
  }
}