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

@Tag("22")
class Record_1804 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1804: FirstName is Ofelia")
	void FirstNameOfRecord1804() {
		assertEquals("Ofelia", customers.get(1803).getFirstName());
	}

	@Test
	@DisplayName("Record 1804: LastName is Oree")
	void LastNameOfRecord1804() {
		assertEquals("Oree", customers.get(1803).getLastName());
	}

	@Test
	@DisplayName("Record 1804: Company is Copper Sales Inc")
	void CompanyOfRecord1804() {
		assertEquals("Copper Sales Inc", customers.get(1803).getCompany());
	}

	@Test
	@DisplayName("Record 1804: Address is 200 E Long Lake Rd  #-165")
	void AddressOfRecord1804() {
		assertEquals("200 E Long Lake Rd  #-165", customers.get(1803).getAddress());
	}

	@Test
	@DisplayName("Record 1804: City is Bloomfield Hills")
	void CityOfRecord1804() {
		assertEquals("Bloomfield Hills", customers.get(1803).getCity());
	}

	@Test
	@DisplayName("Record 1804: County is Oakland")
	void CountyOfRecord1804() {
		assertEquals("Oakland", customers.get(1803).getCounty());
	}

	@Test
	@DisplayName("Record 1804: State is MI")
	void StateOfRecord1804() {
		assertEquals("MI", customers.get(1803).getState());
	}

	@Test
	@DisplayName("Record 1804: ZIP is 48304")
	void ZIPOfRecord1804() {
		assertEquals("48304", customers.get(1803).getZIP());
	}

	@Test
	@DisplayName("Record 1804: Phone is 248-645-2886")
	void PhoneOfRecord1804() {
		assertEquals("248-645-2886", customers.get(1803).getPhone());
	}

	@Test
	@DisplayName("Record 1804: Fax is 248-645-1064")
	void FaxOfRecord1804() {
		assertEquals("248-645-1064", customers.get(1803).getFax());
	}

	@Test
	@DisplayName("Record 1804: Email is ofelia@oree.com")
	void EmailOfRecord1804() {
		assertEquals("ofelia@oree.com", customers.get(1803).getEmail());
	}

	@Test
	@DisplayName("Record 1804: Web is http://www.ofeliaoree.com")
	void WebOfRecord1804() {
		assertEquals("http://www.ofeliaoree.com", customers.get(1803).getWeb());
	}
}
