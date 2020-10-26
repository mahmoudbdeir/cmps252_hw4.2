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

@Tag("29")
class Record_1456 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1456: FirstName is Armand")
	void FirstNameOfRecord1456() {
		assertEquals("Armand", customers.get(1455).getFirstName());
	}

	@Test
	@DisplayName("Record 1456: LastName is Dampier")
	void LastNameOfRecord1456() {
		assertEquals("Dampier", customers.get(1455).getLastName());
	}

	@Test
	@DisplayName("Record 1456: Company is Mason Candlelight Co")
	void CompanyOfRecord1456() {
		assertEquals("Mason Candlelight Co", customers.get(1455).getCompany());
	}

	@Test
	@DisplayName("Record 1456: Address is 8632 Old Ardmore Rd")
	void AddressOfRecord1456() {
		assertEquals("8632 Old Ardmore Rd", customers.get(1455).getAddress());
	}

	@Test
	@DisplayName("Record 1456: City is Hyattsville")
	void CityOfRecord1456() {
		assertEquals("Hyattsville", customers.get(1455).getCity());
	}

	@Test
	@DisplayName("Record 1456: County is Prince Georges")
	void CountyOfRecord1456() {
		assertEquals("Prince Georges", customers.get(1455).getCounty());
	}

	@Test
	@DisplayName("Record 1456: State is MD")
	void StateOfRecord1456() {
		assertEquals("MD", customers.get(1455).getState());
	}

	@Test
	@DisplayName("Record 1456: ZIP is 20785")
	void ZIPOfRecord1456() {
		assertEquals("20785", customers.get(1455).getZIP());
	}

	@Test
	@DisplayName("Record 1456: Phone is 301-773-9007")
	void PhoneOfRecord1456() {
		assertEquals("301-773-9007", customers.get(1455).getPhone());
	}

	@Test
	@DisplayName("Record 1456: Fax is 301-773-4006")
	void FaxOfRecord1456() {
		assertEquals("301-773-4006", customers.get(1455).getFax());
	}

	@Test
	@DisplayName("Record 1456: Email is armand@dampier.com")
	void EmailOfRecord1456() {
		assertEquals("armand@dampier.com", customers.get(1455).getEmail());
	}

	@Test
	@DisplayName("Record 1456: Web is http://www.armanddampier.com")
	void WebOfRecord1456() {
		assertEquals("http://www.armanddampier.com", customers.get(1455).getWeb());
	}
}
