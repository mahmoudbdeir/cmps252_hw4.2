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

@Tag("48")
class Record_1591 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1591: FirstName is Elaine")
	void FirstNameOfRecord1591() {
		assertEquals("Elaine", customers.get(1590).getFirstName());
	}

	@Test
	@DisplayName("Record 1591: LastName is Sygel")
	void LastNameOfRecord1591() {
		assertEquals("Sygel", customers.get(1590).getLastName());
	}

	@Test
	@DisplayName("Record 1591: Company is Winchester Ortho Assocs Ltd")
	void CompanyOfRecord1591() {
		assertEquals("Winchester Ortho Assocs Ltd", customers.get(1590).getCompany());
	}

	@Test
	@DisplayName("Record 1591: Address is 10 W 47th St")
	void AddressOfRecord1591() {
		assertEquals("10 W 47th St", customers.get(1590).getAddress());
	}

	@Test
	@DisplayName("Record 1591: City is New York")
	void CityOfRecord1591() {
		assertEquals("New York", customers.get(1590).getCity());
	}

	@Test
	@DisplayName("Record 1591: County is New York")
	void CountyOfRecord1591() {
		assertEquals("New York", customers.get(1590).getCounty());
	}

	@Test
	@DisplayName("Record 1591: State is NY")
	void StateOfRecord1591() {
		assertEquals("NY", customers.get(1590).getState());
	}

	@Test
	@DisplayName("Record 1591: ZIP is 10036")
	void ZIPOfRecord1591() {
		assertEquals("10036", customers.get(1590).getZIP());
	}

	@Test
	@DisplayName("Record 1591: Phone is 212-869-4668")
	void PhoneOfRecord1591() {
		assertEquals("212-869-4668", customers.get(1590).getPhone());
	}

	@Test
	@DisplayName("Record 1591: Fax is 212-869-9463")
	void FaxOfRecord1591() {
		assertEquals("212-869-9463", customers.get(1590).getFax());
	}

	@Test
	@DisplayName("Record 1591: Email is elaine@sygel.com")
	void EmailOfRecord1591() {
		assertEquals("elaine@sygel.com", customers.get(1590).getEmail());
	}

	@Test
	@DisplayName("Record 1591: Web is http://www.elainesygel.com")
	void WebOfRecord1591() {
		assertEquals("http://www.elainesygel.com", customers.get(1590).getWeb());
	}
}
