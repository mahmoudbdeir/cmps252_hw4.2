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

@Tag("45")
class Record_3369 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3369: FirstName is Bennie")
	void FirstNameOfRecord3369() {
		assertEquals("Bennie", customers.get(3368).getFirstName());
	}

	@Test
	@DisplayName("Record 3369: LastName is Ellinger")
	void LastNameOfRecord3369() {
		assertEquals("Ellinger", customers.get(3368).getLastName());
	}

	@Test
	@DisplayName("Record 3369: Company is Telescan Inc")
	void CompanyOfRecord3369() {
		assertEquals("Telescan Inc", customers.get(3368).getCompany());
	}

	@Test
	@DisplayName("Record 3369: Address is 111 N County St")
	void AddressOfRecord3369() {
		assertEquals("111 N County St", customers.get(3368).getAddress());
	}

	@Test
	@DisplayName("Record 3369: City is Waukegan")
	void CityOfRecord3369() {
		assertEquals("Waukegan", customers.get(3368).getCity());
	}

	@Test
	@DisplayName("Record 3369: County is Lake")
	void CountyOfRecord3369() {
		assertEquals("Lake", customers.get(3368).getCounty());
	}

	@Test
	@DisplayName("Record 3369: State is IL")
	void StateOfRecord3369() {
		assertEquals("IL", customers.get(3368).getState());
	}

	@Test
	@DisplayName("Record 3369: ZIP is 60085")
	void ZIPOfRecord3369() {
		assertEquals("60085", customers.get(3368).getZIP());
	}

	@Test
	@DisplayName("Record 3369: Phone is 847-662-3096")
	void PhoneOfRecord3369() {
		assertEquals("847-662-3096", customers.get(3368).getPhone());
	}

	@Test
	@DisplayName("Record 3369: Fax is 847-662-2579")
	void FaxOfRecord3369() {
		assertEquals("847-662-2579", customers.get(3368).getFax());
	}

	@Test
	@DisplayName("Record 3369: Email is bennie@ellinger.com")
	void EmailOfRecord3369() {
		assertEquals("bennie@ellinger.com", customers.get(3368).getEmail());
	}

	@Test
	@DisplayName("Record 3369: Web is http://www.bennieellinger.com")
	void WebOfRecord3369() {
		assertEquals("http://www.bennieellinger.com", customers.get(3368).getWeb());
	}
}
