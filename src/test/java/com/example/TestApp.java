package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp {

    @Test
    public void appTest(){
        int expectedNumber = 1;
        Assert.assertEquals(1,expectedNumber);
    }
}
