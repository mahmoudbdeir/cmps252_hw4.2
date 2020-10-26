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

@Tag("45")
class Record_76 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 76: FirstName is Verda")
	void FirstNameOfRecord76() {
		assertEquals("Verda", customers.get(75).getFirstName());
	}

	@Test
	@DisplayName("Record 76: LastName is ysenberg")
	void LastNameOfRecord76() {
		assertEquals("ysenberg", customers.get(75).getLastName());
	}

	@Test
	@DisplayName("Record 76: Company is Midwest Interview & Rsrch Inc")
	void CompanyOfRecord76() {
		assertEquals("Midwest Interview & Rsrch Inc", customers.get(75).getCompany());
	}

	@Test
	@DisplayName("Record 76: Address is 2659 Edison Ave")
	void AddressOfRecord76() {
		assertEquals("2659 Edison Ave", customers.get(75).getAddress());
	}

	@Test
	@DisplayName("Record 76: City is Jacksonville")
	void CityOfRecord76() {
		assertEquals("Jacksonville", customers.get(75).getCity());
	}

	@Test
	@DisplayName("Record 76: County is Duval")
	void CountyOfRecord76() {
		assertEquals("Duval", customers.get(75).getCounty());
	}

	@Test
	@DisplayName("Record 76: State is FL")
	void StateOfRecord76() {
		assertEquals("FL", customers.get(75).getState());
	}

	@Test
	@DisplayName("Record 76: ZIP is 32204")
	void ZIPOfRecord76() {
		assertEquals("32204", customers.get(75).getZIP());
	}

	@Test
	@DisplayName("Record 76: Phone is 904-388-9684")
	void PhoneOfRecord76() {
		assertEquals("904-388-9684", customers.get(75).getPhone());
	}

	@Test
	@DisplayName("Record 76: Fax is 904-388-6109")
	void FaxOfRecord76() {
		assertEquals("904-388-6109", customers.get(75).getFax());
	}

	@Test
	@DisplayName("Record 76: Email is verda@ysenberg.com")
	void EmailOfRecord76() {
		assertEquals("verda@ysenberg.com", customers.get(75).getEmail());
	}

	@Test
	@DisplayName("Record 76: Web is http://www.verdaysenberg.com")
	void WebOfRecord76() {
		assertEquals("http://www.verdaysenberg.com", customers.get(75).getWeb());
	}
}
