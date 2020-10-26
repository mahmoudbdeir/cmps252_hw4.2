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

@Tag("34")
class Record_870 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 870: FirstName is Paige")
	void FirstNameOfRecord870() {
		assertEquals("Paige", customers.get(869).getFirstName());
	}

	@Test
	@DisplayName("Record 870: LastName is Dirico")
	void LastNameOfRecord870() {
		assertEquals("Dirico", customers.get(869).getLastName());
	}

	@Test
	@DisplayName("Record 870: Company is Union Camp Corp")
	void CompanyOfRecord870() {
		assertEquals("Union Camp Corp", customers.get(869).getCompany());
	}

	@Test
	@DisplayName("Record 870: Address is 350 Fair St")
	void AddressOfRecord870() {
		assertEquals("350 Fair St", customers.get(869).getAddress());
	}

	@Test
	@DisplayName("Record 870: City is Ferndale")
	void CityOfRecord870() {
		assertEquals("Ferndale", customers.get(869).getCity());
	}

	@Test
	@DisplayName("Record 870: County is Oakland")
	void CountyOfRecord870() {
		assertEquals("Oakland", customers.get(869).getCounty());
	}

	@Test
	@DisplayName("Record 870: State is MI")
	void StateOfRecord870() {
		assertEquals("MI", customers.get(869).getState());
	}

	@Test
	@DisplayName("Record 870: ZIP is 48220")
	void ZIPOfRecord870() {
		assertEquals("48220", customers.get(869).getZIP());
	}

	@Test
	@DisplayName("Record 870: Phone is 248-548-0141")
	void PhoneOfRecord870() {
		assertEquals("248-548-0141", customers.get(869).getPhone());
	}

	@Test
	@DisplayName("Record 870: Fax is 248-548-3216")
	void FaxOfRecord870() {
		assertEquals("248-548-3216", customers.get(869).getFax());
	}

	@Test
	@DisplayName("Record 870: Email is paige@dirico.com")
	void EmailOfRecord870() {
		assertEquals("paige@dirico.com", customers.get(869).getEmail());
	}

	@Test
	@DisplayName("Record 870: Web is http://www.paigedirico.com")
	void WebOfRecord870() {
		assertEquals("http://www.paigedirico.com", customers.get(869).getWeb());
	}
}
