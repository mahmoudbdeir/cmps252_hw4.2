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

@Tag("36")
class Record_581 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 581: FirstName is Jerold")
	void FirstNameOfRecord581() {
		assertEquals("Jerold", customers.get(580).getFirstName());
	}

	@Test
	@DisplayName("Record 581: LastName is Knupke")
	void LastNameOfRecord581() {
		assertEquals("Knupke", customers.get(580).getLastName());
	}

	@Test
	@DisplayName("Record 581: Company is College Of Notre Dame Of Md")
	void CompanyOfRecord581() {
		assertEquals("College Of Notre Dame Of Md", customers.get(580).getCompany());
	}

	@Test
	@DisplayName("Record 581: Address is 5601 W National Ave")
	void AddressOfRecord581() {
		assertEquals("5601 W National Ave", customers.get(580).getAddress());
	}

	@Test
	@DisplayName("Record 581: City is Milwaukee")
	void CityOfRecord581() {
		assertEquals("Milwaukee", customers.get(580).getCity());
	}

	@Test
	@DisplayName("Record 581: County is Milwaukee")
	void CountyOfRecord581() {
		assertEquals("Milwaukee", customers.get(580).getCounty());
	}

	@Test
	@DisplayName("Record 581: State is WI")
	void StateOfRecord581() {
		assertEquals("WI", customers.get(580).getState());
	}

	@Test
	@DisplayName("Record 581: ZIP is 53214")
	void ZIPOfRecord581() {
		assertEquals("53214", customers.get(580).getZIP());
	}

	@Test
	@DisplayName("Record 581: Phone is 414-258-8647")
	void PhoneOfRecord581() {
		assertEquals("414-258-8647", customers.get(580).getPhone());
	}

	@Test
	@DisplayName("Record 581: Fax is 414-258-1598")
	void FaxOfRecord581() {
		assertEquals("414-258-1598", customers.get(580).getFax());
	}

	@Test
	@DisplayName("Record 581: Email is jerold@knupke.com")
	void EmailOfRecord581() {
		assertEquals("jerold@knupke.com", customers.get(580).getEmail());
	}

	@Test
	@DisplayName("Record 581: Web is http://www.jeroldknupke.com")
	void WebOfRecord581() {
		assertEquals("http://www.jeroldknupke.com", customers.get(580).getWeb());
	}
}
