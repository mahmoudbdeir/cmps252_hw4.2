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

@Tag("16")
class Record_1333 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1333: FirstName is Migdalia")
	void FirstNameOfRecord1333() {
		assertEquals("Migdalia", customers.get(1332).getFirstName());
	}

	@Test
	@DisplayName("Record 1333: LastName is Blevans")
	void LastNameOfRecord1333() {
		assertEquals("Blevans", customers.get(1332).getLastName());
	}

	@Test
	@DisplayName("Record 1333: Company is General Audio Visual Inc")
	void CompanyOfRecord1333() {
		assertEquals("General Audio Visual Inc", customers.get(1332).getCompany());
	}

	@Test
	@DisplayName("Record 1333: Address is 1269 Majesty Dr")
	void AddressOfRecord1333() {
		assertEquals("1269 Majesty Dr", customers.get(1332).getAddress());
	}

	@Test
	@DisplayName("Record 1333: City is Dallas")
	void CityOfRecord1333() {
		assertEquals("Dallas", customers.get(1332).getCity());
	}

	@Test
	@DisplayName("Record 1333: County is Dallas")
	void CountyOfRecord1333() {
		assertEquals("Dallas", customers.get(1332).getCounty());
	}

	@Test
	@DisplayName("Record 1333: State is TX")
	void StateOfRecord1333() {
		assertEquals("TX", customers.get(1332).getState());
	}

	@Test
	@DisplayName("Record 1333: ZIP is 75247")
	void ZIPOfRecord1333() {
		assertEquals("75247", customers.get(1332).getZIP());
	}

	@Test
	@DisplayName("Record 1333: Phone is 214-630-8688")
	void PhoneOfRecord1333() {
		assertEquals("214-630-8688", customers.get(1332).getPhone());
	}

	@Test
	@DisplayName("Record 1333: Fax is 214-630-5594")
	void FaxOfRecord1333() {
		assertEquals("214-630-5594", customers.get(1332).getFax());
	}

	@Test
	@DisplayName("Record 1333: Email is migdalia@blevans.com")
	void EmailOfRecord1333() {
		assertEquals("migdalia@blevans.com", customers.get(1332).getEmail());
	}

	@Test
	@DisplayName("Record 1333: Web is http://www.migdaliablevans.com")
	void WebOfRecord1333() {
		assertEquals("http://www.migdaliablevans.com", customers.get(1332).getWeb());
	}
}
