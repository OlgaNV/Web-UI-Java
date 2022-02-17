package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.html.HTMLInputElement;

import java.util.concurrent.TimeUnit;

import static org.bouncycastle.cms.RecipientId.password;


public class App
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

        driver.findElement(By.id("username")).sendKeys("OlgaPolyacova");
        webElement.click();

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("olga.V@mail.ru");
        webElement.click();

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ldf123456");
        webElement.click();


    }

}
