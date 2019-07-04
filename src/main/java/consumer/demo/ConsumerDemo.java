package consumer.demo;


import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        System.out.println("Java8 Consumer Example\n");

        Consumer<String> consumer = ConsumerDemo::printNames;
        consumer.accept("C++");
        consumer.accept("Java");
        consumer.accept("Python");
        consumer.accept("Ruby On Rails");
    }

    private static void printNames(String name) {
        System.out.println("Passed String " +name);
    }
}