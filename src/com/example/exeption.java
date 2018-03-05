package com.example;

import  java.lang.String;

/**
 * Created by Maxim.Rumyantsev on 05-Mar-18.
 *
 * Допустим, в программе используется следующее приведение типа:

 A a = (A) b;
 где A — имя какого-то класса, a и b — переменные.
 Если компилятор сможет сразу определить, что такое приведение невозможно, то компиляция завершится ошибкой.
 Однако не всегда компилятор может это сделать, т.к. фактический объект, находящийся по ссылке b, на момент
 компиляции не известен. Поэтому иногда такой код может успешно скомпилироваться, но упасть с ошибкой во время исполнения.

 Какое исключение выбросит JVM, если во время выполнения программы окажется, что ссылка b не может быть приведена к типу A?

 Введите полное имя класса исключения, включая пакет, например, com.example.FooBarException

 P.S. Эта задача предполагает проведение небольшого эксперимента. В лекциях нет ответа на этот вопрос.
 */

class A
{
    public String str()
    {
        return "A class";
    }
}

class B extends A
{
    @Override
    public String str()
    {
        return "B class";
    }
}

class Main
{
    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        A a = new A();
        B b = (B) a;
        //System.err.println(b.str());
    }
}
//
//"C:\Program Files\Java\jdk1.8.0_152\bin\java" -Didea.launcher.port=7538 "-Didea.launcher.bin.path=C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2016.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_152\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_152\jre\lib\rt.jar;C:\1\001_GIT\HelloWorld\out\production\HelloWorld;C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2016.3.4\lib\junit-4.12.jar;C:\1\001_GIT\HelloWorld\lib\hamcrest-library-1.3.jar;C:\1\001_GIT\HelloWorld\lib\hamcrest-core-1.3.jar;C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2016.3.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain com.example.Main
//        Exception in thread "main" java.lang.ClassCastException: com.example.A cannot be cast to com.example.B
//        at com.example.Main.<init>(exeption.java:50)
//        at com.example.Main.main(exeption.java:44)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
//
//        Process finished with exit code 1