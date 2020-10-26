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

@Tag("0")
class Record_4997 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4997: FirstName is Lynda")
	void FirstNameOfRecord4997() {
		assertEquals("Lynda", customers.get(4996).getFirstName());
	}

	@Test
	@DisplayName("Record 4997: LastName is Bellon")
	void LastNameOfRecord4997() {
		assertEquals("Bellon", customers.get(4996).getLastName());
	}

	@Test
	@DisplayName("Record 4997: Company is Illinois Bank")
	void CompanyOfRecord4997() {
		assertEquals("Illinois Bank", customers.get(4996).getCompany());
	}

	@Test
	@DisplayName("Record 4997: Address is Box #-8825")
	void AddressOfRecord4997() {
		assertEquals("Box #-8825", customers.get(4996).getAddress());
	}

	@Test
	@DisplayName("Record 4997: City is Boise")
	void CityOfRecord4997() {
		assertEquals("Boise", customers.get(4996).getCity());
	}

	@Test
	@DisplayName("Record 4997: County is Ada")
	void CountyOfRecord4997() {
		assertEquals("Ada", customers.get(4996).getCounty());
	}

	@Test
	@DisplayName("Record 4997: State is ID")
	void StateOfRecord4997() {
		assertEquals("ID", customers.get(4996).getState());
	}

	@Test
	@DisplayName("Record 4997: ZIP is 83707")
	void ZIPOfRecord4997() {
		assertEquals("83707", customers.get(4996).getZIP());
	}

	@Test
	@DisplayName("Record 4997: Phone is 208-344-0366")
	void PhoneOfRecord4997() {
		assertEquals("208-344-0366", customers.get(4996).getPhone());
	}

	@Test
	@DisplayName("Record 4997: Fax is 208-344-5072")
	void FaxOfRecord4997() {
		assertEquals("208-344-5072", customers.get(4996).getFax());
	}

	@Test
	@DisplayName("Record 4997: Email is lynda@bellon.com")
	void EmailOfRecord4997() {
		assertEquals("lynda@bellon.com", customers.get(4996).getEmail());
	}

	@Test
	@DisplayName("Record 4997: Web is http://www.lyndabellon.com")
	void WebOfRecord4997() {
		assertEquals("http://www.lyndabellon.com", customers.get(4996).getWeb());
	}
}
