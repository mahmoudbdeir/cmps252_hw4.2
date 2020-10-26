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
class Record_802 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 802: FirstName is Jared")
	void FirstNameOfRecord802() {
		assertEquals("Jared", customers.get(801).getFirstName());
	}

	@Test
	@DisplayName("Record 802: LastName is Penhall")
	void LastNameOfRecord802() {
		assertEquals("Penhall", customers.get(801).getLastName());
	}

	@Test
	@DisplayName("Record 802: Company is Nelson, Guy C Esq")
	void CompanyOfRecord802() {
		assertEquals("Nelson, Guy C Esq", customers.get(801).getCompany());
	}

	@Test
	@DisplayName("Record 802: Address is 1865 S Main St")
	void AddressOfRecord802() {
		assertEquals("1865 S Main St", customers.get(801).getAddress());
	}

	@Test
	@DisplayName("Record 802: City is Salt Lake City")
	void CityOfRecord802() {
		assertEquals("Salt Lake City", customers.get(801).getCity());
	}

	@Test
	@DisplayName("Record 802: County is Salt Lake")
	void CountyOfRecord802() {
		assertEquals("Salt Lake", customers.get(801).getCounty());
	}

	@Test
	@DisplayName("Record 802: State is UT")
	void StateOfRecord802() {
		assertEquals("UT", customers.get(801).getState());
	}

	@Test
	@DisplayName("Record 802: ZIP is 84115")
	void ZIPOfRecord802() {
		assertEquals("84115", customers.get(801).getZIP());
	}

	@Test
	@DisplayName("Record 802: Phone is 801-466-7635")
	void PhoneOfRecord802() {
		assertEquals("801-466-7635", customers.get(801).getPhone());
	}

	@Test
	@DisplayName("Record 802: Fax is 801-466-5249")
	void FaxOfRecord802() {
		assertEquals("801-466-5249", customers.get(801).getFax());
	}

	@Test
	@DisplayName("Record 802: Email is jared@penhall.com")
	void EmailOfRecord802() {
		assertEquals("jared@penhall.com", customers.get(801).getEmail());
	}

	@Test
	@DisplayName("Record 802: Web is http://www.jaredpenhall.com")
	void WebOfRecord802() {
		assertEquals("http://www.jaredpenhall.com", customers.get(801).getWeb());
	}
}
