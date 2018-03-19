package com.example.IO_stream;


//Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
//
//        Контрольная сумма данных вычисляется по следующему алгоритму:
//
//        Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
//        Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor bn+1 , где Cn —
// контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте
// Integer.rotateLeft), bn — n-ный байт данных.
//        Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно
// выбрасываться из метода.
//
//        Пример
//        На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно быть возвращено число 71.


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,World");
        System.out.println((new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        try {
           System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int checkSumOfStream2(InputStream inputStream) throws IOException {
        int cSum =0;
        for(int b;(b=inputStream.read())!=-1; cSum = Integer.rotateLeft(cSum,1) ^ b);
        return cSum;
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        int input = 0;
        int result = 0;
        int i = 0;
        input = inputStream.read();
        while (input != -1) {
            System.out.println(input);
            result = Integer.rotateLeft(result, 1) ^ Math.abs(input);
            System.out.println("result=" + result);
            i=i+1;
            System.out.println("i"+ i);
            input = inputStream.read();

        };
        return result;

    }
}
