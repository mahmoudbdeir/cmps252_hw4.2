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

@Tag("47")
class Record_3754 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3754: FirstName is Tyron")
	void FirstNameOfRecord3754() {
		assertEquals("Tyron", customers.get(3753).getFirstName());
	}

	@Test
	@DisplayName("Record 3754: LastName is Walbridge")
	void LastNameOfRecord3754() {
		assertEquals("Walbridge", customers.get(3753).getLastName());
	}

	@Test
	@DisplayName("Record 3754: Company is Enslin & Son Packing Co")
	void CompanyOfRecord3754() {
		assertEquals("Enslin & Son Packing Co", customers.get(3753).getCompany());
	}

	@Test
	@DisplayName("Record 3754: Address is 1085 E 31st St")
	void AddressOfRecord3754() {
		assertEquals("1085 E 31st St", customers.get(3753).getAddress());
	}

	@Test
	@DisplayName("Record 3754: City is Hialeah")
	void CityOfRecord3754() {
		assertEquals("Hialeah", customers.get(3753).getCity());
	}

	@Test
	@DisplayName("Record 3754: County is Miami-Dade")
	void CountyOfRecord3754() {
		assertEquals("Miami-Dade", customers.get(3753).getCounty());
	}

	@Test
	@DisplayName("Record 3754: State is FL")
	void StateOfRecord3754() {
		assertEquals("FL", customers.get(3753).getState());
	}

	@Test
	@DisplayName("Record 3754: ZIP is 33013")
	void ZIPOfRecord3754() {
		assertEquals("33013", customers.get(3753).getZIP());
	}

	@Test
	@DisplayName("Record 3754: Phone is 305-836-5460")
	void PhoneOfRecord3754() {
		assertEquals("305-836-5460", customers.get(3753).getPhone());
	}

	@Test
	@DisplayName("Record 3754: Fax is 305-836-7645")
	void FaxOfRecord3754() {
		assertEquals("305-836-7645", customers.get(3753).getFax());
	}

	@Test
	@DisplayName("Record 3754: Email is tyron@walbridge.com")
	void EmailOfRecord3754() {
		assertEquals("tyron@walbridge.com", customers.get(3753).getEmail());
	}

	@Test
	@DisplayName("Record 3754: Web is http://www.tyronwalbridge.com")
	void WebOfRecord3754() {
		assertEquals("http://www.tyronwalbridge.com", customers.get(3753).getWeb());
	}
}
