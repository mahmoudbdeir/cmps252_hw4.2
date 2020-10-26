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

@Tag("30")
class Record_515 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 515: FirstName is Marsha")
	void FirstNameOfRecord515() {
		assertEquals("Marsha", customers.get(514).getFirstName());
	}

	@Test
	@DisplayName("Record 515: LastName is Bartleson")
	void LastNameOfRecord515() {
		assertEquals("Bartleson", customers.get(514).getLastName());
	}

	@Test
	@DisplayName("Record 515: Company is Allen Hinckley & Snyder")
	void CompanyOfRecord515() {
		assertEquals("Allen Hinckley & Snyder", customers.get(514).getCompany());
	}

	@Test
	@DisplayName("Record 515: Address is 200 Hillsdale Ave")
	void AddressOfRecord515() {
		assertEquals("200 Hillsdale Ave", customers.get(514).getAddress());
	}

	@Test
	@DisplayName("Record 515: City is San Jose")
	void CityOfRecord515() {
		assertEquals("San Jose", customers.get(514).getCity());
	}

	@Test
	@DisplayName("Record 515: County is Santa Clara")
	void CountyOfRecord515() {
		assertEquals("Santa Clara", customers.get(514).getCounty());
	}

	@Test
	@DisplayName("Record 515: State is CA")
	void StateOfRecord515() {
		assertEquals("CA", customers.get(514).getState());
	}

	@Test
	@DisplayName("Record 515: ZIP is 95136")
	void ZIPOfRecord515() {
		assertEquals("95136", customers.get(514).getZIP());
	}

	@Test
	@DisplayName("Record 515: Phone is 408-227-1136")
	void PhoneOfRecord515() {
		assertEquals("408-227-1136", customers.get(514).getPhone());
	}

	@Test
	@DisplayName("Record 515: Fax is 408-227-0091")
	void FaxOfRecord515() {
		assertEquals("408-227-0091", customers.get(514).getFax());
	}

	@Test
	@DisplayName("Record 515: Email is marsha@bartleson.com")
	void EmailOfRecord515() {
		assertEquals("marsha@bartleson.com", customers.get(514).getEmail());
	}

	@Test
	@DisplayName("Record 515: Web is http://www.marshabartleson.com")
	void WebOfRecord515() {
		assertEquals("http://www.marshabartleson.com", customers.get(514).getWeb());
	}
}
