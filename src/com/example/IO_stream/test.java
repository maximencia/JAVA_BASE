package com.example.IO_stream;

import com.sun.javaws.Main;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.example.IO_stream.Hello.checkSumOfStream;
import static org.junit.Assert.assertEquals;

/**
 * @author meanmail
 */


public class test {
    private static final byte[][] testSets = new byte[][]{
            {10, 20, 30, 50, 1, 125},
            {111, -45, 0, -2, 58, -1},
            {0, 0, 0, 0, 0, 0},
            {-1, -1, -1, -1, -1, -1},
            {0x33, 0x45, 0x01},
            {},
            {-1}
    };
    private static final int[] testResults = new int[]{71, 931, 0, 5397, 71, 0, 255};

    @Test(timeout = 8000)
    public void checkSumOfStreamSample1() throws IOException {
        for (int i = 0; i < testSets.length; i++) {
            int checkSum;
            checkSum= checkSumOfStream(new ByteArrayInputStream(testSets[i]));
            assertEquals(testResults[i], checkSum);
        }
    }
}