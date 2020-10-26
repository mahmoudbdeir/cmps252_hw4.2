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

@Tag("20")
class Record_2167 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2167: FirstName is Jaclyn")
	void FirstNameOfRecord2167() {
		assertEquals("Jaclyn", customers.get(2166).getFirstName());
	}

	@Test
	@DisplayName("Record 2167: LastName is Szysh")
	void LastNameOfRecord2167() {
		assertEquals("Szysh", customers.get(2166).getLastName());
	}

	@Test
	@DisplayName("Record 2167: Company is Color Comp Inc")
	void CompanyOfRecord2167() {
		assertEquals("Color Comp Inc", customers.get(2166).getCompany());
	}

	@Test
	@DisplayName("Record 2167: Address is 66590 Kamehameha Hwy  #-1c")
	void AddressOfRecord2167() {
		assertEquals("66590 Kamehameha Hwy  #-1c", customers.get(2166).getAddress());
	}

	@Test
	@DisplayName("Record 2167: City is Halywa")
	void CityOfRecord2167() {
		assertEquals("Halywa", customers.get(2166).getCity());
	}

	@Test
	@DisplayName("Record 2167: County is Honolulu")
	void CountyOfRecord2167() {
		assertEquals("Honolulu", customers.get(2166).getCounty());
	}

	@Test
	@DisplayName("Record 2167: State is HI")
	void StateOfRecord2167() {
		assertEquals("HI", customers.get(2166).getState());
	}

	@Test
	@DisplayName("Record 2167: ZIP is 96712")
	void ZIPOfRecord2167() {
		assertEquals("96712", customers.get(2166).getZIP());
	}

	@Test
	@DisplayName("Record 2167: Phone is 808-637-8456")
	void PhoneOfRecord2167() {
		assertEquals("808-637-8456", customers.get(2166).getPhone());
	}

	@Test
	@DisplayName("Record 2167: Fax is 808-637-7367")
	void FaxOfRecord2167() {
		assertEquals("808-637-7367", customers.get(2166).getFax());
	}

	@Test
	@DisplayName("Record 2167: Email is jaclyn@szysh.com")
	void EmailOfRecord2167() {
		assertEquals("jaclyn@szysh.com", customers.get(2166).getEmail());
	}

	@Test
	@DisplayName("Record 2167: Web is http://www.jaclynszysh.com")
	void WebOfRecord2167() {
		assertEquals("http://www.jaclynszysh.com", customers.get(2166).getWeb());
	}
}
