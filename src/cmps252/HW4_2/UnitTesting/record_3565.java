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

@Tag("44")
class Record_3565 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3565: FirstName is Sherman")
	void FirstNameOfRecord3565() {
		assertEquals("Sherman", customers.get(3564).getFirstName());
	}

	@Test
	@DisplayName("Record 3565: LastName is Pekala")
	void LastNameOfRecord3565() {
		assertEquals("Pekala", customers.get(3564).getLastName());
	}

	@Test
	@DisplayName("Record 3565: Company is Anderson Printing Company")
	void CompanyOfRecord3565() {
		assertEquals("Anderson Printing Company", customers.get(3564).getCompany());
	}

	@Test
	@DisplayName("Record 3565: Address is 1111 E Lancaster Ave")
	void AddressOfRecord3565() {
		assertEquals("1111 E Lancaster Ave", customers.get(3564).getAddress());
	}

	@Test
	@DisplayName("Record 3565: City is Fort Worth")
	void CityOfRecord3565() {
		assertEquals("Fort Worth", customers.get(3564).getCity());
	}

	@Test
	@DisplayName("Record 3565: County is Tarrant")
	void CountyOfRecord3565() {
		assertEquals("Tarrant", customers.get(3564).getCounty());
	}

	@Test
	@DisplayName("Record 3565: State is TX")
	void StateOfRecord3565() {
		assertEquals("TX", customers.get(3564).getState());
	}

	@Test
	@DisplayName("Record 3565: ZIP is 76102")
	void ZIPOfRecord3565() {
		assertEquals("76102", customers.get(3564).getZIP());
	}

	@Test
	@DisplayName("Record 3565: Phone is 817-338-3330")
	void PhoneOfRecord3565() {
		assertEquals("817-338-3330", customers.get(3564).getPhone());
	}

	@Test
	@DisplayName("Record 3565: Fax is 817-338-3001")
	void FaxOfRecord3565() {
		assertEquals("817-338-3001", customers.get(3564).getFax());
	}

	@Test
	@DisplayName("Record 3565: Email is sherman@pekala.com")
	void EmailOfRecord3565() {
		assertEquals("sherman@pekala.com", customers.get(3564).getEmail());
	}

	@Test
	@DisplayName("Record 3565: Web is http://www.shermanpekala.com")
	void WebOfRecord3565() {
		assertEquals("http://www.shermanpekala.com", customers.get(3564).getWeb());
	}
}
