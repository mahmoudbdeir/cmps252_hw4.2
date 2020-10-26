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

@Tag("24")
class Record_4114 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4114: FirstName is Lily")
	void FirstNameOfRecord4114() {
		assertEquals("Lily", customers.get(4113).getFirstName());
	}

	@Test
	@DisplayName("Record 4114: LastName is Iberra")
	void LastNameOfRecord4114() {
		assertEquals("Iberra", customers.get(4113).getLastName());
	}

	@Test
	@DisplayName("Record 4114: Company is Many Happy Returns")
	void CompanyOfRecord4114() {
		assertEquals("Many Happy Returns", customers.get(4113).getCompany());
	}

	@Test
	@DisplayName("Record 4114: Address is 6933 W 59th St")
	void AddressOfRecord4114() {
		assertEquals("6933 W 59th St", customers.get(4113).getAddress());
	}

	@Test
	@DisplayName("Record 4114: City is Chicago")
	void CityOfRecord4114() {
		assertEquals("Chicago", customers.get(4113).getCity());
	}

	@Test
	@DisplayName("Record 4114: County is Cook")
	void CountyOfRecord4114() {
		assertEquals("Cook", customers.get(4113).getCounty());
	}

	@Test
	@DisplayName("Record 4114: State is IL")
	void StateOfRecord4114() {
		assertEquals("IL", customers.get(4113).getState());
	}

	@Test
	@DisplayName("Record 4114: ZIP is 60638")
	void ZIPOfRecord4114() {
		assertEquals("60638", customers.get(4113).getZIP());
	}

	@Test
	@DisplayName("Record 4114: Phone is 773-586-4036")
	void PhoneOfRecord4114() {
		assertEquals("773-586-4036", customers.get(4113).getPhone());
	}

	@Test
	@DisplayName("Record 4114: Fax is 773-586-1404")
	void FaxOfRecord4114() {
		assertEquals("773-586-1404", customers.get(4113).getFax());
	}

	@Test
	@DisplayName("Record 4114: Email is lily@iberra.com")
	void EmailOfRecord4114() {
		assertEquals("lily@iberra.com", customers.get(4113).getEmail());
	}

	@Test
	@DisplayName("Record 4114: Web is http://www.lilyiberra.com")
	void WebOfRecord4114() {
		assertEquals("http://www.lilyiberra.com", customers.get(4113).getWeb());
	}
}
