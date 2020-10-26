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
class Record_4801 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4801: FirstName is Shelby")
	void FirstNameOfRecord4801() {
		assertEquals("Shelby", customers.get(4800).getFirstName());
	}

	@Test
	@DisplayName("Record 4801: LastName is Gaw")
	void LastNameOfRecord4801() {
		assertEquals("Gaw", customers.get(4800).getLastName());
	}

	@Test
	@DisplayName("Record 4801: Company is Madden Insurance Agency")
	void CompanyOfRecord4801() {
		assertEquals("Madden Insurance Agency", customers.get(4800).getCompany());
	}

	@Test
	@DisplayName("Record 4801: Address is 39 Shale Dr")
	void AddressOfRecord4801() {
		assertEquals("39 Shale Dr", customers.get(4800).getAddress());
	}

	@Test
	@DisplayName("Record 4801: City is Rochester")
	void CityOfRecord4801() {
		assertEquals("Rochester", customers.get(4800).getCity());
	}

	@Test
	@DisplayName("Record 4801: County is Monroe")
	void CountyOfRecord4801() {
		assertEquals("Monroe", customers.get(4800).getCounty());
	}

	@Test
	@DisplayName("Record 4801: State is NY")
	void StateOfRecord4801() {
		assertEquals("NY", customers.get(4800).getState());
	}

	@Test
	@DisplayName("Record 4801: ZIP is 14615")
	void ZIPOfRecord4801() {
		assertEquals("14615", customers.get(4800).getZIP());
	}

	@Test
	@DisplayName("Record 4801: Phone is 585-621-9034")
	void PhoneOfRecord4801() {
		assertEquals("585-621-9034", customers.get(4800).getPhone());
	}

	@Test
	@DisplayName("Record 4801: Fax is 585-621-6683")
	void FaxOfRecord4801() {
		assertEquals("585-621-6683", customers.get(4800).getFax());
	}

	@Test
	@DisplayName("Record 4801: Email is shelby@gaw.com")
	void EmailOfRecord4801() {
		assertEquals("shelby@gaw.com", customers.get(4800).getEmail());
	}

	@Test
	@DisplayName("Record 4801: Web is http://www.shelbygaw.com")
	void WebOfRecord4801() {
		assertEquals("http://www.shelbygaw.com", customers.get(4800).getWeb());
	}
}
