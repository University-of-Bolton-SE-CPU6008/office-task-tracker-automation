public class Main extends OpenBrowser{
    public static void main(String[] args) throws InterruptedException {
        open();
        maximizeBrowser();
        enterEmailToLoginAccount();
        enterPaswordToLoginAccount();
        clickSignInButton();
        //signOut();
    }
}
