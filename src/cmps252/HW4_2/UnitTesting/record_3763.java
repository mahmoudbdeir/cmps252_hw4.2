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

@Tag("35")
class Record_3763 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3763: FirstName is Percy")
	void FirstNameOfRecord3763() {
		assertEquals("Percy", customers.get(3762).getFirstName());
	}

	@Test
	@DisplayName("Record 3763: LastName is Mayville")
	void LastNameOfRecord3763() {
		assertEquals("Mayville", customers.get(3762).getLastName());
	}

	@Test
	@DisplayName("Record 3763: Company is Fox Cities Irrigation")
	void CompanyOfRecord3763() {
		assertEquals("Fox Cities Irrigation", customers.get(3762).getCompany());
	}

	@Test
	@DisplayName("Record 3763: Address is 4122 Curtis Ln")
	void AddressOfRecord3763() {
		assertEquals("4122 Curtis Ln", customers.get(3762).getAddress());
	}

	@Test
	@DisplayName("Record 3763: City is Shreveport")
	void CityOfRecord3763() {
		assertEquals("Shreveport", customers.get(3762).getCity());
	}

	@Test
	@DisplayName("Record 3763: County is Caddo")
	void CountyOfRecord3763() {
		assertEquals("Caddo", customers.get(3762).getCounty());
	}

	@Test
	@DisplayName("Record 3763: State is LA")
	void StateOfRecord3763() {
		assertEquals("LA", customers.get(3762).getState());
	}

	@Test
	@DisplayName("Record 3763: ZIP is 71109")
	void ZIPOfRecord3763() {
		assertEquals("71109", customers.get(3762).getZIP());
	}

	@Test
	@DisplayName("Record 3763: Phone is 318-636-1886")
	void PhoneOfRecord3763() {
		assertEquals("318-636-1886", customers.get(3762).getPhone());
	}

	@Test
	@DisplayName("Record 3763: Fax is 318-636-4614")
	void FaxOfRecord3763() {
		assertEquals("318-636-4614", customers.get(3762).getFax());
	}

	@Test
	@DisplayName("Record 3763: Email is percy@mayville.com")
	void EmailOfRecord3763() {
		assertEquals("percy@mayville.com", customers.get(3762).getEmail());
	}

	@Test
	@DisplayName("Record 3763: Web is http://www.percymayville.com")
	void WebOfRecord3763() {
		assertEquals("http://www.percymayville.com", customers.get(3762).getWeb());
	}
}
