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

@Tag("0")
class Record_3139 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3139: FirstName is Eleanore")
	void FirstNameOfRecord3139() {
		assertEquals("Eleanore", customers.get(3138).getFirstName());
	}

	@Test
	@DisplayName("Record 3139: LastName is Bysner")
	void LastNameOfRecord3139() {
		assertEquals("Bysner", customers.get(3138).getLastName());
	}

	@Test
	@DisplayName("Record 3139: Company is A Applebeam And Associates")
	void CompanyOfRecord3139() {
		assertEquals("A Applebeam And Associates", customers.get(3138).getCompany());
	}

	@Test
	@DisplayName("Record 3139: Address is 2401 Pennsylvania Ave")
	void AddressOfRecord3139() {
		assertEquals("2401 Pennsylvania Ave", customers.get(3138).getAddress());
	}

	@Test
	@DisplayName("Record 3139: City is Philadelphia")
	void CityOfRecord3139() {
		assertEquals("Philadelphia", customers.get(3138).getCity());
	}

	@Test
	@DisplayName("Record 3139: County is Philadelphia")
	void CountyOfRecord3139() {
		assertEquals("Philadelphia", customers.get(3138).getCounty());
	}

	@Test
	@DisplayName("Record 3139: State is PA")
	void StateOfRecord3139() {
		assertEquals("PA", customers.get(3138).getState());
	}

	@Test
	@DisplayName("Record 3139: ZIP is 19130")
	void ZIPOfRecord3139() {
		assertEquals("19130", customers.get(3138).getZIP());
	}

	@Test
	@DisplayName("Record 3139: Phone is 215-232-9779")
	void PhoneOfRecord3139() {
		assertEquals("215-232-9779", customers.get(3138).getPhone());
	}

	@Test
	@DisplayName("Record 3139: Fax is 215-232-0092")
	void FaxOfRecord3139() {
		assertEquals("215-232-0092", customers.get(3138).getFax());
	}

	@Test
	@DisplayName("Record 3139: Email is eleanore@bysner.com")
	void EmailOfRecord3139() {
		assertEquals("eleanore@bysner.com", customers.get(3138).getEmail());
	}

	@Test
	@DisplayName("Record 3139: Web is http://www.eleanorebysner.com")
	void WebOfRecord3139() {
		assertEquals("http://www.eleanorebysner.com", customers.get(3138).getWeb());
	}
}
