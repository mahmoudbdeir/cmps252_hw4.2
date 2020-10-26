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

@Tag("46")
class Record_1393 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1393: FirstName is Annmarie")
	void FirstNameOfRecord1393() {
		assertEquals("Annmarie", customers.get(1392).getFirstName());
	}

	@Test
	@DisplayName("Record 1393: LastName is Hackshaw")
	void LastNameOfRecord1393() {
		assertEquals("Hackshaw", customers.get(1392).getLastName());
	}

	@Test
	@DisplayName("Record 1393: Company is Irma Hotel")
	void CompanyOfRecord1393() {
		assertEquals("Irma Hotel", customers.get(1392).getCompany());
	}

	@Test
	@DisplayName("Record 1393: Address is 4410 Adamo Dr")
	void AddressOfRecord1393() {
		assertEquals("4410 Adamo Dr", customers.get(1392).getAddress());
	}

	@Test
	@DisplayName("Record 1393: City is Tampa")
	void CityOfRecord1393() {
		assertEquals("Tampa", customers.get(1392).getCity());
	}

	@Test
	@DisplayName("Record 1393: County is Hillsborough")
	void CountyOfRecord1393() {
		assertEquals("Hillsborough", customers.get(1392).getCounty());
	}

	@Test
	@DisplayName("Record 1393: State is FL")
	void StateOfRecord1393() {
		assertEquals("FL", customers.get(1392).getState());
	}

	@Test
	@DisplayName("Record 1393: ZIP is 33605")
	void ZIPOfRecord1393() {
		assertEquals("33605", customers.get(1392).getZIP());
	}

	@Test
	@DisplayName("Record 1393: Phone is 813-248-5851")
	void PhoneOfRecord1393() {
		assertEquals("813-248-5851", customers.get(1392).getPhone());
	}

	@Test
	@DisplayName("Record 1393: Fax is 813-248-3838")
	void FaxOfRecord1393() {
		assertEquals("813-248-3838", customers.get(1392).getFax());
	}

	@Test
	@DisplayName("Record 1393: Email is annmarie@hackshaw.com")
	void EmailOfRecord1393() {
		assertEquals("annmarie@hackshaw.com", customers.get(1392).getEmail());
	}

	@Test
	@DisplayName("Record 1393: Web is http://www.annmariehackshaw.com")
	void WebOfRecord1393() {
		assertEquals("http://www.annmariehackshaw.com", customers.get(1392).getWeb());
	}
}
