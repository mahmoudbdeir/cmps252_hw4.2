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

@Tag("40")
class Record_3021 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3021: FirstName is Isaac")
	void FirstNameOfRecord3021() {
		assertEquals("Isaac", customers.get(3020).getFirstName());
	}

	@Test
	@DisplayName("Record 3021: LastName is Lossing")
	void LastNameOfRecord3021() {
		assertEquals("Lossing", customers.get(3020).getLastName());
	}

	@Test
	@DisplayName("Record 3021: Company is Bissette, W Louis Jr")
	void CompanyOfRecord3021() {
		assertEquals("Bissette, W Louis Jr", customers.get(3020).getCompany());
	}

	@Test
	@DisplayName("Record 3021: Address is 3401 W Harrison St")
	void AddressOfRecord3021() {
		assertEquals("3401 W Harrison St", customers.get(3020).getAddress());
	}

	@Test
	@DisplayName("Record 3021: City is Phoenix")
	void CityOfRecord3021() {
		assertEquals("Phoenix", customers.get(3020).getCity());
	}

	@Test
	@DisplayName("Record 3021: County is Maricopa")
	void CountyOfRecord3021() {
		assertEquals("Maricopa", customers.get(3020).getCounty());
	}

	@Test
	@DisplayName("Record 3021: State is AZ")
	void StateOfRecord3021() {
		assertEquals("AZ", customers.get(3020).getState());
	}

	@Test
	@DisplayName("Record 3021: ZIP is 85009")
	void ZIPOfRecord3021() {
		assertEquals("85009", customers.get(3020).getZIP());
	}

	@Test
	@DisplayName("Record 3021: Phone is 602-278-9665")
	void PhoneOfRecord3021() {
		assertEquals("602-278-9665", customers.get(3020).getPhone());
	}

	@Test
	@DisplayName("Record 3021: Fax is 602-278-2915")
	void FaxOfRecord3021() {
		assertEquals("602-278-2915", customers.get(3020).getFax());
	}

	@Test
	@DisplayName("Record 3021: Email is isaac@lossing.com")
	void EmailOfRecord3021() {
		assertEquals("isaac@lossing.com", customers.get(3020).getEmail());
	}

	@Test
	@DisplayName("Record 3021: Web is http://www.isaaclossing.com")
	void WebOfRecord3021() {
		assertEquals("http://www.isaaclossing.com", customers.get(3020).getWeb());
	}
}
