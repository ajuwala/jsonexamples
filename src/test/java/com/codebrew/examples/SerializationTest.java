package com.codebrew.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SerializationTest {

    private Person person;
    private ObjectMapper mapper;

    @Before
    public void initTestData() {
        String street = "1234 Example St";
        String city = "Dallas";
        String state = "Texas";
        String zip = "123456";
        Address address = new Address(street, city, state, zip);

        int npa = 987;
        int nxx = 654;
        int lastFour = 3210;
        PhoneNumber phoneNumber = new PhoneNumber(npa, nxx, lastFour);

        person = new Person("John Doe", 35, address, phoneNumber);
        mapper = new ObjectMapper();
        mapper.setDefaultPrettyPrinter(new DefaultPrettyPrinter());
    }

    @Test
    public void testSerializationWithNotNull() throws JsonProcessingException {
        // unit under test
        String objectAsJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);

        // verify
        Assert.assertNotNull(objectAsJsonString);
        Assert.assertFalse(objectAsJsonString.contains("aptSuite"));
        System.out.println(objectAsJsonString);
    }
}
