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

@Tag("9")
class Record_3203 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3203: FirstName is Bobby")
	void FirstNameOfRecord3203() {
		assertEquals("Bobby", customers.get(3202).getFirstName());
	}

	@Test
	@DisplayName("Record 3203: LastName is Dorta")
	void LastNameOfRecord3203() {
		assertEquals("Dorta", customers.get(3202).getLastName());
	}

	@Test
	@DisplayName("Record 3203: Company is Langer Manufacturing Co")
	void CompanyOfRecord3203() {
		assertEquals("Langer Manufacturing Co", customers.get(3202).getCompany());
	}

	@Test
	@DisplayName("Record 3203: Address is 41 Park St")
	void AddressOfRecord3203() {
		assertEquals("41 Park St", customers.get(3202).getAddress());
	}

	@Test
	@DisplayName("Record 3203: City is Adams")
	void CityOfRecord3203() {
		assertEquals("Adams", customers.get(3202).getCity());
	}

	@Test
	@DisplayName("Record 3203: County is Berkshire")
	void CountyOfRecord3203() {
		assertEquals("Berkshire", customers.get(3202).getCounty());
	}

	@Test
	@DisplayName("Record 3203: State is MA")
	void StateOfRecord3203() {
		assertEquals("MA", customers.get(3202).getState());
	}

	@Test
	@DisplayName("Record 3203: ZIP is 1220")
	void ZIPOfRecord3203() {
		assertEquals("1220", customers.get(3202).getZIP());
	}

	@Test
	@DisplayName("Record 3203: Phone is 413-743-7822")
	void PhoneOfRecord3203() {
		assertEquals("413-743-7822", customers.get(3202).getPhone());
	}

	@Test
	@DisplayName("Record 3203: Fax is 413-743-6893")
	void FaxOfRecord3203() {
		assertEquals("413-743-6893", customers.get(3202).getFax());
	}

	@Test
	@DisplayName("Record 3203: Email is bobby@dorta.com")
	void EmailOfRecord3203() {
		assertEquals("bobby@dorta.com", customers.get(3202).getEmail());
	}

	@Test
	@DisplayName("Record 3203: Web is http://www.bobbydorta.com")
	void WebOfRecord3203() {
		assertEquals("http://www.bobbydorta.com", customers.get(3202).getWeb());
	}
}
