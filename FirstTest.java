import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

public class FirstTest {
    private  WebDriver driver;


    @Test
    public void myTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setLogin("snxchyan2014@mail.ru");
        loginPage.setPassword("xdrxalo");
        loginPage.clickButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickMessengerButton();
        homePage.waitMessengerOpened(wait);
        homePage.clickOnFriendName();
        homePage.waitChatOpened(wait);
        homePage.clickOnSmile();
        homePage.waitSmilesOpened(wait);
        homePage.likeButtonClick();
        driver.quit();

    }

}
