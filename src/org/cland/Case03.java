package org.cland;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Case03 {

    public static void main(String[] args) {
        List<Integer> data=new ArrayList<>();
        data.add(2);
        data.add(1);
        data.add(3);

        System.out.println("===基本操作 数据源->过滤->映射->收集 ==");
        Stream.of(1,2,3)
                .filter(e->e==1)
                 .map(e->e+1)
                .collect(Collectors.toSet());

        System.out.println(data.stream().collect(Collectors.summingInt(e->e)));

        System.out.println("====简单分组====");
        data.add(2);
        data.stream()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e->System.out.println(e.getKey()+":"+e.getValue()));

        System.out.println("====求和===");
        System.out.println(data.stream().reduce((x,y)->x+y).get());

    }

}
