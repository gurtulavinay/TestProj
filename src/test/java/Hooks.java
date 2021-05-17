import Utils.CommonFunction;
import cucumber.api.java.Before;

public class Hooks {

    CommonFunction commonFunctionObj = new CommonFunction();

    @Before
    public void beforeTest()

    {
        commonFunctionObj.openBrowser();
    }

    /*@After
    public void afterTest()
    {
        commonFunctionsObj.closeBrowser();
    }*/
}
