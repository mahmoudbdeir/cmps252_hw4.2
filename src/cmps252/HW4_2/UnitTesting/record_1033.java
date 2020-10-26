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

@Tag("4")
class Record_1033 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1033: FirstName is Irma")
	void FirstNameOfRecord1033() {
		assertEquals("Irma", customers.get(1032).getFirstName());
	}

	@Test
	@DisplayName("Record 1033: LastName is Schwanbeck")
	void LastNameOfRecord1033() {
		assertEquals("Schwanbeck", customers.get(1032).getLastName());
	}

	@Test
	@DisplayName("Record 1033: Company is Gits Mfg Co")
	void CompanyOfRecord1033() {
		assertEquals("Gits Mfg Co", customers.get(1032).getCompany());
	}

	@Test
	@DisplayName("Record 1033: Address is 2376 American Ave")
	void AddressOfRecord1033() {
		assertEquals("2376 American Ave", customers.get(1032).getAddress());
	}

	@Test
	@DisplayName("Record 1033: City is Hayward")
	void CityOfRecord1033() {
		assertEquals("Hayward", customers.get(1032).getCity());
	}

	@Test
	@DisplayName("Record 1033: County is Alameda")
	void CountyOfRecord1033() {
		assertEquals("Alameda", customers.get(1032).getCounty());
	}

	@Test
	@DisplayName("Record 1033: State is CA")
	void StateOfRecord1033() {
		assertEquals("CA", customers.get(1032).getState());
	}

	@Test
	@DisplayName("Record 1033: ZIP is 94545")
	void ZIPOfRecord1033() {
		assertEquals("94545", customers.get(1032).getZIP());
	}

	@Test
	@DisplayName("Record 1033: Phone is 510-783-5945")
	void PhoneOfRecord1033() {
		assertEquals("510-783-5945", customers.get(1032).getPhone());
	}

	@Test
	@DisplayName("Record 1033: Fax is 510-783-5823")
	void FaxOfRecord1033() {
		assertEquals("510-783-5823", customers.get(1032).getFax());
	}

	@Test
	@DisplayName("Record 1033: Email is irma@schwanbeck.com")
	void EmailOfRecord1033() {
		assertEquals("irma@schwanbeck.com", customers.get(1032).getEmail());
	}

	@Test
	@DisplayName("Record 1033: Web is http://www.irmaschwanbeck.com")
	void WebOfRecord1033() {
		assertEquals("http://www.irmaschwanbeck.com", customers.get(1032).getWeb());
	}
}
