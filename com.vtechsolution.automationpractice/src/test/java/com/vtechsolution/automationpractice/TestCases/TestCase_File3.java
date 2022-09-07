package com.vtechsolution.automationpractice.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.automationpractice.TestBase.TestBase;
import com.vtechsolution.automationpractice.page.object.Homepage;

public class TestCase_File3 extends TestBase {
	
	Homepage hp;
	
	@Test(priority=59)
	public void verifyPrintedDressImg3_57() {
		hp = new Homepage(driver);
		
		if (hp.verifyPrintedDressImg3Link()) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressImg3 image is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressImg3 imgage is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=60,enabled=false)
	public void clickonPrintedDressImg3_58() {
		hp = new Homepage(driver);
		hp.ClickonPrintedDressImg3Link();
		
		String PrintedDressImg3title = driver.getTitle();
		System.out.println(PrintedDressImg3title);
		
		if (PrintedDressImg3title.contains("Faded Short Sleeve T-shirts - My Store")) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressImg3 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressImg3 is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=61)
	public void verifyQuickViewimg3_59() {
		hp = new Homepage(driver);
		if (hp.verifyQuickViewimg3Link()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg3 is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg3 is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=62)                                                   // ToBe Verify this testcase
	public void clickonQuickViewimg3_60() {
		hp = new Homepage(driver);
		hp.ClickonQuickViewimg3Link();
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"fancybox-iframe\"]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement nameele = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));      
		String text = nameele.getAttribute("textContent");
		System.out.println(text);
		
		if (nameele.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg3 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg3 is not verified");
		}
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
	
	
	
	@Test(priority=63)
	public void verifyPrintedDressTextimg3_61() {
		hp = new Homepage(driver);
		if (hp.verifyPrintedDressTextimg3Link()) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressTextimg3 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressTextimg3 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=64)
	public void clickonPrintedDressTextimg3_62() {
		hp = new Homepage(driver);
		hp.ClickonPrintedDressTextimg3Link();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String PrintedDressTextimg3title = driver.getTitle();
		System.out.println(PrintedDressTextimg3title);
		
		if (PrintedDressTextimg3title.contains("Printed Dress - My Store")) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressTextimg3 Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressTextimg3 Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority=65)
	public void verifyAddtocartImg3Link_63() {
		hp = new Homepage(driver);
		if (hp.verifyAddtocartImg3Link()) {
			Assert.assertTrue(true);
			System.out.println("AddtocartImg3 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("AddtocartImg3 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=66)                                                                       
	public void clickonAddToCartimg3Link_64() throws InterruptedException {
		hp = new Homepage(driver);
		hp.ClickonAddtocartImg3Link();
		
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		String msgtext = msg.getAttribute("textContent");
		System.out.println(msgtext);
		
		if(msgtext.contains("Product successfully added to your shopping cart")) {	
			Assert.assertTrue(true);
			System.out.println("Add To cart link img3 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Add To cart link img3 is not verified");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=67)
	public void verifyMoreImg3Link_65() {
		hp = new Homepage(driver);
		
		if (hp.verifyMoreimg3Link()) {
			Assert.assertTrue(true);
			System.out.println("MoreImg3 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("MoreImg3 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=68)                                                                       
	public void clickonMoreImg3Link_66() {
		hp = new Homepage(driver);
		hp.ClickonMoreimg3Link();
			
		String moreimg3Title = driver.getTitle();
		System.out.println(moreimg3Title);
		
		if(moreimg3Title.contains("Printed Dress - My Store")) {	
			Assert.assertTrue(true);
			System.out.println("Moreimg3 link img1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("moreimg3 link img1 is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=69)
	public void verifyPrintedDressImg4_67() {
		hp = new Homepage(driver);
		
		if (hp.verifyPrintedDressImg4Link()) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressImg4 image is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressImg4 imgage is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=70)                      // ToBe Verify this testcase
	public void clickonPrintedDressImg4_68() {
		hp = new Homepage(driver);
		hp.ClickonPrintedDressImg4Link();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String PrintedDressImg4title = driver.getTitle();
		System.out.println(PrintedDressImg4title);
		
		if (PrintedDressImg4title.contains("Printed Dress - My Store")) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressImg4 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressImg4 is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=71)
	public void verifyQuickViewimg4_69() {
		hp = new Homepage(driver);
		if (hp.verifyQuickViewimg4Link()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg4 is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg4 is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=72)                                                   // ToBe Verify this testcase
	public void clickonQuickViewimg4_70() {
		hp = new Homepage(driver);
		hp.ClickonQuickViewimg4Link();
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement nameele = driver.findElement(By.xpath("//button[@name='Submit']/span"));      
		String text = nameele.getAttribute("textContent");
		System.out.println(text);
		
		if (nameele.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg4 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg4 is not verified");
		}
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
	
	
	
	@Test(priority=73)
	public void verifyPrintedDressTextimg4_71() {
		hp = new Homepage(driver);
		if (hp.verifyPrintedDressImg4Link()) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressTextimg4 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressTextimg4 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=74)                          
	public void clickonPrintedDressTextimg4_72() {
		hp = new Homepage(driver);
		hp.ClickonPrintedDressTextImg4Link();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String PrintedDressTextimg4title = driver.getTitle();
		System.out.println(PrintedDressTextimg4title);
		
		if (PrintedDressTextimg4title.contains("Printed Dress - My Store")) {
			Assert.assertTrue(true);
			System.out.println("PrintedDressTextimg4 Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("PrintedDressTextimg4 Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority=75)
	public void verifyAddtocartImg4Link_73() {
		hp = new Homepage(driver);
		if (hp.verifyAddtocartImg4Link()) {
			Assert.assertTrue(true);
			System.out.println("AddtocartImg4 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("AddtocartImg4 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=76)                                                                       
	public void clickonAddToCartimg4Link_74() throws InterruptedException {
		hp = new Homepage(driver);
		hp.ClickonAddtocartImg4Link();
		
		WebElement msg = driver.findElement(By.xpath(""));
		String msgtext = msg.getAttribute("textContent");
		System.out.println(msgtext);
		
		if(msgtext.contains("Product successfully added to your shopping cart")) {	
			Assert.assertTrue(true);
			System.out.println("Add To cart link img4 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Add To cart link img4 is not verified");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=77)
	public void verifyMoreImg4Link_75() {
		hp = new Homepage(driver);
		
		if (hp.verifyMoreimg4Link()) {
			Assert.assertTrue(true);
			System.out.println("MoreImg4 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("MoreImg4 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=78)                                                                       
	public void clickonMoreImg4Link_76() {
		hp = new Homepage(driver);
		hp.ClickonMoreimg4Link();
			
		String moreimg4Title = driver.getTitle();
		System.out.println(moreimg4Title);
		
		if(moreimg4Title.contains("")) {	
			Assert.assertTrue(true);
			System.out.println("Moreimg4 link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("moreimg4 link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	
	
	
	
	
	
	

}
