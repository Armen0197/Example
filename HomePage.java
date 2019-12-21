package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private By messenger_button = By.cssSelector("div.l9j0dhe7[aria-label=\"Messenger\"]");
    private By open_messenger = By.cssSelector("div[class=\"rq0escxv j83agx80 cbu4d94t k4urcfbm\"]");
    private By find_friend = By.cssSelector("a[href=\"/messages/t/user:100004068216875/\"]");
    private By chat_opened = By.cssSelector("div[class=\"buofh1pr ni8dbmo4 stjgntxs j83agx80 bp9cbjyn\"]");
    private By smile_button = By.cssSelector("div[aria-label=\"Выберите смайлик\"]");
    private By smiles_opened = By.cssSelector("div._3vgi[style=\"min-height: 1800px;\"]");
    private By like_button = By.cssSelector("svg[class=\"sqpo3gyd\"]");

    public void clickMessengerButton() {
        driver.findElement(messenger_button).click();
    }

    public void waitMessengerOpened(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(open_messenger));
    }

    public void clickOnFriendName() {
        driver.findElement(find_friend).click();
    }

    public void waitChatOpened(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chat_opened));
    }

    public void clickOnSmile() {
        driver.findElement(smile_button).click();
    }

    public void waitSmilesOpened(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(smiles_opened));
    }

    public void likeButtonClick() {
        driver.findElement(like_button).click();
    }
}
