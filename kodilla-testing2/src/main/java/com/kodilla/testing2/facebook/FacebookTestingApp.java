package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY="//*[@id=\"day\"]";
    public static final String XPATH_SELECT_MONTH="//*[@id=\"month\"]";
    public static final String XPATH_SELECT_YEAR="//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(" https://www.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed());
        WebElement comboFieldDay=driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay=new Select(comboFieldDay);
        selectDay.selectByIndex(30);

        while (!driver.findElement(By.xpath(XPATH_SELECT_MONTH)).isDisplayed());
        WebElement comboFieldMonth=driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth=new Select(comboFieldMonth);
        selectMonth.selectByIndex(4);


        while (!driver.findElement(By.xpath(XPATH_SELECT_YEAR)).isDisplayed());
        WebElement comboField=driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear=new Select(comboField);
        selectYear.selectByIndex(35);





    }
}
