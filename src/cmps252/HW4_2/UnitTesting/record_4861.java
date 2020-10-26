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

@Tag("34")
class Record_4861 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4861: FirstName is Aimee")
	void FirstNameOfRecord4861() {
		assertEquals("Aimee", customers.get(4860).getFirstName());
	}

	@Test
	@DisplayName("Record 4861: LastName is Traux")
	void LastNameOfRecord4861() {
		assertEquals("Traux", customers.get(4860).getLastName());
	}

	@Test
	@DisplayName("Record 4861: Company is Champ Co")
	void CompanyOfRecord4861() {
		assertEquals("Champ Co", customers.get(4860).getCompany());
	}

	@Test
	@DisplayName("Record 4861: Address is 5319 S Lewis")
	void AddressOfRecord4861() {
		assertEquals("5319 S Lewis", customers.get(4860).getAddress());
	}

	@Test
	@DisplayName("Record 4861: City is Tulsa")
	void CityOfRecord4861() {
		assertEquals("Tulsa", customers.get(4860).getCity());
	}

	@Test
	@DisplayName("Record 4861: County is Tulsa")
	void CountyOfRecord4861() {
		assertEquals("Tulsa", customers.get(4860).getCounty());
	}

	@Test
	@DisplayName("Record 4861: State is OK")
	void StateOfRecord4861() {
		assertEquals("OK", customers.get(4860).getState());
	}

	@Test
	@DisplayName("Record 4861: ZIP is 74105")
	void ZIPOfRecord4861() {
		assertEquals("74105", customers.get(4860).getZIP());
	}

	@Test
	@DisplayName("Record 4861: Phone is 918-748-1998")
	void PhoneOfRecord4861() {
		assertEquals("918-748-1998", customers.get(4860).getPhone());
	}

	@Test
	@DisplayName("Record 4861: Fax is 918-748-0564")
	void FaxOfRecord4861() {
		assertEquals("918-748-0564", customers.get(4860).getFax());
	}

	@Test
	@DisplayName("Record 4861: Email is aimee@traux.com")
	void EmailOfRecord4861() {
		assertEquals("aimee@traux.com", customers.get(4860).getEmail());
	}

	@Test
	@DisplayName("Record 4861: Web is http://www.aimeetraux.com")
	void WebOfRecord4861() {
		assertEquals("http://www.aimeetraux.com", customers.get(4860).getWeb());
	}
}
