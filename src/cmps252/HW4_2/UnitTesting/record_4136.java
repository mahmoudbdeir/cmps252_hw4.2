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

@Tag("28")
class Record_4136 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4136: FirstName is Marta")
	void FirstNameOfRecord4136() {
		assertEquals("Marta", customers.get(4135).getFirstName());
	}

	@Test
	@DisplayName("Record 4136: LastName is Hoppman")
	void LastNameOfRecord4136() {
		assertEquals("Hoppman", customers.get(4135).getLastName());
	}

	@Test
	@DisplayName("Record 4136: Company is Huitt Zollars Inc")
	void CompanyOfRecord4136() {
		assertEquals("Huitt Zollars Inc", customers.get(4135).getCompany());
	}

	@Test
	@DisplayName("Record 4136: Address is 1180 Broadway")
	void AddressOfRecord4136() {
		assertEquals("1180 Broadway", customers.get(4135).getAddress());
	}

	@Test
	@DisplayName("Record 4136: City is Hewlett")
	void CityOfRecord4136() {
		assertEquals("Hewlett", customers.get(4135).getCity());
	}

	@Test
	@DisplayName("Record 4136: County is Nassau")
	void CountyOfRecord4136() {
		assertEquals("Nassau", customers.get(4135).getCounty());
	}

	@Test
	@DisplayName("Record 4136: State is NY")
	void StateOfRecord4136() {
		assertEquals("NY", customers.get(4135).getState());
	}

	@Test
	@DisplayName("Record 4136: ZIP is 11557")
	void ZIPOfRecord4136() {
		assertEquals("11557", customers.get(4135).getZIP());
	}

	@Test
	@DisplayName("Record 4136: Phone is 516-295-0687")
	void PhoneOfRecord4136() {
		assertEquals("516-295-0687", customers.get(4135).getPhone());
	}

	@Test
	@DisplayName("Record 4136: Fax is 516-295-0908")
	void FaxOfRecord4136() {
		assertEquals("516-295-0908", customers.get(4135).getFax());
	}

	@Test
	@DisplayName("Record 4136: Email is marta@hoppman.com")
	void EmailOfRecord4136() {
		assertEquals("marta@hoppman.com", customers.get(4135).getEmail());
	}

	@Test
	@DisplayName("Record 4136: Web is http://www.martahoppman.com")
	void WebOfRecord4136() {
		assertEquals("http://www.martahoppman.com", customers.get(4135).getWeb());
	}
}
