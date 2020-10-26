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

@Tag("23")
class Record_1479 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1479: FirstName is Eliseo")
	void FirstNameOfRecord1479() {
		assertEquals("Eliseo", customers.get(1478).getFirstName());
	}

	@Test
	@DisplayName("Record 1479: LastName is Meleski")
	void LastNameOfRecord1479() {
		assertEquals("Meleski", customers.get(1478).getLastName());
	}

	@Test
	@DisplayName("Record 1479: Company is Sams Lighting")
	void CompanyOfRecord1479() {
		assertEquals("Sams Lighting", customers.get(1478).getCompany());
	}

	@Test
	@DisplayName("Record 1479: Address is 7627 Lake St")
	void AddressOfRecord1479() {
		assertEquals("7627 Lake St", customers.get(1478).getAddress());
	}

	@Test
	@DisplayName("Record 1479: City is River Forest")
	void CityOfRecord1479() {
		assertEquals("River Forest", customers.get(1478).getCity());
	}

	@Test
	@DisplayName("Record 1479: County is Cook")
	void CountyOfRecord1479() {
		assertEquals("Cook", customers.get(1478).getCounty());
	}

	@Test
	@DisplayName("Record 1479: State is IL")
	void StateOfRecord1479() {
		assertEquals("IL", customers.get(1478).getState());
	}

	@Test
	@DisplayName("Record 1479: ZIP is 60305")
	void ZIPOfRecord1479() {
		assertEquals("60305", customers.get(1478).getZIP());
	}

	@Test
	@DisplayName("Record 1479: Phone is 708-771-4065")
	void PhoneOfRecord1479() {
		assertEquals("708-771-4065", customers.get(1478).getPhone());
	}

	@Test
	@DisplayName("Record 1479: Fax is 708-771-9678")
	void FaxOfRecord1479() {
		assertEquals("708-771-9678", customers.get(1478).getFax());
	}

	@Test
	@DisplayName("Record 1479: Email is eliseo@meleski.com")
	void EmailOfRecord1479() {
		assertEquals("eliseo@meleski.com", customers.get(1478).getEmail());
	}

	@Test
	@DisplayName("Record 1479: Web is http://www.eliseomeleski.com")
	void WebOfRecord1479() {
		assertEquals("http://www.eliseomeleski.com", customers.get(1478).getWeb());
	}
}
