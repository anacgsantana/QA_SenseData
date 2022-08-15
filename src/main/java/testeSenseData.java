import org.junit.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testeSenseData {

	@Test
	public void teste() {
		// Realizar o login no site

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(900, 720));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// Aplicando filtro de pesquisa.

		WebElement filtro = driver.findElement(By.className("product_sort_container"));
		Select escolha = new Select(filtro);
		escolha.selectByVisibleText("Price (low to high)");

		// Selecionando os produtos.

		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

		// Acessando carrinho e finalizando a compra.

		driver.findElement(By.id("shopping_cart_container")).click();

		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("standard");
		driver.findElement(By.id("last-name")).sendKeys("_user");
		driver.findElement(By.id("postal-code")).sendKeys("31313131");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();

		driver.quit();

	}
}