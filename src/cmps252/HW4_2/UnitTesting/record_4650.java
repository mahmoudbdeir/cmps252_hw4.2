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

@Tag("19")
class Record_4650 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4650: FirstName is Julio")
	void FirstNameOfRecord4650() {
		assertEquals("Julio", customers.get(4649).getFirstName());
	}

	@Test
	@DisplayName("Record 4650: LastName is Hoyos")
	void LastNameOfRecord4650() {
		assertEquals("Hoyos", customers.get(4649).getLastName());
	}

	@Test
	@DisplayName("Record 4650: Company is Duncan, John Earl Esq")
	void CompanyOfRecord4650() {
		assertEquals("Duncan, John Earl Esq", customers.get(4649).getCompany());
	}

	@Test
	@DisplayName("Record 4650: Address is 8 Frontage Rd")
	void AddressOfRecord4650() {
		assertEquals("8 Frontage Rd", customers.get(4649).getAddress());
	}

	@Test
	@DisplayName("Record 4650: City is East Haven")
	void CityOfRecord4650() {
		assertEquals("East Haven", customers.get(4649).getCity());
	}

	@Test
	@DisplayName("Record 4650: County is New Haven")
	void CountyOfRecord4650() {
		assertEquals("New Haven", customers.get(4649).getCounty());
	}

	@Test
	@DisplayName("Record 4650: State is CT")
	void StateOfRecord4650() {
		assertEquals("CT", customers.get(4649).getState());
	}

	@Test
	@DisplayName("Record 4650: ZIP is 6512")
	void ZIPOfRecord4650() {
		assertEquals("6512", customers.get(4649).getZIP());
	}

	@Test
	@DisplayName("Record 4650: Phone is 203-468-4903")
	void PhoneOfRecord4650() {
		assertEquals("203-468-4903", customers.get(4649).getPhone());
	}

	@Test
	@DisplayName("Record 4650: Fax is 203-468-0918")
	void FaxOfRecord4650() {
		assertEquals("203-468-0918", customers.get(4649).getFax());
	}

	@Test
	@DisplayName("Record 4650: Email is julio@hoyos.com")
	void EmailOfRecord4650() {
		assertEquals("julio@hoyos.com", customers.get(4649).getEmail());
	}

	@Test
	@DisplayName("Record 4650: Web is http://www.juliohoyos.com")
	void WebOfRecord4650() {
		assertEquals("http://www.juliohoyos.com", customers.get(4649).getWeb());
	}
}
