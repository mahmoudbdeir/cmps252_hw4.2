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

@Tag("15")
class Record_217 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 217: FirstName is Mae")
	void FirstNameOfRecord217() {
		assertEquals("Mae", customers.get(216).getFirstName());
	}

	@Test
	@DisplayName("Record 217: LastName is Facundo")
	void LastNameOfRecord217() {
		assertEquals("Facundo", customers.get(216).getLastName());
	}

	@Test
	@DisplayName("Record 217: Company is Rodman Elevator")
	void CompanyOfRecord217() {
		assertEquals("Rodman Elevator", customers.get(216).getCompany());
	}

	@Test
	@DisplayName("Record 217: Address is 809 W Lake St")
	void AddressOfRecord217() {
		assertEquals("809 W Lake St", customers.get(216).getAddress());
	}

	@Test
	@DisplayName("Record 217: City is Chicago")
	void CityOfRecord217() {
		assertEquals("Chicago", customers.get(216).getCity());
	}

	@Test
	@DisplayName("Record 217: County is Cook")
	void CountyOfRecord217() {
		assertEquals("Cook", customers.get(216).getCounty());
	}

	@Test
	@DisplayName("Record 217: State is IL")
	void StateOfRecord217() {
		assertEquals("IL", customers.get(216).getState());
	}

	@Test
	@DisplayName("Record 217: ZIP is 60607")
	void ZIPOfRecord217() {
		assertEquals("60607", customers.get(216).getZIP());
	}

	@Test
	@DisplayName("Record 217: Phone is 312-226-9893")
	void PhoneOfRecord217() {
		assertEquals("312-226-9893", customers.get(216).getPhone());
	}

	@Test
	@DisplayName("Record 217: Fax is 312-226-3914")
	void FaxOfRecord217() {
		assertEquals("312-226-3914", customers.get(216).getFax());
	}

	@Test
	@DisplayName("Record 217: Email is mae@facundo.com")
	void EmailOfRecord217() {
		assertEquals("mae@facundo.com", customers.get(216).getEmail());
	}

	@Test
	@DisplayName("Record 217: Web is http://www.maefacundo.com")
	void WebOfRecord217() {
		assertEquals("http://www.maefacundo.com", customers.get(216).getWeb());
	}
}
