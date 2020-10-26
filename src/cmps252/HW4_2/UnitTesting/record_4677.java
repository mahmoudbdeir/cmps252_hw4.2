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

@Tag("4")
class Record_4677 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4677: FirstName is Nina")
	void FirstNameOfRecord4677() {
		assertEquals("Nina", customers.get(4676).getFirstName());
	}

	@Test
	@DisplayName("Record 4677: LastName is Miyahira")
	void LastNameOfRecord4677() {
		assertEquals("Miyahira", customers.get(4676).getLastName());
	}

	@Test
	@DisplayName("Record 4677: Company is Waldman House Press Inc")
	void CompanyOfRecord4677() {
		assertEquals("Waldman House Press Inc", customers.get(4676).getCompany());
	}

	@Test
	@DisplayName("Record 4677: Address is 3255 Wilshire Blvd  #-903")
	void AddressOfRecord4677() {
		assertEquals("3255 Wilshire Blvd  #-903", customers.get(4676).getAddress());
	}

	@Test
	@DisplayName("Record 4677: City is Los Angeles")
	void CityOfRecord4677() {
		assertEquals("Los Angeles", customers.get(4676).getCity());
	}

	@Test
	@DisplayName("Record 4677: County is Los Angeles")
	void CountyOfRecord4677() {
		assertEquals("Los Angeles", customers.get(4676).getCounty());
	}

	@Test
	@DisplayName("Record 4677: State is CA")
	void StateOfRecord4677() {
		assertEquals("CA", customers.get(4676).getState());
	}

	@Test
	@DisplayName("Record 4677: ZIP is 90010")
	void ZIPOfRecord4677() {
		assertEquals("90010", customers.get(4676).getZIP());
	}

	@Test
	@DisplayName("Record 4677: Phone is 213-388-9180")
	void PhoneOfRecord4677() {
		assertEquals("213-388-9180", customers.get(4676).getPhone());
	}

	@Test
	@DisplayName("Record 4677: Fax is 213-388-4821")
	void FaxOfRecord4677() {
		assertEquals("213-388-4821", customers.get(4676).getFax());
	}

	@Test
	@DisplayName("Record 4677: Email is nina@miyahira.com")
	void EmailOfRecord4677() {
		assertEquals("nina@miyahira.com", customers.get(4676).getEmail());
	}

	@Test
	@DisplayName("Record 4677: Web is http://www.ninamiyahira.com")
	void WebOfRecord4677() {
		assertEquals("http://www.ninamiyahira.com", customers.get(4676).getWeb());
	}
}
