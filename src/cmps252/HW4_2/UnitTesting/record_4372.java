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
class Record_4372 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4372: FirstName is Rae")
	void FirstNameOfRecord4372() {
		assertEquals("Rae", customers.get(4371).getFirstName());
	}

	@Test
	@DisplayName("Record 4372: LastName is Shiraki")
	void LastNameOfRecord4372() {
		assertEquals("Shiraki", customers.get(4371).getLastName());
	}

	@Test
	@DisplayName("Record 4372: Company is Proctor Publications")
	void CompanyOfRecord4372() {
		assertEquals("Proctor Publications", customers.get(4371).getCompany());
	}

	@Test
	@DisplayName("Record 4372: Address is 800 Brickell Ave")
	void AddressOfRecord4372() {
		assertEquals("800 Brickell Ave", customers.get(4371).getAddress());
	}

	@Test
	@DisplayName("Record 4372: City is Miami")
	void CityOfRecord4372() {
		assertEquals("Miami", customers.get(4371).getCity());
	}

	@Test
	@DisplayName("Record 4372: County is Miami-Dade")
	void CountyOfRecord4372() {
		assertEquals("Miami-Dade", customers.get(4371).getCounty());
	}

	@Test
	@DisplayName("Record 4372: State is FL")
	void StateOfRecord4372() {
		assertEquals("FL", customers.get(4371).getState());
	}

	@Test
	@DisplayName("Record 4372: ZIP is 33131")
	void ZIPOfRecord4372() {
		assertEquals("33131", customers.get(4371).getZIP());
	}

	@Test
	@DisplayName("Record 4372: Phone is 305-539-1185")
	void PhoneOfRecord4372() {
		assertEquals("305-539-1185", customers.get(4371).getPhone());
	}

	@Test
	@DisplayName("Record 4372: Fax is 305-539-8971")
	void FaxOfRecord4372() {
		assertEquals("305-539-8971", customers.get(4371).getFax());
	}

	@Test
	@DisplayName("Record 4372: Email is rae@shiraki.com")
	void EmailOfRecord4372() {
		assertEquals("rae@shiraki.com", customers.get(4371).getEmail());
	}

	@Test
	@DisplayName("Record 4372: Web is http://www.raeshiraki.com")
	void WebOfRecord4372() {
		assertEquals("http://www.raeshiraki.com", customers.get(4371).getWeb());
	}
}
