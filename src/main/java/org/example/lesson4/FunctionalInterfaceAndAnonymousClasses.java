package org.example.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionalInterfaceAndAnonymousClasses {
    public static void main(String[] args) {
        //удаление объектов в листе через итератор
        {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        Iterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 4) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
        //Predicate (условие) - возвращает всегда boolean и принимает один аргумент
        //функциаональный интерфейс Predicate + анонимный класс
        {
            Predicate<Integer> predicate = new Predicate<Integer>() {
                @Override
                public boolean test(Integer integer) {
                    if (integer % 2 == 0) {
                        return true;
                    }
                    return false;
                }
            };
            System.out.println(predicate.test(2));
            System.out.println(predicate.test(3));
        }
        //функциаональный интерфейс Predicate + анонимный класс через лямбда выражение
        {
            Predicate<Integer> predicateOther = integer -> {
                if (integer < 0) {
                    return false;
                }
                return true;
            };
            System.out.println(predicateOther.test(-1));
            System.out.println(predicateOther.test(2));
        }
        //функциаональный интерфейс Predicate + анонимный класс через лямбда выражение + еще короче
        {
            Predicate<Integer> predicateLast = integer -> integer > 0;
            System.out.println(predicateLast.test(100));
        }
        //Consumer (потребитель) - всегда void и принимает один аргумент
        {
            Consumer<String> consumer = System.out::println;
            consumer.accept("Hello world!");
        }
        //Supplier (производитель) - противоположность Consumer, ничего не принимает, но возвращает что-то.
        {
            Supplier supplier = () -> new Random().nextInt();
            System.out.println(supplier.get());
        }
        //Function (функция) - принимает один тип, возвращает другой тип данных.
        {
            Function<Integer, String> func = x -> {
                String res = "";
                for (int i = 0; i < x; i++) {
                    res += "-";
                }
                return res;
            };
            System.out.println(func.apply(5));
        }

    }
}
