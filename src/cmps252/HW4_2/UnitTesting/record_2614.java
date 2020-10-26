package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("45")
class Record_2614 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2614: FirstName is Andreas")
	void FirstNameOfRecord2614() {
		assertEquals("Andreas", customers.get(2613).getFirstName());
	}

	@Test
	@DisplayName("Record 2614: LastName is Gloor")
	void LastNameOfRecord2614() {
		assertEquals("Gloor", customers.get(2613).getLastName());
	}

	@Test
	@DisplayName("Record 2614: Company is Cantor, Jane Bruskin Esq")
	void CompanyOfRecord2614() {
		assertEquals("Cantor, Jane Bruskin Esq", customers.get(2613).getCompany());
	}

	@Test
	@DisplayName("Record 2614: Address is 5042 Lincoln Ave")
	void AddressOfRecord2614() {
		assertEquals("5042 Lincoln Ave", customers.get(2613).getAddress());
	}

	@Test
	@DisplayName("Record 2614: City is Cypress")
	void CityOfRecord2614() {
		assertEquals("Cypress", customers.get(2613).getCity());
	}

	@Test
	@DisplayName("Record 2614: County is Orange")
	void CountyOfRecord2614() {
		assertEquals("Orange", customers.get(2613).getCounty());
	}

	@Test
	@DisplayName("Record 2614: State is CA")
	void StateOfRecord2614() {
		assertEquals("CA", customers.get(2613).getState());
	}

	@Test
	@DisplayName("Record 2614: ZIP is 90630")
	void ZIPOfRecord2614() {
		assertEquals("90630", customers.get(2613).getZIP());
	}

	@Test
	@DisplayName("Record 2614: Phone is 714-827-7935")
	void PhoneOfRecord2614() {
		assertEquals("714-827-7935", customers.get(2613).getPhone());
	}

	@Test
	@DisplayName("Record 2614: Fax is 714-827-0695")
	void FaxOfRecord2614() {
		assertEquals("714-827-0695", customers.get(2613).getFax());
	}

	@Test
	@DisplayName("Record 2614: Email is andreas@gloor.com")
	void EmailOfRecord2614() {
		assertEquals("andreas@gloor.com", customers.get(2613).getEmail());
	}

	@Test
	@DisplayName("Record 2614: Web is http://www.andreasgloor.com")
	void WebOfRecord2614() {
		assertEquals("http://www.andreasgloor.com", customers.get(2613).getWeb());
	}
}
