package org.example.negativ;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Lesson3
{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");// открытие полного экрана
        options.addArguments("--incognito");// открытие страницы в режиме инкогнито
        options.addArguments("disable-popup-blocking");// блокировка всплывающих окон

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[3]/a/span[1]"));
        webElement.click();

        driver.findElement(By.id("username")).sendKeys("OlgaP");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ol.V@mail.ru");

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ldf12y3456");

        WebElement dateField = driver.findElement(By.xpath("//*[@id=\"day\"]/option[7]"));
        dateField.click();

        WebElement monthField = driver.findElement(By.xpath("//*[@id=\"month\"]/option[11]"));
        monthField.click();

        WebElement yearField = driver.findElement(By.xpath("//*[@id=\"year\"]/option[20]"));
        yearField.click();


        WebElement createField = driver.findElement(By.xpath("//*[@id=\"createpage_create\"]"));
        createField.click();



    }

}
