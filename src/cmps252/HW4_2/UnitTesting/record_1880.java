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
class Record_1880 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1880: FirstName is Kellie")
	void FirstNameOfRecord1880() {
		assertEquals("Kellie", customers.get(1879).getFirstName());
	}

	@Test
	@DisplayName("Record 1880: LastName is Spoth")
	void LastNameOfRecord1880() {
		assertEquals("Spoth", customers.get(1879).getLastName());
	}

	@Test
	@DisplayName("Record 1880: Company is Cannon, Douglas B Esq")
	void CompanyOfRecord1880() {
		assertEquals("Cannon, Douglas B Esq", customers.get(1879).getCompany());
	}

	@Test
	@DisplayName("Record 1880: Address is Llewellyn Ave")
	void AddressOfRecord1880() {
		assertEquals("Llewellyn Ave", customers.get(1879).getAddress());
	}

	@Test
	@DisplayName("Record 1880: City is Richland")
	void CityOfRecord1880() {
		assertEquals("Richland", customers.get(1879).getCity());
	}

	@Test
	@DisplayName("Record 1880: County is Atlantic")
	void CountyOfRecord1880() {
		assertEquals("Atlantic", customers.get(1879).getCounty());
	}

	@Test
	@DisplayName("Record 1880: State is NJ")
	void StateOfRecord1880() {
		assertEquals("NJ", customers.get(1879).getState());
	}

	@Test
	@DisplayName("Record 1880: ZIP is 8350")
	void ZIPOfRecord1880() {
		assertEquals("8350", customers.get(1879).getZIP());
	}

	@Test
	@DisplayName("Record 1880: Phone is 609-697-3831")
	void PhoneOfRecord1880() {
		assertEquals("609-697-3831", customers.get(1879).getPhone());
	}

	@Test
	@DisplayName("Record 1880: Fax is 609-697-8634")
	void FaxOfRecord1880() {
		assertEquals("609-697-8634", customers.get(1879).getFax());
	}

	@Test
	@DisplayName("Record 1880: Email is kellie@spoth.com")
	void EmailOfRecord1880() {
		assertEquals("kellie@spoth.com", customers.get(1879).getEmail());
	}

	@Test
	@DisplayName("Record 1880: Web is http://www.kelliespoth.com")
	void WebOfRecord1880() {
		assertEquals("http://www.kelliespoth.com", customers.get(1879).getWeb());
	}
}
