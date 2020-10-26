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

@Tag("11")
class Record_3255 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3255: FirstName is Raphael")
	void FirstNameOfRecord3255() {
		assertEquals("Raphael", customers.get(3254).getFirstName());
	}

	@Test
	@DisplayName("Record 3255: LastName is Philbrook")
	void LastNameOfRecord3255() {
		assertEquals("Philbrook", customers.get(3254).getLastName());
	}

	@Test
	@DisplayName("Record 3255: Company is Millers Wholesale Inc")
	void CompanyOfRecord3255() {
		assertEquals("Millers Wholesale Inc", customers.get(3254).getCompany());
	}

	@Test
	@DisplayName("Record 3255: Address is Anderson St")
	void AddressOfRecord3255() {
		assertEquals("Anderson St", customers.get(3254).getAddress());
	}

	@Test
	@DisplayName("Record 3255: City is Aberdeen")
	void CityOfRecord3255() {
		assertEquals("Aberdeen", customers.get(3254).getCity());
	}

	@Test
	@DisplayName("Record 3255: County is Moore")
	void CountyOfRecord3255() {
		assertEquals("Moore", customers.get(3254).getCounty());
	}

	@Test
	@DisplayName("Record 3255: State is NC")
	void StateOfRecord3255() {
		assertEquals("NC", customers.get(3254).getState());
	}

	@Test
	@DisplayName("Record 3255: ZIP is 28315")
	void ZIPOfRecord3255() {
		assertEquals("28315", customers.get(3254).getZIP());
	}

	@Test
	@DisplayName("Record 3255: Phone is 910-944-5135")
	void PhoneOfRecord3255() {
		assertEquals("910-944-5135", customers.get(3254).getPhone());
	}

	@Test
	@DisplayName("Record 3255: Fax is 910-944-7534")
	void FaxOfRecord3255() {
		assertEquals("910-944-7534", customers.get(3254).getFax());
	}

	@Test
	@DisplayName("Record 3255: Email is raphael@philbrook.com")
	void EmailOfRecord3255() {
		assertEquals("raphael@philbrook.com", customers.get(3254).getEmail());
	}

	@Test
	@DisplayName("Record 3255: Web is http://www.raphaelphilbrook.com")
	void WebOfRecord3255() {
		assertEquals("http://www.raphaelphilbrook.com", customers.get(3254).getWeb());
	}
}
