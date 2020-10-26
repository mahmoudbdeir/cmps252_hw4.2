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

@Tag("41")
class Record_3362 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3362: FirstName is Raquel")
	void FirstNameOfRecord3362() {
		assertEquals("Raquel", customers.get(3361).getFirstName());
	}

	@Test
	@DisplayName("Record 3362: LastName is Dyscher")
	void LastNameOfRecord3362() {
		assertEquals("Dyscher", customers.get(3361).getLastName());
	}

	@Test
	@DisplayName("Record 3362: Company is Gregory, Thomas W Jr")
	void CompanyOfRecord3362() {
		assertEquals("Gregory, Thomas W Jr", customers.get(3361).getCompany());
	}

	@Test
	@DisplayName("Record 3362: Address is 1854 Hylan Blvd")
	void AddressOfRecord3362() {
		assertEquals("1854 Hylan Blvd", customers.get(3361).getAddress());
	}

	@Test
	@DisplayName("Record 3362: City is Staten Island")
	void CityOfRecord3362() {
		assertEquals("Staten Island", customers.get(3361).getCity());
	}

	@Test
	@DisplayName("Record 3362: County is Richmond")
	void CountyOfRecord3362() {
		assertEquals("Richmond", customers.get(3361).getCounty());
	}

	@Test
	@DisplayName("Record 3362: State is NY")
	void StateOfRecord3362() {
		assertEquals("NY", customers.get(3361).getState());
	}

	@Test
	@DisplayName("Record 3362: ZIP is 10305")
	void ZIPOfRecord3362() {
		assertEquals("10305", customers.get(3361).getZIP());
	}

	@Test
	@DisplayName("Record 3362: Phone is 718-351-0051")
	void PhoneOfRecord3362() {
		assertEquals("718-351-0051", customers.get(3361).getPhone());
	}

	@Test
	@DisplayName("Record 3362: Fax is 718-351-4777")
	void FaxOfRecord3362() {
		assertEquals("718-351-4777", customers.get(3361).getFax());
	}

	@Test
	@DisplayName("Record 3362: Email is raquel@dyscher.com")
	void EmailOfRecord3362() {
		assertEquals("raquel@dyscher.com", customers.get(3361).getEmail());
	}

	@Test
	@DisplayName("Record 3362: Web is http://www.raqueldyscher.com")
	void WebOfRecord3362() {
		assertEquals("http://www.raqueldyscher.com", customers.get(3361).getWeb());
	}
}
