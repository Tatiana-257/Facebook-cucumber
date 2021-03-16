package definition;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageobjects.busquedaPage;
import pageobjects.loginPage;

public class busquedaDefinition {
    busquedaPage busqueda;
    loginPage login;

    public busquedaDefinition() {
        busqueda=new busquedaPage();
        login=new loginPage();
    }

    @Y("realizo una busqueda")
    public void realizoUnaBusqueda() {
        busqueda.escribirNombre();
    }

    @Y("doy click en el nombre")
    public void doyClickEnElNombre() {
        busqueda.clickNombre();
    }
    @Entonces("busqueda correcta")
    public void busquedaCorrecta() {
        busqueda.validarBusqueda();
    }


}
