package StackInheritance;

public class Main {
    public static void main(String[] args) {
        StackAggregation stack1 = new StackAggregation(5);

        stack1.push("alma");
        stack1.push(1);
        stack1.push(true);

        System.out.println(stack1);
    }
}
