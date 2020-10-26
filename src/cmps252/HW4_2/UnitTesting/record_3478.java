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
class Record_3478 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3478: FirstName is Greg")
	void FirstNameOfRecord3478() {
		assertEquals("Greg", customers.get(3477).getFirstName());
	}

	@Test
	@DisplayName("Record 3478: LastName is Lamoreux")
	void LastNameOfRecord3478() {
		assertEquals("Lamoreux", customers.get(3477).getLastName());
	}

	@Test
	@DisplayName("Record 3478: Company is Sheehan, James G Jr")
	void CompanyOfRecord3478() {
		assertEquals("Sheehan, James G Jr", customers.get(3477).getCompany());
	}

	@Test
	@DisplayName("Record 3478: Address is 4609 New Horizon Blvd  #-5")
	void AddressOfRecord3478() {
		assertEquals("4609 New Horizon Blvd  #-5", customers.get(3477).getAddress());
	}

	@Test
	@DisplayName("Record 3478: City is Bakersfield")
	void CityOfRecord3478() {
		assertEquals("Bakersfield", customers.get(3477).getCity());
	}

	@Test
	@DisplayName("Record 3478: County is Kern")
	void CountyOfRecord3478() {
		assertEquals("Kern", customers.get(3477).getCounty());
	}

	@Test
	@DisplayName("Record 3478: State is CA")
	void StateOfRecord3478() {
		assertEquals("CA", customers.get(3477).getState());
	}

	@Test
	@DisplayName("Record 3478: ZIP is 93313")
	void ZIPOfRecord3478() {
		assertEquals("93313", customers.get(3477).getZIP());
	}

	@Test
	@DisplayName("Record 3478: Phone is 661-396-7816")
	void PhoneOfRecord3478() {
		assertEquals("661-396-7816", customers.get(3477).getPhone());
	}

	@Test
	@DisplayName("Record 3478: Fax is 661-396-5483")
	void FaxOfRecord3478() {
		assertEquals("661-396-5483", customers.get(3477).getFax());
	}

	@Test
	@DisplayName("Record 3478: Email is Greg@lamoreux.com")
	void EmailOfRecord3478() {
		assertEquals("Greg@lamoreux.com", customers.get(3477).getEmail());
	}

	@Test
	@DisplayName("Record 3478: Web is http://www.Greglamoreux.com")
	void WebOfRecord3478() {
		assertEquals("http://www.Greglamoreux.com", customers.get(3477).getWeb());
	}
}
