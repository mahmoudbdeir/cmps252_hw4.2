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
class Record_459 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 459: FirstName is Jerome")
	void FirstNameOfRecord459() {
		assertEquals("Jerome", customers.get(458).getFirstName());
	}

	@Test
	@DisplayName("Record 459: LastName is Paquin")
	void LastNameOfRecord459() {
		assertEquals("Paquin", customers.get(458).getLastName());
	}

	@Test
	@DisplayName("Record 459: Company is Coffey, Joseph A Jr")
	void CompanyOfRecord459() {
		assertEquals("Coffey, Joseph A Jr", customers.get(458).getCompany());
	}

	@Test
	@DisplayName("Record 459: Address is 3005 W Lake Mary Blvd")
	void AddressOfRecord459() {
		assertEquals("3005 W Lake Mary Blvd", customers.get(458).getAddress());
	}

	@Test
	@DisplayName("Record 459: City is Lake Mary")
	void CityOfRecord459() {
		assertEquals("Lake Mary", customers.get(458).getCity());
	}

	@Test
	@DisplayName("Record 459: County is Seminole")
	void CountyOfRecord459() {
		assertEquals("Seminole", customers.get(458).getCounty());
	}

	@Test
	@DisplayName("Record 459: State is FL")
	void StateOfRecord459() {
		assertEquals("FL", customers.get(458).getState());
	}

	@Test
	@DisplayName("Record 459: ZIP is 32746")
	void ZIPOfRecord459() {
		assertEquals("32746", customers.get(458).getZIP());
	}

	@Test
	@DisplayName("Record 459: Phone is 407-322-4502")
	void PhoneOfRecord459() {
		assertEquals("407-322-4502", customers.get(458).getPhone());
	}

	@Test
	@DisplayName("Record 459: Fax is 407-322-6322")
	void FaxOfRecord459() {
		assertEquals("407-322-6322", customers.get(458).getFax());
	}

	@Test
	@DisplayName("Record 459: Email is jerome@paquin.com")
	void EmailOfRecord459() {
		assertEquals("jerome@paquin.com", customers.get(458).getEmail());
	}

	@Test
	@DisplayName("Record 459: Web is http://www.jeromepaquin.com")
	void WebOfRecord459() {
		assertEquals("http://www.jeromepaquin.com", customers.get(458).getWeb());
	}
}
