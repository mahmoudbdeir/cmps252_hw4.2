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

@Tag("24")
class Record_1299 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1299: FirstName is Francis")
	void FirstNameOfRecord1299() {
		assertEquals("Francis", customers.get(1298).getFirstName());
	}

	@Test
	@DisplayName("Record 1299: LastName is Schlau")
	void LastNameOfRecord1299() {
		assertEquals("Schlau", customers.get(1298).getLastName());
	}

	@Test
	@DisplayName("Record 1299: Company is Kruse, Clifton B Jr")
	void CompanyOfRecord1299() {
		assertEquals("Kruse, Clifton B Jr", customers.get(1298).getCompany());
	}

	@Test
	@DisplayName("Record 1299: Address is 588 Springfield Ave")
	void AddressOfRecord1299() {
		assertEquals("588 Springfield Ave", customers.get(1298).getAddress());
	}

	@Test
	@DisplayName("Record 1299: City is Berkeley Hyghts")
	void CityOfRecord1299() {
		assertEquals("Berkeley Hyghts", customers.get(1298).getCity());
	}

	@Test
	@DisplayName("Record 1299: County is Union")
	void CountyOfRecord1299() {
		assertEquals("Union", customers.get(1298).getCounty());
	}

	@Test
	@DisplayName("Record 1299: State is NJ")
	void StateOfRecord1299() {
		assertEquals("NJ", customers.get(1298).getState());
	}

	@Test
	@DisplayName("Record 1299: ZIP is 07922")
	void ZIPOfRecord1299() {
		assertEquals("07922", customers.get(1298).getZIP());
	}

	@Test
	@DisplayName("Record 1299: Phone is 908-464-9126")
	void PhoneOfRecord1299() {
		assertEquals("908-464-9126", customers.get(1298).getPhone());
	}

	@Test
	@DisplayName("Record 1299: Fax is 908-464-7315")
	void FaxOfRecord1299() {
		assertEquals("908-464-7315", customers.get(1298).getFax());
	}

	@Test
	@DisplayName("Record 1299: Email is francis@schlau.com")
	void EmailOfRecord1299() {
		assertEquals("francis@schlau.com", customers.get(1298).getEmail());
	}

	@Test
	@DisplayName("Record 1299: Web is http://www.francisschlau.com")
	void WebOfRecord1299() {
		assertEquals("http://www.francisschlau.com", customers.get(1298).getWeb());
	}
}
