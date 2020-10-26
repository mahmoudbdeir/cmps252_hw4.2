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

@Tag("20")
class Record_4970 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4970: FirstName is Antione")
	void FirstNameOfRecord4970() {
		assertEquals("Antione", customers.get(4969).getFirstName());
	}

	@Test
	@DisplayName("Record 4970: LastName is Divenere")
	void LastNameOfRecord4970() {
		assertEquals("Divenere", customers.get(4969).getLastName());
	}

	@Test
	@DisplayName("Record 4970: Company is Communications Service")
	void CompanyOfRecord4970() {
		assertEquals("Communications Service", customers.get(4969).getCompany());
	}

	@Test
	@DisplayName("Record 4970: Address is 420 Lexington Ave")
	void AddressOfRecord4970() {
		assertEquals("420 Lexington Ave", customers.get(4969).getAddress());
	}

	@Test
	@DisplayName("Record 4970: City is New York")
	void CityOfRecord4970() {
		assertEquals("New York", customers.get(4969).getCity());
	}

	@Test
	@DisplayName("Record 4970: County is New York")
	void CountyOfRecord4970() {
		assertEquals("New York", customers.get(4969).getCounty());
	}

	@Test
	@DisplayName("Record 4970: State is NY")
	void StateOfRecord4970() {
		assertEquals("NY", customers.get(4969).getState());
	}

	@Test
	@DisplayName("Record 4970: ZIP is 10170")
	void ZIPOfRecord4970() {
		assertEquals("10170", customers.get(4969).getZIP());
	}

	@Test
	@DisplayName("Record 4970: Phone is 212-808-0054")
	void PhoneOfRecord4970() {
		assertEquals("212-808-0054", customers.get(4969).getPhone());
	}

	@Test
	@DisplayName("Record 4970: Fax is 212-808-5593")
	void FaxOfRecord4970() {
		assertEquals("212-808-5593", customers.get(4969).getFax());
	}

	@Test
	@DisplayName("Record 4970: Email is antione@divenere.com")
	void EmailOfRecord4970() {
		assertEquals("antione@divenere.com", customers.get(4969).getEmail());
	}

	@Test
	@DisplayName("Record 4970: Web is http://www.antionedivenere.com")
	void WebOfRecord4970() {
		assertEquals("http://www.antionedivenere.com", customers.get(4969).getWeb());
	}
}
