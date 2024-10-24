package com.test.app;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;
import common.TestBaseClass;
import org.testng.annotations.Test;

public class Sample extends TestBaseClass {

    @Test(groups = "Smoke")
    public void tc00VerifyURL() {

        test = extent.createTest("Verify URL", "Open the Mumzworld Webstore")
                .assignCategory("Functional_TestCase")
                .assignCategory("Positive_TestCase");
        logger.info("Verify URL");

        webdriver.openURL("https://www.mumzworld.com/en");
        test.log(Status.INFO, "Open Mumzworld");
        logger.info("Open Mumzworld");
    }

    @Test
    public void tc01VerifyCheckoutFlow() throws InterruptedException {

        test = extent.createTest("Verify Checkout Flow", "Search for a product\n" +
                        "Add the product to bag\n" +
                        "Go to view bag page (shopping bag)\n" +
                        "Increase qty to be 5 items\n" +
                        "Click Proceed to checkout")
                .assignCategory("Functional_TestCase")
                .assignCategory("Positive_TestCase");
        logger.info("Verify Checkout Flow");

        webdriver.enterText(IConstants.txtSearch, "Cocomelon");
        webdriver.clickOnButton(IConstants.btnSubmit);
        test.log(Status.INFO, "Verify Search for a product");
        logger.info("Verify Search for a product");

        Thread.sleep(3000);
        webdriver.clickOnButton(IConstants.btnAddToCart);
        test.log(Status.INFO, "Verify Add the product to bag");
        logger.info("Verify Add the product to bag");

        webdriver.clickOnButton(IConstants.btnViewBag);
        test.log(Status.INFO, "Verify view bag page");
        logger.info("Verify view bag page");

        for (int i = 0; i < 5; i++) {
            webdriver.clickOnButton(IConstants.btnIncreaseQty);
            test.log(Status.INFO, "Verify Increase Qty");
            logger.info("Verify Increase Qty");
            System.out.println("Button clicked " + (i + 1) + " times.");
        }

        webdriver.clickOnButton(IConstants.btnProceedToCheckOut);
        test.log(Status.INFO, "Verify Proceed To CheckOut");
        logger.info("Verify Proceed To CheckOut");

    }

    @Test
    public void tc02VerifySignUp() {

        test = extent.createTest("Verify Sign Up", "")
                .assignCategory("Functional_TestCase")
                .assignCategory("Positive_TestCase");
        logger.info("Verify Sign Up");

        webdriver.clickOnButton(IConstants.btnSignup);
        test.log(Status.INFO, "Verify Sing up button");
        logger.info("Verify Sing up button");

        webdriver.enterText(IConstants.txtFirstName, "John");
        test.log(Status.INFO, "Verify First Name");
        logger.info("Verify First Name");

        webdriver.enterText(IConstants.txtLastName, "doe");
        test.log(Status.INFO, "Verify Last Name");
        logger.info("Verify Last Name");

        webdriver.enterText(IConstants.txtEmail, "jd05@gmail.com");
        test.log(Status.INFO, "Verify Email");
        logger.info("Verify Email");

        webdriver.enterText(IConstants.txtPassword, "jd05#");
        test.log(Status.INFO, "Verify Passcode");
        logger.info("Verify Passcode");

        webdriver.clickOnButton(IConstants.btnRegister);
        test.log(Status.INFO, "Verify Register");
        logger.info("Verify Register");
    }
}
