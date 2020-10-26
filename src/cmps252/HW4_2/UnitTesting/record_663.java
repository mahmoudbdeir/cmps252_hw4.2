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

@Tag("30")
class Record_663 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 663: FirstName is Samantha")
	void FirstNameOfRecord663() {
		assertEquals("Samantha", customers.get(662).getFirstName());
	}

	@Test
	@DisplayName("Record 663: LastName is Shelkoff")
	void LastNameOfRecord663() {
		assertEquals("Shelkoff", customers.get(662).getLastName());
	}

	@Test
	@DisplayName("Record 663: Company is Stone Medical Supply Corp")
	void CompanyOfRecord663() {
		assertEquals("Stone Medical Supply Corp", customers.get(662).getCompany());
	}

	@Test
	@DisplayName("Record 663: Address is 1743 Route 88")
	void AddressOfRecord663() {
		assertEquals("1743 Route 88", customers.get(662).getAddress());
	}

	@Test
	@DisplayName("Record 663: City is Brick")
	void CityOfRecord663() {
		assertEquals("Brick", customers.get(662).getCity());
	}

	@Test
	@DisplayName("Record 663: County is Ocean")
	void CountyOfRecord663() {
		assertEquals("Ocean", customers.get(662).getCounty());
	}

	@Test
	@DisplayName("Record 663: State is NJ")
	void StateOfRecord663() {
		assertEquals("NJ", customers.get(662).getState());
	}

	@Test
	@DisplayName("Record 663: ZIP is 8724")
	void ZIPOfRecord663() {
		assertEquals("8724", customers.get(662).getZIP());
	}

	@Test
	@DisplayName("Record 663: Phone is 732-458-6321")
	void PhoneOfRecord663() {
		assertEquals("732-458-6321", customers.get(662).getPhone());
	}

	@Test
	@DisplayName("Record 663: Fax is 732-458-6939")
	void FaxOfRecord663() {
		assertEquals("732-458-6939", customers.get(662).getFax());
	}

	@Test
	@DisplayName("Record 663: Email is samantha@shelkoff.com")
	void EmailOfRecord663() {
		assertEquals("samantha@shelkoff.com", customers.get(662).getEmail());
	}

	@Test
	@DisplayName("Record 663: Web is http://www.samanthashelkoff.com")
	void WebOfRecord663() {
		assertEquals("http://www.samanthashelkoff.com", customers.get(662).getWeb());
	}
}
