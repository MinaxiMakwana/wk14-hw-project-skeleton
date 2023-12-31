package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {


//    1.1 create method with name "selectMenu" it has one parameter name "menu" of type strin

//    1.2 This method should click on the menu whatever name is passed as parameter. Write the following Test:

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

//        1.1 Mouse hover on “Desktops” Tab and click

//        1.2 call selectMenu method and pass the menu = “Show All Desktops”

//        1.3 Verify the text ‘Desktops’

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click

//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”

//        2.3 Verify the text ‘Laptops & Notebooks’

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

//        3.1 Mouse hover on “Components” Tab and click

//        3.2 call selectMenu method and pass the menu = “Show All Components”

//        3.3 Verify the text ‘Components’

    }

}
