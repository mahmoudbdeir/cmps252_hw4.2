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

@Tag("12")
class Record_368 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 368: FirstName is Marcellus")
	void FirstNameOfRecord368() {
		assertEquals("Marcellus", customers.get(367).getFirstName());
	}

	@Test
	@DisplayName("Record 368: LastName is Parrin")
	void LastNameOfRecord368() {
		assertEquals("Parrin", customers.get(367).getLastName());
	}

	@Test
	@DisplayName("Record 368: Company is Patient Pride")
	void CompanyOfRecord368() {
		assertEquals("Patient Pride", customers.get(367).getCompany());
	}

	@Test
	@DisplayName("Record 368: Address is 64 Mill St")
	void AddressOfRecord368() {
		assertEquals("64 Mill St", customers.get(367).getAddress());
	}

	@Test
	@DisplayName("Record 368: City is Southbridge")
	void CityOfRecord368() {
		assertEquals("Southbridge", customers.get(367).getCity());
	}

	@Test
	@DisplayName("Record 368: County is Worcester")
	void CountyOfRecord368() {
		assertEquals("Worcester", customers.get(367).getCounty());
	}

	@Test
	@DisplayName("Record 368: State is MA")
	void StateOfRecord368() {
		assertEquals("MA", customers.get(367).getState());
	}

	@Test
	@DisplayName("Record 368: ZIP is 1550")
	void ZIPOfRecord368() {
		assertEquals("1550", customers.get(367).getZIP());
	}

	@Test
	@DisplayName("Record 368: Phone is 508-765-6400")
	void PhoneOfRecord368() {
		assertEquals("508-765-6400", customers.get(367).getPhone());
	}

	@Test
	@DisplayName("Record 368: Fax is 508-765-5907")
	void FaxOfRecord368() {
		assertEquals("508-765-5907", customers.get(367).getFax());
	}

	@Test
	@DisplayName("Record 368: Email is marcellus@parrin.com")
	void EmailOfRecord368() {
		assertEquals("marcellus@parrin.com", customers.get(367).getEmail());
	}

	@Test
	@DisplayName("Record 368: Web is http://www.marcellusparrin.com")
	void WebOfRecord368() {
		assertEquals("http://www.marcellusparrin.com", customers.get(367).getWeb());
	}
}
