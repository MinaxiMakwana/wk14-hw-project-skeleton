package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void verifyUserShouldLoginSuccessFully(){

//        Enter username

//        Enter password

//        Click on Login Button

//        Verify "WelCome" Message

    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage(){

//        Login To The application

//        Verify Logo is Displayed

    }

    @Test
    public void verifyUserShouldLogOutSuccessFully(){

//        Login To The application

//        Click on User Profile logo

//        Mouse hover on "Logout" and click

//        Verify the text "Login Panel" is displayed

    }

    @Test
    public void  verifyErrorMessageWithInvalidCredentials(){

//        Enter username <username>

//        Enter password <password>

//        Click on Login Button

//        Verify Error message <errorMessage>

//        Test Data:
//        username              password        errorMessage
//                                              Required
//        test123@gmail.com                     Required
//                              test123         Required
//        test123@gmail.com     test123         Invalid credentials

    }
}
