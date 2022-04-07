package Lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

      //определение локатора для входа в аккаунт

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a")
    private WebElement loginBtn;

     // определение локатора поля ввода логина

    @FindBy(xpath = "//*[@id=\"user\"]")
    private WebElement loginField;

     // определение локатора поля ввода пароля

    @FindBy(xpath = "//*[@id=\"lj_loginwidget_password\"]")
    private WebElement passwdField;

    //определение локатора кнопки входа в аккаунт

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/button")
    private WebElement loginEnter;

    // метод для осуществления входа в аккаунт

    public void clickLoginBtn() {
        loginBtn.click();
    }

     // метод для ввода логина

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

     // метод для ввода пароля

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    // метод для осуществления нажатия кнопки входа в аккаунт

    public void clickLoginEnter() {
        loginEnter.click();
    }


}




