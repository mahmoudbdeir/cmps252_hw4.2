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
class Record_3969 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3969: FirstName is Sonny")
	void FirstNameOfRecord3969() {
		assertEquals("Sonny", customers.get(3968).getFirstName());
	}

	@Test
	@DisplayName("Record 3969: LastName is Angeloni")
	void LastNameOfRecord3969() {
		assertEquals("Angeloni", customers.get(3968).getLastName());
	}

	@Test
	@DisplayName("Record 3969: Company is Pip Printing Of Riverside")
	void CompanyOfRecord3969() {
		assertEquals("Pip Printing Of Riverside", customers.get(3968).getCompany());
	}

	@Test
	@DisplayName("Record 3969: Address is 2901 N Central Ave  #-1150")
	void AddressOfRecord3969() {
		assertEquals("2901 N Central Ave  #-1150", customers.get(3968).getAddress());
	}

	@Test
	@DisplayName("Record 3969: City is Phoenix")
	void CityOfRecord3969() {
		assertEquals("Phoenix", customers.get(3968).getCity());
	}

	@Test
	@DisplayName("Record 3969: County is Maricopa")
	void CountyOfRecord3969() {
		assertEquals("Maricopa", customers.get(3968).getCounty());
	}

	@Test
	@DisplayName("Record 3969: State is AZ")
	void StateOfRecord3969() {
		assertEquals("AZ", customers.get(3968).getState());
	}

	@Test
	@DisplayName("Record 3969: ZIP is 85012")
	void ZIPOfRecord3969() {
		assertEquals("85012", customers.get(3968).getZIP());
	}

	@Test
	@DisplayName("Record 3969: Phone is 602-279-5821")
	void PhoneOfRecord3969() {
		assertEquals("602-279-5821", customers.get(3968).getPhone());
	}

	@Test
	@DisplayName("Record 3969: Fax is 602-279-7585")
	void FaxOfRecord3969() {
		assertEquals("602-279-7585", customers.get(3968).getFax());
	}

	@Test
	@DisplayName("Record 3969: Email is sonny@angeloni.com")
	void EmailOfRecord3969() {
		assertEquals("sonny@angeloni.com", customers.get(3968).getEmail());
	}

	@Test
	@DisplayName("Record 3969: Web is http://www.sonnyangeloni.com")
	void WebOfRecord3969() {
		assertEquals("http://www.sonnyangeloni.com", customers.get(3968).getWeb());
	}
}
