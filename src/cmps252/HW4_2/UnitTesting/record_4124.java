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

@Tag("8")
class Record_4124 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4124: FirstName is Phil")
	void FirstNameOfRecord4124() {
		assertEquals("Phil", customers.get(4123).getFirstName());
	}

	@Test
	@DisplayName("Record 4124: LastName is Renn")
	void LastNameOfRecord4124() {
		assertEquals("Renn", customers.get(4123).getLastName());
	}

	@Test
	@DisplayName("Record 4124: Company is Tecton Corporation")
	void CompanyOfRecord4124() {
		assertEquals("Tecton Corporation", customers.get(4123).getCompany());
	}

	@Test
	@DisplayName("Record 4124: Address is 7150 E County Line Rd")
	void AddressOfRecord4124() {
		assertEquals("7150 E County Line Rd", customers.get(4123).getAddress());
	}

	@Test
	@DisplayName("Record 4124: City is Littleton")
	void CityOfRecord4124() {
		assertEquals("Littleton", customers.get(4123).getCity());
	}

	@Test
	@DisplayName("Record 4124: County is Douglas")
	void CountyOfRecord4124() {
		assertEquals("Douglas", customers.get(4123).getCounty());
	}

	@Test
	@DisplayName("Record 4124: State is CO")
	void StateOfRecord4124() {
		assertEquals("CO", customers.get(4123).getState());
	}

	@Test
	@DisplayName("Record 4124: ZIP is 80126")
	void ZIPOfRecord4124() {
		assertEquals("80126", customers.get(4123).getZIP());
	}

	@Test
	@DisplayName("Record 4124: Phone is 303-694-5521")
	void PhoneOfRecord4124() {
		assertEquals("303-694-5521", customers.get(4123).getPhone());
	}

	@Test
	@DisplayName("Record 4124: Fax is 303-694-3787")
	void FaxOfRecord4124() {
		assertEquals("303-694-3787", customers.get(4123).getFax());
	}

	@Test
	@DisplayName("Record 4124: Email is phil@renn.com")
	void EmailOfRecord4124() {
		assertEquals("phil@renn.com", customers.get(4123).getEmail());
	}

	@Test
	@DisplayName("Record 4124: Web is http://www.philrenn.com")
	void WebOfRecord4124() {
		assertEquals("http://www.philrenn.com", customers.get(4123).getWeb());
	}
}
