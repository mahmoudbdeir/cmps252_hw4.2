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

@Tag("41")
class Record_3669 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3669: FirstName is Chase")
	void FirstNameOfRecord3669() {
		assertEquals("Chase", customers.get(3668).getFirstName());
	}

	@Test
	@DisplayName("Record 3669: LastName is Metsger")
	void LastNameOfRecord3669() {
		assertEquals("Metsger", customers.get(3668).getLastName());
	}

	@Test
	@DisplayName("Record 3669: Company is Moundsville Flower Shop")
	void CompanyOfRecord3669() {
		assertEquals("Moundsville Flower Shop", customers.get(3668).getCompany());
	}

	@Test
	@DisplayName("Record 3669: Address is 3099 S 300 W")
	void AddressOfRecord3669() {
		assertEquals("3099 S 300 W", customers.get(3668).getAddress());
	}

	@Test
	@DisplayName("Record 3669: City is Salt Lake City")
	void CityOfRecord3669() {
		assertEquals("Salt Lake City", customers.get(3668).getCity());
	}

	@Test
	@DisplayName("Record 3669: County is Salt Lake")
	void CountyOfRecord3669() {
		assertEquals("Salt Lake", customers.get(3668).getCounty());
	}

	@Test
	@DisplayName("Record 3669: State is UT")
	void StateOfRecord3669() {
		assertEquals("UT", customers.get(3668).getState());
	}

	@Test
	@DisplayName("Record 3669: ZIP is 84115")
	void ZIPOfRecord3669() {
		assertEquals("84115", customers.get(3668).getZIP());
	}

	@Test
	@DisplayName("Record 3669: Phone is 801-466-6001")
	void PhoneOfRecord3669() {
		assertEquals("801-466-6001", customers.get(3668).getPhone());
	}

	@Test
	@DisplayName("Record 3669: Fax is 801-466-1417")
	void FaxOfRecord3669() {
		assertEquals("801-466-1417", customers.get(3668).getFax());
	}

	@Test
	@DisplayName("Record 3669: Email is chase@metsger.com")
	void EmailOfRecord3669() {
		assertEquals("chase@metsger.com", customers.get(3668).getEmail());
	}

	@Test
	@DisplayName("Record 3669: Web is http://www.chasemetsger.com")
	void WebOfRecord3669() {
		assertEquals("http://www.chasemetsger.com", customers.get(3668).getWeb());
	}
}
