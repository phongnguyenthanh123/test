/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author phong
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "D:\\SoftwareTesting\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.techlistic.com/p/selenium-practice-form.html";
        driver.get(url);
        driver.findElement(By.name("firstname")).sendKeys("Nguyen");
        driver.findElement(By.name("lastname")).sendKeys("Thanh Phong");
        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
        driver.findElement(By.id("datepicker")).sendKeys("20");
        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"continents\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]")).click();
//		WebElement add = driver.findElement(By.linkText("Choose File"));
//		add.sendKeys("/Lab3_NguyenThanhPhong/img/images5377069_hoa.jpg");
//		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div/div/div[29]/div[2]/div/a")).click();
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }

}
