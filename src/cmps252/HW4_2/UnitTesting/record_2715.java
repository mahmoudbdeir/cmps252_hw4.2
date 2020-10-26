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

@Tag("26")
class Record_2715 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2715: FirstName is Clark")
	void FirstNameOfRecord2715() {
		assertEquals("Clark", customers.get(2714).getFirstName());
	}

	@Test
	@DisplayName("Record 2715: LastName is Stryb")
	void LastNameOfRecord2715() {
		assertEquals("Stryb", customers.get(2714).getLastName());
	}

	@Test
	@DisplayName("Record 2715: Company is Howard Markman")
	void CompanyOfRecord2715() {
		assertEquals("Howard Markman", customers.get(2714).getCompany());
	}

	@Test
	@DisplayName("Record 2715: Address is 1845 S Lewis St")
	void AddressOfRecord2715() {
		assertEquals("1845 S Lewis St", customers.get(2714).getAddress());
	}

	@Test
	@DisplayName("Record 2715: City is Anahym")
	void CityOfRecord2715() {
		assertEquals("Anahym", customers.get(2714).getCity());
	}

	@Test
	@DisplayName("Record 2715: County is Orange")
	void CountyOfRecord2715() {
		assertEquals("Orange", customers.get(2714).getCounty());
	}

	@Test
	@DisplayName("Record 2715: State is CA")
	void StateOfRecord2715() {
		assertEquals("CA", customers.get(2714).getState());
	}

	@Test
	@DisplayName("Record 2715: ZIP is 92805")
	void ZIPOfRecord2715() {
		assertEquals("92805", customers.get(2714).getZIP());
	}

	@Test
	@DisplayName("Record 2715: Phone is 714-938-3939")
	void PhoneOfRecord2715() {
		assertEquals("714-938-3939", customers.get(2714).getPhone());
	}

	@Test
	@DisplayName("Record 2715: Fax is 714-938-4411")
	void FaxOfRecord2715() {
		assertEquals("714-938-4411", customers.get(2714).getFax());
	}

	@Test
	@DisplayName("Record 2715: Email is clark@stryb.com")
	void EmailOfRecord2715() {
		assertEquals("clark@stryb.com", customers.get(2714).getEmail());
	}

	@Test
	@DisplayName("Record 2715: Web is http://www.clarkstryb.com")
	void WebOfRecord2715() {
		assertEquals("http://www.clarkstryb.com", customers.get(2714).getWeb());
	}
}
