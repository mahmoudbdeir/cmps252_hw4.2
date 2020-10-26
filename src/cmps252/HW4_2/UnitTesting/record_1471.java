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

@Tag("4")
class Record_1471 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1471: FirstName is Chung")
	void FirstNameOfRecord1471() {
		assertEquals("Chung", customers.get(1470).getFirstName());
	}

	@Test
	@DisplayName("Record 1471: LastName is Worner")
	void LastNameOfRecord1471() {
		assertEquals("Worner", customers.get(1470).getLastName());
	}

	@Test
	@DisplayName("Record 1471: Company is Crider Brokerage Co")
	void CompanyOfRecord1471() {
		assertEquals("Crider Brokerage Co", customers.get(1470).getCompany());
	}

	@Test
	@DisplayName("Record 1471: Address is 2222 Noblestown Rd")
	void AddressOfRecord1471() {
		assertEquals("2222 Noblestown Rd", customers.get(1470).getAddress());
	}

	@Test
	@DisplayName("Record 1471: City is Pittsburgh")
	void CityOfRecord1471() {
		assertEquals("Pittsburgh", customers.get(1470).getCity());
	}

	@Test
	@DisplayName("Record 1471: County is Allegheny")
	void CountyOfRecord1471() {
		assertEquals("Allegheny", customers.get(1470).getCounty());
	}

	@Test
	@DisplayName("Record 1471: State is PA")
	void StateOfRecord1471() {
		assertEquals("PA", customers.get(1470).getState());
	}

	@Test
	@DisplayName("Record 1471: ZIP is 15205")
	void ZIPOfRecord1471() {
		assertEquals("15205", customers.get(1470).getZIP());
	}

	@Test
	@DisplayName("Record 1471: Phone is 412-928-4828")
	void PhoneOfRecord1471() {
		assertEquals("412-928-4828", customers.get(1470).getPhone());
	}

	@Test
	@DisplayName("Record 1471: Fax is 412-928-0143")
	void FaxOfRecord1471() {
		assertEquals("412-928-0143", customers.get(1470).getFax());
	}

	@Test
	@DisplayName("Record 1471: Email is chung@worner.com")
	void EmailOfRecord1471() {
		assertEquals("chung@worner.com", customers.get(1470).getEmail());
	}

	@Test
	@DisplayName("Record 1471: Web is http://www.chungworner.com")
	void WebOfRecord1471() {
		assertEquals("http://www.chungworner.com", customers.get(1470).getWeb());
	}
}
