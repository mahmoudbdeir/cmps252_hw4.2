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

@Tag("4")
class Record_1735 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1735: FirstName is Karrie")
	void FirstNameOfRecord1735() {
		assertEquals("Karrie", customers.get(1734).getFirstName());
	}

	@Test
	@DisplayName("Record 1735: LastName is Tottingham")
	void LastNameOfRecord1735() {
		assertEquals("Tottingham", customers.get(1734).getLastName());
	}

	@Test
	@DisplayName("Record 1735: Company is Alamance County Real Est Guid")
	void CompanyOfRecord1735() {
		assertEquals("Alamance County Real Est Guid", customers.get(1734).getCompany());
	}

	@Test
	@DisplayName("Record 1735: Address is 1326 Walnut St")
	void AddressOfRecord1735() {
		assertEquals("1326 Walnut St", customers.get(1734).getAddress());
	}

	@Test
	@DisplayName("Record 1735: City is Philadelphia")
	void CityOfRecord1735() {
		assertEquals("Philadelphia", customers.get(1734).getCity());
	}

	@Test
	@DisplayName("Record 1735: County is Philadelphia")
	void CountyOfRecord1735() {
		assertEquals("Philadelphia", customers.get(1734).getCounty());
	}

	@Test
	@DisplayName("Record 1735: State is PA")
	void StateOfRecord1735() {
		assertEquals("PA", customers.get(1734).getState());
	}

	@Test
	@DisplayName("Record 1735: ZIP is 19107")
	void ZIPOfRecord1735() {
		assertEquals("19107", customers.get(1734).getZIP());
	}

	@Test
	@DisplayName("Record 1735: Phone is 215-545-7969")
	void PhoneOfRecord1735() {
		assertEquals("215-545-7969", customers.get(1734).getPhone());
	}

	@Test
	@DisplayName("Record 1735: Fax is 215-545-4474")
	void FaxOfRecord1735() {
		assertEquals("215-545-4474", customers.get(1734).getFax());
	}

	@Test
	@DisplayName("Record 1735: Email is karrie@tottingham.com")
	void EmailOfRecord1735() {
		assertEquals("karrie@tottingham.com", customers.get(1734).getEmail());
	}

	@Test
	@DisplayName("Record 1735: Web is http://www.karrietottingham.com")
	void WebOfRecord1735() {
		assertEquals("http://www.karrietottingham.com", customers.get(1734).getWeb());
	}
}
