package org.singleDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.singleDesignPattern.pageObject.TravelHomePage;
import org.testng.annotations.Test;

public class DemoTest
{
    @Test
    public void demoTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver_ver90//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getFooterNav().selectFlightInFooter()); //we are getting object of the FooterNav class by using getFoortNav()
                                                              //and using the selectFlightInFooter() method
        System.out.println(travelHomePage.getNavigationBar().selectFlightInHeader());
        System.out.println("The links count in header : "+travelHomePage.getNavigationBar().getLinkCount());
        System.out.println("The links count in footer : "+travelHomePage.getFooterNav().getLinkCount());

        //for strategy design pattern - lets have 3 classes for flight booking : one-way, round-trip, multi-trip
        //so whenever we select 'one-way' then all the methods related to that will go with that, similarly with 'round-trip' and 'multi-trip'
        //example : travelHomePage.getLinksCount("footer"), travelHomepage.getLinksCount("header"), travelHomePage.checkAvailability("multiTrip")
        //we are passing parameters/algorithms in method - runtime instructions


    }
}
