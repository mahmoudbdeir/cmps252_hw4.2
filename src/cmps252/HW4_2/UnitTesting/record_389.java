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

@Tag("44")
class Record_389 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 389: FirstName is Suzanne")
	void FirstNameOfRecord389() {
		assertEquals("Suzanne", customers.get(388).getFirstName());
	}

	@Test
	@DisplayName("Record 389: LastName is Golen")
	void LastNameOfRecord389() {
		assertEquals("Golen", customers.get(388).getLastName());
	}

	@Test
	@DisplayName("Record 389: Company is Berger, Stephen W Esq")
	void CompanyOfRecord389() {
		assertEquals("Berger, Stephen W Esq", customers.get(388).getCompany());
	}

	@Test
	@DisplayName("Record 389: Address is 14200 E 10mile Rd")
	void AddressOfRecord389() {
		assertEquals("14200 E 10mile Rd", customers.get(388).getAddress());
	}

	@Test
	@DisplayName("Record 389: City is Warren")
	void CityOfRecord389() {
		assertEquals("Warren", customers.get(388).getCity());
	}

	@Test
	@DisplayName("Record 389: County is Macomb")
	void CountyOfRecord389() {
		assertEquals("Macomb", customers.get(388).getCounty());
	}

	@Test
	@DisplayName("Record 389: State is MI")
	void StateOfRecord389() {
		assertEquals("MI", customers.get(388).getState());
	}

	@Test
	@DisplayName("Record 389: ZIP is 48089")
	void ZIPOfRecord389() {
		assertEquals("48089", customers.get(388).getZIP());
	}

	@Test
	@DisplayName("Record 389: Phone is 586-773-8508")
	void PhoneOfRecord389() {
		assertEquals("586-773-8508", customers.get(388).getPhone());
	}

	@Test
	@DisplayName("Record 389: Fax is 586-773-4354")
	void FaxOfRecord389() {
		assertEquals("586-773-4354", customers.get(388).getFax());
	}

	@Test
	@DisplayName("Record 389: Email is suzanne@golen.com")
	void EmailOfRecord389() {
		assertEquals("suzanne@golen.com", customers.get(388).getEmail());
	}

	@Test
	@DisplayName("Record 389: Web is http://www.suzannegolen.com")
	void WebOfRecord389() {
		assertEquals("http://www.suzannegolen.com", customers.get(388).getWeb());
	}
}
