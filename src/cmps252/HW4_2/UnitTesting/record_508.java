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
class Record_508 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 508: FirstName is Nigel")
	void FirstNameOfRecord508() {
		assertEquals("Nigel", customers.get(507).getFirstName());
	}

	@Test
	@DisplayName("Record 508: LastName is Mattina")
	void LastNameOfRecord508() {
		assertEquals("Mattina", customers.get(507).getLastName());
	}

	@Test
	@DisplayName("Record 508: Company is Simon Hammer & Jensen")
	void CompanyOfRecord508() {
		assertEquals("Simon Hammer & Jensen", customers.get(507).getCompany());
	}

	@Test
	@DisplayName("Record 508: Address is 4634 12th St")
	void AddressOfRecord508() {
		assertEquals("4634 12th St", customers.get(507).getAddress());
	}

	@Test
	@DisplayName("Record 508: City is Wayland")
	void CityOfRecord508() {
		assertEquals("Wayland", customers.get(507).getCity());
	}

	@Test
	@DisplayName("Record 508: County is Allegan")
	void CountyOfRecord508() {
		assertEquals("Allegan", customers.get(507).getCounty());
	}

	@Test
	@DisplayName("Record 508: State is MI")
	void StateOfRecord508() {
		assertEquals("MI", customers.get(507).getState());
	}

	@Test
	@DisplayName("Record 508: ZIP is 49348")
	void ZIPOfRecord508() {
		assertEquals("49348", customers.get(507).getZIP());
	}

	@Test
	@DisplayName("Record 508: Phone is 269-877-9752")
	void PhoneOfRecord508() {
		assertEquals("269-877-9752", customers.get(507).getPhone());
	}

	@Test
	@DisplayName("Record 508: Fax is 269-877-9228")
	void FaxOfRecord508() {
		assertEquals("269-877-9228", customers.get(507).getFax());
	}

	@Test
	@DisplayName("Record 508: Email is nigel@mattina.com")
	void EmailOfRecord508() {
		assertEquals("nigel@mattina.com", customers.get(507).getEmail());
	}

	@Test
	@DisplayName("Record 508: Web is http://www.nigelmattina.com")
	void WebOfRecord508() {
		assertEquals("http://www.nigelmattina.com", customers.get(507).getWeb());
	}
}
