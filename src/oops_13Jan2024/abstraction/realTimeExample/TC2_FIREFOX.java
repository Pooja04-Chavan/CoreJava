package src.oops_13Jan2024.abstraction.realTimeExample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FIREFOX");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FF");
        return null;
    }

}
