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

@Tag("4")
class Record_3785 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3785: FirstName is Wesley")
	void FirstNameOfRecord3785() {
		assertEquals("Wesley", customers.get(3784).getFirstName());
	}

	@Test
	@DisplayName("Record 3785: LastName is Apa")
	void LastNameOfRecord3785() {
		assertEquals("Apa", customers.get(3784).getLastName());
	}

	@Test
	@DisplayName("Record 3785: Company is Ramco Manufacturing Co")
	void CompanyOfRecord3785() {
		assertEquals("Ramco Manufacturing Co", customers.get(3784).getCompany());
	}

	@Test
	@DisplayName("Record 3785: Address is 1550 Winchester Blvd  #-213")
	void AddressOfRecord3785() {
		assertEquals("1550 Winchester Blvd  #-213", customers.get(3784).getAddress());
	}

	@Test
	@DisplayName("Record 3785: City is Campbell")
	void CityOfRecord3785() {
		assertEquals("Campbell", customers.get(3784).getCity());
	}

	@Test
	@DisplayName("Record 3785: County is Santa Clara")
	void CountyOfRecord3785() {
		assertEquals("Santa Clara", customers.get(3784).getCounty());
	}

	@Test
	@DisplayName("Record 3785: State is CA")
	void StateOfRecord3785() {
		assertEquals("CA", customers.get(3784).getState());
	}

	@Test
	@DisplayName("Record 3785: ZIP is 95008")
	void ZIPOfRecord3785() {
		assertEquals("95008", customers.get(3784).getZIP());
	}

	@Test
	@DisplayName("Record 3785: Phone is 408-379-4538")
	void PhoneOfRecord3785() {
		assertEquals("408-379-4538", customers.get(3784).getPhone());
	}

	@Test
	@DisplayName("Record 3785: Fax is 408-379-1298")
	void FaxOfRecord3785() {
		assertEquals("408-379-1298", customers.get(3784).getFax());
	}

	@Test
	@DisplayName("Record 3785: Email is wesley@apa.com")
	void EmailOfRecord3785() {
		assertEquals("wesley@apa.com", customers.get(3784).getEmail());
	}

	@Test
	@DisplayName("Record 3785: Web is http://www.wesleyapa.com")
	void WebOfRecord3785() {
		assertEquals("http://www.wesleyapa.com", customers.get(3784).getWeb());
	}
}
