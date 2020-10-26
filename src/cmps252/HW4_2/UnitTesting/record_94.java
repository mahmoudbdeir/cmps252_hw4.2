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
class Record_94 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 94: FirstName is Latonya")
	void FirstNameOfRecord94() {
		assertEquals("Latonya", customers.get(93).getFirstName());
	}

	@Test
	@DisplayName("Record 94: LastName is Bemberry")
	void LastNameOfRecord94() {
		assertEquals("Bemberry", customers.get(93).getLastName());
	}

	@Test
	@DisplayName("Record 94: Company is Inofast Inc")
	void CompanyOfRecord94() {
		assertEquals("Inofast Inc", customers.get(93).getCompany());
	}

	@Test
	@DisplayName("Record 94: Address is 1718 Belmont Ave  #-k")
	void AddressOfRecord94() {
		assertEquals("1718 Belmont Ave  #-k", customers.get(93).getAddress());
	}

	@Test
	@DisplayName("Record 94: City is Windsor Mill")
	void CityOfRecord94() {
		assertEquals("Windsor Mill", customers.get(93).getCity());
	}

	@Test
	@DisplayName("Record 94: County is Baltimore")
	void CountyOfRecord94() {
		assertEquals("Baltimore", customers.get(93).getCounty());
	}

	@Test
	@DisplayName("Record 94: State is MD")
	void StateOfRecord94() {
		assertEquals("MD", customers.get(93).getState());
	}

	@Test
	@DisplayName("Record 94: ZIP is 21244")
	void ZIPOfRecord94() {
		assertEquals("21244", customers.get(93).getZIP());
	}

	@Test
	@DisplayName("Record 94: Phone is 410-298-5205")
	void PhoneOfRecord94() {
		assertEquals("410-298-5205", customers.get(93).getPhone());
	}

	@Test
	@DisplayName("Record 94: Fax is 410-298-7214")
	void FaxOfRecord94() {
		assertEquals("410-298-7214", customers.get(93).getFax());
	}

	@Test
	@DisplayName("Record 94: Email is latonya@bemberry.com")
	void EmailOfRecord94() {
		assertEquals("latonya@bemberry.com", customers.get(93).getEmail());
	}

	@Test
	@DisplayName("Record 94: Web is http://www.latonyabemberry.com")
	void WebOfRecord94() {
		assertEquals("http://www.latonyabemberry.com", customers.get(93).getWeb());
	}
}
