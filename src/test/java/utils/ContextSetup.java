package utils;

import pageObjectManager.PageObjectManager;

import java.io.IOException;

public class ContextSetup {

    public PageObjectManager pageObjectManager;
    public Base base;


    public ContextSetup() throws IOException {
        base = new Base();
        pageObjectManager = new PageObjectManager(base.WebDriverSetup());

    }

}
