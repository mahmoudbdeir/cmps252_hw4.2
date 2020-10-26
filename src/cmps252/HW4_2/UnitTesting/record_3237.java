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

@Tag("17")
class Record_3237 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3237: FirstName is Christian")
	void FirstNameOfRecord3237() {
		assertEquals("Christian", customers.get(3236).getFirstName());
	}

	@Test
	@DisplayName("Record 3237: LastName is Jewell")
	void LastNameOfRecord3237() {
		assertEquals("Jewell", customers.get(3236).getLastName());
	}

	@Test
	@DisplayName("Record 3237: Company is Saint Andrews Marina")
	void CompanyOfRecord3237() {
		assertEquals("Saint Andrews Marina", customers.get(3236).getCompany());
	}

	@Test
	@DisplayName("Record 3237: Address is 145 Witherspoon St")
	void AddressOfRecord3237() {
		assertEquals("145 Witherspoon St", customers.get(3236).getAddress());
	}

	@Test
	@DisplayName("Record 3237: City is Princeton")
	void CityOfRecord3237() {
		assertEquals("Princeton", customers.get(3236).getCity());
	}

	@Test
	@DisplayName("Record 3237: County is Mercer")
	void CountyOfRecord3237() {
		assertEquals("Mercer", customers.get(3236).getCounty());
	}

	@Test
	@DisplayName("Record 3237: State is NJ")
	void StateOfRecord3237() {
		assertEquals("NJ", customers.get(3236).getState());
	}

	@Test
	@DisplayName("Record 3237: ZIP is 8542")
	void ZIPOfRecord3237() {
		assertEquals("8542", customers.get(3236).getZIP());
	}

	@Test
	@DisplayName("Record 3237: Phone is 609-924-0689")
	void PhoneOfRecord3237() {
		assertEquals("609-924-0689", customers.get(3236).getPhone());
	}

	@Test
	@DisplayName("Record 3237: Fax is 609-924-9094")
	void FaxOfRecord3237() {
		assertEquals("609-924-9094", customers.get(3236).getFax());
	}

	@Test
	@DisplayName("Record 3237: Email is christian@jewell.com")
	void EmailOfRecord3237() {
		assertEquals("christian@jewell.com", customers.get(3236).getEmail());
	}

	@Test
	@DisplayName("Record 3237: Web is http://www.christianjewell.com")
	void WebOfRecord3237() {
		assertEquals("http://www.christianjewell.com", customers.get(3236).getWeb());
	}
}
