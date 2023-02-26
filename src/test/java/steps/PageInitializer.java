package steps;

import pages.*;

public class PageInitializer {

    public static MainPage mainPage;
    public static SignupPage signupPage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static LaptopPage laptopPage;
    public static CartPage cartPage;

    public static void initializePageObjects() {

        mainPage = new MainPage();
        signupPage = new SignupPage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        laptopPage = new LaptopPage();
        cartPage = new CartPage();
    }
}
