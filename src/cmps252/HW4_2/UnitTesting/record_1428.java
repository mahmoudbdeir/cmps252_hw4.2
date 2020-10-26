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

@Tag("18")
class Record_1428 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1428: FirstName is Graig")
	void FirstNameOfRecord1428() {
		assertEquals("Graig", customers.get(1427).getFirstName());
	}

	@Test
	@DisplayName("Record 1428: LastName is Rapley")
	void LastNameOfRecord1428() {
		assertEquals("Rapley", customers.get(1427).getLastName());
	}

	@Test
	@DisplayName("Record 1428: Company is Neumeyer, Susan L Esq")
	void CompanyOfRecord1428() {
		assertEquals("Neumeyer, Susan L Esq", customers.get(1427).getCompany());
	}

	@Test
	@DisplayName("Record 1428: Address is 315 W 57th St")
	void AddressOfRecord1428() {
		assertEquals("315 W 57th St", customers.get(1427).getAddress());
	}

	@Test
	@DisplayName("Record 1428: City is New York")
	void CityOfRecord1428() {
		assertEquals("New York", customers.get(1427).getCity());
	}

	@Test
	@DisplayName("Record 1428: County is New York")
	void CountyOfRecord1428() {
		assertEquals("New York", customers.get(1427).getCounty());
	}

	@Test
	@DisplayName("Record 1428: State is NY")
	void StateOfRecord1428() {
		assertEquals("NY", customers.get(1427).getState());
	}

	@Test
	@DisplayName("Record 1428: ZIP is 10019")
	void ZIPOfRecord1428() {
		assertEquals("10019", customers.get(1427).getZIP());
	}

	@Test
	@DisplayName("Record 1428: Phone is 212-333-7155")
	void PhoneOfRecord1428() {
		assertEquals("212-333-7155", customers.get(1427).getPhone());
	}

	@Test
	@DisplayName("Record 1428: Fax is 212-333-7422")
	void FaxOfRecord1428() {
		assertEquals("212-333-7422", customers.get(1427).getFax());
	}

	@Test
	@DisplayName("Record 1428: Email is graig@rapley.com")
	void EmailOfRecord1428() {
		assertEquals("graig@rapley.com", customers.get(1427).getEmail());
	}

	@Test
	@DisplayName("Record 1428: Web is http://www.graigrapley.com")
	void WebOfRecord1428() {
		assertEquals("http://www.graigrapley.com", customers.get(1427).getWeb());
	}
}
