package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMainPage {

    public MedunnaMainPage() {
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInRegister;
    @FindBy(xpath="//a[@id='login-item']")
    public WebElement signIn;
    @FindBy(xpath="//div[@id='app-header']//a[2]")
    public WebElement register;
    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement ssnDogrulama;



    @FindBy(xpath="//input[@id='ssn']")
    public WebElement SSN;
    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;
    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastName;
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;
    @FindBy(xpath="//input[@id='email']")
    public WebElement email;
    @FindBy(xpath="//input[@id='firstPassword']")
    public WebElement newPassword;
    @FindBy(xpath="//input[@id='secondPassword']")
    public WebElement newPasswordConfirmation;
    @FindBy(xpath="//button[@id='register-submit']//span[contains(text(),'Register')]")
    public WebElement registerButton;


}
