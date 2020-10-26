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

@Tag("35")
class Record_4793 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4793: FirstName is Erma")
	void FirstNameOfRecord4793() {
		assertEquals("Erma", customers.get(4792).getFirstName());
	}

	@Test
	@DisplayName("Record 4793: LastName is Bui")
	void LastNameOfRecord4793() {
		assertEquals("Bui", customers.get(4792).getLastName());
	}

	@Test
	@DisplayName("Record 4793: Company is National Auto Body")
	void CompanyOfRecord4793() {
		assertEquals("National Auto Body", customers.get(4792).getCompany());
	}

	@Test
	@DisplayName("Record 4793: Address is 14785 Preston Rd")
	void AddressOfRecord4793() {
		assertEquals("14785 Preston Rd", customers.get(4792).getAddress());
	}

	@Test
	@DisplayName("Record 4793: City is Dallas")
	void CityOfRecord4793() {
		assertEquals("Dallas", customers.get(4792).getCity());
	}

	@Test
	@DisplayName("Record 4793: County is Dallas")
	void CountyOfRecord4793() {
		assertEquals("Dallas", customers.get(4792).getCounty());
	}

	@Test
	@DisplayName("Record 4793: State is TX")
	void StateOfRecord4793() {
		assertEquals("TX", customers.get(4792).getState());
	}

	@Test
	@DisplayName("Record 4793: ZIP is 75240")
	void ZIPOfRecord4793() {
		assertEquals("75240", customers.get(4792).getZIP());
	}

	@Test
	@DisplayName("Record 4793: Phone is 214-458-6062")
	void PhoneOfRecord4793() {
		assertEquals("214-458-6062", customers.get(4792).getPhone());
	}

	@Test
	@DisplayName("Record 4793: Fax is 214-458-4639")
	void FaxOfRecord4793() {
		assertEquals("214-458-4639", customers.get(4792).getFax());
	}

	@Test
	@DisplayName("Record 4793: Email is erma@bui.com")
	void EmailOfRecord4793() {
		assertEquals("erma@bui.com", customers.get(4792).getEmail());
	}

	@Test
	@DisplayName("Record 4793: Web is http://www.ermabui.com")
	void WebOfRecord4793() {
		assertEquals("http://www.ermabui.com", customers.get(4792).getWeb());
	}
}
