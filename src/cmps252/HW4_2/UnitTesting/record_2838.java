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

@Tag("10")
class Record_2838 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2838: FirstName is Stacy")
	void FirstNameOfRecord2838() {
		assertEquals("Stacy", customers.get(2837).getFirstName());
	}

	@Test
	@DisplayName("Record 2838: LastName is Shortino")
	void LastNameOfRecord2838() {
		assertEquals("Shortino", customers.get(2837).getLastName());
	}

	@Test
	@DisplayName("Record 2838: Company is Augat Inc")
	void CompanyOfRecord2838() {
		assertEquals("Augat Inc", customers.get(2837).getCompany());
	}

	@Test
	@DisplayName("Record 2838: Address is 806 Monson St")
	void AddressOfRecord2838() {
		assertEquals("806 Monson St", customers.get(2837).getAddress());
	}

	@Test
	@DisplayName("Record 2838: City is Beaufort")
	void CityOfRecord2838() {
		assertEquals("Beaufort", customers.get(2837).getCity());
	}

	@Test
	@DisplayName("Record 2838: County is Beaufort")
	void CountyOfRecord2838() {
		assertEquals("Beaufort", customers.get(2837).getCounty());
	}

	@Test
	@DisplayName("Record 2838: State is SC")
	void StateOfRecord2838() {
		assertEquals("SC", customers.get(2837).getState());
	}

	@Test
	@DisplayName("Record 2838: ZIP is 29902")
	void ZIPOfRecord2838() {
		assertEquals("29902", customers.get(2837).getZIP());
	}

	@Test
	@DisplayName("Record 2838: Phone is 843-525-3769")
	void PhoneOfRecord2838() {
		assertEquals("843-525-3769", customers.get(2837).getPhone());
	}

	@Test
	@DisplayName("Record 2838: Fax is 843-525-9122")
	void FaxOfRecord2838() {
		assertEquals("843-525-9122", customers.get(2837).getFax());
	}

	@Test
	@DisplayName("Record 2838: Email is stacy@shortino.com")
	void EmailOfRecord2838() {
		assertEquals("stacy@shortino.com", customers.get(2837).getEmail());
	}

	@Test
	@DisplayName("Record 2838: Web is http://www.stacyshortino.com")
	void WebOfRecord2838() {
		assertEquals("http://www.stacyshortino.com", customers.get(2837).getWeb());
	}
}
