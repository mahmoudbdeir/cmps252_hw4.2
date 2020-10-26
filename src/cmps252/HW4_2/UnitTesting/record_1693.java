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

@Tag("48")
class Record_1693 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1693: FirstName is Freddie")
	void FirstNameOfRecord1693() {
		assertEquals("Freddie", customers.get(1692).getFirstName());
	}

	@Test
	@DisplayName("Record 1693: LastName is Bonenfant")
	void LastNameOfRecord1693() {
		assertEquals("Bonenfant", customers.get(1692).getLastName());
	}

	@Test
	@DisplayName("Record 1693: Company is Holiday Inn")
	void CompanyOfRecord1693() {
		assertEquals("Holiday Inn", customers.get(1692).getCompany());
	}

	@Test
	@DisplayName("Record 1693: Address is 3800 S 16th St")
	void AddressOfRecord1693() {
		assertEquals("3800 S 16th St", customers.get(1692).getAddress());
	}

	@Test
	@DisplayName("Record 1693: City is Phoenix")
	void CityOfRecord1693() {
		assertEquals("Phoenix", customers.get(1692).getCity());
	}

	@Test
	@DisplayName("Record 1693: County is Maricopa")
	void CountyOfRecord1693() {
		assertEquals("Maricopa", customers.get(1692).getCounty());
	}

	@Test
	@DisplayName("Record 1693: State is AZ")
	void StateOfRecord1693() {
		assertEquals("AZ", customers.get(1692).getState());
	}

	@Test
	@DisplayName("Record 1693: ZIP is 85040")
	void ZIPOfRecord1693() {
		assertEquals("85040", customers.get(1692).getZIP());
	}

	@Test
	@DisplayName("Record 1693: Phone is 602-243-5433")
	void PhoneOfRecord1693() {
		assertEquals("602-243-5433", customers.get(1692).getPhone());
	}

	@Test
	@DisplayName("Record 1693: Fax is 602-243-1455")
	void FaxOfRecord1693() {
		assertEquals("602-243-1455", customers.get(1692).getFax());
	}

	@Test
	@DisplayName("Record 1693: Email is freddie@bonenfant.com")
	void EmailOfRecord1693() {
		assertEquals("freddie@bonenfant.com", customers.get(1692).getEmail());
	}

	@Test
	@DisplayName("Record 1693: Web is http://www.freddiebonenfant.com")
	void WebOfRecord1693() {
		assertEquals("http://www.freddiebonenfant.com", customers.get(1692).getWeb());
	}
}
