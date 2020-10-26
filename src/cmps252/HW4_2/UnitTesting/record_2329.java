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

@Tag("38")
class Record_2329 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2329: FirstName is Stephanie")
	void FirstNameOfRecord2329() {
		assertEquals("Stephanie", customers.get(2328).getFirstName());
	}

	@Test
	@DisplayName("Record 2329: LastName is Folwell")
	void LastNameOfRecord2329() {
		assertEquals("Folwell", customers.get(2328).getLastName());
	}

	@Test
	@DisplayName("Record 2329: Company is Hamilton House")
	void CompanyOfRecord2329() {
		assertEquals("Hamilton House", customers.get(2328).getCompany());
	}

	@Test
	@DisplayName("Record 2329: Address is 815 W Wall St")
	void AddressOfRecord2329() {
		assertEquals("815 W Wall St", customers.get(2328).getAddress());
	}

	@Test
	@DisplayName("Record 2329: City is Grapevine")
	void CityOfRecord2329() {
		assertEquals("Grapevine", customers.get(2328).getCity());
	}

	@Test
	@DisplayName("Record 2329: County is Tarrant")
	void CountyOfRecord2329() {
		assertEquals("Tarrant", customers.get(2328).getCounty());
	}

	@Test
	@DisplayName("Record 2329: State is TX")
	void StateOfRecord2329() {
		assertEquals("TX", customers.get(2328).getState());
	}

	@Test
	@DisplayName("Record 2329: ZIP is 76051")
	void ZIPOfRecord2329() {
		assertEquals("76051", customers.get(2328).getZIP());
	}

	@Test
	@DisplayName("Record 2329: Phone is 817-329-1987")
	void PhoneOfRecord2329() {
		assertEquals("817-329-1987", customers.get(2328).getPhone());
	}

	@Test
	@DisplayName("Record 2329: Fax is 817-329-6081")
	void FaxOfRecord2329() {
		assertEquals("817-329-6081", customers.get(2328).getFax());
	}

	@Test
	@DisplayName("Record 2329: Email is stephanie@folwell.com")
	void EmailOfRecord2329() {
		assertEquals("stephanie@folwell.com", customers.get(2328).getEmail());
	}

	@Test
	@DisplayName("Record 2329: Web is http://www.stephaniefolwell.com")
	void WebOfRecord2329() {
		assertEquals("http://www.stephaniefolwell.com", customers.get(2328).getWeb());
	}
}
