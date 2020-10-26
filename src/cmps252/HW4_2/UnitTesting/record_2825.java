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

@Tag("2")
class Record_2825 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2825: FirstName is Nicholas")
	void FirstNameOfRecord2825() {
		assertEquals("Nicholas", customers.get(2824).getFirstName());
	}

	@Test
	@DisplayName("Record 2825: LastName is Diebol")
	void LastNameOfRecord2825() {
		assertEquals("Diebol", customers.get(2824).getLastName());
	}

	@Test
	@DisplayName("Record 2825: Company is Mtn Stat Muzzleloading Supl")
	void CompanyOfRecord2825() {
		assertEquals("Mtn Stat Muzzleloading Supl", customers.get(2824).getCompany());
	}

	@Test
	@DisplayName("Record 2825: Address is 7302 Washington St")
	void AddressOfRecord2825() {
		assertEquals("7302 Washington St", customers.get(2824).getAddress());
	}

	@Test
	@DisplayName("Record 2825: City is Saint Joseph")
	void CityOfRecord2825() {
		assertEquals("Saint Joseph", customers.get(2824).getCity());
	}

	@Test
	@DisplayName("Record 2825: County is Buchanan")
	void CountyOfRecord2825() {
		assertEquals("Buchanan", customers.get(2824).getCounty());
	}

	@Test
	@DisplayName("Record 2825: State is MO")
	void StateOfRecord2825() {
		assertEquals("MO", customers.get(2824).getState());
	}

	@Test
	@DisplayName("Record 2825: ZIP is 64504")
	void ZIPOfRecord2825() {
		assertEquals("64504", customers.get(2824).getZIP());
	}

	@Test
	@DisplayName("Record 2825: Phone is 816-238-5991")
	void PhoneOfRecord2825() {
		assertEquals("816-238-5991", customers.get(2824).getPhone());
	}

	@Test
	@DisplayName("Record 2825: Fax is 816-238-9734")
	void FaxOfRecord2825() {
		assertEquals("816-238-9734", customers.get(2824).getFax());
	}

	@Test
	@DisplayName("Record 2825: Email is nicholas@diebol.com")
	void EmailOfRecord2825() {
		assertEquals("nicholas@diebol.com", customers.get(2824).getEmail());
	}

	@Test
	@DisplayName("Record 2825: Web is http://www.nicholasdiebol.com")
	void WebOfRecord2825() {
		assertEquals("http://www.nicholasdiebol.com", customers.get(2824).getWeb());
	}
}
