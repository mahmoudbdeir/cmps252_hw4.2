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

@Tag("26")
class Record_950 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 950: FirstName is Arlene")
	void FirstNameOfRecord950() {
		assertEquals("Arlene", customers.get(949).getFirstName());
	}

	@Test
	@DisplayName("Record 950: LastName is Pressel")
	void LastNameOfRecord950() {
		assertEquals("Pressel", customers.get(949).getLastName());
	}

	@Test
	@DisplayName("Record 950: Company is Scolding Locks Corp")
	void CompanyOfRecord950() {
		assertEquals("Scolding Locks Corp", customers.get(949).getCompany());
	}

	@Test
	@DisplayName("Record 950: Address is Conway Rd")
	void AddressOfRecord950() {
		assertEquals("Conway Rd", customers.get(949).getAddress());
	}

	@Test
	@DisplayName("Record 950: City is Orlando")
	void CityOfRecord950() {
		assertEquals("Orlando", customers.get(949).getCity());
	}

	@Test
	@DisplayName("Record 950: County is Orange")
	void CountyOfRecord950() {
		assertEquals("Orange", customers.get(949).getCounty());
	}

	@Test
	@DisplayName("Record 950: State is FL")
	void StateOfRecord950() {
		assertEquals("FL", customers.get(949).getState());
	}

	@Test
	@DisplayName("Record 950: ZIP is 32812")
	void ZIPOfRecord950() {
		assertEquals("32812", customers.get(949).getZIP());
	}

	@Test
	@DisplayName("Record 950: Phone is 407-843-7313")
	void PhoneOfRecord950() {
		assertEquals("407-843-7313", customers.get(949).getPhone());
	}

	@Test
	@DisplayName("Record 950: Fax is 407-843-1743")
	void FaxOfRecord950() {
		assertEquals("407-843-1743", customers.get(949).getFax());
	}

	@Test
	@DisplayName("Record 950: Email is arlene@pressel.com")
	void EmailOfRecord950() {
		assertEquals("arlene@pressel.com", customers.get(949).getEmail());
	}

	@Test
	@DisplayName("Record 950: Web is http://www.arlenepressel.com")
	void WebOfRecord950() {
		assertEquals("http://www.arlenepressel.com", customers.get(949).getWeb());
	}
}
