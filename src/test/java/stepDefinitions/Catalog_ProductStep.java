package stepDefinitions;

import Pages.*;
import Utilities.*;
import io.cucumber.java.en.*;

public class Catalog_ProductStep {
	PropertyFileReader prop = new PropertyFileReader();
	Catalog_ProductsPage prodPage = new Catalog_ProductsPage();

	@When("user clicks on Add New button")
	public void clickOnAddNewButton(){
		prodPage.clickOnAddNewButton();
	}

	@When("user enter new product {string} details in Add new Product Page")
	public void enterNewProductDetails(String prodName){
		prodPage.enterNewProductDetails(prodName);
	}

	@When("user clicks on product Save button")
	public void clickOnProductSaveButton() {
		prodPage.clickOnProductSaveButton();
	}
}
