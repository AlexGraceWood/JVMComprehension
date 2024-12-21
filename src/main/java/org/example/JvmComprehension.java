package org.example;

public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1: В стеке создается локальная переменная `i`, хранящая примитивное значение 1.
        Object o = new Object();        // 2: В куче создается объект класса `Object`, ссылка на него сохраняется в стеке в переменной `o`.
        Integer ii = 2;                 // 3: В куче создается объект класса `Integer` со значением 2, ссылка сохраняется в стеке в переменной `ii`.
        printAll(o, i, ii);             // 4: Вызывается метод `printAll`, создается новый фрейм стека, в который передаются ссылки на `o`, `ii` и копия значения `i`.
        System.out.println("finished"); // 7: Метод `println` выводит строку `"finished"`. Строка берется из String Pool в куче.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5: В куче создается объект класса `Integer` со значением 700, ссылка сохраняется в локальной переменной `uselessVar` в стеке.
        System.out.println(o.toString() + i + ii);  // 6: Вызывается метод `toString()` у объекта `o`. В куче создается временная строка для вывода.
    }
}
