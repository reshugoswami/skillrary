package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective business 
 * libraries of Testing Page
 * @author SATURN
 *
 */
public class TestingPage {
	
	

		// Declaration
		@FindBy(xpath = "//h1[@class='page-header']")
		private WebElement pageHeader;

		@FindBy(xpath = "//img[@id='Selenium Training']")
		private WebElement seleniumTrainingImage;

		@FindBy(id = "cartArea")
		private WebElement cartArea;

		@FindBy(xpath = "//ul[@class='list-socialicons']/descendant::i[@class='fa fa-facebook']")
		private WebElement facebookIcon;

		// Initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Utilization
		/**
		 * This method returns page header text
		 * 
		 * @return
		 */
		public String getPageHeader() {
			return pageHeader.getText();
		}

		/**
		 * This method returns selenium training image
		 * @return
		 */
		public WebElement getSeleniumTrainingImage() {
			return seleniumTrainingImage;
		}

		/**
		 * This method returns cart area web element
		 * @return
		 */
		public WebElement getCartArea() {
			return cartArea;
		}

		/**
		 * This method returns facebook icon
		 * @return
		 */
		public WebElement getFacebookIcon() {
			return facebookIcon;
		}

		/**
		 * This method is used to click facebook icon
		 */
		public void clickFacebookIcon() {
			facebookIcon.click();
		}

	}

