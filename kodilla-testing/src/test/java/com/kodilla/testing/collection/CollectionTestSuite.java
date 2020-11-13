package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")

public class CollectionTestSuite {

        @BeforeEach
        public void before() {
            System.out.println("Test Case: begin -beforeEach");
        }

        @AfterEach
        public void after() {
            System.out.println("Test Case: end -AfterEach");
        }

        @BeforeAll
        public void beforeAll() {
            System.out.println("Test Suite: begin -BeforeAll");
        }

        @AfterAll
        public void afterAll() {
            System.out.println("Test Suite: end -AfterAll");
        }
        @DisplayName(
                        "When created odd List," +
                        "Then getOddList should return odd number from List"
        )
        @Test

        void testCaseOddNumbersExterminator(){
            //Given
            List<Integer> oddList = new ArrayList<Integer>();
            //When
            if (List % 2 == 0) {
                oddList = new ArrayList<Integer>();
                System.out.println(oddList);
            }

            //Then
            Assertions.assertEquals(oddList, );
        }
        void testOddNumbersExterminatorEmptyList(){

        }
        void testOddNumbersExterminatorNormalList(){

        }
    }

}
