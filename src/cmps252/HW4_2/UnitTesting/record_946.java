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
class Record_946 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 946: FirstName is Tessa")
	void FirstNameOfRecord946() {
		assertEquals("Tessa", customers.get(945).getFirstName());
	}

	@Test
	@DisplayName("Record 946: LastName is Peltier")
	void LastNameOfRecord946() {
		assertEquals("Peltier", customers.get(945).getLastName());
	}

	@Test
	@DisplayName("Record 946: Company is Kolbye Associates")
	void CompanyOfRecord946() {
		assertEquals("Kolbye Associates", customers.get(945).getCompany());
	}

	@Test
	@DisplayName("Record 946: Address is 777 N Shore Rd")
	void AddressOfRecord946() {
		assertEquals("777 N Shore Rd", customers.get(945).getAddress());
	}

	@Test
	@DisplayName("Record 946: City is Revere")
	void CityOfRecord946() {
		assertEquals("Revere", customers.get(945).getCity());
	}

	@Test
	@DisplayName("Record 946: County is Suffolk")
	void CountyOfRecord946() {
		assertEquals("Suffolk", customers.get(945).getCounty());
	}

	@Test
	@DisplayName("Record 946: State is MA")
	void StateOfRecord946() {
		assertEquals("MA", customers.get(945).getState());
	}

	@Test
	@DisplayName("Record 946: ZIP is 2151")
	void ZIPOfRecord946() {
		assertEquals("2151", customers.get(945).getZIP());
	}

	@Test
	@DisplayName("Record 946: Phone is 781-286-0862")
	void PhoneOfRecord946() {
		assertEquals("781-286-0862", customers.get(945).getPhone());
	}

	@Test
	@DisplayName("Record 946: Fax is 781-286-1362")
	void FaxOfRecord946() {
		assertEquals("781-286-1362", customers.get(945).getFax());
	}

	@Test
	@DisplayName("Record 946: Email is tessa@peltier.com")
	void EmailOfRecord946() {
		assertEquals("tessa@peltier.com", customers.get(945).getEmail());
	}

	@Test
	@DisplayName("Record 946: Web is http://www.tessapeltier.com")
	void WebOfRecord946() {
		assertEquals("http://www.tessapeltier.com", customers.get(945).getWeb());
	}
}
