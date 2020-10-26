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

@Tag("7")
class Record_967 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 967: FirstName is Gilberto")
	void FirstNameOfRecord967() {
		assertEquals("Gilberto", customers.get(966).getFirstName());
	}

	@Test
	@DisplayName("Record 967: LastName is Matuszeski")
	void LastNameOfRecord967() {
		assertEquals("Matuszeski", customers.get(966).getLastName());
	}

	@Test
	@DisplayName("Record 967: Company is Alsea Veneer")
	void CompanyOfRecord967() {
		assertEquals("Alsea Veneer", customers.get(966).getCompany());
	}

	@Test
	@DisplayName("Record 967: Address is 12 E Market St")
	void AddressOfRecord967() {
		assertEquals("12 E Market St", customers.get(966).getAddress());
	}

	@Test
	@DisplayName("Record 967: City is Long Beach")
	void CityOfRecord967() {
		assertEquals("Long Beach", customers.get(966).getCity());
	}

	@Test
	@DisplayName("Record 967: County is Los Angeles")
	void CountyOfRecord967() {
		assertEquals("Los Angeles", customers.get(966).getCounty());
	}

	@Test
	@DisplayName("Record 967: State is CA")
	void StateOfRecord967() {
		assertEquals("CA", customers.get(966).getState());
	}

	@Test
	@DisplayName("Record 967: ZIP is 90805")
	void ZIPOfRecord967() {
		assertEquals("90805", customers.get(966).getZIP());
	}

	@Test
	@DisplayName("Record 967: Phone is 562-422-4936")
	void PhoneOfRecord967() {
		assertEquals("562-422-4936", customers.get(966).getPhone());
	}

	@Test
	@DisplayName("Record 967: Fax is 562-422-4083")
	void FaxOfRecord967() {
		assertEquals("562-422-4083", customers.get(966).getFax());
	}

	@Test
	@DisplayName("Record 967: Email is gilberto@matuszeski.com")
	void EmailOfRecord967() {
		assertEquals("gilberto@matuszeski.com", customers.get(966).getEmail());
	}

	@Test
	@DisplayName("Record 967: Web is http://www.gilbertomatuszeski.com")
	void WebOfRecord967() {
		assertEquals("http://www.gilbertomatuszeski.com", customers.get(966).getWeb());
	}
}
