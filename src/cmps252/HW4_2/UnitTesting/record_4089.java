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

@Tag("8")
class Record_4089 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4089: FirstName is Sara")
	void FirstNameOfRecord4089() {
		assertEquals("Sara", customers.get(4088).getFirstName());
	}

	@Test
	@DisplayName("Record 4089: LastName is Nordlie")
	void LastNameOfRecord4089() {
		assertEquals("Nordlie", customers.get(4088).getLastName());
	}

	@Test
	@DisplayName("Record 4089: Company is Travel Doctor")
	void CompanyOfRecord4089() {
		assertEquals("Travel Doctor", customers.get(4088).getCompany());
	}

	@Test
	@DisplayName("Record 4089: Address is 1500 Jack Mckay Blvd")
	void AddressOfRecord4089() {
		assertEquals("1500 Jack Mckay Blvd", customers.get(4088).getAddress());
	}

	@Test
	@DisplayName("Record 4089: City is Ennis")
	void CityOfRecord4089() {
		assertEquals("Ennis", customers.get(4088).getCity());
	}

	@Test
	@DisplayName("Record 4089: County is Ellis")
	void CountyOfRecord4089() {
		assertEquals("Ellis", customers.get(4088).getCounty());
	}

	@Test
	@DisplayName("Record 4089: State is TX")
	void StateOfRecord4089() {
		assertEquals("TX", customers.get(4088).getState());
	}

	@Test
	@DisplayName("Record 4089: ZIP is 75119")
	void ZIPOfRecord4089() {
		assertEquals("75119", customers.get(4088).getZIP());
	}

	@Test
	@DisplayName("Record 4089: Phone is 972-875-1417")
	void PhoneOfRecord4089() {
		assertEquals("972-875-1417", customers.get(4088).getPhone());
	}

	@Test
	@DisplayName("Record 4089: Fax is 972-875-0731")
	void FaxOfRecord4089() {
		assertEquals("972-875-0731", customers.get(4088).getFax());
	}

	@Test
	@DisplayName("Record 4089: Email is sara@nordlie.com")
	void EmailOfRecord4089() {
		assertEquals("sara@nordlie.com", customers.get(4088).getEmail());
	}

	@Test
	@DisplayName("Record 4089: Web is http://www.saranordlie.com")
	void WebOfRecord4089() {
		assertEquals("http://www.saranordlie.com", customers.get(4088).getWeb());
	}
}
