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

@Tag("17")
class Record_712 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 712: FirstName is Claude")
	void FirstNameOfRecord712() {
		assertEquals("Claude", customers.get(711).getFirstName());
	}

	@Test
	@DisplayName("Record 712: LastName is Muthana")
	void LastNameOfRecord712() {
		assertEquals("Muthana", customers.get(711).getLastName());
	}

	@Test
	@DisplayName("Record 712: Company is Ford Marrin Esposito Gleser")
	void CompanyOfRecord712() {
		assertEquals("Ford Marrin Esposito Gleser", customers.get(711).getCompany());
	}

	@Test
	@DisplayName("Record 712: Address is 1152 Crown Point Rd")
	void AddressOfRecord712() {
		assertEquals("1152 Crown Point Rd", customers.get(711).getAddress());
	}

	@Test
	@DisplayName("Record 712: City is Westville")
	void CityOfRecord712() {
		assertEquals("Westville", customers.get(711).getCity());
	}

	@Test
	@DisplayName("Record 712: County is Gloucester")
	void CountyOfRecord712() {
		assertEquals("Gloucester", customers.get(711).getCounty());
	}

	@Test
	@DisplayName("Record 712: State is NJ")
	void StateOfRecord712() {
		assertEquals("NJ", customers.get(711).getState());
	}

	@Test
	@DisplayName("Record 712: ZIP is 8093")
	void ZIPOfRecord712() {
		assertEquals("8093", customers.get(711).getZIP());
	}

	@Test
	@DisplayName("Record 712: Phone is 856-848-9240")
	void PhoneOfRecord712() {
		assertEquals("856-848-9240", customers.get(711).getPhone());
	}

	@Test
	@DisplayName("Record 712: Fax is 856-848-9216")
	void FaxOfRecord712() {
		assertEquals("856-848-9216", customers.get(711).getFax());
	}

	@Test
	@DisplayName("Record 712: Email is claude@muthana.com")
	void EmailOfRecord712() {
		assertEquals("claude@muthana.com", customers.get(711).getEmail());
	}

	@Test
	@DisplayName("Record 712: Web is http://www.claudemuthana.com")
	void WebOfRecord712() {
		assertEquals("http://www.claudemuthana.com", customers.get(711).getWeb());
	}
}
