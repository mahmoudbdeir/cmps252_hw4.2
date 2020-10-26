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

@Tag("2")
class Record_3261 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3261: FirstName is Amanda")
	void FirstNameOfRecord3261() {
		assertEquals("Amanda", customers.get(3260).getFirstName());
	}

	@Test
	@DisplayName("Record 3261: LastName is Brough")
	void LastNameOfRecord3261() {
		assertEquals("Brough", customers.get(3260).getLastName());
	}

	@Test
	@DisplayName("Record 3261: Company is Holme, Howard K Esq")
	void CompanyOfRecord3261() {
		assertEquals("Holme, Howard K Esq", customers.get(3260).getCompany());
	}

	@Test
	@DisplayName("Record 3261: Address is 1694 Anahym St")
	void AddressOfRecord3261() {
		assertEquals("1694 Anahym St", customers.get(3260).getAddress());
	}

	@Test
	@DisplayName("Record 3261: City is Harbor City")
	void CityOfRecord3261() {
		assertEquals("Harbor City", customers.get(3260).getCity());
	}

	@Test
	@DisplayName("Record 3261: County is Los Angeles")
	void CountyOfRecord3261() {
		assertEquals("Los Angeles", customers.get(3260).getCounty());
	}

	@Test
	@DisplayName("Record 3261: State is CA")
	void StateOfRecord3261() {
		assertEquals("CA", customers.get(3260).getState());
	}

	@Test
	@DisplayName("Record 3261: ZIP is 90710")
	void ZIPOfRecord3261() {
		assertEquals("90710", customers.get(3260).getZIP());
	}

	@Test
	@DisplayName("Record 3261: Phone is 310-530-5796")
	void PhoneOfRecord3261() {
		assertEquals("310-530-5796", customers.get(3260).getPhone());
	}

	@Test
	@DisplayName("Record 3261: Fax is 310-530-5715")
	void FaxOfRecord3261() {
		assertEquals("310-530-5715", customers.get(3260).getFax());
	}

	@Test
	@DisplayName("Record 3261: Email is amanda@brough.com")
	void EmailOfRecord3261() {
		assertEquals("amanda@brough.com", customers.get(3260).getEmail());
	}

	@Test
	@DisplayName("Record 3261: Web is http://www.amandabrough.com")
	void WebOfRecord3261() {
		assertEquals("http://www.amandabrough.com", customers.get(3260).getWeb());
	}
}
