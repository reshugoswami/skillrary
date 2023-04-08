package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * This class contains all the elements and respective business 
 * libraries of Home Page
 * @author SATURN
 *
 */
public class HomePage {
	
	

		//Declaration
		@FindBy(xpath = "//img[@alt='SkillRary']")
		private WebElement logo;

		@FindBy(xpath = "//a[text()=' GEARS ']")
		private WebElement gearsTab;

		@FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
		private WebElement skillraryDemoAppLink;

		//Initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		//Utilization
		/**
		 * This method returns the skillrary logo
		 * @return
		 */
		public WebElement getLogo() {
			return logo;
		}

		/**
		 * This method is used to click on Gears Tab
		 */
		public void clickGearsTab() {
			gearsTab.click();
		}

		/**
		 * This method is used to click on skillrary demo app link
		 */
		public void clickSkillraryDemoApp() {
			skillraryDemoAppLink.click();
		}
}
