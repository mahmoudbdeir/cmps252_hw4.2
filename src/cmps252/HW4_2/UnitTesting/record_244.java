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

@Tag("35")
class Record_244 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 244: FirstName is Karla")
	void FirstNameOfRecord244() {
		assertEquals("Karla", customers.get(243).getFirstName());
	}

	@Test
	@DisplayName("Record 244: LastName is Anding")
	void LastNameOfRecord244() {
		assertEquals("Anding", customers.get(243).getLastName());
	}

	@Test
	@DisplayName("Record 244: Company is Chucalissa Archaeological Mus")
	void CompanyOfRecord244() {
		assertEquals("Chucalissa Archaeological Mus", customers.get(243).getCompany());
	}

	@Test
	@DisplayName("Record 244: Address is 2976 W Melvina St")
	void AddressOfRecord244() {
		assertEquals("2976 W Melvina St", customers.get(243).getAddress());
	}

	@Test
	@DisplayName("Record 244: City is Milwaukee")
	void CityOfRecord244() {
		assertEquals("Milwaukee", customers.get(243).getCity());
	}

	@Test
	@DisplayName("Record 244: County is Milwaukee")
	void CountyOfRecord244() {
		assertEquals("Milwaukee", customers.get(243).getCounty());
	}

	@Test
	@DisplayName("Record 244: State is WI")
	void StateOfRecord244() {
		assertEquals("WI", customers.get(243).getState());
	}

	@Test
	@DisplayName("Record 244: ZIP is 53216")
	void ZIPOfRecord244() {
		assertEquals("53216", customers.get(243).getZIP());
	}

	@Test
	@DisplayName("Record 244: Phone is 414-265-9747")
	void PhoneOfRecord244() {
		assertEquals("414-265-9747", customers.get(243).getPhone());
	}

	@Test
	@DisplayName("Record 244: Fax is 414-265-0951")
	void FaxOfRecord244() {
		assertEquals("414-265-0951", customers.get(243).getFax());
	}

	@Test
	@DisplayName("Record 244: Email is karla@anding.com")
	void EmailOfRecord244() {
		assertEquals("karla@anding.com", customers.get(243).getEmail());
	}

	@Test
	@DisplayName("Record 244: Web is http://www.karlaanding.com")
	void WebOfRecord244() {
		assertEquals("http://www.karlaanding.com", customers.get(243).getWeb());
	}
}
