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

@Tag("15")
class Record_644 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 644: FirstName is Mayra")
	void FirstNameOfRecord644() {
		assertEquals("Mayra", customers.get(643).getFirstName());
	}

	@Test
	@DisplayName("Record 644: LastName is Vandernoot")
	void LastNameOfRecord644() {
		assertEquals("Vandernoot", customers.get(643).getLastName());
	}

	@Test
	@DisplayName("Record 644: Company is Imperial Engrv & Embos Co Inc")
	void CompanyOfRecord644() {
		assertEquals("Imperial Engrv & Embos Co Inc", customers.get(643).getCompany());
	}

	@Test
	@DisplayName("Record 644: Address is 1017 S Us Highway 301")
	void AddressOfRecord644() {
		assertEquals("1017 S Us Highway 301", customers.get(643).getAddress());
	}

	@Test
	@DisplayName("Record 644: City is Tampa")
	void CityOfRecord644() {
		assertEquals("Tampa", customers.get(643).getCity());
	}

	@Test
	@DisplayName("Record 644: County is Hillsborough")
	void CountyOfRecord644() {
		assertEquals("Hillsborough", customers.get(643).getCounty());
	}

	@Test
	@DisplayName("Record 644: State is FL")
	void StateOfRecord644() {
		assertEquals("FL", customers.get(643).getState());
	}

	@Test
	@DisplayName("Record 644: ZIP is 33619")
	void ZIPOfRecord644() {
		assertEquals("33619", customers.get(643).getZIP());
	}

	@Test
	@DisplayName("Record 644: Phone is 813-628-3872")
	void PhoneOfRecord644() {
		assertEquals("813-628-3872", customers.get(643).getPhone());
	}

	@Test
	@DisplayName("Record 644: Fax is 813-628-1409")
	void FaxOfRecord644() {
		assertEquals("813-628-1409", customers.get(643).getFax());
	}

	@Test
	@DisplayName("Record 644: Email is mayra@vandernoot.com")
	void EmailOfRecord644() {
		assertEquals("mayra@vandernoot.com", customers.get(643).getEmail());
	}

	@Test
	@DisplayName("Record 644: Web is http://www.mayravandernoot.com")
	void WebOfRecord644() {
		assertEquals("http://www.mayravandernoot.com", customers.get(643).getWeb());
	}
}
