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

@Tag("1")
class Record_4581 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4581: FirstName is Jae")
	void FirstNameOfRecord4581() {
		assertEquals("Jae", customers.get(4580).getFirstName());
	}

	@Test
	@DisplayName("Record 4581: LastName is Contras")
	void LastNameOfRecord4581() {
		assertEquals("Contras", customers.get(4580).getLastName());
	}

	@Test
	@DisplayName("Record 4581: Company is A T Williams Oil Co")
	void CompanyOfRecord4581() {
		assertEquals("A T Williams Oil Co", customers.get(4580).getCompany());
	}

	@Test
	@DisplayName("Record 4581: Address is 1443 Upland St")
	void AddressOfRecord4581() {
		assertEquals("1443 Upland St", customers.get(4580).getAddress());
	}

	@Test
	@DisplayName("Record 4581: City is Chester")
	void CityOfRecord4581() {
		assertEquals("Chester", customers.get(4580).getCity());
	}

	@Test
	@DisplayName("Record 4581: County is Delaware")
	void CountyOfRecord4581() {
		assertEquals("Delaware", customers.get(4580).getCounty());
	}

	@Test
	@DisplayName("Record 4581: State is PA")
	void StateOfRecord4581() {
		assertEquals("PA", customers.get(4580).getState());
	}

	@Test
	@DisplayName("Record 4581: ZIP is 19013")
	void ZIPOfRecord4581() {
		assertEquals("19013", customers.get(4580).getZIP());
	}

	@Test
	@DisplayName("Record 4581: Phone is 610-490-0161")
	void PhoneOfRecord4581() {
		assertEquals("610-490-0161", customers.get(4580).getPhone());
	}

	@Test
	@DisplayName("Record 4581: Fax is 610-490-2695")
	void FaxOfRecord4581() {
		assertEquals("610-490-2695", customers.get(4580).getFax());
	}

	@Test
	@DisplayName("Record 4581: Email is jae@contras.com")
	void EmailOfRecord4581() {
		assertEquals("jae@contras.com", customers.get(4580).getEmail());
	}

	@Test
	@DisplayName("Record 4581: Web is http://www.jaecontras.com")
	void WebOfRecord4581() {
		assertEquals("http://www.jaecontras.com", customers.get(4580).getWeb());
	}
}
