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

@Tag("0")
class Record_413 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 413: FirstName is Margot")
	void FirstNameOfRecord413() {
		assertEquals("Margot", customers.get(412).getFirstName());
	}

	@Test
	@DisplayName("Record 413: LastName is Leone")
	void LastNameOfRecord413() {
		assertEquals("Leone", customers.get(412).getLastName());
	}

	@Test
	@DisplayName("Record 413: Company is Lehman Brothers")
	void CompanyOfRecord413() {
		assertEquals("Lehman Brothers", customers.get(412).getCompany());
	}

	@Test
	@DisplayName("Record 413: Address is 2552 135th St")
	void AddressOfRecord413() {
		assertEquals("2552 135th St", customers.get(412).getAddress());
	}

	@Test
	@DisplayName("Record 413: City is Blue Island")
	void CityOfRecord413() {
		assertEquals("Blue Island", customers.get(412).getCity());
	}

	@Test
	@DisplayName("Record 413: County is Cook")
	void CountyOfRecord413() {
		assertEquals("Cook", customers.get(412).getCounty());
	}

	@Test
	@DisplayName("Record 413: State is IL")
	void StateOfRecord413() {
		assertEquals("IL", customers.get(412).getState());
	}

	@Test
	@DisplayName("Record 413: ZIP is 60406")
	void ZIPOfRecord413() {
		assertEquals("60406", customers.get(412).getZIP());
	}

	@Test
	@DisplayName("Record 413: Phone is 708-389-5346")
	void PhoneOfRecord413() {
		assertEquals("708-389-5346", customers.get(412).getPhone());
	}

	@Test
	@DisplayName("Record 413: Fax is 708-389-4682")
	void FaxOfRecord413() {
		assertEquals("708-389-4682", customers.get(412).getFax());
	}

	@Test
	@DisplayName("Record 413: Email is margot@leone.com")
	void EmailOfRecord413() {
		assertEquals("margot@leone.com", customers.get(412).getEmail());
	}

	@Test
	@DisplayName("Record 413: Web is http://www.margotleone.com")
	void WebOfRecord413() {
		assertEquals("http://www.margotleone.com", customers.get(412).getWeb());
	}
}
