package com.astontech.menteeTrainingAlgos.codeSignal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class AddTwoHugeNumbers {

    public static void main(String[] args) {
        ListNode<Integer> a = new ListNode<Integer>(1234);
        a.next = new ListNode<>(1234);
        a.next.next = new ListNode<>(0);

        ListNode<Integer> b = new ListNode<>(0);

        addTwoHugeNumbers(a,b);

    }

    // Definition for singly-linked list:
    static class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
//

    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

        StringBuilder pieceTogetherA = new StringBuilder();
        StringBuilder pieceTogetherB = new StringBuilder();

        ListNode aNode = a;
        while(aNode.value != null) {
            pieceTogetherA.append(aNode.value);
            if (aNode.next == null) break;
            aNode = aNode.next;
        }
        int aNumber = Integer.parseInt(pieceTogetherA.toString());

        ListNode bNode = b;
        while(bNode.value != null) {
            pieceTogetherB.append(bNode.value);
            if (bNode.next == null) break;
            bNode = bNode.next;
        }
        int bNumber = Integer.parseInt(pieceTogetherB.toString());

        int total = aNumber + bNumber;

        String totalToString = Integer.toString(total);
        List<String> numbers = new ArrayList<>();
        AtomicReference<StringBuilder> sectionedStrings = new AtomicReference<>(new StringBuilder());
        IntStream.range(0, totalToString.length()).
                forEach(i -> {
                    sectionedStrings.get().append(totalToString.charAt(i));
                    if (i != 1 && (i+1) % 4 == 0) {
                        numbers.add(sectionedStrings.toString());
                        sectionedStrings.set(new StringBuilder());
                    } else if (i == totalToString.length()-1) {
                        numbers.add(sectionedStrings.toString());
                    }
                } );

        System.out.println(numbers.toString());

        return a;
    }
}
