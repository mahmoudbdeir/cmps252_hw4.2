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

@Tag("23")
class Record_185 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 185: FirstName is Taryn")
	void FirstNameOfRecord185() {
		assertEquals("Taryn", customers.get(184).getFirstName());
	}

	@Test
	@DisplayName("Record 185: LastName is Romash")
	void LastNameOfRecord185() {
		assertEquals("Romash", customers.get(184).getLastName());
	}

	@Test
	@DisplayName("Record 185: Company is Gulf Coast Marine Agency Inc")
	void CompanyOfRecord185() {
		assertEquals("Gulf Coast Marine Agency Inc", customers.get(184).getCompany());
	}

	@Test
	@DisplayName("Record 185: Address is 458 West Ave  #-2")
	void AddressOfRecord185() {
		assertEquals("458 West Ave  #-2", customers.get(184).getAddress());
	}

	@Test
	@DisplayName("Record 185: City is Albion")
	void CityOfRecord185() {
		assertEquals("Albion", customers.get(184).getCity());
	}

	@Test
	@DisplayName("Record 185: County is Orleans")
	void CountyOfRecord185() {
		assertEquals("Orleans", customers.get(184).getCounty());
	}

	@Test
	@DisplayName("Record 185: State is NY")
	void StateOfRecord185() {
		assertEquals("NY", customers.get(184).getState());
	}

	@Test
	@DisplayName("Record 185: ZIP is 14411")
	void ZIPOfRecord185() {
		assertEquals("14411", customers.get(184).getZIP());
	}

	@Test
	@DisplayName("Record 185: Phone is 585-589-6534")
	void PhoneOfRecord185() {
		assertEquals("585-589-6534", customers.get(184).getPhone());
	}

	@Test
	@DisplayName("Record 185: Fax is 585-589-0804")
	void FaxOfRecord185() {
		assertEquals("585-589-0804", customers.get(184).getFax());
	}

	@Test
	@DisplayName("Record 185: Email is taryn@romash.com")
	void EmailOfRecord185() {
		assertEquals("taryn@romash.com", customers.get(184).getEmail());
	}

	@Test
	@DisplayName("Record 185: Web is http://www.tarynromash.com")
	void WebOfRecord185() {
		assertEquals("http://www.tarynromash.com", customers.get(184).getWeb());
	}
}
