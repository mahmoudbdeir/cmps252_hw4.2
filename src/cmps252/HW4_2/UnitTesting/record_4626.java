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
class Record_4626 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4626: FirstName is Olive")
	void FirstNameOfRecord4626() {
		assertEquals("Olive", customers.get(4625).getFirstName());
	}

	@Test
	@DisplayName("Record 4626: LastName is Demarino")
	void LastNameOfRecord4626() {
		assertEquals("Demarino", customers.get(4625).getLastName());
	}

	@Test
	@DisplayName("Record 4626: Company is Circuit Clerks Office")
	void CompanyOfRecord4626() {
		assertEquals("Circuit Clerks Office", customers.get(4625).getCompany());
	}

	@Test
	@DisplayName("Record 4626: Address is Buttermilk Rd")
	void AddressOfRecord4626() {
		assertEquals("Buttermilk Rd", customers.get(4625).getAddress());
	}

	@Test
	@DisplayName("Record 4626: City is Ellsworth")
	void CityOfRecord4626() {
		assertEquals("Ellsworth", customers.get(4625).getCity());
	}

	@Test
	@DisplayName("Record 4626: County is Hancock")
	void CountyOfRecord4626() {
		assertEquals("Hancock", customers.get(4625).getCounty());
	}

	@Test
	@DisplayName("Record 4626: State is ME")
	void StateOfRecord4626() {
		assertEquals("ME", customers.get(4625).getState());
	}

	@Test
	@DisplayName("Record 4626: ZIP is 4605")
	void ZIPOfRecord4626() {
		assertEquals("4605", customers.get(4625).getZIP());
	}

	@Test
	@DisplayName("Record 4626: Phone is 207-667-2878")
	void PhoneOfRecord4626() {
		assertEquals("207-667-2878", customers.get(4625).getPhone());
	}

	@Test
	@DisplayName("Record 4626: Fax is 207-667-5747")
	void FaxOfRecord4626() {
		assertEquals("207-667-5747", customers.get(4625).getFax());
	}

	@Test
	@DisplayName("Record 4626: Email is olive@demarino.com")
	void EmailOfRecord4626() {
		assertEquals("olive@demarino.com", customers.get(4625).getEmail());
	}

	@Test
	@DisplayName("Record 4626: Web is http://www.olivedemarino.com")
	void WebOfRecord4626() {
		assertEquals("http://www.olivedemarino.com", customers.get(4625).getWeb());
	}
}
