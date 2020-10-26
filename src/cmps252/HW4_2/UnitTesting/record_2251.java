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
class Record_2251 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2251: FirstName is Micah")
	void FirstNameOfRecord2251() {
		assertEquals("Micah", customers.get(2250).getFirstName());
	}

	@Test
	@DisplayName("Record 2251: LastName is Noa")
	void LastNameOfRecord2251() {
		assertEquals("Noa", customers.get(2250).getLastName());
	}

	@Test
	@DisplayName("Record 2251: Company is Digital Photo & Graphics Inc")
	void CompanyOfRecord2251() {
		assertEquals("Digital Photo & Graphics Inc", customers.get(2250).getCompany());
	}

	@Test
	@DisplayName("Record 2251: Address is Parkway Pl")
	void AddressOfRecord2251() {
		assertEquals("Parkway Pl", customers.get(2250).getAddress());
	}

	@Test
	@DisplayName("Record 2251: City is Edison")
	void CityOfRecord2251() {
		assertEquals("Edison", customers.get(2250).getCity());
	}

	@Test
	@DisplayName("Record 2251: County is Middlesex")
	void CountyOfRecord2251() {
		assertEquals("Middlesex", customers.get(2250).getCounty());
	}

	@Test
	@DisplayName("Record 2251: State is NJ")
	void StateOfRecord2251() {
		assertEquals("NJ", customers.get(2250).getState());
	}

	@Test
	@DisplayName("Record 2251: ZIP is 8837")
	void ZIPOfRecord2251() {
		assertEquals("8837", customers.get(2250).getZIP());
	}

	@Test
	@DisplayName("Record 2251: Phone is 732-225-9222")
	void PhoneOfRecord2251() {
		assertEquals("732-225-9222", customers.get(2250).getPhone());
	}

	@Test
	@DisplayName("Record 2251: Fax is 732-225-9453")
	void FaxOfRecord2251() {
		assertEquals("732-225-9453", customers.get(2250).getFax());
	}

	@Test
	@DisplayName("Record 2251: Email is micah@noa.com")
	void EmailOfRecord2251() {
		assertEquals("micah@noa.com", customers.get(2250).getEmail());
	}

	@Test
	@DisplayName("Record 2251: Web is http://www.micahnoa.com")
	void WebOfRecord2251() {
		assertEquals("http://www.micahnoa.com", customers.get(2250).getWeb());
	}
}
