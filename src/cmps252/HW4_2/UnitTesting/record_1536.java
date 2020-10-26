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

@Tag("42")
class Record_1536 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1536: FirstName is Douglas")
	void FirstNameOfRecord1536() {
		assertEquals("Douglas", customers.get(1535).getFirstName());
	}

	@Test
	@DisplayName("Record 1536: LastName is Cervetti")
	void LastNameOfRecord1536() {
		assertEquals("Cervetti", customers.get(1535).getLastName());
	}

	@Test
	@DisplayName("Record 1536: Company is Industrial Erecting Co Inc")
	void CompanyOfRecord1536() {
		assertEquals("Industrial Erecting Co Inc", customers.get(1535).getCompany());
	}

	@Test
	@DisplayName("Record 1536: Address is 4900 Cascade Rd Se")
	void AddressOfRecord1536() {
		assertEquals("4900 Cascade Rd Se", customers.get(1535).getAddress());
	}

	@Test
	@DisplayName("Record 1536: City is Grand Rapids")
	void CityOfRecord1536() {
		assertEquals("Grand Rapids", customers.get(1535).getCity());
	}

	@Test
	@DisplayName("Record 1536: County is Kent")
	void CountyOfRecord1536() {
		assertEquals("Kent", customers.get(1535).getCounty());
	}

	@Test
	@DisplayName("Record 1536: State is MI")
	void StateOfRecord1536() {
		assertEquals("MI", customers.get(1535).getState());
	}

	@Test
	@DisplayName("Record 1536: ZIP is 49546")
	void ZIPOfRecord1536() {
		assertEquals("49546", customers.get(1535).getZIP());
	}

	@Test
	@DisplayName("Record 1536: Phone is 616-949-0462")
	void PhoneOfRecord1536() {
		assertEquals("616-949-0462", customers.get(1535).getPhone());
	}

	@Test
	@DisplayName("Record 1536: Fax is 616-949-4893")
	void FaxOfRecord1536() {
		assertEquals("616-949-4893", customers.get(1535).getFax());
	}

	@Test
	@DisplayName("Record 1536: Email is douglas@cervetti.com")
	void EmailOfRecord1536() {
		assertEquals("douglas@cervetti.com", customers.get(1535).getEmail());
	}

	@Test
	@DisplayName("Record 1536: Web is http://www.douglascervetti.com")
	void WebOfRecord1536() {
		assertEquals("http://www.douglascervetti.com", customers.get(1535).getWeb());
	}
}
