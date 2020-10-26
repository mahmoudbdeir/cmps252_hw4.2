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
class Record_2767 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2767: FirstName is Kristofer")
	void FirstNameOfRecord2767() {
		assertEquals("Kristofer", customers.get(2766).getFirstName());
	}

	@Test
	@DisplayName("Record 2767: LastName is Kaczor")
	void LastNameOfRecord2767() {
		assertEquals("Kaczor", customers.get(2766).getLastName());
	}

	@Test
	@DisplayName("Record 2767: Company is Waterloo Industries Inc")
	void CompanyOfRecord2767() {
		assertEquals("Waterloo Industries Inc", customers.get(2766).getCompany());
	}

	@Test
	@DisplayName("Record 2767: Address is 76 Bridge St")
	void AddressOfRecord2767() {
		assertEquals("76 Bridge St", customers.get(2766).getAddress());
	}

	@Test
	@DisplayName("Record 2767: City is Milford")
	void CityOfRecord2767() {
		assertEquals("Milford", customers.get(2766).getCity());
	}

	@Test
	@DisplayName("Record 2767: County is Hillsborough")
	void CountyOfRecord2767() {
		assertEquals("Hillsborough", customers.get(2766).getCounty());
	}

	@Test
	@DisplayName("Record 2767: State is NH")
	void StateOfRecord2767() {
		assertEquals("NH", customers.get(2766).getState());
	}

	@Test
	@DisplayName("Record 2767: ZIP is 3055")
	void ZIPOfRecord2767() {
		assertEquals("3055", customers.get(2766).getZIP());
	}

	@Test
	@DisplayName("Record 2767: Phone is 603-672-8772")
	void PhoneOfRecord2767() {
		assertEquals("603-672-8772", customers.get(2766).getPhone());
	}

	@Test
	@DisplayName("Record 2767: Fax is 603-672-3011")
	void FaxOfRecord2767() {
		assertEquals("603-672-3011", customers.get(2766).getFax());
	}

	@Test
	@DisplayName("Record 2767: Email is kristofer@kaczor.com")
	void EmailOfRecord2767() {
		assertEquals("kristofer@kaczor.com", customers.get(2766).getEmail());
	}

	@Test
	@DisplayName("Record 2767: Web is http://www.kristoferkaczor.com")
	void WebOfRecord2767() {
		assertEquals("http://www.kristoferkaczor.com", customers.get(2766).getWeb());
	}
}
