package Remedy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Functionl {
    WebDriver driver=null;
    @BeforeTest
    public  void beforeTest(){

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.remedypartners.com");

    }

    @Test
    public void test(){
        driver.findElement(By.xpath(".//*[@id='navbar']/div/div[2]/nav/ul/li[7]/a")).click();
        driver.findElement(By.xpath(".//*[@id='edit-name']")).sendKeys("salasgh");
        driver.findElement(By.xpath(".//*[@id='edit-pass']")).sendKeys("salasgh");
        driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
        String s = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/section/div[1]")).getText();

        System.out.println(s);

    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
