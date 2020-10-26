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

@Tag("44")
class Record_1229 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1229: FirstName is Doreen")
	void FirstNameOfRecord1229() {
		assertEquals("Doreen", customers.get(1228).getFirstName());
	}

	@Test
	@DisplayName("Record 1229: LastName is Tijing")
	void LastNameOfRecord1229() {
		assertEquals("Tijing", customers.get(1228).getLastName());
	}

	@Test
	@DisplayName("Record 1229: Company is New Concepts Prodt Dsgn & Dev")
	void CompanyOfRecord1229() {
		assertEquals("New Concepts Prodt Dsgn & Dev", customers.get(1228).getCompany());
	}

	@Test
	@DisplayName("Record 1229: Address is 49 W 38th St")
	void AddressOfRecord1229() {
		assertEquals("49 W 38th St", customers.get(1228).getAddress());
	}

	@Test
	@DisplayName("Record 1229: City is New York")
	void CityOfRecord1229() {
		assertEquals("New York", customers.get(1228).getCity());
	}

	@Test
	@DisplayName("Record 1229: County is New York")
	void CountyOfRecord1229() {
		assertEquals("New York", customers.get(1228).getCounty());
	}

	@Test
	@DisplayName("Record 1229: State is NY")
	void StateOfRecord1229() {
		assertEquals("NY", customers.get(1228).getState());
	}

	@Test
	@DisplayName("Record 1229: ZIP is 10018")
	void ZIPOfRecord1229() {
		assertEquals("10018", customers.get(1228).getZIP());
	}

	@Test
	@DisplayName("Record 1229: Phone is 212-840-2619")
	void PhoneOfRecord1229() {
		assertEquals("212-840-2619", customers.get(1228).getPhone());
	}

	@Test
	@DisplayName("Record 1229: Fax is 212-840-5963")
	void FaxOfRecord1229() {
		assertEquals("212-840-5963", customers.get(1228).getFax());
	}

	@Test
	@DisplayName("Record 1229: Email is doreen@tijing.com")
	void EmailOfRecord1229() {
		assertEquals("doreen@tijing.com", customers.get(1228).getEmail());
	}

	@Test
	@DisplayName("Record 1229: Web is http://www.doreentijing.com")
	void WebOfRecord1229() {
		assertEquals("http://www.doreentijing.com", customers.get(1228).getWeb());
	}
}
