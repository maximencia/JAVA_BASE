package com.example.logger;

// этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.
//
//         Требуется выставить такие настройки, чтобы:
//
//         Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
//         Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
//         Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
//         Не упомянутые здесь настройки изменяться не должны.
//
//         (*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать файлы на диске, поэтому придется так.
//
//         Подсказки:
//
//         Level есть не только у Logger, но и у Handler.
//         Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.


//     Пошаговая стратегия (для тех, кто очень хочет уложиться в мягкий дедлайн)
//        - инициализируем переменную для логгера класса А и  устанавливаем ему заданный уровень
//        -  то же для класса B
//
//        - инициализируем переменную для логгера класса "org.stepic.java"
//        - лезем в документацию и смотрим что там с родителями логгера - как сделать так, чтобы сообщения не передавались выше
//        - устанавливаем ему эту фичу
//
//        - инициализируем ConsoleHandler
//        - устанавливаем ему нужный уровень
//        - добавляем его к логгеру нашего самого верхнего уровня
//
//        - инициализируем нужный форматтер
//        - устанавливаем его нашему ConsoleHandler
//
//        Удачи!

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Loggers {

    public static void main(String[] args) {
        loggersConfig();
        System.out.println("Hello,World");
        System.out.println(sqrt.sqrt(3));
    }

    public static void loggersConfig() {

//        - инициализируем переменную для логгера класса А и  устанавливаем ему заданный уровень
//        -  то же для класса B
//
        Logger classALogger = Logger.getLogger("com.example.logger.Loggers");
//        Logger classALogger = Logger.getLogger("org.stepic.java.logging.ClassA");
        classALogger.setLevel(Level.ALL);

        Logger classBLogger = Logger.getLogger("sqrt");
//        Logger classBLogger = Logger.getLogger("org.stepic.java.logging.ClassB");
        classBLogger.setLevel(Level.WARNING);


//        - инициализируем переменную для логгера класса "org.stepic.java"
//        - лезем в документацию и смотрим что там с родителями логгера - как сделать так, чтобы сообщения не передавались выше
//        - устанавливаем ему эту фичу
        Logger parentLogger = Logger.getLogger("com.example.logger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
//        - инициализируем нужный форматтер
//        - устанавливаем его нашему ConsoleHandler
//
        parentLogger.addHandler(handler);
        parentLogger.setUseParentHandlers(false);

    }
}

