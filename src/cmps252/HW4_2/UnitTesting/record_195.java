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

@Tag("42")
class Record_195 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 195: FirstName is Tessa")
	void FirstNameOfRecord195() {
		assertEquals("Tessa", customers.get(194).getFirstName());
	}

	@Test
	@DisplayName("Record 195: LastName is Broxton")
	void LastNameOfRecord195() {
		assertEquals("Broxton", customers.get(194).getLastName());
	}

	@Test
	@DisplayName("Record 195: Company is Melvin, Matthew G Esq")
	void CompanyOfRecord195() {
		assertEquals("Melvin, Matthew G Esq", customers.get(194).getCompany());
	}

	@Test
	@DisplayName("Record 195: Address is 41980 Ann Arbor Rd E")
	void AddressOfRecord195() {
		assertEquals("41980 Ann Arbor Rd E", customers.get(194).getAddress());
	}

	@Test
	@DisplayName("Record 195: City is Plymouth")
	void CityOfRecord195() {
		assertEquals("Plymouth", customers.get(194).getCity());
	}

	@Test
	@DisplayName("Record 195: County is Wayne")
	void CountyOfRecord195() {
		assertEquals("Wayne", customers.get(194).getCounty());
	}

	@Test
	@DisplayName("Record 195: State is MI")
	void StateOfRecord195() {
		assertEquals("MI", customers.get(194).getState());
	}

	@Test
	@DisplayName("Record 195: ZIP is 48170")
	void ZIPOfRecord195() {
		assertEquals("48170", customers.get(194).getZIP());
	}

	@Test
	@DisplayName("Record 195: Phone is 734-455-6024")
	void PhoneOfRecord195() {
		assertEquals("734-455-6024", customers.get(194).getPhone());
	}

	@Test
	@DisplayName("Record 195: Fax is 734-455-1437")
	void FaxOfRecord195() {
		assertEquals("734-455-1437", customers.get(194).getFax());
	}

	@Test
	@DisplayName("Record 195: Email is tessa@broxton.com")
	void EmailOfRecord195() {
		assertEquals("tessa@broxton.com", customers.get(194).getEmail());
	}

	@Test
	@DisplayName("Record 195: Web is http://www.tessabroxton.com")
	void WebOfRecord195() {
		assertEquals("http://www.tessabroxton.com", customers.get(194).getWeb());
	}
}
