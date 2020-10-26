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
class Record_4009 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4009: FirstName is Humberto")
	void FirstNameOfRecord4009() {
		assertEquals("Humberto", customers.get(4008).getFirstName());
	}

	@Test
	@DisplayName("Record 4009: LastName is Boerboom")
	void LastNameOfRecord4009() {
		assertEquals("Boerboom", customers.get(4008).getLastName());
	}

	@Test
	@DisplayName("Record 4009: Company is Jaywork, John Terence Esq")
	void CompanyOfRecord4009() {
		assertEquals("Jaywork, John Terence Esq", customers.get(4008).getCompany());
	}

	@Test
	@DisplayName("Record 4009: Address is 4133 Sayles Blvd")
	void AddressOfRecord4009() {
		assertEquals("4133 Sayles Blvd", customers.get(4008).getAddress());
	}

	@Test
	@DisplayName("Record 4009: City is Abilene")
	void CityOfRecord4009() {
		assertEquals("Abilene", customers.get(4008).getCity());
	}

	@Test
	@DisplayName("Record 4009: County is Taylor")
	void CountyOfRecord4009() {
		assertEquals("Taylor", customers.get(4008).getCounty());
	}

	@Test
	@DisplayName("Record 4009: State is TX")
	void StateOfRecord4009() {
		assertEquals("TX", customers.get(4008).getState());
	}

	@Test
	@DisplayName("Record 4009: ZIP is 79605")
	void ZIPOfRecord4009() {
		assertEquals("79605", customers.get(4008).getZIP());
	}

	@Test
	@DisplayName("Record 4009: Phone is 325-695-5758")
	void PhoneOfRecord4009() {
		assertEquals("325-695-5758", customers.get(4008).getPhone());
	}

	@Test
	@DisplayName("Record 4009: Fax is 325-695-9331")
	void FaxOfRecord4009() {
		assertEquals("325-695-9331", customers.get(4008).getFax());
	}

	@Test
	@DisplayName("Record 4009: Email is humberto@boerboom.com")
	void EmailOfRecord4009() {
		assertEquals("humberto@boerboom.com", customers.get(4008).getEmail());
	}

	@Test
	@DisplayName("Record 4009: Web is http://www.humbertoboerboom.com")
	void WebOfRecord4009() {
		assertEquals("http://www.humbertoboerboom.com", customers.get(4008).getWeb());
	}
}
