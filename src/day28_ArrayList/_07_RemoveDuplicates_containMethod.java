package day28_ArrayList;import java.util.ArrayList;public class _07_RemoveDuplicates_containMethod {    public static void main(String[] args) {        ArrayList<Integer> list = new ArrayList<>();        list.add(10);        list.add(10);        list.add(10);        list.add(20);        list.add(20);        list.add(20);        list.add(10);        list.add(10);        list.add(10);        ArrayList<Integer> result = new ArrayList<>();  // {10, 20, 30}        for (Integer each : list) {            if (result.contains(each)){   //  contains returns boolean                continue;            }            result.add(each);        }    }}