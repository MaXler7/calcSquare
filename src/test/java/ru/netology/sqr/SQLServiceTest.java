package ru.netology.sqr;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQLServiceTest {


    @Test
    public void shouldCalcSquare() {
        SQLService service = new SQLService();
        int lowerlimit = 300;
        int upperlimit = 400;
        int expected = 3;


        int actual = service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);


    }


    @Test
    public void shouldCalcSquareMore() {
        SQLService service = new SQLService();
        int lowerlimit = 300;
        int upperlimit =  1000_00;
        int expected = 3;


        int actual = service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);


    }



    @Test
    public void shouldalcSquareBrokenTest() {
        SQLService service = new SQLService();
        int lowerlimit = 200;
        int upperlimit = 300;
        int expected = 4;


        int actual = service.calcSquare(lowerlimit, upperlimit);

        assertEquals(expected, actual);
    }

}
