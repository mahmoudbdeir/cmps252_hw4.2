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

@Tag("26")
class Record_2025 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2025: FirstName is Nanette")
	void FirstNameOfRecord2025() {
		assertEquals("Nanette", customers.get(2024).getFirstName());
	}

	@Test
	@DisplayName("Record 2025: LastName is Dushkin")
	void LastNameOfRecord2025() {
		assertEquals("Dushkin", customers.get(2024).getLastName());
	}

	@Test
	@DisplayName("Record 2025: Company is Allmetal Inc")
	void CompanyOfRecord2025() {
		assertEquals("Allmetal Inc", customers.get(2024).getCompany());
	}

	@Test
	@DisplayName("Record 2025: Address is 425 Battery St  #-200")
	void AddressOfRecord2025() {
		assertEquals("425 Battery St  #-200", customers.get(2024).getAddress());
	}

	@Test
	@DisplayName("Record 2025: City is San Francisco")
	void CityOfRecord2025() {
		assertEquals("San Francisco", customers.get(2024).getCity());
	}

	@Test
	@DisplayName("Record 2025: County is San Francisco")
	void CountyOfRecord2025() {
		assertEquals("San Francisco", customers.get(2024).getCounty());
	}

	@Test
	@DisplayName("Record 2025: State is CA")
	void StateOfRecord2025() {
		assertEquals("CA", customers.get(2024).getState());
	}

	@Test
	@DisplayName("Record 2025: ZIP is 94111")
	void ZIPOfRecord2025() {
		assertEquals("94111", customers.get(2024).getZIP());
	}

	@Test
	@DisplayName("Record 2025: Phone is 415-781-1976")
	void PhoneOfRecord2025() {
		assertEquals("415-781-1976", customers.get(2024).getPhone());
	}

	@Test
	@DisplayName("Record 2025: Fax is 415-781-0558")
	void FaxOfRecord2025() {
		assertEquals("415-781-0558", customers.get(2024).getFax());
	}

	@Test
	@DisplayName("Record 2025: Email is nanette@dushkin.com")
	void EmailOfRecord2025() {
		assertEquals("nanette@dushkin.com", customers.get(2024).getEmail());
	}

	@Test
	@DisplayName("Record 2025: Web is http://www.nanettedushkin.com")
	void WebOfRecord2025() {
		assertEquals("http://www.nanettedushkin.com", customers.get(2024).getWeb());
	}
}
