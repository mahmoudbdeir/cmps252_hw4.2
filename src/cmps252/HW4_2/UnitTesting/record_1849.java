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

@Tag("13")
class Record_1849 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1849: FirstName is Greta")
	void FirstNameOfRecord1849() {
		assertEquals("Greta", customers.get(1848).getFirstName());
	}

	@Test
	@DisplayName("Record 1849: LastName is Clinkinbeard")
	void LastNameOfRecord1849() {
		assertEquals("Clinkinbeard", customers.get(1848).getLastName());
	}

	@Test
	@DisplayName("Record 1849: Company is Dakota Pipe & Steel")
	void CompanyOfRecord1849() {
		assertEquals("Dakota Pipe & Steel", customers.get(1848).getCompany());
	}

	@Test
	@DisplayName("Record 1849: Address is 1203 Highway 3 S")
	void AddressOfRecord1849() {
		assertEquals("1203 Highway 3 S", customers.get(1848).getAddress());
	}

	@Test
	@DisplayName("Record 1849: City is Northfield")
	void CityOfRecord1849() {
		assertEquals("Northfield", customers.get(1848).getCity());
	}

	@Test
	@DisplayName("Record 1849: County is Rice")
	void CountyOfRecord1849() {
		assertEquals("Rice", customers.get(1848).getCounty());
	}

	@Test
	@DisplayName("Record 1849: State is MN")
	void StateOfRecord1849() {
		assertEquals("MN", customers.get(1848).getState());
	}

	@Test
	@DisplayName("Record 1849: ZIP is 55057")
	void ZIPOfRecord1849() {
		assertEquals("55057", customers.get(1848).getZIP());
	}

	@Test
	@DisplayName("Record 1849: Phone is 507-663-2547")
	void PhoneOfRecord1849() {
		assertEquals("507-663-2547", customers.get(1848).getPhone());
	}

	@Test
	@DisplayName("Record 1849: Fax is 507-663-9769")
	void FaxOfRecord1849() {
		assertEquals("507-663-9769", customers.get(1848).getFax());
	}

	@Test
	@DisplayName("Record 1849: Email is greta@clinkinbeard.com")
	void EmailOfRecord1849() {
		assertEquals("greta@clinkinbeard.com", customers.get(1848).getEmail());
	}

	@Test
	@DisplayName("Record 1849: Web is http://www.gretaclinkinbeard.com")
	void WebOfRecord1849() {
		assertEquals("http://www.gretaclinkinbeard.com", customers.get(1848).getWeb());
	}
}
