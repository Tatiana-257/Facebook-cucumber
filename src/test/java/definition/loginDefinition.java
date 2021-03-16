package definition;

import io.cucumber.java.es.*;
import org.junit.Assert;
import pageobjects.loginPage;

public class loginDefinition {
    loginPage login;

    public loginDefinition() {
        login=new loginPage();
    }

    @Dado("que la web este disponible")
    public void queLaWebEsteDisponible() {
        hooks.driver.get("https://www.facebook.com/");
        Assert.assertEquals("Facebook - Entrar o registrarse",hooks.driver.getTitle());
    }

    @Cuando("ingreso el correo electronico en el campo email")
    public void ingresoElCorreoElectronicoEnElCampoEmail() {
        login.ingresarEmail();

    }


    @E("ingreso el password")
    public void ingresoElPassword() {
        login.ingresarPassword();
    }

    @Y("doy click en Entrar")
    public void doyClickEnEntrar() {
        login.clickEntrar();
    }

    @Entonces("debo ingresar a la pagina principal de mi Facebook")
    public void deboIngresarALaPaginaPrincipalDeMiFacebook() {
        login.validarFacebook();

    }
}
