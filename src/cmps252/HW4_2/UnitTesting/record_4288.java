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

@Tag("16")
class Record_4288 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4288: FirstName is Tabitha")
	void FirstNameOfRecord4288() {
		assertEquals("Tabitha", customers.get(4287).getFirstName());
	}

	@Test
	@DisplayName("Record 4288: LastName is Pyo")
	void LastNameOfRecord4288() {
		assertEquals("Pyo", customers.get(4287).getLastName());
	}

	@Test
	@DisplayName("Record 4288: Company is Atlas Truck Body Inc")
	void CompanyOfRecord4288() {
		assertEquals("Atlas Truck Body Inc", customers.get(4287).getCompany());
	}

	@Test
	@DisplayName("Record 4288: Address is 701 Westchester Ave")
	void AddressOfRecord4288() {
		assertEquals("701 Westchester Ave", customers.get(4287).getAddress());
	}

	@Test
	@DisplayName("Record 4288: City is West Harrison")
	void CityOfRecord4288() {
		assertEquals("West Harrison", customers.get(4287).getCity());
	}

	@Test
	@DisplayName("Record 4288: County is Westchester")
	void CountyOfRecord4288() {
		assertEquals("Westchester", customers.get(4287).getCounty());
	}

	@Test
	@DisplayName("Record 4288: State is NY")
	void StateOfRecord4288() {
		assertEquals("NY", customers.get(4287).getState());
	}

	@Test
	@DisplayName("Record 4288: ZIP is 10604")
	void ZIPOfRecord4288() {
		assertEquals("10604", customers.get(4287).getZIP());
	}

	@Test
	@DisplayName("Record 4288: Phone is 914-761-2997")
	void PhoneOfRecord4288() {
		assertEquals("914-761-2997", customers.get(4287).getPhone());
	}

	@Test
	@DisplayName("Record 4288: Fax is 914-761-9259")
	void FaxOfRecord4288() {
		assertEquals("914-761-9259", customers.get(4287).getFax());
	}

	@Test
	@DisplayName("Record 4288: Email is tabitha@pyo.com")
	void EmailOfRecord4288() {
		assertEquals("tabitha@pyo.com", customers.get(4287).getEmail());
	}

	@Test
	@DisplayName("Record 4288: Web is http://www.tabithapyo.com")
	void WebOfRecord4288() {
		assertEquals("http://www.tabithapyo.com", customers.get(4287).getWeb());
	}
}
