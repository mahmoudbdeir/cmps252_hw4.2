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

@Tag("32")
class Record_3513 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3513: FirstName is Vincent")
	void FirstNameOfRecord3513() {
		assertEquals("Vincent", customers.get(3512).getFirstName());
	}

	@Test
	@DisplayName("Record 3513: LastName is Ruths")
	void LastNameOfRecord3513() {
		assertEquals("Ruths", customers.get(3512).getLastName());
	}

	@Test
	@DisplayName("Record 3513: Company is Gasser & Sons Inc")
	void CompanyOfRecord3513() {
		assertEquals("Gasser & Sons Inc", customers.get(3512).getCompany());
	}

	@Test
	@DisplayName("Record 3513: Address is 1 Lower Ragsdale Dr")
	void AddressOfRecord3513() {
		assertEquals("1 Lower Ragsdale Dr", customers.get(3512).getAddress());
	}

	@Test
	@DisplayName("Record 3513: City is Monterey")
	void CityOfRecord3513() {
		assertEquals("Monterey", customers.get(3512).getCity());
	}

	@Test
	@DisplayName("Record 3513: County is Monterey")
	void CountyOfRecord3513() {
		assertEquals("Monterey", customers.get(3512).getCounty());
	}

	@Test
	@DisplayName("Record 3513: State is CA")
	void StateOfRecord3513() {
		assertEquals("CA", customers.get(3512).getState());
	}

	@Test
	@DisplayName("Record 3513: ZIP is 93940")
	void ZIPOfRecord3513() {
		assertEquals("93940", customers.get(3512).getZIP());
	}

	@Test
	@DisplayName("Record 3513: Phone is 831-649-9494")
	void PhoneOfRecord3513() {
		assertEquals("831-649-9494", customers.get(3512).getPhone());
	}

	@Test
	@DisplayName("Record 3513: Fax is 831-649-6783")
	void FaxOfRecord3513() {
		assertEquals("831-649-6783", customers.get(3512).getFax());
	}

	@Test
	@DisplayName("Record 3513: Email is vincent@ruths.com")
	void EmailOfRecord3513() {
		assertEquals("vincent@ruths.com", customers.get(3512).getEmail());
	}

	@Test
	@DisplayName("Record 3513: Web is http://www.vincentruths.com")
	void WebOfRecord3513() {
		assertEquals("http://www.vincentruths.com", customers.get(3512).getWeb());
	}
}
