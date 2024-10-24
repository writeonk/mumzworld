package com.test.app;

import org.openqa.selenium.By;

public interface IConstants {

    By txtSearch = By.xpath("//input[@type='search']");
    By btnSubmit = By.xpath("//button[@type ='submit']");
    By btnAddToCart = By.xpath("(//div[@class ='item-actionsContainer_new-3Uk'])[1]");
    By btnViewBag = By.xpath("(//a[@href='/en/cart'])[2]");
    By btnIncreaseQty = By.xpath("(//button[@type ='button' and @aria-label='Increase Quantity'])[2]");
    By btnProceedToCheckOut = By.xpath("(//button[@title = 'Proceed to Checkout'])[2]");
    By btnSignup = By.xpath("//button[@title = 'Sign up']");
    By txtFirstName = By.id("create_account_page_firstname");
    By txtLastName = By.id("create_account_page_lastname");
    By txtEmail = By.id("create_account_page_email");
    By txtPassword = By.id("create_account_page_password");
    By btnRegister = By.xpath("//button[@type ='submit' and @title='Register']");
}
