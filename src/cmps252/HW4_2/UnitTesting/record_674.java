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

@Tag("27")
class Record_674 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 674: FirstName is Dexter")
	void FirstNameOfRecord674() {
		assertEquals("Dexter", customers.get(673).getFirstName());
	}

	@Test
	@DisplayName("Record 674: LastName is Pons")
	void LastNameOfRecord674() {
		assertEquals("Pons", customers.get(673).getLastName());
	}

	@Test
	@DisplayName("Record 674: Company is Kingstonian")
	void CompanyOfRecord674() {
		assertEquals("Kingstonian", customers.get(673).getCompany());
	}

	@Test
	@DisplayName("Record 674: Address is 324 Kings St")
	void AddressOfRecord674() {
		assertEquals("324 Kings St", customers.get(673).getAddress());
	}

	@Test
	@DisplayName("Record 674: City is Salinas")
	void CityOfRecord674() {
		assertEquals("Salinas", customers.get(673).getCity());
	}

	@Test
	@DisplayName("Record 674: County is Monterey")
	void CountyOfRecord674() {
		assertEquals("Monterey", customers.get(673).getCounty());
	}

	@Test
	@DisplayName("Record 674: State is CA")
	void StateOfRecord674() {
		assertEquals("CA", customers.get(673).getState());
	}

	@Test
	@DisplayName("Record 674: ZIP is 93905")
	void ZIPOfRecord674() {
		assertEquals("93905", customers.get(673).getZIP());
	}

	@Test
	@DisplayName("Record 674: Phone is 831-754-2243")
	void PhoneOfRecord674() {
		assertEquals("831-754-2243", customers.get(673).getPhone());
	}

	@Test
	@DisplayName("Record 674: Fax is 831-754-6588")
	void FaxOfRecord674() {
		assertEquals("831-754-6588", customers.get(673).getFax());
	}

	@Test
	@DisplayName("Record 674: Email is dexter@pons.com")
	void EmailOfRecord674() {
		assertEquals("dexter@pons.com", customers.get(673).getEmail());
	}

	@Test
	@DisplayName("Record 674: Web is http://www.dexterpons.com")
	void WebOfRecord674() {
		assertEquals("http://www.dexterpons.com", customers.get(673).getWeb());
	}
}
