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

@Tag("14")
class Record_2262 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2262: FirstName is Diane")
	void FirstNameOfRecord2262() {
		assertEquals("Diane", customers.get(2261).getFirstName());
	}

	@Test
	@DisplayName("Record 2262: LastName is Heese")
	void LastNameOfRecord2262() {
		assertEquals("Heese", customers.get(2261).getLastName());
	}

	@Test
	@DisplayName("Record 2262: Company is Deweese, Thomas L Esq")
	void CompanyOfRecord2262() {
		assertEquals("Deweese, Thomas L Esq", customers.get(2261).getCompany());
	}

	@Test
	@DisplayName("Record 2262: Address is 234 Main St")
	void AddressOfRecord2262() {
		assertEquals("234 Main St", customers.get(2261).getAddress());
	}

	@Test
	@DisplayName("Record 2262: City is Chatham")
	void CityOfRecord2262() {
		assertEquals("Chatham", customers.get(2261).getCity());
	}

	@Test
	@DisplayName("Record 2262: County is Morris")
	void CountyOfRecord2262() {
		assertEquals("Morris", customers.get(2261).getCounty());
	}

	@Test
	@DisplayName("Record 2262: State is NJ")
	void StateOfRecord2262() {
		assertEquals("NJ", customers.get(2261).getState());
	}

	@Test
	@DisplayName("Record 2262: ZIP is 7928")
	void ZIPOfRecord2262() {
		assertEquals("7928", customers.get(2261).getZIP());
	}

	@Test
	@DisplayName("Record 2262: Phone is 973-701-8623")
	void PhoneOfRecord2262() {
		assertEquals("973-701-8623", customers.get(2261).getPhone());
	}

	@Test
	@DisplayName("Record 2262: Fax is 973-701-0535")
	void FaxOfRecord2262() {
		assertEquals("973-701-0535", customers.get(2261).getFax());
	}

	@Test
	@DisplayName("Record 2262: Email is diane@heese.com")
	void EmailOfRecord2262() {
		assertEquals("diane@heese.com", customers.get(2261).getEmail());
	}

	@Test
	@DisplayName("Record 2262: Web is http://www.dianeheese.com")
	void WebOfRecord2262() {
		assertEquals("http://www.dianeheese.com", customers.get(2261).getWeb());
	}
}
