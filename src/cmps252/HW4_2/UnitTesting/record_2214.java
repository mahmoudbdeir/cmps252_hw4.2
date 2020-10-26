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

@Tag("25")
class Record_2214 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2214: FirstName is Olive")
	void FirstNameOfRecord2214() {
		assertEquals("Olive", customers.get(2213).getFirstName());
	}

	@Test
	@DisplayName("Record 2214: LastName is Ondeck")
	void LastNameOfRecord2214() {
		assertEquals("Ondeck", customers.get(2213).getLastName());
	}

	@Test
	@DisplayName("Record 2214: Company is John L Harlan & Assoc Pc")
	void CompanyOfRecord2214() {
		assertEquals("John L Harlan & Assoc Pc", customers.get(2213).getCompany());
	}

	@Test
	@DisplayName("Record 2214: Address is 135 Auburn Ave Ne")
	void AddressOfRecord2214() {
		assertEquals("135 Auburn Ave Ne", customers.get(2213).getAddress());
	}

	@Test
	@DisplayName("Record 2214: City is Atlanta")
	void CityOfRecord2214() {
		assertEquals("Atlanta", customers.get(2213).getCity());
	}

	@Test
	@DisplayName("Record 2214: County is Fulton")
	void CountyOfRecord2214() {
		assertEquals("Fulton", customers.get(2213).getCounty());
	}

	@Test
	@DisplayName("Record 2214: State is GA")
	void StateOfRecord2214() {
		assertEquals("GA", customers.get(2213).getState());
	}

	@Test
	@DisplayName("Record 2214: ZIP is 30303")
	void ZIPOfRecord2214() {
		assertEquals("30303", customers.get(2213).getZIP());
	}

	@Test
	@DisplayName("Record 2214: Phone is 404-521-3350")
	void PhoneOfRecord2214() {
		assertEquals("404-521-3350", customers.get(2213).getPhone());
	}

	@Test
	@DisplayName("Record 2214: Fax is 404-521-4755")
	void FaxOfRecord2214() {
		assertEquals("404-521-4755", customers.get(2213).getFax());
	}

	@Test
	@DisplayName("Record 2214: Email is olive@ondeck.com")
	void EmailOfRecord2214() {
		assertEquals("olive@ondeck.com", customers.get(2213).getEmail());
	}

	@Test
	@DisplayName("Record 2214: Web is http://www.oliveondeck.com")
	void WebOfRecord2214() {
		assertEquals("http://www.oliveondeck.com", customers.get(2213).getWeb());
	}
}
