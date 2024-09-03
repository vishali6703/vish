package com.testDemo.testingdemo3;

import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\OneDrive\\Desktop\\testingdemo3\\src\\main\\java\\com\\testDemo\\testingdemo3\\driver\\chromedriver.exe");
       ChromeDriver driver1=new ChromeDriver();
       driver1.get("https://letcode.in/");
       Thread.sleep(3000);
       driver1.manage().window().maximize();
       driver1.findElementByXPath("//a[normalize-space(text())='Log in']").click();
	   Thread.sleep(3000);
	   driver1.findElementByXPath("(//label[normalize-space(text())='Email']/following::input)[1]").sendKeys("vishali6703@gmail.com");
	   Thread.sleep(3000);
	   driver1.findElementByXPath("(//label[normalize-space(text())='Password']/following::input)[1]").sendKeys("vishali6703");
	   Thread.sleep(3000);
	   driver1.findElementByXPath("//button[normalize-space(text())='LOGIN']").click();
	   Thread.sleep(5000);
	   String ans=driver1.findElementByXPath("//a[normalize-space(text())='Sign out']").getText();
	   System.out.println(ans);
	   driver1.close();
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\OneDrive\\Desktop\\testdemo1\\src\\test\\java\\com\\testDemo\\testdemo1\\driver\\chromedriver.exe");
	   ChromeDriver driver2=new ChromeDriver();
	   driver2.get("https://letcode.in/");
	   Thread.sleep(3000);
	   driver2.manage().window().maximize();
	   driver2.findElementByXPath("//a[normalize-space(text())='Log in']").click();
	   Thread.sleep(3000);
	   driver2.findElementByXPath("(//label[normalize-space(text())='Email']/following::input)[1]").sendKeys("vishali6703@gmail.com");
	   Thread.sleep(3000);
	   driver2.findElementByXPath("(//label[normalize-space(text())='Password']/following::input)[1]").sendKeys("vishali");
	   Thread.sleep(3000);
	   
	   driver2.findElementByXPath("//button[normalize-space(text())='LOGIN']").click();
	   Thread.sleep(5000);
	   String ans1=driver2.findElementByXPath("//button[normalize-space(text())='LOGIN']").getText();
	   System.out.println(ans1);
	   driver2.close();
	   
  


       
       
       }
}
