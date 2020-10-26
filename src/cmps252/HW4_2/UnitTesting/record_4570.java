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

@Tag("37")
class Record_4570 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4570: FirstName is Consuelo")
	void FirstNameOfRecord4570() {
		assertEquals("Consuelo", customers.get(4569).getFirstName());
	}

	@Test
	@DisplayName("Record 4570: LastName is Lagana")
	void LastNameOfRecord4570() {
		assertEquals("Lagana", customers.get(4569).getLastName());
	}

	@Test
	@DisplayName("Record 4570: Company is Richfield Hospitality Services")
	void CompanyOfRecord4570() {
		assertEquals("Richfield Hospitality Services", customers.get(4569).getCompany());
	}

	@Test
	@DisplayName("Record 4570: Address is 23290 Commerce Park")
	void AddressOfRecord4570() {
		assertEquals("23290 Commerce Park", customers.get(4569).getAddress());
	}

	@Test
	@DisplayName("Record 4570: City is Beachwood")
	void CityOfRecord4570() {
		assertEquals("Beachwood", customers.get(4569).getCity());
	}

	@Test
	@DisplayName("Record 4570: County is Cuyahoga")
	void CountyOfRecord4570() {
		assertEquals("Cuyahoga", customers.get(4569).getCounty());
	}

	@Test
	@DisplayName("Record 4570: State is OH")
	void StateOfRecord4570() {
		assertEquals("OH", customers.get(4569).getState());
	}

	@Test
	@DisplayName("Record 4570: ZIP is 44122")
	void ZIPOfRecord4570() {
		assertEquals("44122", customers.get(4569).getZIP());
	}

	@Test
	@DisplayName("Record 4570: Phone is 216-464-0708")
	void PhoneOfRecord4570() {
		assertEquals("216-464-0708", customers.get(4569).getPhone());
	}

	@Test
	@DisplayName("Record 4570: Fax is 216-464-9676")
	void FaxOfRecord4570() {
		assertEquals("216-464-9676", customers.get(4569).getFax());
	}

	@Test
	@DisplayName("Record 4570: Email is consuelo@lagana.com")
	void EmailOfRecord4570() {
		assertEquals("consuelo@lagana.com", customers.get(4569).getEmail());
	}

	@Test
	@DisplayName("Record 4570: Web is http://www.consuelolagana.com")
	void WebOfRecord4570() {
		assertEquals("http://www.consuelolagana.com", customers.get(4569).getWeb());
	}
}
