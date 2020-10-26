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

@Tag("6")
class Record_756 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 756: FirstName is Fran")
	void FirstNameOfRecord756() {
		assertEquals("Fran", customers.get(755).getFirstName());
	}

	@Test
	@DisplayName("Record 756: LastName is Vermeesch")
	void LastNameOfRecord756() {
		assertEquals("Vermeesch", customers.get(755).getLastName());
	}

	@Test
	@DisplayName("Record 756: Company is Cohen Shapiro Polish Shiekman")
	void CompanyOfRecord756() {
		assertEquals("Cohen Shapiro Polish Shiekman", customers.get(755).getCompany());
	}

	@Test
	@DisplayName("Record 756: Address is Fm  #-492")
	void AddressOfRecord756() {
		assertEquals("Fm  #-492", customers.get(755).getAddress());
	}

	@Test
	@DisplayName("Record 756: City is Mission")
	void CityOfRecord756() {
		assertEquals("Mission", customers.get(755).getCity());
	}

	@Test
	@DisplayName("Record 756: County is Hidalgo")
	void CountyOfRecord756() {
		assertEquals("Hidalgo", customers.get(755).getCounty());
	}

	@Test
	@DisplayName("Record 756: State is TX")
	void StateOfRecord756() {
		assertEquals("TX", customers.get(755).getState());
	}

	@Test
	@DisplayName("Record 756: ZIP is 78572")
	void ZIPOfRecord756() {
		assertEquals("78572", customers.get(755).getZIP());
	}

	@Test
	@DisplayName("Record 756: Phone is 956-581-9130")
	void PhoneOfRecord756() {
		assertEquals("956-581-9130", customers.get(755).getPhone());
	}

	@Test
	@DisplayName("Record 756: Fax is 956-581-7751")
	void FaxOfRecord756() {
		assertEquals("956-581-7751", customers.get(755).getFax());
	}

	@Test
	@DisplayName("Record 756: Email is fran@vermeesch.com")
	void EmailOfRecord756() {
		assertEquals("fran@vermeesch.com", customers.get(755).getEmail());
	}

	@Test
	@DisplayName("Record 756: Web is http://www.franvermeesch.com")
	void WebOfRecord756() {
		assertEquals("http://www.franvermeesch.com", customers.get(755).getWeb());
	}
}
