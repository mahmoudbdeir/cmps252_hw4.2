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

@Tag("29")
class Record_68 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 68: FirstName is Jerome")
	void FirstNameOfRecord68() {
		assertEquals("Jerome", customers.get(67).getFirstName());
	}

	@Test
	@DisplayName("Record 68: LastName is Mcclaughry")
	void LastNameOfRecord68() {
		assertEquals("Mcclaughry", customers.get(67).getLastName());
	}

	@Test
	@DisplayName("Record 68: Company is C Xpress Moving & Storage")
	void CompanyOfRecord68() {
		assertEquals("C Xpress Moving & Storage", customers.get(67).getCompany());
	}

	@Test
	@DisplayName("Record 68: Address is 409 Lincoln Ave")
	void AddressOfRecord68() {
		assertEquals("409 Lincoln Ave", customers.get(67).getAddress());
	}

	@Test
	@DisplayName("Record 68: City is Hatboro")
	void CityOfRecord68() {
		assertEquals("Hatboro", customers.get(67).getCity());
	}

	@Test
	@DisplayName("Record 68: County is Montgomery")
	void CountyOfRecord68() {
		assertEquals("Montgomery", customers.get(67).getCounty());
	}

	@Test
	@DisplayName("Record 68: State is PA")
	void StateOfRecord68() {
		assertEquals("PA", customers.get(67).getState());
	}

	@Test
	@DisplayName("Record 68: ZIP is 19040")
	void ZIPOfRecord68() {
		assertEquals("19040", customers.get(67).getZIP());
	}

	@Test
	@DisplayName("Record 68: Phone is 215-443-1456")
	void PhoneOfRecord68() {
		assertEquals("215-443-1456", customers.get(67).getPhone());
	}

	@Test
	@DisplayName("Record 68: Fax is 215-443-1364")
	void FaxOfRecord68() {
		assertEquals("215-443-1364", customers.get(67).getFax());
	}

	@Test
	@DisplayName("Record 68: Email is jerome@mcclaughry.com")
	void EmailOfRecord68() {
		assertEquals("jerome@mcclaughry.com", customers.get(67).getEmail());
	}

	@Test
	@DisplayName("Record 68: Web is http://www.jeromemcclaughry.com")
	void WebOfRecord68() {
		assertEquals("http://www.jeromemcclaughry.com", customers.get(67).getWeb());
	}
}
