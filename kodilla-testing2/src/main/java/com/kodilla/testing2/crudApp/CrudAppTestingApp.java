package com.kodilla.testing2.crudApp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {

    public static final String X_PATH_INPUT="//html/body/main/section/form/fieldset/input ";
    public static final String X_PATH_TEXTAREA="//html/body/main/section/form/fieldset[2]/textarea ";
    public static final String X_PATH_SELECT="//select[1] ";
    public static void main(String[] args) {

        WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://sebastians85.github.io/");

        WebElement searchField=driver.findElement(By.xpath(X_PATH_INPUT));
        searchField.sendKeys("new robotics task");
        WebElement textAreaField=driver.findElement(By.xpath(X_PATH_TEXTAREA));
        textAreaField.sendKeys("new robotics content");


        while (!driver.findElement(By.xpath(X_PATH_SELECT)).isDisplayed());
        WebElement comboField=driver.findElement(By.xpath(X_PATH_SELECT));
        Select select=new Select(comboField);
        select.selectByIndex(1);


    }


}
