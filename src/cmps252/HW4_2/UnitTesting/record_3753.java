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

@Tag("35")
class Record_3753 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3753: FirstName is Jeremy")
	void FirstNameOfRecord3753() {
		assertEquals("Jeremy", customers.get(3752).getFirstName());
	}

	@Test
	@DisplayName("Record 3753: LastName is Zarin")
	void LastNameOfRecord3753() {
		assertEquals("Zarin", customers.get(3752).getLastName());
	}

	@Test
	@DisplayName("Record 3753: Company is Andrew Phaneuf Roofing")
	void CompanyOfRecord3753() {
		assertEquals("Andrew Phaneuf Roofing", customers.get(3752).getCompany());
	}

	@Test
	@DisplayName("Record 3753: Address is 1258 Mission St")
	void AddressOfRecord3753() {
		assertEquals("1258 Mission St", customers.get(3752).getAddress());
	}

	@Test
	@DisplayName("Record 3753: City is San Francisco")
	void CityOfRecord3753() {
		assertEquals("San Francisco", customers.get(3752).getCity());
	}

	@Test
	@DisplayName("Record 3753: County is San Francisco")
	void CountyOfRecord3753() {
		assertEquals("San Francisco", customers.get(3752).getCounty());
	}

	@Test
	@DisplayName("Record 3753: State is CA")
	void StateOfRecord3753() {
		assertEquals("CA", customers.get(3752).getState());
	}

	@Test
	@DisplayName("Record 3753: ZIP is 94103")
	void ZIPOfRecord3753() {
		assertEquals("94103", customers.get(3752).getZIP());
	}

	@Test
	@DisplayName("Record 3753: Phone is 415-864-8194")
	void PhoneOfRecord3753() {
		assertEquals("415-864-8194", customers.get(3752).getPhone());
	}

	@Test
	@DisplayName("Record 3753: Fax is 415-864-9308")
	void FaxOfRecord3753() {
		assertEquals("415-864-9308", customers.get(3752).getFax());
	}

	@Test
	@DisplayName("Record 3753: Email is jeremy@zarin.com")
	void EmailOfRecord3753() {
		assertEquals("jeremy@zarin.com", customers.get(3752).getEmail());
	}

	@Test
	@DisplayName("Record 3753: Web is http://www.jeremyzarin.com")
	void WebOfRecord3753() {
		assertEquals("http://www.jeremyzarin.com", customers.get(3752).getWeb());
	}
}
