package support;

import definition.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

public class util extends hooks {
    public static WebDriverWait wait;

    public util() {
        wait=new WebDriverWait(driver,30);
    }
}