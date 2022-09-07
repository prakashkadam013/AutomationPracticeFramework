package com.vtechsolution.automationpractice.TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.automationpractice.TestBase.TestBase;
import com.vtechsolution.automationpractice.page.object.Homepage;

public class TestCase_File1 extends TestBase {
	
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

}
