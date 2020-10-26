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

@Tag("39")
class Record_73 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 73: FirstName is Gayle")
	void FirstNameOfRecord73() {
		assertEquals("Gayle", customers.get(72).getFirstName());
	}

	@Test
	@DisplayName("Record 73: LastName is Benes")
	void LastNameOfRecord73() {
		assertEquals("Benes", customers.get(72).getLastName());
	}

	@Test
	@DisplayName("Record 73: Company is Mln Automated Systems")
	void CompanyOfRecord73() {
		assertEquals("Mln Automated Systems", customers.get(72).getCompany());
	}

	@Test
	@DisplayName("Record 73: Address is 11660 Alpharetta Hwy")
	void AddressOfRecord73() {
		assertEquals("11660 Alpharetta Hwy", customers.get(72).getAddress());
	}

	@Test
	@DisplayName("Record 73: City is Roswell")
	void CityOfRecord73() {
		assertEquals("Roswell", customers.get(72).getCity());
	}

	@Test
	@DisplayName("Record 73: County is Fulton")
	void CountyOfRecord73() {
		assertEquals("Fulton", customers.get(72).getCounty());
	}

	@Test
	@DisplayName("Record 73: State is GA")
	void StateOfRecord73() {
		assertEquals("GA", customers.get(72).getState());
	}

	@Test
	@DisplayName("Record 73: ZIP is 30076")
	void ZIPOfRecord73() {
		assertEquals("30076", customers.get(72).getZIP());
	}

	@Test
	@DisplayName("Record 73: Phone is 770-838-5504")
	void PhoneOfRecord73() {
		assertEquals("770-838-5504", customers.get(72).getPhone());
	}

	@Test
	@DisplayName("Record 73: Fax is 770-838-0427")
	void FaxOfRecord73() {
		assertEquals("770-838-0427", customers.get(72).getFax());
	}

	@Test
	@DisplayName("Record 73: Email is gayle@benes.com")
	void EmailOfRecord73() {
		assertEquals("gayle@benes.com", customers.get(72).getEmail());
	}

	@Test
	@DisplayName("Record 73: Web is http://www.gaylebenes.com")
	void WebOfRecord73() {
		assertEquals("http://www.gaylebenes.com", customers.get(72).getWeb());
	}
}
