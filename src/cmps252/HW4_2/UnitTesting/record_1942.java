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

@Tag("31")
class Record_1942 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1942: FirstName is Dee")
	void FirstNameOfRecord1942() {
		assertEquals("Dee", customers.get(1941).getFirstName());
	}

	@Test
	@DisplayName("Record 1942: LastName is Kauffman")
	void LastNameOfRecord1942() {
		assertEquals("Kauffman", customers.get(1941).getLastName());
	}

	@Test
	@DisplayName("Record 1942: Company is Advision Signs")
	void CompanyOfRecord1942() {
		assertEquals("Advision Signs", customers.get(1941).getCompany());
	}

	@Test
	@DisplayName("Record 1942: Address is 5 Groce Ave")
	void AddressOfRecord1942() {
		assertEquals("5 Groce Ave", customers.get(1941).getAddress());
	}

	@Test
	@DisplayName("Record 1942: City is Glenolden")
	void CityOfRecord1942() {
		assertEquals("Glenolden", customers.get(1941).getCity());
	}

	@Test
	@DisplayName("Record 1942: County is Delaware")
	void CountyOfRecord1942() {
		assertEquals("Delaware", customers.get(1941).getCounty());
	}

	@Test
	@DisplayName("Record 1942: State is PA")
	void StateOfRecord1942() {
		assertEquals("PA", customers.get(1941).getState());
	}

	@Test
	@DisplayName("Record 1942: ZIP is 19036")
	void ZIPOfRecord1942() {
		assertEquals("19036", customers.get(1941).getZIP());
	}

	@Test
	@DisplayName("Record 1942: Phone is 610-534-4409")
	void PhoneOfRecord1942() {
		assertEquals("610-534-4409", customers.get(1941).getPhone());
	}

	@Test
	@DisplayName("Record 1942: Fax is 610-534-0364")
	void FaxOfRecord1942() {
		assertEquals("610-534-0364", customers.get(1941).getFax());
	}

	@Test
	@DisplayName("Record 1942: Email is dee@kauffman.com")
	void EmailOfRecord1942() {
		assertEquals("dee@kauffman.com", customers.get(1941).getEmail());
	}

	@Test
	@DisplayName("Record 1942: Web is http://www.deekauffman.com")
	void WebOfRecord1942() {
		assertEquals("http://www.deekauffman.com", customers.get(1941).getWeb());
	}
}
