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

@Tag("12")
class Record_733 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 733: FirstName is Caryn")
	void FirstNameOfRecord733() {
		assertEquals("Caryn", customers.get(732).getFirstName());
	}

	@Test
	@DisplayName("Record 733: LastName is Andreadis")
	void LastNameOfRecord733() {
		assertEquals("Andreadis", customers.get(732).getLastName());
	}

	@Test
	@DisplayName("Record 733: Company is Legros, Clay J Esq")
	void CompanyOfRecord733() {
		assertEquals("Legros, Clay J Esq", customers.get(732).getCompany());
	}

	@Test
	@DisplayName("Record 733: Address is 14410 Mile Rd")
	void AddressOfRecord733() {
		assertEquals("14410 Mile Rd", customers.get(732).getAddress());
	}

	@Test
	@DisplayName("Record 733: City is Washington")
	void CityOfRecord733() {
		assertEquals("Washington", customers.get(732).getCity());
	}

	@Test
	@DisplayName("Record 733: County is Macomb")
	void CountyOfRecord733() {
		assertEquals("Macomb", customers.get(732).getCounty());
	}

	@Test
	@DisplayName("Record 733: State is MI")
	void StateOfRecord733() {
		assertEquals("MI", customers.get(732).getState());
	}

	@Test
	@DisplayName("Record 733: ZIP is 48094")
	void ZIPOfRecord733() {
		assertEquals("48094", customers.get(732).getZIP());
	}

	@Test
	@DisplayName("Record 733: Phone is 586-752-1649")
	void PhoneOfRecord733() {
		assertEquals("586-752-1649", customers.get(732).getPhone());
	}

	@Test
	@DisplayName("Record 733: Fax is 586-752-6398")
	void FaxOfRecord733() {
		assertEquals("586-752-6398", customers.get(732).getFax());
	}

	@Test
	@DisplayName("Record 733: Email is caryn@andreadis.com")
	void EmailOfRecord733() {
		assertEquals("caryn@andreadis.com", customers.get(732).getEmail());
	}

	@Test
	@DisplayName("Record 733: Web is http://www.carynandreadis.com")
	void WebOfRecord733() {
		assertEquals("http://www.carynandreadis.com", customers.get(732).getWeb());
	}
}
