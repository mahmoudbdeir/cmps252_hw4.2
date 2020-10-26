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

@Tag("28")
class Record_3083 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3083: FirstName is Benny")
	void FirstNameOfRecord3083() {
		assertEquals("Benny", customers.get(3082).getFirstName());
	}

	@Test
	@DisplayName("Record 3083: LastName is Dollins")
	void LastNameOfRecord3083() {
		assertEquals("Dollins", customers.get(3082).getLastName());
	}

	@Test
	@DisplayName("Record 3083: Company is Blossom House")
	void CompanyOfRecord3083() {
		assertEquals("Blossom House", customers.get(3082).getCompany());
	}

	@Test
	@DisplayName("Record 3083: Address is 610 Us Highway 41")
	void AddressOfRecord3083() {
		assertEquals("610 Us Highway 41", customers.get(3082).getAddress());
	}

	@Test
	@DisplayName("Record 3083: City is Schererville")
	void CityOfRecord3083() {
		assertEquals("Schererville", customers.get(3082).getCity());
	}

	@Test
	@DisplayName("Record 3083: County is Lake")
	void CountyOfRecord3083() {
		assertEquals("Lake", customers.get(3082).getCounty());
	}

	@Test
	@DisplayName("Record 3083: State is IN")
	void StateOfRecord3083() {
		assertEquals("IN", customers.get(3082).getState());
	}

	@Test
	@DisplayName("Record 3083: ZIP is 46375")
	void ZIPOfRecord3083() {
		assertEquals("46375", customers.get(3082).getZIP());
	}

	@Test
	@DisplayName("Record 3083: Phone is 219-865-4482")
	void PhoneOfRecord3083() {
		assertEquals("219-865-4482", customers.get(3082).getPhone());
	}

	@Test
	@DisplayName("Record 3083: Fax is 219-865-6789")
	void FaxOfRecord3083() {
		assertEquals("219-865-6789", customers.get(3082).getFax());
	}

	@Test
	@DisplayName("Record 3083: Email is benny@dollins.com")
	void EmailOfRecord3083() {
		assertEquals("benny@dollins.com", customers.get(3082).getEmail());
	}

	@Test
	@DisplayName("Record 3083: Web is http://www.bennydollins.com")
	void WebOfRecord3083() {
		assertEquals("http://www.bennydollins.com", customers.get(3082).getWeb());
	}
}
