package org.example.SerializationProject.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraySplitterTests {

    @Test
    @DisplayName("checking null values")
    public void checkingNullValues(){
        Assertions.assertEquals("", ArraySplitter.splitArray(null, 3));
    }

    @Test
    @DisplayName("Checking single vallues")
    public void checkingSingleValues(){
        Assertions.assertEquals("hello", ArraySplitter.splitArray(new String[] {"hello"}, 0));
    }

    @Test
    @DisplayName("Checking Employee Values")
    public void checkingEmployeeValues(){
        String[] expectedEmployee = {"178566","Mrs.","Juliette","M","Rojo","F","juliette.rojo@yahoo.co.uk","05/08/1967","06/04/2011","193912"};
        Assertions.assertEquals("178566",ArraySplitter.splitArray(expectedEmployee, 0) );
        Assertions.assertEquals("Mrs.",ArraySplitter.splitArray(expectedEmployee, 1) );
        Assertions.assertEquals("Juliette",ArraySplitter.splitArray(expectedEmployee, 2) );
        Assertions.assertEquals("M",ArraySplitter.splitArray(expectedEmployee, 3) );
        Assertions.assertEquals("Rojo",ArraySplitter.splitArray(expectedEmployee, 4) );
        Assertions.assertEquals("F",ArraySplitter.splitArray(expectedEmployee, 5) );
        Assertions.assertEquals("juliette.rojo@yahoo.co.uk",ArraySplitter.splitArray(expectedEmployee, 6) );
        Assertions.assertEquals("05/08/1967",ArraySplitter.splitArray(expectedEmployee, 7) );
        Assertions.assertEquals("06/04/2011",ArraySplitter.splitArray(expectedEmployee, 8) );
        Assertions.assertEquals("193912",ArraySplitter.splitArray(expectedEmployee, 9) );

    }

    @Test
    @DisplayName("Checking Employee Values")
    public void checkingEmployeeValues2(){
        String[] expectedEmployee = {"23346","Mr.","John","M","Mary","F","juliette.rojo@yahoo.co.uk","05/08/1967","06/04/2011","193912"};
        Assertions.assertEquals("23346",ArraySplitter.splitArray(expectedEmployee, 0) );
        Assertions.assertEquals("Mr.",ArraySplitter.splitArray(expectedEmployee, 1) );
        Assertions.assertEquals("John",ArraySplitter.splitArray(expectedEmployee, 2) );
        Assertions.assertEquals("M",ArraySplitter.splitArray(expectedEmployee, 3) );
        Assertions.assertEquals("Mary",ArraySplitter.splitArray(expectedEmployee, 4) );
        Assertions.assertEquals("F",ArraySplitter.splitArray(expectedEmployee, 5) );
        Assertions.assertEquals("juliette.rojo@yahoo.co.uk",ArraySplitter.splitArray(expectedEmployee, 6) );
        Assertions.assertEquals("05/08/1967",ArraySplitter.splitArray(expectedEmployee, 7) );
        Assertions.assertEquals("06/04/2011",ArraySplitter.splitArray(expectedEmployee, 8) );
        Assertions.assertEquals("193912",ArraySplitter.splitArray(expectedEmployee, 9) );

    }

    @Test
    @DisplayName("Checking Employee Values")
    public void checkingEmployeeValues3(){
        String[] expectedEmployee = {"19875","Mrs.","Ada","M","Jane","F","juliette.rojo@yahoo.co.uk","05/08/1967","06/04/2011","193912"};
        Assertions.assertEquals("19875",ArraySplitter.splitArray(expectedEmployee, 0) );
        Assertions.assertEquals("Mrs.",ArraySplitter.splitArray(expectedEmployee, 1) );
        Assertions.assertEquals("Ada",ArraySplitter.splitArray(expectedEmployee, 2) );
        Assertions.assertEquals("M",ArraySplitter.splitArray(expectedEmployee, 3) );
        Assertions.assertEquals("Jane",ArraySplitter.splitArray(expectedEmployee, 4) );
        Assertions.assertEquals("F",ArraySplitter.splitArray(expectedEmployee, 5) );
        Assertions.assertEquals("juliette.rojo@yahoo.co.uk",ArraySplitter.splitArray(expectedEmployee, 6) );
        Assertions.assertEquals("05/08/1967",ArraySplitter.splitArray(expectedEmployee, 7) );
        Assertions.assertEquals("06/04/2011",ArraySplitter.splitArray(expectedEmployee, 8) );
        Assertions.assertEquals("193912",ArraySplitter.splitArray(expectedEmployee, 9) );

    }

}
