package com.vtechsolution.automationpractice.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.automationpractice.TestBase.TestBase;
import com.vtechsolution.automationpractice.page.object.Homepage;

public class TestCase_1 extends TestBase {
	
	
	Homepage hp = new Homepage(driver);
	

	@Test(priority=1)
	public void verifyurl_TC1() {
		
		hp = new Homepage(driver);
		
		String url = hp.geturl();
		System.out.println(url);
		
		if(url.contains("http://automationpractice.com/index.php")) {
			Assert.assertTrue(true);
			System.out.println("Url is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Url is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority=2)
	public void verifyHomepageTC2() {

		String HP = driver.getTitle();

		if (HP.contains("Store")) {

			Assert.assertTrue(true);
			System.out.println("U r on Home page");
			
		} else {
			Assert.assertTrue(false);
			System.out.println("U r not on Home page");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	@Test(priority=3)
	public void verifylogo_01() {
			
			if(hp.verifylogo())
		{
			Assert.assertTrue(true);
			System.out.println("YourLogo is Displayed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("YourLogo is not Displayed");
		}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
		
	@Test(priority=4)
	public void verifySearchBox_02() {

		
		if(hp.verifysearchbox())
		{
			Assert.assertTrue(true);
			System.out.println("SearchBox is Displayed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("SearchBox is not Displayed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
		@Test(priority=5)
		public void verifySearchButton_03()
		{
			hp = new Homepage(driver);
			if(hp.verifySearchbtn())
			{
				Assert.assertTrue(true);
				System.out.println("SearchButton is Displayed");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("SearchButton is not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=6)
		public void verifySalesOffer_04()
		{
			
			hp = new Homepage(driver);
			
			if(hp.verifySalesOffers())
			{
				Assert.assertTrue(true);
				System.out.println("SalesOffers is Displayed");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("SalesOffers is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=7)
		public void TopHelpNumber_05()
		{
			hp = new Homepage(driver);
			if(hp.verifyTopHelpNumber())
			{
				Assert.assertTrue(true);
				System.out.println("TopHelpNumber is Displayed");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("TopHelpNumber is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=8)
		public void verifyContactUs_06()
		{
			hp = new Homepage(driver);
			if(hp.verifyContactUs())
			{
				Assert.assertTrue(true);
				System.out.println("Contact Us Link is Displayed");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("Contact Us Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		
		@Test(priority=9)
		public void clickonContactUslink_07() {
			hp = new Homepage(driver);
			hp.ClickonContactUs();
			
			String ContactUstitle = driver.getTitle();
			System.out.println(ContactUstitle);

			if (ContactUstitle.contains("Contact us - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Contact us Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Contact us Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=10)
		public void verifySignInLink_08() {
			hp = new Homepage(driver);
			if (hp.verifySignInlink()) {
				Assert.assertTrue(true);
				System.out.println("SignIn Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("SignIn Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		
		@Test(priority=11)
		public void clickonSignInLink_09() {
			hp = new Homepage(driver);
			hp.ClickonSignInLink();
			String SignIntitle = driver.getTitle();
			System.out.println(SignIntitle);

			if (SignIntitle.contains("Login - My Store")) {
				Assert.assertTrue(true);
				System.out.println("SignIn Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("SignIn Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

		@Test(priority=12)
		public void verifyCartLink_10() {
			hp = new Homepage(driver);
			if (hp.verifyCartlink()) {
				Assert.assertTrue(true);
				System.out.println("Cart Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("Cart Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=13)
		public void clickonCartLink_11() {
			hp = new Homepage(driver);
			hp.ClickonCartLink();
			
			String Carttitle = driver.getTitle();
			System.out.println(Carttitle);

			if (Carttitle.contains("Order - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Cart Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Cart Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=14)
		public void verifyWomenLink_12() {
			hp = new Homepage(driver);
			if (hp.verifyWomenLink()) {
				Assert.assertTrue(true);
				System.out.println("Women Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("Women Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=15)
		public void clickonWomenLink_13() {
			hp = new Homepage(driver);
			hp.ClickonWomenLink();
			
			String Womentitle = driver.getTitle();
			System.out.println(Womentitle);

			if (Womentitle.contains("Women - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Women Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Women Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=16)
		public void verifyWomenTopsLink_14() {
			hp = new Homepage(driver);
			if (hp.verifyWomenTopsLink()) {
				Assert.assertTrue(true);
				System.out.println("WomenTops Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("WomenTops Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=17)
		public void clickonWomenTopslink_15() {
			hp = new Homepage(driver);
			hp.ClickonTopsLink();

			String WomenTopstitle = driver.getTitle();
			System.out.println(WomenTopstitle);
			
			if (WomenTopstitle.contains("Tops - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Women Tops Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Women Tops Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=18)
		public void verifyWomenTshirtsLink_16() {
			hp = new Homepage(driver);
			if (hp.verifyWomenTshirtsLink()) {
				Assert.assertTrue(true);
				System.out.println("WomenTshirt Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("WomenTshirt Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=19)
		public void clickonWomenTshirtslink_17() {
			hp = new Homepage(driver);
			hp.ClickonWomenTshirtsLink();
			
			String WomenTshirtstitle = driver.getTitle();
			System.out.println(WomenTshirtstitle);
			
			if (WomenTshirtstitle.contains("T-shirts - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Women Tshirts Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Women Tshirts Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=20)
		public void verifyWomenBlousesLink_18() {
			hp = new Homepage(driver);
			if (hp.verifyWomenBlousesLink()) {
				Assert.assertTrue(true);
				System.out.println("WomenBlouses Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("WomenBlouses Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=21)
		public void clickonWomenBlouseslink_19() {
			hp = new Homepage(driver);
			hp.ClickonWomenBlousesLink();
			
			String WomenBlousestitle = driver.getTitle();
			System.out.println(WomenBlousestitle);
			
			if (WomenBlousestitle.contains("Blouses - My Store")) {
				Assert.assertTrue(true);
				System.out.println("Women Blouses Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("Women Blouses Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=22)
		public void verifyWomenDressesLink_20() {
			hp = new Homepage(driver);
			if (hp.verifyDressesLink()) {
				Assert.assertTrue(true);
				System.out.println("WomenDresses Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("WomenDresses Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=23)
		public void clickonWomenDresseslink_21() {
			hp = new Homepage(driver);
			hp.ClickonDressesLink();
			
			String WomenDressestitle = driver.getTitle();
			System.out.println(WomenDressestitle);
			
			if (WomenDressestitle.contains("Dresses - My Store")) {
				Assert.assertTrue(true);
				System.out.println("WomenDresses Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("WomenDresses Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}
		
		@Test(priority=24)
		public void verifyCasualDressesLink_22() {
			hp = new Homepage(driver);
			if (hp.verifyCasualDressesLink()) {
				Assert.assertTrue(true);
				System.out.println("CasualDresses Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("CasualDresses Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=25)
		public void clickonCasualDresseslink_23() {
			hp = new Homepage(driver);
			hp.ClickonCasualDressesLink();
			
			String CasualDressestitle = driver.getTitle();
			System.out.println(CasualDressestitle);
			
			if (CasualDressestitle.contains("Casual Dresses - My Store")) {
				Assert.assertTrue(true);
				System.out.println("CasualDresses Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("CasualDresses Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=26)
		public void verifyEveningDressesLink_24() {
			hp = new Homepage(driver);
			if (hp.verifyEveningDressesLink()) {
				Assert.assertTrue(true);
				System.out.println("EveningDresses Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("EveningDresses Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=27)
		public void clickonEveningDresseslink_25() {
			hp = new Homepage(driver);
			hp.ClickonEveningDressesLink();
			
			String EveningDressestitle = driver.getTitle();
			System.out.println(EveningDressestitle);
			
			if (EveningDressestitle.contains("Evening Dresses - My Store")) {
				Assert.assertTrue(true);
				System.out.println("EveningDresses Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("EveningDresses Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=28)
		public void verifySummerDressesLink_26() {
			hp = new Homepage(driver);
			if (hp.verifySummerDressesLink()) {
				Assert.assertTrue(true);
				System.out.println("Summer Dresses Link is Displayed");
			} else {
				Assert.assertTrue(false);
				System.out.println("SummerDresses Link is Not Displayed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		@Test(priority=29)
		public void clickonSummerDresseslink_27() {
			hp = new Homepage(driver);
			hp.ClickonSummerDressesLink();
			
			String SummerDressestitle = driver.getTitle();
			System.out.println(SummerDressestitle);
			
			if (SummerDressestitle.contains("Summer Dresses - My Store")) {
				Assert.assertTrue(true);
				System.out.println("SummerDresses Link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("SummerDresses Link is not verified");
			}
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
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
		
		@Test(priority=39,enabled=false)
		public void clickonShortSleeveimg1_37() throws InterruptedException {
			hp = new Homepage(driver);
			hp.ClickonShortSleeveimg1Link();
			Thread.sleep(15000);
			
			String ShortSleeveimg1title = driver.getTitle();
			System.out.println(ShortSleeveimg1title);
			
			if (ShortSleeveimg1title.contains("Faded Short Sleeve T-shirts - My Store")) {
				Assert.assertTrue(true);
				System.out.println("ShortSleeveimg1 is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("ShortSleeveimg1 is not verified");
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
		
		@Test(priority=41,enabled=false)                                                                  // ToBe Verify this testcase
		public void clickonQuickViewimg1_39() throws InterruptedException {
			hp = new Homepage(driver);
			hp.ClickonQuickViewimg1Link();
			
			Thread.sleep(5000);
		//	System.out.println(driver.getTitle());
			driver.switchTo().alert();
			WebElement nameele = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));      
			String text = nameele.getAttribute("textContent");
			System.out.println(text);
			
			if (nameele.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("QuickViewimg1 is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("QuickViewimg1 is not verified");
			}
			driver.findElement(By.xpath("//a[@title='Close']")).click();
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

		
		@Test(priority=52,enabled=false)                                                                                     // To be check Testcase                                                                                                     
		public void clickonQuickViewimg2Link_50(){
			hp = new Homepage(driver);
			hp.ClickonQuickViewimg2Link();
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
			String eleText = ele.getAttribute("textContent");
			System.out.println(eleText);
			
			if(ele.isDisplayed()) {	
				Assert.assertTrue(true);
				System.out.println("QuickViewimg2 link is verified");
			} else {
				Assert.assertTrue(false);
				System.out.println("QuickViewimg2 link is not verified");
			}
			driver.navigate().back();
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

