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
class Record_974 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 974: FirstName is Judy")
	void FirstNameOfRecord974() {
		assertEquals("Judy", customers.get(973).getFirstName());
	}

	@Test
	@DisplayName("Record 974: LastName is Blake")
	void LastNameOfRecord974() {
		assertEquals("Blake", customers.get(973).getLastName());
	}

	@Test
	@DisplayName("Record 974: Company is United Capital Corp")
	void CompanyOfRecord974() {
		assertEquals("United Capital Corp", customers.get(973).getCompany());
	}

	@Test
	@DisplayName("Record 974: Address is 8436 N Nebraska Ave")
	void AddressOfRecord974() {
		assertEquals("8436 N Nebraska Ave", customers.get(973).getAddress());
	}

	@Test
	@DisplayName("Record 974: City is Tampa")
	void CityOfRecord974() {
		assertEquals("Tampa", customers.get(973).getCity());
	}

	@Test
	@DisplayName("Record 974: County is Hillsborough")
	void CountyOfRecord974() {
		assertEquals("Hillsborough", customers.get(973).getCounty());
	}

	@Test
	@DisplayName("Record 974: State is FL")
	void StateOfRecord974() {
		assertEquals("FL", customers.get(973).getState());
	}

	@Test
	@DisplayName("Record 974: ZIP is 33604")
	void ZIPOfRecord974() {
		assertEquals("33604", customers.get(973).getZIP());
	}

	@Test
	@DisplayName("Record 974: Phone is 813-935-0921")
	void PhoneOfRecord974() {
		assertEquals("813-935-0921", customers.get(973).getPhone());
	}

	@Test
	@DisplayName("Record 974: Fax is 813-935-0072")
	void FaxOfRecord974() {
		assertEquals("813-935-0072", customers.get(973).getFax());
	}

	@Test
	@DisplayName("Record 974: Email is judy@blake.com")
	void EmailOfRecord974() {
		assertEquals("judy@blake.com", customers.get(973).getEmail());
	}

	@Test
	@DisplayName("Record 974: Web is http://www.judyblake.com")
	void WebOfRecord974() {
		assertEquals("http://www.judyblake.com", customers.get(973).getWeb());
	}
}
