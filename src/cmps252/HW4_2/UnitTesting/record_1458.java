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

@Tag("17")
class Record_1458 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1458: FirstName is Mervin")
	void FirstNameOfRecord1458() {
		assertEquals("Mervin", customers.get(1457).getFirstName());
	}

	@Test
	@DisplayName("Record 1458: LastName is Norena")
	void LastNameOfRecord1458() {
		assertEquals("Norena", customers.get(1457).getLastName());
	}

	@Test
	@DisplayName("Record 1458: Company is Rice, Robert C Jr")
	void CompanyOfRecord1458() {
		assertEquals("Rice, Robert C Jr", customers.get(1457).getCompany());
	}

	@Test
	@DisplayName("Record 1458: Address is 1041 State Route 52")
	void AddressOfRecord1458() {
		assertEquals("1041 State Route 52", customers.get(1457).getAddress());
	}

	@Test
	@DisplayName("Record 1458: City is Walden")
	void CityOfRecord1458() {
		assertEquals("Walden", customers.get(1457).getCity());
	}

	@Test
	@DisplayName("Record 1458: County is Orange")
	void CountyOfRecord1458() {
		assertEquals("Orange", customers.get(1457).getCounty());
	}

	@Test
	@DisplayName("Record 1458: State is NY")
	void StateOfRecord1458() {
		assertEquals("NY", customers.get(1457).getState());
	}

	@Test
	@DisplayName("Record 1458: ZIP is 12586")
	void ZIPOfRecord1458() {
		assertEquals("12586", customers.get(1457).getZIP());
	}

	@Test
	@DisplayName("Record 1458: Phone is 845-778-7712")
	void PhoneOfRecord1458() {
		assertEquals("845-778-7712", customers.get(1457).getPhone());
	}

	@Test
	@DisplayName("Record 1458: Fax is 845-778-5423")
	void FaxOfRecord1458() {
		assertEquals("845-778-5423", customers.get(1457).getFax());
	}

	@Test
	@DisplayName("Record 1458: Email is mervin@norena.com")
	void EmailOfRecord1458() {
		assertEquals("mervin@norena.com", customers.get(1457).getEmail());
	}

	@Test
	@DisplayName("Record 1458: Web is http://www.mervinnorena.com")
	void WebOfRecord1458() {
		assertEquals("http://www.mervinnorena.com", customers.get(1457).getWeb());
	}
}
