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
class Record_1438 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1438: FirstName is Nilda")
	void FirstNameOfRecord1438() {
		assertEquals("Nilda", customers.get(1437).getFirstName());
	}

	@Test
	@DisplayName("Record 1438: LastName is Bremseth")
	void LastNameOfRecord1438() {
		assertEquals("Bremseth", customers.get(1437).getLastName());
	}

	@Test
	@DisplayName("Record 1438: Company is First Citizens Bank")
	void CompanyOfRecord1438() {
		assertEquals("First Citizens Bank", customers.get(1437).getCompany());
	}

	@Test
	@DisplayName("Record 1438: Address is 2015 Garnet Ave")
	void AddressOfRecord1438() {
		assertEquals("2015 Garnet Ave", customers.get(1437).getAddress());
	}

	@Test
	@DisplayName("Record 1438: City is San Diego")
	void CityOfRecord1438() {
		assertEquals("San Diego", customers.get(1437).getCity());
	}

	@Test
	@DisplayName("Record 1438: County is San Diego")
	void CountyOfRecord1438() {
		assertEquals("San Diego", customers.get(1437).getCounty());
	}

	@Test
	@DisplayName("Record 1438: State is CA")
	void StateOfRecord1438() {
		assertEquals("CA", customers.get(1437).getState());
	}

	@Test
	@DisplayName("Record 1438: ZIP is 92109")
	void ZIPOfRecord1438() {
		assertEquals("92109", customers.get(1437).getZIP());
	}

	@Test
	@DisplayName("Record 1438: Phone is 858-581-4355")
	void PhoneOfRecord1438() {
		assertEquals("858-581-4355", customers.get(1437).getPhone());
	}

	@Test
	@DisplayName("Record 1438: Fax is 858-581-3014")
	void FaxOfRecord1438() {
		assertEquals("858-581-3014", customers.get(1437).getFax());
	}

	@Test
	@DisplayName("Record 1438: Email is nilda@bremseth.com")
	void EmailOfRecord1438() {
		assertEquals("nilda@bremseth.com", customers.get(1437).getEmail());
	}

	@Test
	@DisplayName("Record 1438: Web is http://www.nildabremseth.com")
	void WebOfRecord1438() {
		assertEquals("http://www.nildabremseth.com", customers.get(1437).getWeb());
	}
}
