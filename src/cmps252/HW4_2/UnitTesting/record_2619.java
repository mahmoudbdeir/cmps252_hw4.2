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

@Tag("29")
class Record_2619 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2619: FirstName is Vern")
	void FirstNameOfRecord2619() {
		assertEquals("Vern", customers.get(2618).getFirstName());
	}

	@Test
	@DisplayName("Record 2619: LastName is Vuncannon")
	void LastNameOfRecord2619() {
		assertEquals("Vuncannon", customers.get(2618).getLastName());
	}

	@Test
	@DisplayName("Record 2619: Company is Sunny 103 7 Kjqy")
	void CompanyOfRecord2619() {
		assertEquals("Sunny 103 7 Kjqy", customers.get(2618).getCompany());
	}

	@Test
	@DisplayName("Record 2619: Address is 123 Grand St")
	void AddressOfRecord2619() {
		assertEquals("123 Grand St", customers.get(2618).getAddress());
	}

	@Test
	@DisplayName("Record 2619: City is Brooklyn")
	void CityOfRecord2619() {
		assertEquals("Brooklyn", customers.get(2618).getCity());
	}

	@Test
	@DisplayName("Record 2619: County is Kings")
	void CountyOfRecord2619() {
		assertEquals("Kings", customers.get(2618).getCounty());
	}

	@Test
	@DisplayName("Record 2619: State is NY")
	void StateOfRecord2619() {
		assertEquals("NY", customers.get(2618).getState());
	}

	@Test
	@DisplayName("Record 2619: ZIP is 11211")
	void ZIPOfRecord2619() {
		assertEquals("11211", customers.get(2618).getZIP());
	}

	@Test
	@DisplayName("Record 2619: Phone is 718-543-5563")
	void PhoneOfRecord2619() {
		assertEquals("718-543-5563", customers.get(2618).getPhone());
	}

	@Test
	@DisplayName("Record 2619: Fax is 718-543-7409")
	void FaxOfRecord2619() {
		assertEquals("718-543-7409", customers.get(2618).getFax());
	}

	@Test
	@DisplayName("Record 2619: Email is vern@vuncannon.com")
	void EmailOfRecord2619() {
		assertEquals("vern@vuncannon.com", customers.get(2618).getEmail());
	}

	@Test
	@DisplayName("Record 2619: Web is http://www.vernvuncannon.com")
	void WebOfRecord2619() {
		assertEquals("http://www.vernvuncannon.com", customers.get(2618).getWeb());
	}
}
