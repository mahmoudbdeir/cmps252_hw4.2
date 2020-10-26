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

@Tag("38")
class Record_4851 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4851: FirstName is Curt")
	void FirstNameOfRecord4851() {
		assertEquals("Curt", customers.get(4850).getFirstName());
	}

	@Test
	@DisplayName("Record 4851: LastName is Santora")
	void LastNameOfRecord4851() {
		assertEquals("Santora", customers.get(4850).getLastName());
	}

	@Test
	@DisplayName("Record 4851: Company is Supercut Bandsaw Co Inc")
	void CompanyOfRecord4851() {
		assertEquals("Supercut Bandsaw Co Inc", customers.get(4850).getCompany());
	}

	@Test
	@DisplayName("Record 4851: Address is 2425 Merrill Field Dr")
	void AddressOfRecord4851() {
		assertEquals("2425 Merrill Field Dr", customers.get(4850).getAddress());
	}

	@Test
	@DisplayName("Record 4851: City is Anchorage")
	void CityOfRecord4851() {
		assertEquals("Anchorage", customers.get(4850).getCity());
	}

	@Test
	@DisplayName("Record 4851: County is Anchorage")
	void CountyOfRecord4851() {
		assertEquals("Anchorage", customers.get(4850).getCounty());
	}

	@Test
	@DisplayName("Record 4851: State is AK")
	void StateOfRecord4851() {
		assertEquals("AK", customers.get(4850).getState());
	}

	@Test
	@DisplayName("Record 4851: ZIP is 99501")
	void ZIPOfRecord4851() {
		assertEquals("99501", customers.get(4850).getZIP());
	}

	@Test
	@DisplayName("Record 4851: Phone is 907-276-3887")
	void PhoneOfRecord4851() {
		assertEquals("907-276-3887", customers.get(4850).getPhone());
	}

	@Test
	@DisplayName("Record 4851: Fax is 907-276-3401")
	void FaxOfRecord4851() {
		assertEquals("907-276-3401", customers.get(4850).getFax());
	}

	@Test
	@DisplayName("Record 4851: Email is curt@santora.com")
	void EmailOfRecord4851() {
		assertEquals("curt@santora.com", customers.get(4850).getEmail());
	}

	@Test
	@DisplayName("Record 4851: Web is http://www.curtsantora.com")
	void WebOfRecord4851() {
		assertEquals("http://www.curtsantora.com", customers.get(4850).getWeb());
	}
}
