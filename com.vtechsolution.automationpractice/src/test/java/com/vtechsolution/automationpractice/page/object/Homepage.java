package com.vtechsolution.automationpractice.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	public boolean verifylogo() {
		return logo.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement searchbox;
	
	public boolean verifysearchbox() {
		return searchbox.isDisplayed();
	}
	
	public void clickonsearchbox() {
		searchbox.click();	
	}
	
	public void entervalueinsearchbox(String value) {
		searchbox.sendKeys(value);;
	}
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchbtn;
	

	public boolean verifySearchbtn() {
		return searchbtn.isDisplayed();
	}
	
	public void clickonsSearchbtn() {
		searchbtn.click();	
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/div/a/img")
	WebElement SalesOffers;
	
	public boolean verifySalesOffers() {
		
		return SalesOffers.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/span")
	WebElement TopHelpNumber;
	
	public boolean verifyTopHelpNumber() {
		
		return TopHelpNumber.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement ContactUs;
	
	public boolean verifyContactUs() {
		
		return ContactUs.isDisplayed();
	}
	
	public void ClickonContactUs(){
		ContactUs.click();
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement SignIn;
	
	public boolean verifySignInlink() {
		
		return SignIn.isDisplayed();
	}
	
	public void ClickonSignInLink(){
		SignIn.click();
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement Cart;
	
	public boolean verifyCartlink() {
		
		return Cart.isDisplayed();
	}
	
	public void ClickonCartLink(){
		Cart.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")  //*[@id="block_top_menu"]/ul/li[1]/a
	WebElement Women;
	
	public boolean verifyWomenLink() {
		
		return Women.isDisplayed();
	}
	
	public void ClickonWomenLink(){
		Women.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/a")  //*[@id="block_top_menu"]/ul/li[1]/ul/li[1]/ul
	public WebElement WomenTops;
	
	public boolean verifyWomenTopsLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Women).build().perform();
		return WomenTops.isDisplayed();
	}

	public void ClickonTopsLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Women).moveToElement(WomenTops).click().build().perform();
	}
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement WomenTshirts;
	
	public boolean verifyWomenTshirtsLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Women).build().perform();
		return WomenTshirts.isDisplayed();
	}

	public void ClickonWomenTshirtsLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Women).moveToElement(WomenTshirts).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
	public WebElement WomenBlouses;
	
	public boolean verifyWomenBlousesLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Women).build().perform();
		return WomenBlouses.isDisplayed();
	}

	public void ClickonWomenBlousesLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Women).moveToElement(WomenBlouses).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement Dresses;
	
	public boolean verifyDressesLink() {
		return Dresses.isDisplayed();
	}

	public void ClickonDressesLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Women).moveToElement(Dresses).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")   //*[@id="block_top_menu"]/ul/li[2]/ul/li[1]/a
	WebElement CasualDresses;
	
	public boolean verifyCasualDressesLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).build().perform();
		return CasualDresses.isDisplayed();
	}

	public void ClickonCasualDressesLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).moveToElement(CasualDresses).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")               //*[@id="block_top_menu"]/ul/li[2]/ul/li[2]/a
	WebElement EveningDresses;
	//*[@id="block_top_menu"]/ul/li[2]/ul/li[2]/a
	public boolean verifyEveningDressesLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).build().perform();
		return EveningDresses.isDisplayed();
	}

	public void ClickonEveningDressesLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).moveToElement(EveningDresses).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
	WebElement SummerDresses;
	
	public boolean verifySummerDressesLink() {
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).build().perform();
		return SummerDresses.isDisplayed();
	}

	public void ClickonSummerDressesLink(){
		Actions act = new Actions(driver);
		act.moveToElement(Dresses).moveToElement(SummerDresses).click().build().perform();;
	}
	
	@FindBy(xpath="//*[@id=\"category-thumbnail\"]/div[1]/img")
	WebElement Womenimg1;
	
	public boolean verifyWomenimg1() {
		Actions act = new Actions(driver);
		act.moveToElement(Women).build().perform();
		return Womenimg1.isDisplayed();
	}

	@FindBy(xpath="//*[@id=\"category-thumbnail\"]/div[2]/img")
	WebElement Womenimg2;
	
	public boolean verifyWomenimg2() {
		Actions act = new Actions(driver);
		act.moveToElement(Women).build().perform();
		return Womenimg2.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement Tshirts;
	
	public boolean verifyTshirtsLink() {	
		return Tshirts.isDisplayed();
	}

	public void ClickonTshirtsLink(){
		Tshirts.click();
	}
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[1]/a")   //*[@id="home-page-tabs"]/li[1]/a
	WebElement Popular;
	
	public boolean verifyPopularLink() {
		return Popular.isDisplayed();
	}

	public String verifyPopularLinkText(){
		return Popular.getAttribute("textContent");
	}
	
	@FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[2]/a")
	WebElement BestSellars;
	
	public boolean verifyBestSellarsLink() {
		return BestSellars.isDisplayed();
	}

	public String verifyBestSellarsLinkText(){
		return BestSellars.getAttribute("textContent");
	}
	
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]")    // Img 1   "//*[@id="homefeatured"]/li[1]/div/div[1]/div/a[1]/img"
	WebElement ShortSleeveimg1;
	
	public boolean verifyShortSleeveimg1() {
		return ShortSleeveimg1.isDisplayed();
	}

	public void ClickonShortSleeveimg1Link() {
	//	Actions act = new Actions(driver);
	//	act.moveToElement(ShortSleeveimg1).click().build().perform();
		
		ShortSleeveimg1.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[2]/span")
	WebElement QuickViewimg1;
	
	public boolean verifyQuickViewimg1() {
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		return QuickViewimg1.isDisplayed();
	}

	public void ClickonQuickViewimg1Link(){
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		QuickViewimg1.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")
	WebElement FadedShortSleeveTshirts;
	
	public boolean verifyFadedShortSleeveTshirtsimg1() {
		return FadedShortSleeveTshirts.isDisplayed();
	}

	public void ClickonFadedShortSleeveTshirtsimg1Link(){
		FadedShortSleeveTshirts.click();
	}
	
	public String VerifyTextofFadedShortSleeveTshirtsimg1(){
		return FadedShortSleeveTshirts.getAttribute("textContent");
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")   // AddtocartImg1
	WebElement AddtocartImg1;
	
	public boolean verifyAddtocartimg1Link() {
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		return AddtocartImg1.isDisplayed();
	}

	public void ClickonAddtocartimg1Link(){
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		AddtocartImg1.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span")  // Moreimg1
	WebElement Moreimg1;
	
	public boolean verifyMoreimg1Link() {
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		return Moreimg1.isDisplayed();
	}

	public void ClickonMoreimg1Link(){
		Actions act = new Actions(driver);
		act.moveToElement(ShortSleeveimg1).build().perform();
		Moreimg1.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")          // Blouseimg2   //*[@id="homefeatured"]/li[2]/div/div[1]/div/a[1]/img
	WebElement Blouseimg2;
	
	public boolean verifyBlouseimg2Link() {
		return Blouseimg2.isDisplayed();
	}

	public void ClickonBlouseimg2Link(){
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).click().build().perform();
	//	Blouseimg2.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[2]/span")            //QuickViewimg2
	WebElement QuickViewimg2;
	
	public boolean verifyQuickViewimg2Link() {
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		return QuickViewimg2.isDisplayed();
	}

	public void ClickonQuickViewimg2Link(){
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		QuickViewimg2.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")                // Blouse
	WebElement BlouseTextLink;
	
	public boolean verifyBlouseTextLink() {
		return BlouseTextLink.isDisplayed();
	}

	public void ClickonBlouseTextLink(){
		BlouseTextLink.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span")       // AddtocartImg2
	WebElement AddtocartImg2;
	
	public boolean verifyAddtocartImg2Link() {
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		return AddtocartImg2.isDisplayed();
	}

	public void ClickonAddtocartImg2Link(){
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		AddtocartImg2.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")            // Moreimg2
	WebElement Moreimg2;
	
	public boolean verifyMoreimg2Link() {
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		return Moreimg2.isDisplayed();
	}

	public void ClickonMoreimg2Link(){
		Actions act = new Actions(driver);
		act.moveToElement(Blouseimg2).build().perform();
		Moreimg2.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img")           // PrintedDressImg3
	WebElement PrintedDressImg3;
	
	public boolean verifyPrintedDressImg3Link() {
		return PrintedDressImg3.isDisplayed();
	}

	public void ClickonPrintedDressImg3Link(){
		PrintedDressImg3.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[2]/span")           // QuickViewimg3
	WebElement QuickViewimg3;
	
	public boolean verifyQuickViewimg3Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).build().perform();
		return QuickViewimg3.isDisplayed();
	}

	public void ClickonQuickViewimg3Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).build().perform();
		QuickViewimg3.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[2]/h5/a")                   // PrintedDress
	WebElement PrintedDressTextimg3;
	
	public boolean verifyPrintedDressTextimg3Link() {
		return PrintedDressTextimg3.isDisplayed();
	}

	public void ClickonPrintedDressTextimg3Link(){
		PrintedDressTextimg3.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span")           //AddtocartImg3
	WebElement AddtocartImg3;
	
	public boolean verifyAddtocartImg3Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).build().perform();
		return AddtocartImg3.isDisplayed();
	}

	public void ClickonAddtocartImg3Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).moveToElement(AddtocartImg3).click().build().perform();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[2]/span")            // Moreimg3
	WebElement Moreimg3;
	
	public boolean verifyMoreimg3Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).build().perform();
		return Moreimg3.isDisplayed();
	}

	public void ClickonMoreimg3Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg3).build().perform();
		Moreimg3.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")                 // PrintedDressImg4
	WebElement PrintedDressImg4;
	
	public boolean verifyPrintedDressImg4Link() {
		return PrintedDressImg4.isDisplayed();
	}

	public void ClickonPrintedDressImg4Link(){
		PrintedDressImg4.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[2]/span")                   // QuickViewimg4
	WebElement QuickViewimg4;
	
	public boolean verifyQuickViewimg4Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).build().perform();
		return QuickViewimg4.isDisplayed();
	}

	public void ClickonQuickViewimg4Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).moveToElement(QuickViewimg4).click().build().perform();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/h5/a")                          // PrintedDress4
	WebElement PrintedDressTextImg4;
	
	public boolean verifyPrintedDressTextImg4Link() {
		return PrintedDressTextImg4.isDisplayed();
	}

	public void ClickonPrintedDressTextImg4Link(){
		PrintedDressTextImg4.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtocartImg4;
	
	public boolean verifyAddtocartImg4Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).build().perform();
		return AddtocartImg4.isDisplayed();
	}

	public void ClickonAddtocartImg4Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).build().perform();
		AddtocartImg4.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[2]/span")                // Moreimg4
	WebElement Moreimg4;
	
	public boolean verifyMoreimg4Link() {
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).build().perform();
		return Moreimg4.isDisplayed();
	}

	public void ClickonMoreimg4Link(){
		Actions act = new Actions(driver);
		act.moveToElement(PrintedDressImg4).build().perform();
		Moreimg4.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[1]/div/a[1]/img")                      //  PrintedSummerDressimg5
	WebElement PrintedSummerDressimg5;
	
	public boolean verifyPrintedSummerDressimg5Link() {
		return PrintedSummerDressimg5.isDisplayed();
	}

	public void ClickonPrintedSummerDressimg5Link(){
		PrintedSummerDressimg5.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[1]/div/a[2]/span")
	WebElement QuickViewimg5;
	
	public boolean verifyQuickViewimg5Link() {
		return QuickViewimg5.isDisplayed();
	}

	public void ClickonQuickViewimg5Link(){
		QuickViewimg5.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a")
	WebElement PrintedSummerDressTextImg5;
	
	public boolean verifyPrintedSummerDressTextImg5Link() {
		return PrintedSummerDressTextImg5.isDisplayed();
	}

	public void ClickonPrintedSummerDressTextImg5Link(){
		PrintedSummerDressTextImg5.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtocartImg5;
	
	public boolean verifyAddtocartImg5Link() {
		return AddtocartImg5.isDisplayed();
	}

	public void ClickonAddtocartImg5Link(){
		AddtocartImg5.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[2]/span")
	WebElement Moreimg5;
	
	public boolean verifyMoreimg5Link() {
		return Moreimg5.isDisplayed();
	}

	public void ClickonMoreimg5Link(){
		Moreimg5.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[1]/img")                // PrintedSummerDressimg6
	WebElement PrintedSummerDressimg6;
	
	public boolean verifyPrintedSummerDressimg6Link() {
		return PrintedSummerDressimg6.isDisplayed();
	}

	public void ClickonPrintedSummerDressimg6Link(){
		PrintedSummerDressimg6.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[2]/span")
	WebElement QuickViewimg6;
	
	public boolean verifyMoreimg5QuickViewimg6Link() {
		return QuickViewimg6.isDisplayed();
	}

	public void ClickonQuickViewimg6Link(){
		QuickViewimg6.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[2]/h5/a")
	WebElement PrintedSummerDressImg6Text;
	
	public boolean verifyPrintedSummerDressImg6TextLink() {
		return PrintedSummerDressImg6Text.isDisplayed();
	}

	public void ClickonPrintedSummerDressImg6TextLink(){
		PrintedSummerDressImg6Text.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtocartImg6;
	
	public boolean verifyAddtocartImg6Link() {
		return AddtocartImg6.isDisplayed();
	}

	public void ClickonAddtocartImg6Link(){
		AddtocartImg6.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[2]/span")
	WebElement Moreimg6;
	
	public boolean verifyMoreimg6Link() {
		return Moreimg6.isDisplayed();
	}

	public void ClickonMoreimg6Link(){
		Moreimg6.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img")              //  PrintedChiffonDressimg7
	WebElement PrintedChiffonDressimg7;
	
	public boolean verifyPrintedChiffonDressimg7Link() {
		return PrintedChiffonDressimg7.isDisplayed();
	}

	public void ClickonPrintedChiffonDressimg76Link(){
		PrintedChiffonDressimg7.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[2]/span")
	WebElement QuickViewimg7;
	
	public boolean verifyQuickViewimg7Link() {
		return QuickViewimg7.isDisplayed();
	}

	public void ClickonQuickViewimg7Link(){
		QuickViewimg7.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[2]/h5/a")
	WebElement PrintedChiffonDressimg7Text;
	
	public boolean verifyPrintedChiffonDressimg7TextLink() {
		return PrintedChiffonDressimg7Text.isDisplayed();
	}

	public void ClickonPrintedChiffonDressimg7Text6Link(){
		PrintedChiffonDressimg7Text.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span")
	WebElement AddtocartImg7;
	
	public boolean verifyAddtocartImg7Link() {
		return AddtocartImg7.isDisplayed();
	}

	public void ClickonAddtocartImg7Link(){
		AddtocartImg7.click();
	}
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[2]/span")
	WebElement Moreimg7;
	
	public boolean verifyMoreimg7Link() {
		return Moreimg7.isDisplayed();
	}

	public void ClickonMoreimg7Link(){
		Moreimg7.click();
	}
	
	@FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[1]/a/img")                          // bottomimg1
	WebElement bottomimg1;
	
	public boolean verifybottomimg1() {
		return bottomimg1.isDisplayed();
	}

	public void Clickonbottomimg1(){
		bottomimg1.click();
	}
	
	@FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[2]/a/img")                  // bottomimg2
	WebElement bottomimg2;
	
	public boolean verifybottomimg2() {
		return bottomimg2.isDisplayed();
	}

	
	@FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[3]/a/img")              // bottomimg3
	WebElement bottomimg3; 
	
	public boolean verifybottomimg3() {
		return bottomimg3.isDisplayed();
	}

	
	@FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[4]/a/img")              // bottomimg4
	WebElement bottomimg4;
	
	public boolean verifybottomimg4() {
		return bottomimg4.isDisplayed();
	}

	
	@FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[5]/a/img")                   // bottomimg5
	WebElement bottomimg5;
	
	public boolean verifybottomimg5() {
		return bottomimg5.isDisplayed();
	}

	
	@FindBy(xpath="//*[@id=\"facebook_block\"]/h4")                               // followfb
	WebElement followfb;
	
	public boolean verifyfollowfb() {
		return followfb.isDisplayed();
	}

	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3")               // come visi tus
	WebElement comevisitus;
	
	public boolean verifycomevisitus() {
		return comevisitus.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/p")                 // come visit us text
	WebElement comevisitustext;
	
	public boolean verifycomevisitustext() {
		return comevisitustext.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"icon-truck\"]")                                           // truck img
	WebElement truckimg;
	
	public boolean verifytruckimg() {
		return truckimg.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/h3")             // CallUs
	WebElement CallUs;
	
	public boolean verifyCallUs() {
		return CallUs.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p")              // CallUs text
	WebElement CallUstext;
	
	public boolean verifyCallUstextb() {
		return CallUstext.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a")          // SelebiumFramework
	WebElement SelebiumFramework;
	
	public boolean verifySelebiumFrameworkLink() {
		return SelebiumFramework.isDisplayed();
	}
	
	public void ClickonSelebiumFrameworkLink(){
		SelebiumFramework.click();
	}
	
	@FindBy(xpath="//*[@id=\"icon-phone\"]")                                      // bottom phone
	WebElement bottomphone; 
	
	public boolean verifybottomphone() {
		return bottomphone.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/h3")          // HowToPayDues
	WebElement HowToPayDues; 
	
	public boolean verifyHowToPayDues() {
		return HowToPayDues.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/p")
	WebElement HowToPayDuestext;
	
	public boolean verifyHowToPayDuestext() {
		return HowToPayDuestext.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"icon-credit-card\"]")                               // CreditCardimg
	WebElement CreditCardimg;
	
	public boolean verifyCreditCardimg() {
		return CreditCardimg.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[2]/h3")                     // CustomerBlock
	WebElement CustomerBlock;
	
	public boolean verifyCustomerBlock() {
		return CustomerBlock.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[2]/p[1]/strong")
	WebElement CustomerBlocktext1;
	
	public boolean verifyCustomerBlocktext1() {
		return CustomerBlocktext1.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[2]/p[2]")
	WebElement CustomerBlocktext2;
	
	public boolean verifyCustomerBlocktext2() {
		return CustomerBlocktext2.isDisplayed();
	}
	
	public String getTxt() {
		return CustomerBlocktext2.getText();
	}
	
	@FindBy(xpath="//*[@id=\"editorial_image_legend\"]")                       // Subsidiary
	WebElement Subsidiary;
	
	public boolean verifySubsidiary() {
		return Subsidiary.isDisplayed();
	}
	 
	@FindBy(xpath="//*[@id=\"editorial_block_center\"]/h1")                       // AutomationPracticeWebsite
	WebElement AutomationPracticeWebsite;
	
	public boolean verifyAutomationPracticeWebsite() {
		return AutomationPracticeWebsite.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"editorial_block_center\"]/h2")
	WebElement PracticeSelenium;
	
	public boolean verifyPracticeSelenium() {
		return PracticeSelenium.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"editorial_block_center\"]/div/p")                 // Bottomtext
	WebElement Bottomtext;
	
	public boolean verifyBottomtext() {
		return Bottomtext.isDisplayed();
	}
	
	public String getBottomtext() {
		return Bottomtext.getText();
	}
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/h4")                     // NewsLetter
	WebElement NewsLetter;
	
	public boolean verifyNewsLettert() {
		return NewsLetter.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"newsletter-input\"]")                        // Emailtextbox
	WebElement Emailtextbox;
	
	public boolean verifyEmailtextbox() {
		return Emailtextbox.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")  // Emailbtn
	WebElement Emailbtn;
	
	public boolean verifyEmailbtn() {
		return Emailbtn.isDisplayed();
	}
	
	@FindBy(xpath="//*[@id=\"social_block\"]/h4")
	WebElement FollowUs;
	
	public boolean verifyFollowUs() {
		return FollowUs.isDisplayed();
	}
	
	public void ClickonFollowUsLink(){
		FollowUs.click();
	}
	
	@FindBy(xpath="//li[@class='facebook']")
	WebElement fb;
	
	public boolean verifyfblink() {
		return fb.isDisplayed();	
	}
	
	public void ClickonfbLink(){
		fb.click();
	}
	
	@FindBy(xpath="//li[@class='twitter']")
	WebElement tw;
	
	public boolean veritwfblink() {
		return tw.isDisplayed();	
	}
	
	public void ClickontwLink(){
		tw.click();
	}
	
	@FindBy(xpath="//li[@class='youtube']")
	WebElement yt;
	
	public boolean verifyytlink() {
		return yt.isDisplayed();	
	}
	
	public void ClickonytLink(){
		yt.click();
	}
	
	@FindBy(xpath="//*[@id=\"social_block\"]/ul/li[4]/a")
	WebElement google;
	
	public boolean verifygooglelink() {
		return google.isDisplayed();	
	}
	
	public void ClickongoogleLink(){
		google.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[2]/h4")                    // Categories
	WebElement Categories;
	
	public boolean verifyCategorieslink() {
		return Categories.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a")           // Bottom women link
	WebElement Bottomwomenlink;
	
	public boolean verifyBottomwomenlink() {
		return Bottomwomenlink.isDisplayed();	
	}
	
	public void ClickonBottomwomenlink(){
		Bottomwomenlink.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/h4")
	WebElement Information;
	
	public boolean verifyInformationlink() {
		return Information.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[1]/a")
	WebElement Specials;
	
	public boolean verifySpecialslink() {
		return Specials.isDisplayed();	
	}
	
	public void ClickonSpecialslink(){
		Specials.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[2]/a")
	WebElement Newproducts;
	
	public boolean verifyNewproductsnlink() {
		return Newproducts.isDisplayed();	
	}
	
	public void ClickonNewproductslink(){
		Newproducts.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[3]/a")
	WebElement BestSellers;
	
	public boolean verifyBestSellerslink() {
		return BestSellers.isDisplayed();	
	}
	
	public void ClickonBestSellerslink(){
		BestSellers.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[4]/a")
	WebElement OurStores;
	
	public boolean verifyOurStoreslink() {
		return OurStores.isDisplayed();	
	}
	
	public void ClickonOurStoreslink(){
		OurStores.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[5]/a")
	WebElement BottomContactUs;
	
	public boolean verifyBottomContactUslink() {
		return BottomContactUs.isDisplayed();	
	}
	
	public void ClickonBottomContactUslink(){
		BottomContactUs.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[6]/a")
	WebElement TermsConditions;
	
	public boolean verifyTermsConditionslink() {
		return TermsConditions.isDisplayed();	
	}
	
	public void ClickonTermsConditionslink(){
		TermsConditions.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")
	WebElement AboutUs;
	
	public boolean verifyAboutUslink() {
		return AboutUs.isDisplayed();	
	}
	
	public void ClickonAboutUslink(){
		AboutUs.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[8]")
	WebElement Sitemap;
	
	public boolean verifySitemaplink() {
		return Sitemap.isDisplayed();	
	}
	
	public void ClickonSitemaplink(){
		Sitemap.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/h4/a")
	WebElement Myaccount;
	
	public boolean verifyMyaccountlink() {
		return Myaccount.isDisplayed();	
	}
	
	public void ClickonMyaccountlink(){
		Myaccount.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]/a")
	WebElement MyOrders;
	
	public boolean verifyMyOrderslink() {
		return MyOrders.isDisplayed();	
	}
	
	public void ClickonMyOrderslink(){
		MyOrders.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/div/ul/li[2]/a")
	WebElement MyCreditSlips;
	
	public boolean verifyMyCreditSlipslink() {
		return MyCreditSlips.isDisplayed();	
	}
	
	public void ClickonMyCreditSlipslink(){
		MyCreditSlips.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/div/ul/li[3]/a")
	WebElement MyAddrsses;
	
	public boolean verifyMyAddrsseslink() {
		return MyAddrsses.isDisplayed();	
	}
	
	public void ClickonMyAddrsseslink(){
		MyAddrsses.click();
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/div/ul/li[4]/a")
	WebElement MyPersonalInfo;
	
	public boolean verifyMyPersonalInfolink() {
		return MyPersonalInfo.isDisplayed();	
	}
	
	public void ClickonMyPersonalInfolink(){
		MyPersonalInfo.click();
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/h4")
	WebElement StoreInformation;
	
	public boolean verifyStoreInformationlink() {
		return StoreInformation.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[1]")
	WebElement StoreInformationtext;
	
	public boolean verifyStoreInformationtext() {
		return StoreInformationtext.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[1]/i")
	WebElement BottomMapIcon;
	
	public boolean verifyBottomMapIcon() {
		return BottomMapIcon.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[2]")
	WebElement BottomCallUs;
	
	public boolean verifyBottomCallUslink() {
		return BottomCallUs.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[2]/i")
	WebElement BottomcallIcon;
	
	public boolean verifyBottomcallIcon() {
		return BottomcallIcon.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[3]")
	WebElement BottomEmail;
	
	public boolean verifyBottomEmaillink() {
		return BottomEmail.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"block_contact_infos\"]/div/ul/li[3]/i")
	WebElement BottomEmailIcon;
	
	public boolean verifyBottomEmailIcon() {
		return BottomEmailIcon.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[4]/div")
	WebElement PageBottomText;
	
	public boolean verifyPageBottomText() {
		return PageBottomText.isDisplayed();	
	}
	
	@FindBy(xpath="//*[@id=\"footer\"]/div/section[4]/div/a")
	WebElement Lastlink;
	
	public boolean verifyLastlink() {
		return Lastlink.isDisplayed();	
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
}
