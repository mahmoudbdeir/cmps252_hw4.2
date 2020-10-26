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

@Tag("47")
class Record_394 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 394: FirstName is Lauretta")
	void FirstNameOfRecord394() {
		assertEquals("Lauretta", customers.get(393).getFirstName());
	}

	@Test
	@DisplayName("Record 394: LastName is Sechler")
	void LastNameOfRecord394() {
		assertEquals("Sechler", customers.get(393).getLastName());
	}

	@Test
	@DisplayName("Record 394: Company is Golden Coast Signs")
	void CompanyOfRecord394() {
		assertEquals("Golden Coast Signs", customers.get(393).getCompany());
	}

	@Test
	@DisplayName("Record 394: Address is 1903 U Aven")
	void AddressOfRecord394() {
		assertEquals("1903 U Aven", customers.get(393).getAddress());
	}

	@Test
	@DisplayName("Record 394: City is Brooklyn")
	void CityOfRecord394() {
		assertEquals("Brooklyn", customers.get(393).getCity());
	}

	@Test
	@DisplayName("Record 394: County is Kings")
	void CountyOfRecord394() {
		assertEquals("Kings", customers.get(393).getCounty());
	}

	@Test
	@DisplayName("Record 394: State is NY")
	void StateOfRecord394() {
		assertEquals("NY", customers.get(393).getState());
	}

	@Test
	@DisplayName("Record 394: ZIP is 11229")
	void ZIPOfRecord394() {
		assertEquals("11229", customers.get(393).getZIP());
	}

	@Test
	@DisplayName("Record 394: Phone is 718-934-7901")
	void PhoneOfRecord394() {
		assertEquals("718-934-7901", customers.get(393).getPhone());
	}

	@Test
	@DisplayName("Record 394: Fax is 718-934-6403")
	void FaxOfRecord394() {
		assertEquals("718-934-6403", customers.get(393).getFax());
	}

	@Test
	@DisplayName("Record 394: Email is lauretta@sechler.com")
	void EmailOfRecord394() {
		assertEquals("lauretta@sechler.com", customers.get(393).getEmail());
	}

	@Test
	@DisplayName("Record 394: Web is http://www.laurettasechler.com")
	void WebOfRecord394() {
		assertEquals("http://www.laurettasechler.com", customers.get(393).getWeb());
	}
}
