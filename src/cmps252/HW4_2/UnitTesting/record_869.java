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

@Tag("2")
class Record_869 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 869: FirstName is Coleman")
	void FirstNameOfRecord869() {
		assertEquals("Coleman", customers.get(868).getFirstName());
	}

	@Test
	@DisplayName("Record 869: LastName is Bequette")
	void LastNameOfRecord869() {
		assertEquals("Bequette", customers.get(868).getLastName());
	}

	@Test
	@DisplayName("Record 869: Company is Candee Productions")
	void CompanyOfRecord869() {
		assertEquals("Candee Productions", customers.get(868).getCompany());
	}

	@Test
	@DisplayName("Record 869: Address is 926 New Market St")
	void AddressOfRecord869() {
		assertEquals("926 New Market St", customers.get(868).getAddress());
	}

	@Test
	@DisplayName("Record 869: City is Philadelphia")
	void CityOfRecord869() {
		assertEquals("Philadelphia", customers.get(868).getCity());
	}

	@Test
	@DisplayName("Record 869: County is Philadelphia")
	void CountyOfRecord869() {
		assertEquals("Philadelphia", customers.get(868).getCounty());
	}

	@Test
	@DisplayName("Record 869: State is PA")
	void StateOfRecord869() {
		assertEquals("PA", customers.get(868).getState());
	}

	@Test
	@DisplayName("Record 869: ZIP is 19123")
	void ZIPOfRecord869() {
		assertEquals("19123", customers.get(868).getZIP());
	}

	@Test
	@DisplayName("Record 869: Phone is 215-923-9079")
	void PhoneOfRecord869() {
		assertEquals("215-923-9079", customers.get(868).getPhone());
	}

	@Test
	@DisplayName("Record 869: Fax is 215-923-6879")
	void FaxOfRecord869() {
		assertEquals("215-923-6879", customers.get(868).getFax());
	}

	@Test
	@DisplayName("Record 869: Email is coleman@bequette.com")
	void EmailOfRecord869() {
		assertEquals("coleman@bequette.com", customers.get(868).getEmail());
	}

	@Test
	@DisplayName("Record 869: Web is http://www.colemanbequette.com")
	void WebOfRecord869() {
		assertEquals("http://www.colemanbequette.com", customers.get(868).getWeb());
	}
}
