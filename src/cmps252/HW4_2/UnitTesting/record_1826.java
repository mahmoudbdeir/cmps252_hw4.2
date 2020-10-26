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
class Record_1826 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1826: FirstName is Hollis")
	void FirstNameOfRecord1826() {
		assertEquals("Hollis", customers.get(1825).getFirstName());
	}

	@Test
	@DisplayName("Record 1826: LastName is Depena")
	void LastNameOfRecord1826() {
		assertEquals("Depena", customers.get(1825).getLastName());
	}

	@Test
	@DisplayName("Record 1826: Company is Advantage Project Services")
	void CompanyOfRecord1826() {
		assertEquals("Advantage Project Services", customers.get(1825).getCompany());
	}

	@Test
	@DisplayName("Record 1826: Address is 2150 Eldo Rd")
	void AddressOfRecord1826() {
		assertEquals("2150 Eldo Rd", customers.get(1825).getAddress());
	}

	@Test
	@DisplayName("Record 1826: City is Monroeville")
	void CityOfRecord1826() {
		assertEquals("Monroeville", customers.get(1825).getCity());
	}

	@Test
	@DisplayName("Record 1826: County is Allegheny")
	void CountyOfRecord1826() {
		assertEquals("Allegheny", customers.get(1825).getCounty());
	}

	@Test
	@DisplayName("Record 1826: State is PA")
	void StateOfRecord1826() {
		assertEquals("PA", customers.get(1825).getState());
	}

	@Test
	@DisplayName("Record 1826: ZIP is 15146")
	void ZIPOfRecord1826() {
		assertEquals("15146", customers.get(1825).getZIP());
	}

	@Test
	@DisplayName("Record 1826: Phone is 412-372-6241")
	void PhoneOfRecord1826() {
		assertEquals("412-372-6241", customers.get(1825).getPhone());
	}

	@Test
	@DisplayName("Record 1826: Fax is 412-372-9428")
	void FaxOfRecord1826() {
		assertEquals("412-372-9428", customers.get(1825).getFax());
	}

	@Test
	@DisplayName("Record 1826: Email is hollis@depena.com")
	void EmailOfRecord1826() {
		assertEquals("hollis@depena.com", customers.get(1825).getEmail());
	}

	@Test
	@DisplayName("Record 1826: Web is http://www.hollisdepena.com")
	void WebOfRecord1826() {
		assertEquals("http://www.hollisdepena.com", customers.get(1825).getWeb());
	}
}
