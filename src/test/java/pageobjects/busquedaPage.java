package pageobjects;

import definition.hooks;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class busquedaPage extends util {
    @FindBy(xpath = "//input[@aria-label='Buscar en Facebook']")protected WebElement txtBuscar;
    @FindBy(id = "dir_nav_sts:100003718431156")protected WebElement clkNombre;

    public busquedaPage() {
        PageFactory.initElements(driver,this);
    }

    public void escribirNombre(){
        wait.until(ExpectedConditions.visibilityOf(txtBuscar));
        txtBuscar.sendKeys("Thalia Garcia");
    }

    public void clickNombre(){
        wait.until(ExpectedConditions.elementToBeClickable(clkNombre));
        clkNombre.click();
    }
    public void validarBusqueda(){
        Assert.assertEquals("https://www.facebook.com/thalia.garcia.7549",hooks.driver.getCurrentUrl());
    }


}