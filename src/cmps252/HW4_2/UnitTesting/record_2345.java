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

@Tag("9")
class Record_2345 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2345: FirstName is Marcos")
	void FirstNameOfRecord2345() {
		assertEquals("Marcos", customers.get(2344).getFirstName());
	}

	@Test
	@DisplayName("Record 2345: LastName is Dugi")
	void LastNameOfRecord2345() {
		assertEquals("Dugi", customers.get(2344).getLastName());
	}

	@Test
	@DisplayName("Record 2345: Company is Murray Corporation")
	void CompanyOfRecord2345() {
		assertEquals("Murray Corporation", customers.get(2344).getCompany());
	}

	@Test
	@DisplayName("Record 2345: Address is Box #-1128")
	void AddressOfRecord2345() {
		assertEquals("Box #-1128", customers.get(2344).getAddress());
	}

	@Test
	@DisplayName("Record 2345: City is Nome")
	void CityOfRecord2345() {
		assertEquals("Nome", customers.get(2344).getCity());
	}

	@Test
	@DisplayName("Record 2345: County is Nome")
	void CountyOfRecord2345() {
		assertEquals("Nome", customers.get(2344).getCounty());
	}

	@Test
	@DisplayName("Record 2345: State is AK")
	void StateOfRecord2345() {
		assertEquals("AK", customers.get(2344).getState());
	}

	@Test
	@DisplayName("Record 2345: ZIP is 99762")
	void ZIPOfRecord2345() {
		assertEquals("99762", customers.get(2344).getZIP());
	}

	@Test
	@DisplayName("Record 2345: Phone is 907-443-1027")
	void PhoneOfRecord2345() {
		assertEquals("907-443-1027", customers.get(2344).getPhone());
	}

	@Test
	@DisplayName("Record 2345: Fax is 907-443-3945")
	void FaxOfRecord2345() {
		assertEquals("907-443-3945", customers.get(2344).getFax());
	}

	@Test
	@DisplayName("Record 2345: Email is marcos@dugi.com")
	void EmailOfRecord2345() {
		assertEquals("marcos@dugi.com", customers.get(2344).getEmail());
	}

	@Test
	@DisplayName("Record 2345: Web is http://www.marcosdugi.com")
	void WebOfRecord2345() {
		assertEquals("http://www.marcosdugi.com", customers.get(2344).getWeb());
	}
}
