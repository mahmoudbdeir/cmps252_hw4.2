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

@Tag("49")
class Record_3097 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3097: FirstName is Allen")
	void FirstNameOfRecord3097() {
		assertEquals("Allen", customers.get(3096).getFirstName());
	}

	@Test
	@DisplayName("Record 3097: LastName is Tandetske")
	void LastNameOfRecord3097() {
		assertEquals("Tandetske", customers.get(3096).getLastName());
	}

	@Test
	@DisplayName("Record 3097: Company is American Fireworks Co")
	void CompanyOfRecord3097() {
		assertEquals("American Fireworks Co", customers.get(3096).getCompany());
	}

	@Test
	@DisplayName("Record 3097: Address is 1275 Boardman Canfield Rd")
	void AddressOfRecord3097() {
		assertEquals("1275 Boardman Canfield Rd", customers.get(3096).getAddress());
	}

	@Test
	@DisplayName("Record 3097: City is Youngstown")
	void CityOfRecord3097() {
		assertEquals("Youngstown", customers.get(3096).getCity());
	}

	@Test
	@DisplayName("Record 3097: County is Mahoning")
	void CountyOfRecord3097() {
		assertEquals("Mahoning", customers.get(3096).getCounty());
	}

	@Test
	@DisplayName("Record 3097: State is OH")
	void StateOfRecord3097() {
		assertEquals("OH", customers.get(3096).getState());
	}

	@Test
	@DisplayName("Record 3097: ZIP is 44512")
	void ZIPOfRecord3097() {
		assertEquals("44512", customers.get(3096).getZIP());
	}

	@Test
	@DisplayName("Record 3097: Phone is 330-726-1315")
	void PhoneOfRecord3097() {
		assertEquals("330-726-1315", customers.get(3096).getPhone());
	}

	@Test
	@DisplayName("Record 3097: Fax is 330-726-3992")
	void FaxOfRecord3097() {
		assertEquals("330-726-3992", customers.get(3096).getFax());
	}

	@Test
	@DisplayName("Record 3097: Email is allen@tandetske.com")
	void EmailOfRecord3097() {
		assertEquals("allen@tandetske.com", customers.get(3096).getEmail());
	}

	@Test
	@DisplayName("Record 3097: Web is http://www.allentandetske.com")
	void WebOfRecord3097() {
		assertEquals("http://www.allentandetske.com", customers.get(3096).getWeb());
	}
}
