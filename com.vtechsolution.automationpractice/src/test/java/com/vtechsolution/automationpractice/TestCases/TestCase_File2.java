package com.vtechsolution.automationpractice.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.automationpractice.TestBase.TestBase;
import com.vtechsolution.automationpractice.page.object.Homepage;

public class TestCase_File2 extends TestBase {

	Homepage hp;
	
	@Test(priority=30)
	public void verifyWomenimg1_28() {
		hp = new Homepage(driver);
		if (hp.verifyWomenimg1()) {
			Assert.assertTrue(true);
			System.out.println("Womenimg1 is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("Womenimg1 is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=31)
	public void verifyWomenimg2_29() {
		hp = new Homepage(driver);
		if (hp.verifyWomenimg2()) {
			Assert.assertTrue(true);
			System.out.println("Womenimg2 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("Womenimg2 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=32)
	public void verifyTshirtsLink_30() {
		hp = new Homepage(driver);
		if (hp.verifyTshirtsLink()) {
			Assert.assertTrue(true);
			System.out.println("Tshirts Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("Tshirts Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=33)
	public void clickonTshirtslink_31() {
		hp = new Homepage(driver);
		hp.ClickonTshirtsLink();
		
		String Tshirtstitle = driver.getTitle();
		System.out.println(Tshirtstitle);
		
		if (Tshirtstitle.contains("T-shirts - My Store")) {
			Assert.assertTrue(true);
			System.out.println("Tshirts Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Tshirts Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=34)
	public void verifyPopularLink_32() {
		hp = new Homepage(driver);
		if (hp.verifyPopularLink()) {
			Assert.assertTrue(true);
			System.out.println("Popular Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("Popular Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=35)
	public void verifyPopularlinkText_33() {
		hp = new Homepage(driver);
		
		String Populartext = hp.verifyPopularLinkText();
		System.out.println(Populartext);
		
		if(Populartext.contains("Popular")) {
			Assert.assertTrue(true);
			System.out.println("Popular Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Popular Link is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority=36)
	public void verifyBestSellersLink_34() {
		hp = new Homepage(driver);
		if (hp.verifyBestSellarsLink()) {
			Assert.assertTrue(true);
			System.out.println("BestSellers Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("BestSellers Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=37)
	public void verifyBestSellarsText_35() {
		hp = new Homepage(driver);
		
		String BestSellarstext = hp.verifyBestSellarsLinkText();
		System.out.println(BestSellarstext);
		
		if(BestSellarstext.contains("Best Sellers")) {
			Assert.assertTrue(true);
			System.out.println("Popular Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Popular Link is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=38)
	public void verifyShortSleeveimg1_36() {
		hp = new Homepage(driver);
		if (hp.verifyShortSleeveimg1()) {
			Assert.assertTrue(true);
			System.out.println("ShortSleeve image is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("ShortSleeve imgage is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=39)
	public void clickonShortSleeveimg1_37() {
		hp = new Homepage(driver);
		hp.ClickonShortSleeveimg1Link();
		
		String ShortSleeveimg1title = driver.getTitle();
		System.out.println(ShortSleeveimg1title);
		
		if (ShortSleeveimg1title.contains("Faded Short Sleeve T-shirts - My Store")) {
			Assert.assertTrue(true);
			System.out.println("ShortSleeveimg1 is verified");
		} else {
			System.out.println("ShortSleeveimg1 is not verified");
			Assert.assertTrue(false);
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=40)
	public void verifyQuickViewimg1_38() {
		hp = new Homepage(driver);
		if (hp.verifyQuickViewimg1()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg1 is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg1 is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=41)                                        // ToBe Verify this testcase
	public void clickonQuickViewimg1_39() {
		hp = new Homepage(driver);
		hp.ClickonQuickViewimg1Link();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("fancybox-frame1661774838675");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement nameele = driver.findElement(By.xpath("//button[@name='Submit']/span"));      
		String text = nameele.getAttribute("textContent");
		System.out.println(text);
		
		if (nameele.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg1 is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[title=Close]")).click();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
	
	
	
	@Test(priority=42)
	public void verifyFadedShortSleeveTshirtsimg1_40() {
		hp = new Homepage(driver);
		if (hp.verifyFadedShortSleeveTshirtsimg1()) {
			Assert.assertTrue(true);
			System.out.println("FadedShortSleeveTshirts Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("FadedShortSleeveTshirts Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=43)
	public void clickonFadedShortSleeveTshirtsimg1_41() {
		hp = new Homepage(driver);
		hp.ClickonFadedShortSleeveTshirtsimg1Link();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String FadedShortSleeveTshirtstitle = driver.getTitle();
		System.out.println(FadedShortSleeveTshirtstitle);
		
		if (FadedShortSleeveTshirtstitle.contains("Faded Short Sleeve T-shirts - My Store")) {
			Assert.assertTrue(true);
			System.out.println("FadedShortSleeveTshirts Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("FadedShortSleeveTshirts Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=44)
	public void verifyTextofFadedShortSleeveTshirtsimg1_42() {
		hp = new Homepage(driver);
		String img1Text = hp.VerifyTextofFadedShortSleeveTshirtsimg1();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println(img1Text);
		
		if (img1Text.contains("Faded Short Sleeve T-shirts")) {
			Assert.assertTrue(true);
			System.out.println("FadedShortSleeveTshirts Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("FadedShortSleeveTshirts Link is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority=45)
	public void verifyAddtocartImg1Link_43() {
		hp = new Homepage(driver);
		if (hp.verifyAddtocartimg1Link()) {
			Assert.assertTrue(true);
			System.out.println("AddtocartImg1 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("AddtocartImg1 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=46)                                                                       
	public void clickonAddToCartimg1Link_44() throws InterruptedException {
		hp = new Homepage(driver);
		hp.ClickonAddtocartimg1Link();
		Thread.sleep(5000);
		
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		String msgtext = msg.getAttribute("textContent");
		System.out.println(msgtext);
		
		if(msgtext.contains("Product successfully added to your shopping cart")) {	
			Assert.assertTrue(true);
			System.out.println("Add To cart link img1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Add To cart link img1 is not verified");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=47)
	public void verifyMoreImg1Link_45() {
		hp = new Homepage(driver);
		
		if (hp.verifyMoreimg1Link()) {
			Assert.assertTrue(true);
			System.out.println("MoreImg1 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("MoreImg1 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=48)                                                                       
	public void clickonMoreImg1Link_46() {
		hp = new Homepage(driver);
		hp.ClickonMoreimg1Link();
			
		String moreimg1Title = driver.getTitle();
		System.out.println(moreimg1Title);
		
		if(moreimg1Title.contains("Faded Short Sleeve T-shirts - My Store")) {	
			Assert.assertTrue(true);
			System.out.println("Moreimg1 link img1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("moreimg1 link img1 is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority=49)
	public void verifyBlouseimg2_47() {
		hp = new Homepage(driver);
		
		if (hp.verifyBlouseimg2Link()) {
			Assert.assertTrue(true);
			System.out.println("Blouseimg2 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("Blouseimg2 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Test(priority=50,enabled=false)                                                                     // To be check Testcase                                                            
	public void clickonBlouseimg2Link_48() throws InterruptedException{
		hp = new Homepage(driver);
		hp.ClickonBlouseimg2Link();;
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		
	//	String Blouseimg2Title = driver.getTitle();
	//	System.out.println(Blouseimg2Title);
		
		if(ele.isDisplayed()) {	
			Assert.assertTrue(true);
			System.out.println("Blouseimg2 link img1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Blouseimg2 link img1 is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=51)
	public void verifyQuickViewimg2_49() {
		hp = new Homepage(driver);
		
		if (hp.verifyQuickViewimg2Link()) {
			Assert.assertTrue(true);
			System.out.println("QuickViewimg2 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg2 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Test(priority=52)                                      // To be check Testcase                                                                                                     
	public void clickonQuickViewimg2Link_50(){
		hp = new Homepage(driver);
		hp.ClickonQuickViewimg2Link();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"product\"]/div/div/div[2]/h1"));
		String eleText = ele.getAttribute("textContent");
		System.out.println(eleText);
		
		if(ele.isDisplayed()) {	
			Assert.assertTrue(true);
			System.out.println("QuickViewimg2 link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("QuickViewimg2 link is not verified");
		}
	//	driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=53)
	public void verifyBlouseTextLink_51() {
		hp = new Homepage(driver);
		
		if (hp.verifyBlouseTextLink()) {
			Assert.assertTrue(true);
			System.out.println("BlouseText Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("BlouseText Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Test(priority=54)                                                                       
	public void clickonBlouseTextLink_52(){
		hp = new Homepage(driver);
		hp.ClickonBlouseTextLink();
		
		String BlouseTextLinkTitle = driver.getTitle();
		System.out.println(BlouseTextLinkTitle);
		
		if(BlouseTextLinkTitle.contains("Blouse - My Store")) {	
			Assert.assertTrue(true);
			System.out.println("BlouseText Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("BlouseText Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=55)
	public void verifyAddtocartImg2Link_53() {
		hp = new Homepage(driver);
		
		if (hp.verifyAddtocartImg2Link()) {
			Assert.assertTrue(true);
			System.out.println("AddtocartImg2 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("AddtocartImg2 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@Test(priority=56)                                                                       
	public void clickonAddtocartImg2Link_54(){
		hp = new Homepage(driver);
		hp.ClickonAddtocartImg2Link();;
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		String eleText = ele.getAttribute("textContent");
		System.out.println(eleText);
		
		if(eleText.contains("Product successfully added to your shopping cart")) {	
			Assert.assertTrue(true);
			System.out.println("AddtocartImg2 Link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("AddtocartImg2 Link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority=57)
	public void verifyMoreImg2Link_55() {
		hp = new Homepage(driver);
		
		if (hp.verifyMoreimg2Link()) {
			Assert.assertTrue(true);
			System.out.println("MoreImg2 Link is Displayed");
		} else {
			Assert.assertTrue(false);
			System.out.println("MoreImg2 Link is Not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=58)                                                                       
	public void clickonMoreImg2Link_56() {
		hp = new Homepage(driver);
		hp.ClickonMoreimg2Link();
		
		String moreimg2Title = driver.getTitle();
		System.out.println(moreimg2Title);
		
		if(moreimg2Title.contains("Blouse - My Store")) {	
			Assert.assertTrue(true);
			System.out.println("Moreimg2 link is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("moreimg2 link is not verified");
		}
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
}
