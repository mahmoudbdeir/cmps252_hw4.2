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
class Record_473 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 473: FirstName is Christal")
	void FirstNameOfRecord473() {
		assertEquals("Christal", customers.get(472).getFirstName());
	}

	@Test
	@DisplayName("Record 473: LastName is Dul")
	void LastNameOfRecord473() {
		assertEquals("Dul", customers.get(472).getLastName());
	}

	@Test
	@DisplayName("Record 473: Company is Truck Sign Service")
	void CompanyOfRecord473() {
		assertEquals("Truck Sign Service", customers.get(472).getCompany());
	}

	@Test
	@DisplayName("Record 473: Address is 3668 Us Highway 12e E")
	void AddressOfRecord473() {
		assertEquals("3668 Us Highway 12e E", customers.get(472).getAddress());
	}

	@Test
	@DisplayName("Record 473: City is East Helena")
	void CityOfRecord473() {
		assertEquals("East Helena", customers.get(472).getCity());
	}

	@Test
	@DisplayName("Record 473: County is Lewis and Clark")
	void CountyOfRecord473() {
		assertEquals("Lewis and Clark", customers.get(472).getCounty());
	}

	@Test
	@DisplayName("Record 473: State is MT")
	void StateOfRecord473() {
		assertEquals("MT", customers.get(472).getState());
	}

	@Test
	@DisplayName("Record 473: ZIP is 59635")
	void ZIPOfRecord473() {
		assertEquals("59635", customers.get(472).getZIP());
	}

	@Test
	@DisplayName("Record 473: Phone is 406-227-8720")
	void PhoneOfRecord473() {
		assertEquals("406-227-8720", customers.get(472).getPhone());
	}

	@Test
	@DisplayName("Record 473: Fax is 406-227-0394")
	void FaxOfRecord473() {
		assertEquals("406-227-0394", customers.get(472).getFax());
	}

	@Test
	@DisplayName("Record 473: Email is christal@dul.com")
	void EmailOfRecord473() {
		assertEquals("christal@dul.com", customers.get(472).getEmail());
	}

	@Test
	@DisplayName("Record 473: Web is http://www.christaldul.com")
	void WebOfRecord473() {
		assertEquals("http://www.christaldul.com", customers.get(472).getWeb());
	}
}
