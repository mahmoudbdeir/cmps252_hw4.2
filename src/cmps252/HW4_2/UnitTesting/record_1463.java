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

@Tag("41")
class Record_1463 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1463: FirstName is Mercedes")
	void FirstNameOfRecord1463() {
		assertEquals("Mercedes", customers.get(1462).getFirstName());
	}

	@Test
	@DisplayName("Record 1463: LastName is Mass")
	void LastNameOfRecord1463() {
		assertEquals("Mass", customers.get(1462).getLastName());
	}

	@Test
	@DisplayName("Record 1463: Company is Tcby")
	void CompanyOfRecord1463() {
		assertEquals("Tcby", customers.get(1462).getCompany());
	}

	@Test
	@DisplayName("Record 1463: Address is 4013 W Oklahoma Ave")
	void AddressOfRecord1463() {
		assertEquals("4013 W Oklahoma Ave", customers.get(1462).getAddress());
	}

	@Test
	@DisplayName("Record 1463: City is Tampa")
	void CityOfRecord1463() {
		assertEquals("Tampa", customers.get(1462).getCity());
	}

	@Test
	@DisplayName("Record 1463: County is Hillsborough")
	void CountyOfRecord1463() {
		assertEquals("Hillsborough", customers.get(1462).getCounty());
	}

	@Test
	@DisplayName("Record 1463: State is FL")
	void StateOfRecord1463() {
		assertEquals("FL", customers.get(1462).getState());
	}

	@Test
	@DisplayName("Record 1463: ZIP is 33616")
	void ZIPOfRecord1463() {
		assertEquals("33616", customers.get(1462).getZIP());
	}

	@Test
	@DisplayName("Record 1463: Phone is 813-835-2951")
	void PhoneOfRecord1463() {
		assertEquals("813-835-2951", customers.get(1462).getPhone());
	}

	@Test
	@DisplayName("Record 1463: Fax is 813-835-6173")
	void FaxOfRecord1463() {
		assertEquals("813-835-6173", customers.get(1462).getFax());
	}

	@Test
	@DisplayName("Record 1463: Email is mercedes@mass.com")
	void EmailOfRecord1463() {
		assertEquals("mercedes@mass.com", customers.get(1462).getEmail());
	}

	@Test
	@DisplayName("Record 1463: Web is http://www.mercedesmass.com")
	void WebOfRecord1463() {
		assertEquals("http://www.mercedesmass.com", customers.get(1462).getWeb());
	}
}
