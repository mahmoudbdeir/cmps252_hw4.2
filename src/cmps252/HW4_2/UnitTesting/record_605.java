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

@Tag("17")
class Record_605 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 605: FirstName is Charley")
	void FirstNameOfRecord605() {
		assertEquals("Charley", customers.get(604).getFirstName());
	}

	@Test
	@DisplayName("Record 605: LastName is Bagsby")
	void LastNameOfRecord605() {
		assertEquals("Bagsby", customers.get(604).getLastName());
	}

	@Test
	@DisplayName("Record 605: Company is Coleman, John E Jr")
	void CompanyOfRecord605() {
		assertEquals("Coleman, John E Jr", customers.get(604).getCompany());
	}

	@Test
	@DisplayName("Record 605: Address is 6320 Old Winter Garden Rd")
	void AddressOfRecord605() {
		assertEquals("6320 Old Winter Garden Rd", customers.get(604).getAddress());
	}

	@Test
	@DisplayName("Record 605: City is Orlando")
	void CityOfRecord605() {
		assertEquals("Orlando", customers.get(604).getCity());
	}

	@Test
	@DisplayName("Record 605: County is Orange")
	void CountyOfRecord605() {
		assertEquals("Orange", customers.get(604).getCounty());
	}

	@Test
	@DisplayName("Record 605: State is FL")
	void StateOfRecord605() {
		assertEquals("FL", customers.get(604).getState());
	}

	@Test
	@DisplayName("Record 605: ZIP is 32835")
	void ZIPOfRecord605() {
		assertEquals("32835", customers.get(604).getZIP());
	}

	@Test
	@DisplayName("Record 605: Phone is 407-290-2320")
	void PhoneOfRecord605() {
		assertEquals("407-290-2320", customers.get(604).getPhone());
	}

	@Test
	@DisplayName("Record 605: Fax is 407-290-2679")
	void FaxOfRecord605() {
		assertEquals("407-290-2679", customers.get(604).getFax());
	}

	@Test
	@DisplayName("Record 605: Email is charley@bagsby.com")
	void EmailOfRecord605() {
		assertEquals("charley@bagsby.com", customers.get(604).getEmail());
	}

	@Test
	@DisplayName("Record 605: Web is http://www.charleybagsby.com")
	void WebOfRecord605() {
		assertEquals("http://www.charleybagsby.com", customers.get(604).getWeb());
	}
}
