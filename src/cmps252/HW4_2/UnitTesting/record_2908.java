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

@Tag("19")
class Record_2908 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2908: FirstName is Hazel")
	void FirstNameOfRecord2908() {
		assertEquals("Hazel", customers.get(2907).getFirstName());
	}

	@Test
	@DisplayName("Record 2908: LastName is Hyldahl")
	void LastNameOfRecord2908() {
		assertEquals("Hyldahl", customers.get(2907).getLastName());
	}

	@Test
	@DisplayName("Record 2908: Company is Howard, E Cader Esq")
	void CompanyOfRecord2908() {
		assertEquals("Howard, E Cader Esq", customers.get(2907).getCompany());
	}

	@Test
	@DisplayName("Record 2908: Address is 7200 E 130th")
	void AddressOfRecord2908() {
		assertEquals("7200 E 130th", customers.get(2907).getAddress());
	}

	@Test
	@DisplayName("Record 2908: City is Kansas City")
	void CityOfRecord2908() {
		assertEquals("Kansas City", customers.get(2907).getCity());
	}

	@Test
	@DisplayName("Record 2908: County is Jackson")
	void CountyOfRecord2908() {
		assertEquals("Jackson", customers.get(2907).getCounty());
	}

	@Test
	@DisplayName("Record 2908: State is MO")
	void StateOfRecord2908() {
		assertEquals("MO", customers.get(2907).getState());
	}

	@Test
	@DisplayName("Record 2908: ZIP is 64146")
	void ZIPOfRecord2908() {
		assertEquals("64146", customers.get(2907).getZIP());
	}

	@Test
	@DisplayName("Record 2908: Phone is 816-322-1848")
	void PhoneOfRecord2908() {
		assertEquals("816-322-1848", customers.get(2907).getPhone());
	}

	@Test
	@DisplayName("Record 2908: Fax is 816-322-9556")
	void FaxOfRecord2908() {
		assertEquals("816-322-9556", customers.get(2907).getFax());
	}

	@Test
	@DisplayName("Record 2908: Email is hazel@hyldahl.com")
	void EmailOfRecord2908() {
		assertEquals("hazel@hyldahl.com", customers.get(2907).getEmail());
	}

	@Test
	@DisplayName("Record 2908: Web is http://www.hazelhyldahl.com")
	void WebOfRecord2908() {
		assertEquals("http://www.hazelhyldahl.com", customers.get(2907).getWeb());
	}
}
