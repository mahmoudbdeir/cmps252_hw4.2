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
class Record_4964 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4964: FirstName is Queen")
	void FirstNameOfRecord4964() {
		assertEquals("Queen", customers.get(4963).getFirstName());
	}

	@Test
	@DisplayName("Record 4964: LastName is Terrone")
	void LastNameOfRecord4964() {
		assertEquals("Terrone", customers.get(4963).getLastName());
	}

	@Test
	@DisplayName("Record 4964: Company is Ppd Usa Inc")
	void CompanyOfRecord4964() {
		assertEquals("Ppd Usa Inc", customers.get(4963).getCompany());
	}

	@Test
	@DisplayName("Record 4964: Address is 511 Millburn Ave")
	void AddressOfRecord4964() {
		assertEquals("511 Millburn Ave", customers.get(4963).getAddress());
	}

	@Test
	@DisplayName("Record 4964: City is Short Hills")
	void CityOfRecord4964() {
		assertEquals("Short Hills", customers.get(4963).getCity());
	}

	@Test
	@DisplayName("Record 4964: County is Essex")
	void CountyOfRecord4964() {
		assertEquals("Essex", customers.get(4963).getCounty());
	}

	@Test
	@DisplayName("Record 4964: State is NJ")
	void StateOfRecord4964() {
		assertEquals("NJ", customers.get(4963).getState());
	}

	@Test
	@DisplayName("Record 4964: ZIP is 7078")
	void ZIPOfRecord4964() {
		assertEquals("7078", customers.get(4963).getZIP());
	}

	@Test
	@DisplayName("Record 4964: Phone is 973-467-2424")
	void PhoneOfRecord4964() {
		assertEquals("973-467-2424", customers.get(4963).getPhone());
	}

	@Test
	@DisplayName("Record 4964: Fax is 973-467-0002")
	void FaxOfRecord4964() {
		assertEquals("973-467-0002", customers.get(4963).getFax());
	}

	@Test
	@DisplayName("Record 4964: Email is queen@terrone.com")
	void EmailOfRecord4964() {
		assertEquals("queen@terrone.com", customers.get(4963).getEmail());
	}

	@Test
	@DisplayName("Record 4964: Web is http://www.queenterrone.com")
	void WebOfRecord4964() {
		assertEquals("http://www.queenterrone.com", customers.get(4963).getWeb());
	}
}
