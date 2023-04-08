package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

/**
 * This class contains all the elements and respective business 
 * libraries of Selenium Traning Page
 * @author SATURN
 *
 */
public class SeleniumTraningPage {
	
	

		// Declaration
		@FindBy(xpath = "//h1[@class='page-header']")
		private WebElement pageHeader;

		@FindBy(xpath = "//button[@id='add']")
		private WebElement plusButton;

		@FindBy(xpath = "//button[.=' Add to Cart']")
		private WebElement addToCartButton;

		@FindBy(xpath = "//div[@id='callout']/span")
		private WebElement itemAddedMessage;

		// Initialization
		public SeleniumTraningPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Utilization
		/**
		 * This method returns page header text
		 * @return
		 */
		public String getPageHeader() {
			return pageHeader.getText();
		}

		/**
		 * This method is used to double click on plus button
		 * @param web
		 */
		public void doubleClickAdd(WebDriverUtility web) {
			web.doubleClickOnElement(plusButton);
		}

		/**
		 * This method is used to click add to cart button
		 */
		public void clickAddToCart() {
			addToCartButton.click();
		}

		/**
		 * This method returns item added message
		 * @return
		 */
		public String getItemAddedMessage() {
			return itemAddedMessage.getText();
		}

}
