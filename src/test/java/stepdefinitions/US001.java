package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    Faker faker = new Faker();


    @Given("medunna ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {


        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("ana sayfa giris ikonuna tiklar")
    public void anaSayfaGirisIkonunaTiklar() {
        mainPage.signInRegister.click();
        Driver.wait(2);
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        mainPage.register.click();
        Driver.wait(2);
    }

    @And("SSN kutusuna uygun ssn girer")
    public void ssnKutusunaUygunSsnGirer() {
       // mainPage.SSN.sendKeys("256-36-3668"+ Keys.TAB); //her seferinde ayni sayilari gondermemek icin Random i kullaniyoruz.
        mainPage.SSN.sendKeys(faker.random().nextInt(100,899)+"-"+faker.random().nextInt(10,99)+"-"+faker.random().nextInt(1000,9999)+Keys.TAB);
        Driver.wait(2);
    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hataMesajininCikmadiginiTestEder() {

        Assert.assertTrue("hata mesaji gorundu ", mainPage.ssnDogrulama.isDisplayed());

    }

    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        Driver.closeDriver();
    }
}
