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

@Tag("20")
class Record_2414 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2414: FirstName is Lindsay")
	void FirstNameOfRecord2414() {
		assertEquals("Lindsay", customers.get(2413).getFirstName());
	}

	@Test
	@DisplayName("Record 2414: LastName is Dannelly")
	void LastNameOfRecord2414() {
		assertEquals("Dannelly", customers.get(2413).getLastName());
	}

	@Test
	@DisplayName("Record 2414: Company is Great Lakes Fence Co")
	void CompanyOfRecord2414() {
		assertEquals("Great Lakes Fence Co", customers.get(2413).getCompany());
	}

	@Test
	@DisplayName("Record 2414: Address is 219 Ne 36th Ave")
	void AddressOfRecord2414() {
		assertEquals("219 Ne 36th Ave", customers.get(2413).getAddress());
	}

	@Test
	@DisplayName("Record 2414: City is Ocala")
	void CityOfRecord2414() {
		assertEquals("Ocala", customers.get(2413).getCity());
	}

	@Test
	@DisplayName("Record 2414: County is Marion")
	void CountyOfRecord2414() {
		assertEquals("Marion", customers.get(2413).getCounty());
	}

	@Test
	@DisplayName("Record 2414: State is FL")
	void StateOfRecord2414() {
		assertEquals("FL", customers.get(2413).getState());
	}

	@Test
	@DisplayName("Record 2414: ZIP is 34470")
	void ZIPOfRecord2414() {
		assertEquals("34470", customers.get(2413).getZIP());
	}

	@Test
	@DisplayName("Record 2414: Phone is 352-694-1674")
	void PhoneOfRecord2414() {
		assertEquals("352-694-1674", customers.get(2413).getPhone());
	}

	@Test
	@DisplayName("Record 2414: Fax is 352-694-7588")
	void FaxOfRecord2414() {
		assertEquals("352-694-7588", customers.get(2413).getFax());
	}

	@Test
	@DisplayName("Record 2414: Email is lindsay@dannelly.com")
	void EmailOfRecord2414() {
		assertEquals("lindsay@dannelly.com", customers.get(2413).getEmail());
	}

	@Test
	@DisplayName("Record 2414: Web is http://www.lindsaydannelly.com")
	void WebOfRecord2414() {
		assertEquals("http://www.lindsaydannelly.com", customers.get(2413).getWeb());
	}
}
