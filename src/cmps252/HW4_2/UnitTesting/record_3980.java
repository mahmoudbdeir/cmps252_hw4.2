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

@Tag("23")
class Record_3980 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3980: FirstName is Gale")
	void FirstNameOfRecord3980() {
		assertEquals("Gale", customers.get(3979).getFirstName());
	}

	@Test
	@DisplayName("Record 3980: LastName is Manders")
	void LastNameOfRecord3980() {
		assertEquals("Manders", customers.get(3979).getLastName());
	}

	@Test
	@DisplayName("Record 3980: Company is Nantucket Island Chmbr Commrce")
	void CompanyOfRecord3980() {
		assertEquals("Nantucket Island Chmbr Commrce", customers.get(3979).getCompany());
	}

	@Test
	@DisplayName("Record 3980: Address is 2000 Town Ctr  #-900")
	void AddressOfRecord3980() {
		assertEquals("2000 Town Ctr  #-900", customers.get(3979).getAddress());
	}

	@Test
	@DisplayName("Record 3980: City is Southfield")
	void CityOfRecord3980() {
		assertEquals("Southfield", customers.get(3979).getCity());
	}

	@Test
	@DisplayName("Record 3980: County is Oakland")
	void CountyOfRecord3980() {
		assertEquals("Oakland", customers.get(3979).getCounty());
	}

	@Test
	@DisplayName("Record 3980: State is MI")
	void StateOfRecord3980() {
		assertEquals("MI", customers.get(3979).getState());
	}

	@Test
	@DisplayName("Record 3980: ZIP is 48075")
	void ZIPOfRecord3980() {
		assertEquals("48075", customers.get(3979).getZIP());
	}

	@Test
	@DisplayName("Record 3980: Phone is 248-746-7531")
	void PhoneOfRecord3980() {
		assertEquals("248-746-7531", customers.get(3979).getPhone());
	}

	@Test
	@DisplayName("Record 3980: Fax is 248-746-9316")
	void FaxOfRecord3980() {
		assertEquals("248-746-9316", customers.get(3979).getFax());
	}

	@Test
	@DisplayName("Record 3980: Email is gale@manders.com")
	void EmailOfRecord3980() {
		assertEquals("gale@manders.com", customers.get(3979).getEmail());
	}

	@Test
	@DisplayName("Record 3980: Web is http://www.galemanders.com")
	void WebOfRecord3980() {
		assertEquals("http://www.galemanders.com", customers.get(3979).getWeb());
	}
}
