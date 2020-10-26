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

@Tag("46")
class Record_3863 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3863: FirstName is Wesley")
	void FirstNameOfRecord3863() {
		assertEquals("Wesley", customers.get(3862).getFirstName());
	}

	@Test
	@DisplayName("Record 3863: LastName is Hamborsky")
	void LastNameOfRecord3863() {
		assertEquals("Hamborsky", customers.get(3862).getLastName());
	}

	@Test
	@DisplayName("Record 3863: Company is Fashion Corner")
	void CompanyOfRecord3863() {
		assertEquals("Fashion Corner", customers.get(3862).getCompany());
	}

	@Test
	@DisplayName("Record 3863: Address is 214 N Union St")
	void AddressOfRecord3863() {
		assertEquals("214 N Union St", customers.get(3862).getAddress());
	}

	@Test
	@DisplayName("Record 3863: City is Danville")
	void CityOfRecord3863() {
		assertEquals("Danville", customers.get(3862).getCity());
	}

	@Test
	@DisplayName("Record 3863: County is Danville City")
	void CountyOfRecord3863() {
		assertEquals("Danville City", customers.get(3862).getCounty());
	}

	@Test
	@DisplayName("Record 3863: State is VA")
	void StateOfRecord3863() {
		assertEquals("VA", customers.get(3862).getState());
	}

	@Test
	@DisplayName("Record 3863: ZIP is 24541")
	void ZIPOfRecord3863() {
		assertEquals("24541", customers.get(3862).getZIP());
	}

	@Test
	@DisplayName("Record 3863: Phone is 434-791-2118")
	void PhoneOfRecord3863() {
		assertEquals("434-791-2118", customers.get(3862).getPhone());
	}

	@Test
	@DisplayName("Record 3863: Fax is 434-791-5066")
	void FaxOfRecord3863() {
		assertEquals("434-791-5066", customers.get(3862).getFax());
	}

	@Test
	@DisplayName("Record 3863: Email is wesley@hamborsky.com")
	void EmailOfRecord3863() {
		assertEquals("wesley@hamborsky.com", customers.get(3862).getEmail());
	}

	@Test
	@DisplayName("Record 3863: Web is http://www.wesleyhamborsky.com")
	void WebOfRecord3863() {
		assertEquals("http://www.wesleyhamborsky.com", customers.get(3862).getWeb());
	}
}
