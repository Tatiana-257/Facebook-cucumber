package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class loginPage extends util {
    @FindBy(id="email")protected WebElement txtEmail;
    @FindBy(id="pass")protected WebElement txtPassword;
    @FindBy(name="login")protected WebElement btnEntrar;
    @FindBy(xpath ="//a[@href='https://www.facebook.com/tatiana.sarmiento/']")protected WebElement lblvalidar;


    public loginPage() {
        PageFactory.initElements(driver,this);
    }

    public void ingresarEmail(){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));
        txtEmail.sendKeys("micorreo@hotmail.com");
    }

    public void ingresarPassword(){
        txtPassword.sendKeys("micontraseña");
    }

    public void clickEntrar(){
        btnEntrar.click();
    }
    public void validarFacebook(){
        wait.until(ExpectedConditions.visibilityOf(lblvalidar));
        Assert.assertEquals("Tatiana Sarmiento Jurado",lblvalidar.getText());
    }


}
