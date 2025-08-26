package StackQueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.push(10);
        oldStack.push(20);
        System.out.println("올드 스택 결과");
        int firstPop = oldStack.pop();
        System.out.println("첫 번째 팝: " + firstPop);
        int secondSeek = oldStack.peek();
        System.out.println("두 번째 시크: " + secondSeek);
        int secondPop = oldStack.pop();
        System.out.println("두 번째 팝: " + secondPop);

        Deque<Integer> stackWithDeque = new ArrayDeque<>();
        stackWithDeque.push(10);
        stackWithDeque.push(20);
        System.out.println("덱 스택 결과");
        System.out.println("첫 번째 팝: " + stackWithDeque.pop());
        System.out.println("두 번째 시크: " + stackWithDeque.peek());
    }
}
