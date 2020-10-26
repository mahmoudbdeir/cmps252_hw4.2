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

@Tag("21")
class Record_859 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 859: FirstName is Myrna")
	void FirstNameOfRecord859() {
		assertEquals("Myrna", customers.get(858).getFirstName());
	}

	@Test
	@DisplayName("Record 859: LastName is Trapper")
	void LastNameOfRecord859() {
		assertEquals("Trapper", customers.get(858).getLastName());
	}

	@Test
	@DisplayName("Record 859: Company is Allied Electronics")
	void CompanyOfRecord859() {
		assertEquals("Allied Electronics", customers.get(858).getCompany());
	}

	@Test
	@DisplayName("Record 859: Address is 904 Broadway Ave Nw")
	void AddressOfRecord859() {
		assertEquals("904 Broadway Ave Nw", customers.get(858).getAddress());
	}

	@Test
	@DisplayName("Record 859: City is Grand Rapids")
	void CityOfRecord859() {
		assertEquals("Grand Rapids", customers.get(858).getCity());
	}

	@Test
	@DisplayName("Record 859: County is Kent")
	void CountyOfRecord859() {
		assertEquals("Kent", customers.get(858).getCounty());
	}

	@Test
	@DisplayName("Record 859: State is MI")
	void StateOfRecord859() {
		assertEquals("MI", customers.get(858).getState());
	}

	@Test
	@DisplayName("Record 859: ZIP is 49504")
	void ZIPOfRecord859() {
		assertEquals("49504", customers.get(858).getZIP());
	}

	@Test
	@DisplayName("Record 859: Phone is 616-459-6095")
	void PhoneOfRecord859() {
		assertEquals("616-459-6095", customers.get(858).getPhone());
	}

	@Test
	@DisplayName("Record 859: Fax is 616-459-8087")
	void FaxOfRecord859() {
		assertEquals("616-459-8087", customers.get(858).getFax());
	}

	@Test
	@DisplayName("Record 859: Email is myrna@trapper.com")
	void EmailOfRecord859() {
		assertEquals("myrna@trapper.com", customers.get(858).getEmail());
	}

	@Test
	@DisplayName("Record 859: Web is http://www.myrnatrapper.com")
	void WebOfRecord859() {
		assertEquals("http://www.myrnatrapper.com", customers.get(858).getWeb());
	}
}
