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

@Tag("32")
class Record_4592 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4592: FirstName is Samual")
	void FirstNameOfRecord4592() {
		assertEquals("Samual", customers.get(4591).getFirstName());
	}

	@Test
	@DisplayName("Record 4592: LastName is Sandercock")
	void LastNameOfRecord4592() {
		assertEquals("Sandercock", customers.get(4591).getLastName());
	}

	@Test
	@DisplayName("Record 4592: Company is Doussan Inc")
	void CompanyOfRecord4592() {
		assertEquals("Doussan Inc", customers.get(4591).getCompany());
	}

	@Test
	@DisplayName("Record 4592: Address is 12117 Vanowen St")
	void AddressOfRecord4592() {
		assertEquals("12117 Vanowen St", customers.get(4591).getAddress());
	}

	@Test
	@DisplayName("Record 4592: City is North Hollywood")
	void CityOfRecord4592() {
		assertEquals("North Hollywood", customers.get(4591).getCity());
	}

	@Test
	@DisplayName("Record 4592: County is Los Angeles")
	void CountyOfRecord4592() {
		assertEquals("Los Angeles", customers.get(4591).getCounty());
	}

	@Test
	@DisplayName("Record 4592: State is CA")
	void StateOfRecord4592() {
		assertEquals("CA", customers.get(4591).getState());
	}

	@Test
	@DisplayName("Record 4592: ZIP is 91605")
	void ZIPOfRecord4592() {
		assertEquals("91605", customers.get(4591).getZIP());
	}

	@Test
	@DisplayName("Record 4592: Phone is 818-765-2341")
	void PhoneOfRecord4592() {
		assertEquals("818-765-2341", customers.get(4591).getPhone());
	}

	@Test
	@DisplayName("Record 4592: Fax is 818-765-9285")
	void FaxOfRecord4592() {
		assertEquals("818-765-9285", customers.get(4591).getFax());
	}

	@Test
	@DisplayName("Record 4592: Email is samual@sandercock.com")
	void EmailOfRecord4592() {
		assertEquals("samual@sandercock.com", customers.get(4591).getEmail());
	}

	@Test
	@DisplayName("Record 4592: Web is http://www.samualsandercock.com")
	void WebOfRecord4592() {
		assertEquals("http://www.samualsandercock.com", customers.get(4591).getWeb());
	}
}
