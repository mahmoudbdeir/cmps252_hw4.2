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

@Tag("22")
class Record_1356 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1356: FirstName is Theo")
	void FirstNameOfRecord1356() {
		assertEquals("Theo", customers.get(1355).getFirstName());
	}

	@Test
	@DisplayName("Record 1356: LastName is Currie")
	void LastNameOfRecord1356() {
		assertEquals("Currie", customers.get(1355).getLastName());
	}

	@Test
	@DisplayName("Record 1356: Company is Business Laws Inc")
	void CompanyOfRecord1356() {
		assertEquals("Business Laws Inc", customers.get(1355).getCompany());
	}

	@Test
	@DisplayName("Record 1356: Address is 11818 L St")
	void AddressOfRecord1356() {
		assertEquals("11818 L St", customers.get(1355).getAddress());
	}

	@Test
	@DisplayName("Record 1356: City is Omaha")
	void CityOfRecord1356() {
		assertEquals("Omaha", customers.get(1355).getCity());
	}

	@Test
	@DisplayName("Record 1356: County is Douglas")
	void CountyOfRecord1356() {
		assertEquals("Douglas", customers.get(1355).getCounty());
	}

	@Test
	@DisplayName("Record 1356: State is NE")
	void StateOfRecord1356() {
		assertEquals("NE", customers.get(1355).getState());
	}

	@Test
	@DisplayName("Record 1356: ZIP is 68137")
	void ZIPOfRecord1356() {
		assertEquals("68137", customers.get(1355).getZIP());
	}

	@Test
	@DisplayName("Record 1356: Phone is 402-333-8628")
	void PhoneOfRecord1356() {
		assertEquals("402-333-8628", customers.get(1355).getPhone());
	}

	@Test
	@DisplayName("Record 1356: Fax is 402-333-4137")
	void FaxOfRecord1356() {
		assertEquals("402-333-4137", customers.get(1355).getFax());
	}

	@Test
	@DisplayName("Record 1356: Email is theo@currie.com")
	void EmailOfRecord1356() {
		assertEquals("theo@currie.com", customers.get(1355).getEmail());
	}

	@Test
	@DisplayName("Record 1356: Web is http://www.theocurrie.com")
	void WebOfRecord1356() {
		assertEquals("http://www.theocurrie.com", customers.get(1355).getWeb());
	}
}
