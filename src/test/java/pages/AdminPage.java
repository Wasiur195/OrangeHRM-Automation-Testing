package pages;

import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.io.IOException;
import java.util.List;

public class AdminPage {
    //dashboard Menue List
    @FindBy(className = "oxd-main-menu-item-wrapper")
    public List<WebElement> manueList;
    @FindBy(className = "oxd-input")
    public List<WebElement> inputField;

    //Directory input field
    @FindBy(xpath = "//input")
    public List<WebElement> directoryinputField;

    //search button
    @FindBy(css = "[type=submit]")
    WebElement searchBtn;

    //table cell action buttons 1.delete button 2.edit button
    @FindBy(className = "oxd-table-cell-action-space")
    List<WebElement> tableActionButton;

    //edit user filed username
    @FindBy(className = "oxd-input")
    public List<WebElement> editUserField;

    //edit user save button
    @FindBy(className = "oxd-button")
    List<WebElement> savebutton;


    //user dropdown menu
    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropdown;

    //user dropdown menus option like logout,about,support
    @FindBy(className = "oxd-userdropdown-link")
    List<WebElement> dropdownmenuList;

    //user menu list myinfo page
    @FindBy(className = "oxd-main-menu-item--name")
    List<WebElement> userMenuList;

    //personal details inner tab like contact details personal details
    @FindBy(className = "orangehrm-tabs-item")
    List<WebElement> innertabs;


    //gender and blood group selection on user info filed at 13 index male in 14 index female nad in 17 index blood group
    @FindBy(className = "oxd-input-field-bottom-space")
    List<WebElement> genderBloodSelection;
    //gender selection and other lebel selection male at 12 index and female at 12 index
    @FindBy(tagName = "label")
    List<WebElement> genderSelection;
    //blood group selection
    @FindBy(className = "oxd-select-text-input")
    public List<WebElement> bloodgroup;
    //user info save buttons
    @FindBy(css = "[type=submit]")
    List<WebElement> saveButtons;

    //my info sidebar menu list
    @FindBy(className = "orangehrm-tabs-item")
    List<WebElement> userinfoMenuList;

    //contact details input fields
    @FindBy(className = "oxd-input")
    List<WebElement> contactInputFields;
    //select country in Contact update page
    @FindBy(className = "oxd-select-text-input")
    WebElement countrySelect;

    public AdminPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchUserInfoWithInvalidInfo () throws IOException, ParseException, InterruptedException {
//clicking on Admin page section
        manueList.get(0).click();

        Thread.sleep(1000);
        inputField.get(1).sendKeys("invalid243");
        Thread.sleep(1000);
        searchBtn.click();
    }

    public void searchUserInfo () throws IOException, ParseException, InterruptedException {
//clicking on Admin page section
        manueList.get(0).click();
        String username = (String) Utils.readJSONFile("./src/test/resources/TestEmployeeDetails.json", 1).get("username");
        Thread.sleep(1000);
        inputField.get(1).sendKeys(username);
        Thread.sleep(1000);
        searchBtn.click();
    }


    public void searchUserInfofromDirectory () throws IOException, ParseException, InterruptedException {
//clicking on Directory page section
        manueList.get(8).click();
        String firstname = (String) Utils.readJSONFile("./src/test/resources/TestEmployeeDetails.json", 1).get("firstname");
        Thread.sleep(1000);
        directoryinputField.get(1).sendKeys(firstname);
        Thread.sleep(3000);
        directoryinputField.get(1).sendKeys(Keys.ARROW_DOWN);
        directoryinputField.get(1).sendKeys(Keys.ENTER);
        searchBtn.click();
    }

    public void doLogout() throws InterruptedException {
        Thread.sleep(500);

        // Verify if the userDropdown element is present before clicking on it
        if (userDropdown != null) {
            userDropdown.click();
        } else {
            System.out.println("User dropdown element not found.");
        }

        // Verify if dropdownmenuList is populated before accessing it
        if (!dropdownmenuList.isEmpty()) {
            Thread.sleep(500);
            // Verify if index 3 exists in dropdownmenuList before accessing it
            if (dropdownmenuList.size() > 3) {
                dropdownmenuList.get(3).click();
            } else {
                System.out.println("Element at index 3 not found in dropdownmenuList.");
            }
        } else {
            System.out.println("Dropdown menu list is empty.");
        }
    }
    //Adding these checks and print statements will help you understand whether the elements are being located and interacted with as expected. Additionally, it can provide you with more information in case the issue persists. Remember to review the initialization, locators, and timing to ensure that the elements are accessible at the time of execution.







    public void userContactOtherInfoUpdate (WebDriver driver) throws InterruptedException {
        //clicking on My Info tab
        userMenuList.get(2).click();
        Thread.sleep(7000);
        //clicking on blood group
        genderSelection.get(12).click();
        Thread.sleep(3000);
        savebutton.get(0).click();
        Thread.sleep(1000);
        Utils.doScroll(driver, 550);
        Thread.sleep(3000);
        bloodgroup.get(2).click();
        Thread.sleep(5000);

        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        savebutton.get(1).click();
//        driver.findElement(By.className("oxd-select-dropdown")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

    }
    //update blood group to AB- for smoke suit
    /*public void updatebloodgrouptoAB (WebDriver driver) throws InterruptedException {
        // ... (existing code)

        // Check if the bloodgroup list is empty before accessing its elements
        if (!bloodgroup.isEmpty()) {
            bloodgroup.get(2).click();
            Thread.sleep(500);

            // Send arrow keys to navigate to the desired option
            for (int i = 0; i < 8; i++) {
                bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(500);
            }
            bloodgroup.get(2).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            savebutton.get(1).click();
        } else {
            System.out.println("Bloodgroup list is empty. Unable to select blood group.");
        }

   // In this modified code, before attempting to interact with the bloodgroup list, we're checking if the list is empty using the isEmpty() method. If it's empty, we print a message indicating that the list is empty and we're unable to select the blood group. This will help you diagnose whether the issue is related to the element not being found or loaded correctly.

    //Make sure you also double-check the locator used for bloodgroup to ensure it matches the elements on the page. Additionally, verify the timing and visibility of these elements, as they may play a role in whether they are correctly located and interacted with.

            //clicking on My Info tab
        userMenuList.get(2).click();
        Thread.sleep(7000);
        //clicking on blood group
        genderSelection.get(12).click();
        Thread.sleep(3000);
        savebutton.get(0).click();
        Thread.sleep(1000);
        Utils.doScroll(driver, 550);
        Thread.sleep(3000);
        bloodgroup.get(2).click();
        Thread.sleep(5000);

        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        bloodgroup.get(2).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        savebutton.get(1).click();
//        driver.findElement(By.className("oxd-select-dropdown")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);*/

    }
//}

