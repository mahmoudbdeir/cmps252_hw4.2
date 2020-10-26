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

@Tag("0")
class Record_1978 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1978: FirstName is Kirk")
	void FirstNameOfRecord1978() {
		assertEquals("Kirk", customers.get(1977).getFirstName());
	}

	@Test
	@DisplayName("Record 1978: LastName is Bolds")
	void LastNameOfRecord1978() {
		assertEquals("Bolds", customers.get(1977).getLastName());
	}

	@Test
	@DisplayName("Record 1978: Company is Display Fabricators Inc")
	void CompanyOfRecord1978() {
		assertEquals("Display Fabricators Inc", customers.get(1977).getCompany());
	}

	@Test
	@DisplayName("Record 1978: Address is 500 Abbott Dr")
	void AddressOfRecord1978() {
		assertEquals("500 Abbott Dr", customers.get(1977).getAddress());
	}

	@Test
	@DisplayName("Record 1978: City is Broomall")
	void CityOfRecord1978() {
		assertEquals("Broomall", customers.get(1977).getCity());
	}

	@Test
	@DisplayName("Record 1978: County is Delaware")
	void CountyOfRecord1978() {
		assertEquals("Delaware", customers.get(1977).getCounty());
	}

	@Test
	@DisplayName("Record 1978: State is PA")
	void StateOfRecord1978() {
		assertEquals("PA", customers.get(1977).getState());
	}

	@Test
	@DisplayName("Record 1978: ZIP is 19008")
	void ZIPOfRecord1978() {
		assertEquals("19008", customers.get(1977).getZIP());
	}

	@Test
	@DisplayName("Record 1978: Phone is 610-328-7707")
	void PhoneOfRecord1978() {
		assertEquals("610-328-7707", customers.get(1977).getPhone());
	}

	@Test
	@DisplayName("Record 1978: Fax is 610-328-3332")
	void FaxOfRecord1978() {
		assertEquals("610-328-3332", customers.get(1977).getFax());
	}

	@Test
	@DisplayName("Record 1978: Email is kirk@bolds.com")
	void EmailOfRecord1978() {
		assertEquals("kirk@bolds.com", customers.get(1977).getEmail());
	}

	@Test
	@DisplayName("Record 1978: Web is http://www.kirkbolds.com")
	void WebOfRecord1978() {
		assertEquals("http://www.kirkbolds.com", customers.get(1977).getWeb());
	}
}
