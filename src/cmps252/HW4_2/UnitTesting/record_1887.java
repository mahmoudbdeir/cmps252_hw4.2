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

@Tag("26")
class Record_1887 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1887: FirstName is Carrol")
	void FirstNameOfRecord1887() {
		assertEquals("Carrol", customers.get(1886).getFirstName());
	}

	@Test
	@DisplayName("Record 1887: LastName is Mcgibney")
	void LastNameOfRecord1887() {
		assertEquals("Mcgibney", customers.get(1886).getLastName());
	}

	@Test
	@DisplayName("Record 1887: Company is Boston Centerless Inc")
	void CompanyOfRecord1887() {
		assertEquals("Boston Centerless Inc", customers.get(1886).getCompany());
	}

	@Test
	@DisplayName("Record 1887: Address is 140 Price St")
	void AddressOfRecord1887() {
		assertEquals("140 Price St", customers.get(1886).getAddress());
	}

	@Test
	@DisplayName("Record 1887: City is Jackson")
	void CityOfRecord1887() {
		assertEquals("Jackson", customers.get(1886).getCity());
	}

	@Test
	@DisplayName("Record 1887: County is Jackson")
	void CountyOfRecord1887() {
		assertEquals("Jackson", customers.get(1886).getCounty());
	}

	@Test
	@DisplayName("Record 1887: State is MI")
	void StateOfRecord1887() {
		assertEquals("MI", customers.get(1886).getState());
	}

	@Test
	@DisplayName("Record 1887: ZIP is 49202")
	void ZIPOfRecord1887() {
		assertEquals("49202", customers.get(1886).getZIP());
	}

	@Test
	@DisplayName("Record 1887: Phone is 517-788-9596")
	void PhoneOfRecord1887() {
		assertEquals("517-788-9596", customers.get(1886).getPhone());
	}

	@Test
	@DisplayName("Record 1887: Fax is 517-788-6888")
	void FaxOfRecord1887() {
		assertEquals("517-788-6888", customers.get(1886).getFax());
	}

	@Test
	@DisplayName("Record 1887: Email is carrol@mcgibney.com")
	void EmailOfRecord1887() {
		assertEquals("carrol@mcgibney.com", customers.get(1886).getEmail());
	}

	@Test
	@DisplayName("Record 1887: Web is http://www.carrolmcgibney.com")
	void WebOfRecord1887() {
		assertEquals("http://www.carrolmcgibney.com", customers.get(1886).getWeb());
	}
}
