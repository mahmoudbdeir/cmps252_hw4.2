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

@Tag("32")
class Record_687 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 687: FirstName is Harley")
	void FirstNameOfRecord687() {
		assertEquals("Harley", customers.get(686).getFirstName());
	}

	@Test
	@DisplayName("Record 687: LastName is Alme")
	void LastNameOfRecord687() {
		assertEquals("Alme", customers.get(686).getLastName());
	}

	@Test
	@DisplayName("Record 687: Company is Arc Professional Service Group")
	void CompanyOfRecord687() {
		assertEquals("Arc Professional Service Group", customers.get(686).getCompany());
	}

	@Test
	@DisplayName("Record 687: Address is 623 W Liberty St")
	void AddressOfRecord687() {
		assertEquals("623 W Liberty St", customers.get(686).getAddress());
	}

	@Test
	@DisplayName("Record 687: City is Medina")
	void CityOfRecord687() {
		assertEquals("Medina", customers.get(686).getCity());
	}

	@Test
	@DisplayName("Record 687: County is Medina")
	void CountyOfRecord687() {
		assertEquals("Medina", customers.get(686).getCounty());
	}

	@Test
	@DisplayName("Record 687: State is OH")
	void StateOfRecord687() {
		assertEquals("OH", customers.get(686).getState());
	}

	@Test
	@DisplayName("Record 687: ZIP is 44256")
	void ZIPOfRecord687() {
		assertEquals("44256", customers.get(686).getZIP());
	}

	@Test
	@DisplayName("Record 687: Phone is 330-725-2702")
	void PhoneOfRecord687() {
		assertEquals("330-725-2702", customers.get(686).getPhone());
	}

	@Test
	@DisplayName("Record 687: Fax is 330-725-9974")
	void FaxOfRecord687() {
		assertEquals("330-725-9974", customers.get(686).getFax());
	}

	@Test
	@DisplayName("Record 687: Email is harley@alme.com")
	void EmailOfRecord687() {
		assertEquals("harley@alme.com", customers.get(686).getEmail());
	}

	@Test
	@DisplayName("Record 687: Web is http://www.harleyalme.com")
	void WebOfRecord687() {
		assertEquals("http://www.harleyalme.com", customers.get(686).getWeb());
	}
}
