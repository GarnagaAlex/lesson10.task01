package com.garnagaaa.lesson10.task01.app1;

//Файл SomeClass.java компилируется программой (в рантайме) в файл SomeClass.class.

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * Класс компилятора
 */
public class Compiler {

    /**
     * Метод запуска компиляции
     *
     * @param file имя файла
     * @return Статус компиляции
     */
    public static boolean Compile(String file){
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        return compiler.run(null, null, null, file) == 0;
    }
}
