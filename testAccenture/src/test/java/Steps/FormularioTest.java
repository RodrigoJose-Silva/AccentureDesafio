package Steps;


import Browser.Browser;
import Browser.PageActions;
import Pages.PageInsurant;
import Pages.PagePrice;
import Pages.PageProduct;
import Pages.PageSend;
import Pages.PageVehicle;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FormularioTest {

	PageActions pActions = new PageActions();
	PageVehicle pv = new PageVehicle();	
	PageInsurant pi = new PageInsurant();
	PageProduct pp = new PageProduct();
	PagePrice pPrice = new PagePrice();
	PageSend ps =new PageSend();
	

	@Before
	public void setUp () {
		Browser.abrirNavegador();
	}
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		Browser.getDriver().get(site);

	}

	@When("eu preencho todos formularios necessarios e enviar")
	public void eu_preencho_todos_formularios_necessarios_e_enviar() {
		//preenchendo formulario page Enter Vehicle Data
		pActions.escrever(pv.getMake(), "Audi");
		pActions.escrever(pv.getModel(), "Scooter");
		pActions.escrever(pv.getCylinder(), "1");
		pActions.escrever(pv.getEngine(), "1");
		pActions.escrever(pv.getDate(), "07/01/2021");
		pActions.escrever(pv.getNumbers(), "1");
		pActions.escrever(pv.getNumbersSeats(), "1");
		pActions.escrever(pv.getFuel(), "Diesel");
		pActions.escrever(pv.getPayload(), "1");
		pActions.escrever(pv.getTotal(), "100");
		pActions.escrever(pv.getList(), "1000");
		pActions.escrever(pv.getAnnual(), "100");
		pActions.selecionar(pv.getNext());
		
		//Preenchendo formulario page Enter Insurance Data
		pActions.escrever(pi.getFirstName(), "Rodrigo");
		pActions.escrever(pi.getLastName(), "Silva");
		pActions.escrever(pi.getDateBirth(), "03/19/1985");
		pActions.escrever(pi.getCountry(), "Brazil");
		pActions.escrever(pi.getZipCode(), "12345");
		pActions.escrever(pi.getOccupacion(), "Employee");
		pActions.selecionar(pi.getHobbies());
		pActions.selecionar(pi.getNext());
		
		//Preenchendo formulario page Enter Product Data
		pActions.escrever(pp.getStarDate(), "09/01/2021");
		pActions.escrever(pp.getInsurance(), "3.000.000,00");
		pActions.escrever(pp.getMeritRating(), "Super Bonus");
		pActions.escrever(pp.getDamegeInsurance(), "No Coverage");
		pActions.selecionar(pp.getOptionalProducts());
		pActions.escrever(pp.getCoutersyCar(), "No");
		pActions.selecionar(pp.getNext());
		
		//Selecionando categoria / preco Select Price Option
		pActions.selecionar(pPrice.getSelectOption());
		pActions.selecionar(pPrice.getNext());
		
		//Preenchendo formulario page Send Quote
		pActions.escrever(ps.getEmail(), "teste@teste.com");
		pActions.escrever(ps.getUsername(), "Digo");
		pActions.escrever(ps.getPassword(), "Teste123");
		pActions.escrever(ps.getConfirmPassword(), "Teste123");
		
	}

	@Then("validar o envio do e-mail com SUCESSO")
	public void validar_o_envio_do_e_mail_com_sucesso() {
		pActions.selecionar(ps.getSend());
			
	}
	
	@After
	public void tearDown() {
		Browser.fechaNavegador();
	}


}
