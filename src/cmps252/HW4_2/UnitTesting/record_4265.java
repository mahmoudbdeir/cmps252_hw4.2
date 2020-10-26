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

@Tag("22")
class Record_4265 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4265: FirstName is Ernesto")
	void FirstNameOfRecord4265() {
		assertEquals("Ernesto", customers.get(4264).getFirstName());
	}

	@Test
	@DisplayName("Record 4265: LastName is Bethey")
	void LastNameOfRecord4265() {
		assertEquals("Bethey", customers.get(4264).getLastName());
	}

	@Test
	@DisplayName("Record 4265: Company is Panchos")
	void CompanyOfRecord4265() {
		assertEquals("Panchos", customers.get(4264).getCompany());
	}

	@Test
	@DisplayName("Record 4265: Address is 800 Commerce St")
	void AddressOfRecord4265() {
		assertEquals("800 Commerce St", customers.get(4264).getAddress());
	}

	@Test
	@DisplayName("Record 4265: City is Houston")
	void CityOfRecord4265() {
		assertEquals("Houston", customers.get(4264).getCity());
	}

	@Test
	@DisplayName("Record 4265: County is Harris")
	void CountyOfRecord4265() {
		assertEquals("Harris", customers.get(4264).getCounty());
	}

	@Test
	@DisplayName("Record 4265: State is TX")
	void StateOfRecord4265() {
		assertEquals("TX", customers.get(4264).getState());
	}

	@Test
	@DisplayName("Record 4265: ZIP is 77002")
	void ZIPOfRecord4265() {
		assertEquals("77002", customers.get(4264).getZIP());
	}

	@Test
	@DisplayName("Record 4265: Phone is 713-225-6811")
	void PhoneOfRecord4265() {
		assertEquals("713-225-6811", customers.get(4264).getPhone());
	}

	@Test
	@DisplayName("Record 4265: Fax is 713-225-6479")
	void FaxOfRecord4265() {
		assertEquals("713-225-6479", customers.get(4264).getFax());
	}

	@Test
	@DisplayName("Record 4265: Email is ernesto@bethey.com")
	void EmailOfRecord4265() {
		assertEquals("ernesto@bethey.com", customers.get(4264).getEmail());
	}

	@Test
	@DisplayName("Record 4265: Web is http://www.ernestobethey.com")
	void WebOfRecord4265() {
		assertEquals("http://www.ernestobethey.com", customers.get(4264).getWeb());
	}
}
