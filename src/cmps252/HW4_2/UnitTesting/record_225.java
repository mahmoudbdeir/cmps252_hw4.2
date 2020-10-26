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

@Tag("23")
class Record_225 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 225: FirstName is Patricia")
	void FirstNameOfRecord225() {
		assertEquals("Patricia", customers.get(224).getFirstName());
	}

	@Test
	@DisplayName("Record 225: LastName is Bunner")
	void LastNameOfRecord225() {
		assertEquals("Bunner", customers.get(224).getLastName());
	}

	@Test
	@DisplayName("Record 225: Company is Hunter, Derek B")
	void CompanyOfRecord225() {
		assertEquals("Hunter, Derek B", customers.get(224).getCompany());
	}

	@Test
	@DisplayName("Record 225: Address is 942 Lafayette Ave")
	void AddressOfRecord225() {
		assertEquals("942 Lafayette Ave", customers.get(224).getAddress());
	}

	@Test
	@DisplayName("Record 225: City is Brooklyn")
	void CityOfRecord225() {
		assertEquals("Brooklyn", customers.get(224).getCity());
	}

	@Test
	@DisplayName("Record 225: County is Kings")
	void CountyOfRecord225() {
		assertEquals("Kings", customers.get(224).getCounty());
	}

	@Test
	@DisplayName("Record 225: State is NY")
	void StateOfRecord225() {
		assertEquals("NY", customers.get(224).getState());
	}

	@Test
	@DisplayName("Record 225: ZIP is 11221")
	void ZIPOfRecord225() {
		assertEquals("11221", customers.get(224).getZIP());
	}

	@Test
	@DisplayName("Record 225: Phone is 718-443-0443")
	void PhoneOfRecord225() {
		assertEquals("718-443-0443", customers.get(224).getPhone());
	}

	@Test
	@DisplayName("Record 225: Fax is 718-443-1079")
	void FaxOfRecord225() {
		assertEquals("718-443-1079", customers.get(224).getFax());
	}

	@Test
	@DisplayName("Record 225: Email is patricia@bunner.com")
	void EmailOfRecord225() {
		assertEquals("patricia@bunner.com", customers.get(224).getEmail());
	}

	@Test
	@DisplayName("Record 225: Web is http://www.patriciabunner.com")
	void WebOfRecord225() {
		assertEquals("http://www.patriciabunner.com", customers.get(224).getWeb());
	}
}
