package senai.teste;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteNavegabilidade {
//Pré testes
	ChromeDriver driver; //Driver do Navegador
	@Before
	public void PreTeste() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mathe\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(); //Abrir o navegador
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
	}
	
	
	//Teste
	@Test
	public void Teste() {
		
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		//driver.findElement(By.id("Busca1_btnBusca")).click();//
		driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.ENTER);
		
	
	}
	
	//Pos Teste
	public void PosTeste() {
		driver.quit();
	}
	
	
}
