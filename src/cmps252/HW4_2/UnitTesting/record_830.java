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

@Tag("4")
class Record_830 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 830: FirstName is Hollis")
	void FirstNameOfRecord830() {
		assertEquals("Hollis", customers.get(829).getFirstName());
	}

	@Test
	@DisplayName("Record 830: LastName is Moberley")
	void LastNameOfRecord830() {
		assertEquals("Moberley", customers.get(829).getLastName());
	}

	@Test
	@DisplayName("Record 830: Company is International Marine Mfg Corp")
	void CompanyOfRecord830() {
		assertEquals("International Marine Mfg Corp", customers.get(829).getCompany());
	}

	@Test
	@DisplayName("Record 830: Address is 3125 S State St")
	void AddressOfRecord830() {
		assertEquals("3125 S State St", customers.get(829).getAddress());
	}

	@Test
	@DisplayName("Record 830: City is Salt Lake City")
	void CityOfRecord830() {
		assertEquals("Salt Lake City", customers.get(829).getCity());
	}

	@Test
	@DisplayName("Record 830: County is Salt Lake")
	void CountyOfRecord830() {
		assertEquals("Salt Lake", customers.get(829).getCounty());
	}

	@Test
	@DisplayName("Record 830: State is UT")
	void StateOfRecord830() {
		assertEquals("UT", customers.get(829).getState());
	}

	@Test
	@DisplayName("Record 830: ZIP is 84115")
	void ZIPOfRecord830() {
		assertEquals("84115", customers.get(829).getZIP());
	}

	@Test
	@DisplayName("Record 830: Phone is 801-467-6156")
	void PhoneOfRecord830() {
		assertEquals("801-467-6156", customers.get(829).getPhone());
	}

	@Test
	@DisplayName("Record 830: Fax is 801-467-2815")
	void FaxOfRecord830() {
		assertEquals("801-467-2815", customers.get(829).getFax());
	}

	@Test
	@DisplayName("Record 830: Email is hollis@moberley.com")
	void EmailOfRecord830() {
		assertEquals("hollis@moberley.com", customers.get(829).getEmail());
	}

	@Test
	@DisplayName("Record 830: Web is http://www.hollismoberley.com")
	void WebOfRecord830() {
		assertEquals("http://www.hollismoberley.com", customers.get(829).getWeb());
	}
}
