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

@Tag("42")
class Record_4254 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4254: FirstName is Tasha")
	void FirstNameOfRecord4254() {
		assertEquals("Tasha", customers.get(4253).getFirstName());
	}

	@Test
	@DisplayName("Record 4254: LastName is Azim")
	void LastNameOfRecord4254() {
		assertEquals("Azim", customers.get(4253).getLastName());
	}

	@Test
	@DisplayName("Record 4254: Company is Bleuler, Christine C Esq")
	void CompanyOfRecord4254() {
		assertEquals("Bleuler, Christine C Esq", customers.get(4253).getCompany());
	}

	@Test
	@DisplayName("Record 4254: Address is 5520 Miller Ave")
	void AddressOfRecord4254() {
		assertEquals("5520 Miller Ave", customers.get(4253).getAddress());
	}

	@Test
	@DisplayName("Record 4254: City is Omaha")
	void CityOfRecord4254() {
		assertEquals("Omaha", customers.get(4253).getCity());
	}

	@Test
	@DisplayName("Record 4254: County is Douglas")
	void CountyOfRecord4254() {
		assertEquals("Douglas", customers.get(4253).getCounty());
	}

	@Test
	@DisplayName("Record 4254: State is NE")
	void StateOfRecord4254() {
		assertEquals("NE", customers.get(4253).getState());
	}

	@Test
	@DisplayName("Record 4254: ZIP is 68127")
	void ZIPOfRecord4254() {
		assertEquals("68127", customers.get(4253).getZIP());
	}

	@Test
	@DisplayName("Record 4254: Phone is 402-331-7830")
	void PhoneOfRecord4254() {
		assertEquals("402-331-7830", customers.get(4253).getPhone());
	}

	@Test
	@DisplayName("Record 4254: Fax is 402-331-1796")
	void FaxOfRecord4254() {
		assertEquals("402-331-1796", customers.get(4253).getFax());
	}

	@Test
	@DisplayName("Record 4254: Email is tasha@azim.com")
	void EmailOfRecord4254() {
		assertEquals("tasha@azim.com", customers.get(4253).getEmail());
	}

	@Test
	@DisplayName("Record 4254: Web is http://www.tashaazim.com")
	void WebOfRecord4254() {
		assertEquals("http://www.tashaazim.com", customers.get(4253).getWeb());
	}
}
