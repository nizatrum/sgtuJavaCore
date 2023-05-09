package org.example.lesson4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    //Это новый способ работать со структурами данных в функциональном стиле
    // Стрим приводит нашу коллекцию (лист например) в поток данных
    // Есть конвеерные команды, такие как filter, skip, distinct, sorted и тд
    // И терминальные команды (!ВАЖНО!) минимум одна терминальная команда всегда должна быть так как это
    // завершает обработку нашего потока данных и приводит в понятных для нас тип данных, например
    // collect (приводит обратно к коллекции) ну а также другие терминальные методы:
    // findFirst, findAny, count, min, max, forEach(вывод каждого элемента коллеции) и тд
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 2, 5, 1, 8, 5, 6, 8, 9, 0, 1);
        // еще немного функциальных интерфейсов Comparator
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;  //двигает число вправо
                else
                    return -1; //двигает число влево
            }
        });
        //теперь уже использование stream
        List res = list.stream().distinct().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(res);
        //Wrapper (обертка), например для int (примитивный тип) это Integer (ссылочный тип), который является полноценным
        // объектом со своими методами, но занимает больше место, что логично.
        // При параметризации типа мы не можем указать примитивный тип, только ссылочный.
    }
}
