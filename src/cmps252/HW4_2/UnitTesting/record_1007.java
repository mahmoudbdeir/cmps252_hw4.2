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
class Record_1007 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1007: FirstName is Louella")
	void FirstNameOfRecord1007() {
		assertEquals("Louella", customers.get(1006).getFirstName());
	}

	@Test
	@DisplayName("Record 1007: LastName is Lemucchi")
	void LastNameOfRecord1007() {
		assertEquals("Lemucchi", customers.get(1006).getLastName());
	}

	@Test
	@DisplayName("Record 1007: Company is Midland Elevator Co Inc")
	void CompanyOfRecord1007() {
		assertEquals("Midland Elevator Co Inc", customers.get(1006).getCompany());
	}

	@Test
	@DisplayName("Record 1007: Address is 12394 Kinsman Rd")
	void AddressOfRecord1007() {
		assertEquals("12394 Kinsman Rd", customers.get(1006).getAddress());
	}

	@Test
	@DisplayName("Record 1007: City is Burton")
	void CityOfRecord1007() {
		assertEquals("Burton", customers.get(1006).getCity());
	}

	@Test
	@DisplayName("Record 1007: County is Geauga")
	void CountyOfRecord1007() {
		assertEquals("Geauga", customers.get(1006).getCounty());
	}

	@Test
	@DisplayName("Record 1007: State is OH")
	void StateOfRecord1007() {
		assertEquals("OH", customers.get(1006).getState());
	}

	@Test
	@DisplayName("Record 1007: ZIP is 44021")
	void ZIPOfRecord1007() {
		assertEquals("44021", customers.get(1006).getZIP());
	}

	@Test
	@DisplayName("Record 1007: Phone is 440-834-1889")
	void PhoneOfRecord1007() {
		assertEquals("440-834-1889", customers.get(1006).getPhone());
	}

	@Test
	@DisplayName("Record 1007: Fax is 440-834-7742")
	void FaxOfRecord1007() {
		assertEquals("440-834-7742", customers.get(1006).getFax());
	}

	@Test
	@DisplayName("Record 1007: Email is louella@lemucchi.com")
	void EmailOfRecord1007() {
		assertEquals("louella@lemucchi.com", customers.get(1006).getEmail());
	}

	@Test
	@DisplayName("Record 1007: Web is http://www.louellalemucchi.com")
	void WebOfRecord1007() {
		assertEquals("http://www.louellalemucchi.com", customers.get(1006).getWeb());
	}
}
