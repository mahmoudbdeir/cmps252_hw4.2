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

@Tag("19")
class Record_4761 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4761: FirstName is Patty")
	void FirstNameOfRecord4761() {
		assertEquals("Patty", customers.get(4760).getFirstName());
	}

	@Test
	@DisplayName("Record 4761: LastName is Lucius")
	void LastNameOfRecord4761() {
		assertEquals("Lucius", customers.get(4760).getLastName());
	}

	@Test
	@DisplayName("Record 4761: Company is Agouron Pharmaceuticals Inc")
	void CompanyOfRecord4761() {
		assertEquals("Agouron Pharmaceuticals Inc", customers.get(4760).getCompany());
	}

	@Test
	@DisplayName("Record 4761: Address is 2141 E Geer St")
	void AddressOfRecord4761() {
		assertEquals("2141 E Geer St", customers.get(4760).getAddress());
	}

	@Test
	@DisplayName("Record 4761: City is Durham")
	void CityOfRecord4761() {
		assertEquals("Durham", customers.get(4760).getCity());
	}

	@Test
	@DisplayName("Record 4761: County is Durham")
	void CountyOfRecord4761() {
		assertEquals("Durham", customers.get(4760).getCounty());
	}

	@Test
	@DisplayName("Record 4761: State is NC")
	void StateOfRecord4761() {
		assertEquals("NC", customers.get(4760).getState());
	}

	@Test
	@DisplayName("Record 4761: ZIP is 27704")
	void ZIPOfRecord4761() {
		assertEquals("27704", customers.get(4760).getZIP());
	}

	@Test
	@DisplayName("Record 4761: Phone is 919-956-9486")
	void PhoneOfRecord4761() {
		assertEquals("919-956-9486", customers.get(4760).getPhone());
	}

	@Test
	@DisplayName("Record 4761: Fax is 919-956-6324")
	void FaxOfRecord4761() {
		assertEquals("919-956-6324", customers.get(4760).getFax());
	}

	@Test
	@DisplayName("Record 4761: Email is patty@lucius.com")
	void EmailOfRecord4761() {
		assertEquals("patty@lucius.com", customers.get(4760).getEmail());
	}

	@Test
	@DisplayName("Record 4761: Web is http://www.pattylucius.com")
	void WebOfRecord4761() {
		assertEquals("http://www.pattylucius.com", customers.get(4760).getWeb());
	}
}
