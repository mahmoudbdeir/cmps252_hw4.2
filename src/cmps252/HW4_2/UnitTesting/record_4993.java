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

@Tag("33")
class Record_4993 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4993: FirstName is Norris")
	void FirstNameOfRecord4993() {
		assertEquals("Norris", customers.get(4992).getFirstName());
	}

	@Test
	@DisplayName("Record 4993: LastName is Cyganiewicz")
	void LastNameOfRecord4993() {
		assertEquals("Cyganiewicz", customers.get(4992).getLastName());
	}

	@Test
	@DisplayName("Record 4993: Company is Diaz, Kimberly Ward Esq")
	void CompanyOfRecord4993() {
		assertEquals("Diaz, Kimberly Ward Esq", customers.get(4992).getCompany());
	}

	@Test
	@DisplayName("Record 4993: Address is Box #-326")
	void AddressOfRecord4993() {
		assertEquals("Box #-326", customers.get(4992).getAddress());
	}

	@Test
	@DisplayName("Record 4993: City is Califon")
	void CityOfRecord4993() {
		assertEquals("Califon", customers.get(4992).getCity());
	}

	@Test
	@DisplayName("Record 4993: County is Hunterdon")
	void CountyOfRecord4993() {
		assertEquals("Hunterdon", customers.get(4992).getCounty());
	}

	@Test
	@DisplayName("Record 4993: State is NJ")
	void StateOfRecord4993() {
		assertEquals("NJ", customers.get(4992).getState());
	}

	@Test
	@DisplayName("Record 4993: ZIP is 7830")
	void ZIPOfRecord4993() {
		assertEquals("7830", customers.get(4992).getZIP());
	}

	@Test
	@DisplayName("Record 4993: Phone is 908-832-5405")
	void PhoneOfRecord4993() {
		assertEquals("908-832-5405", customers.get(4992).getPhone());
	}

	@Test
	@DisplayName("Record 4993: Fax is 908-832-4199")
	void FaxOfRecord4993() {
		assertEquals("908-832-4199", customers.get(4992).getFax());
	}

	@Test
	@DisplayName("Record 4993: Email is norris@cyganiewicz.com")
	void EmailOfRecord4993() {
		assertEquals("norris@cyganiewicz.com", customers.get(4992).getEmail());
	}

	@Test
	@DisplayName("Record 4993: Web is http://www.norriscyganiewicz.com")
	void WebOfRecord4993() {
		assertEquals("http://www.norriscyganiewicz.com", customers.get(4992).getWeb());
	}
}
