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

@Tag("27")
class Record_522 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 522: FirstName is Chas")
	void FirstNameOfRecord522() {
		assertEquals("Chas", customers.get(521).getFirstName());
	}

	@Test
	@DisplayName("Record 522: LastName is Sebo")
	void LastNameOfRecord522() {
		assertEquals("Sebo", customers.get(521).getLastName());
	}

	@Test
	@DisplayName("Record 522: Company is Greyhound Bus Lines")
	void CompanyOfRecord522() {
		assertEquals("Greyhound Bus Lines", customers.get(521).getCompany());
	}

	@Test
	@DisplayName("Record 522: Address is 25530 Stanford Aven  #-20")
	void AddressOfRecord522() {
		assertEquals("25530 Stanford Aven  #-20", customers.get(521).getAddress());
	}

	@Test
	@DisplayName("Record 522: City is Valencia")
	void CityOfRecord522() {
		assertEquals("Valencia", customers.get(521).getCity());
	}

	@Test
	@DisplayName("Record 522: County is Los Angeles")
	void CountyOfRecord522() {
		assertEquals("Los Angeles", customers.get(521).getCounty());
	}

	@Test
	@DisplayName("Record 522: State is CA")
	void StateOfRecord522() {
		assertEquals("CA", customers.get(521).getState());
	}

	@Test
	@DisplayName("Record 522: ZIP is 91355")
	void ZIPOfRecord522() {
		assertEquals("91355", customers.get(521).getZIP());
	}

	@Test
	@DisplayName("Record 522: Phone is 661-257-7654")
	void PhoneOfRecord522() {
		assertEquals("661-257-7654", customers.get(521).getPhone());
	}

	@Test
	@DisplayName("Record 522: Fax is 661-257-2274")
	void FaxOfRecord522() {
		assertEquals("661-257-2274", customers.get(521).getFax());
	}

	@Test
	@DisplayName("Record 522: Email is chas@sebo.com")
	void EmailOfRecord522() {
		assertEquals("chas@sebo.com", customers.get(521).getEmail());
	}

	@Test
	@DisplayName("Record 522: Web is http://www.chassebo.com")
	void WebOfRecord522() {
		assertEquals("http://www.chassebo.com", customers.get(521).getWeb());
	}
}
