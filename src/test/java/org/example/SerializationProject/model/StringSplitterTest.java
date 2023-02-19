package org.example.SerializationProject.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitterTest {

    @Test
    @DisplayName("Splits Strings at the \",\" ")
    void splitStringAtComma(){
        String employeeSplit = "EID,FName,LName,Email,Something Extra";
        String[] splitApart = StringSplitter.splitString(employeeSplit);
        String[] expected = {"EID","FName","LName","Email","Something Extra"};
        assertArrayEquals(splitApart,expected);
    }

    @Test
    @DisplayName("Ensures it doesnt split string at other characters")
    void dontSplitStringAtOthers(){
        String employeeSplit = "EID!FName.LName  Email  Something Extra";
        String[] splitApart = StringSplitter.splitString(employeeSplit);
        String[] expected = {"EID!FName.LName  Email  Something Extra"};
        assertArrayEquals(splitApart,expected);
    }

    @Test
    @DisplayName("Tests multiple inputs from the ArraySplitter")
    void testLinkedClasses(){
        String[] employeeSplit = {"198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,02/01/2008,69294",
        "178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,05/08/1967,06/04/2011,193912",
        "647173,Mr.,Milan,F,Krawczyk,M,milan.krawczyk@hotmail.com,04/04/1980,1/19/2012,123681",
        };
        ArrayList expectedFull = new ArrayList<String[]>();
        String[] expected1 = {"198429","Mrs.","Serafina","I","Bumgarner","F","serafina.bumgarner@exxonmobil.com","9/21/1982","02/01/2008","69294"};
        String[] expected2 = {"178566","Mrs.","Juliette","M","Rojo","F","juliette.rojo@yahoo.co.uk","05/08/1967","06/04/2011","193912"};
        String[] expected3 = {"647173","Mr.","Milan","F","Krawczyk","M","milan.krawczyk@hotmail.com","04/04/1980","1/19/2012","123681"};
        expectedFull.add(expected1);
        expectedFull.add(expected2);
        expectedFull.add(expected3);
        for (int i = 0; i<employeeSplit.length;i++) {
            String[] splitEmployee = StringSplitter.splitString(ArraySplitter.splitArray(employeeSplit,i));
            String[] splitExpected = (String[]) expectedFull.get(i);
            assertArrayEquals(splitEmployee,splitExpected);
        }
    }

}