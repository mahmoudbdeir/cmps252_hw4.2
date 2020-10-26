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

@Tag("14")
class Record_1574 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1574: FirstName is Belinda")
	void FirstNameOfRecord1574() {
		assertEquals("Belinda", customers.get(1573).getFirstName());
	}

	@Test
	@DisplayName("Record 1574: LastName is Venable")
	void LastNameOfRecord1574() {
		assertEquals("Venable", customers.get(1573).getLastName());
	}

	@Test
	@DisplayName("Record 1574: Company is Cousins Subs")
	void CompanyOfRecord1574() {
		assertEquals("Cousins Subs", customers.get(1573).getCompany());
	}

	@Test
	@DisplayName("Record 1574: Address is 600 W Fulton St")
	void AddressOfRecord1574() {
		assertEquals("600 W Fulton St", customers.get(1573).getAddress());
	}

	@Test
	@DisplayName("Record 1574: City is Chicago")
	void CityOfRecord1574() {
		assertEquals("Chicago", customers.get(1573).getCity());
	}

	@Test
	@DisplayName("Record 1574: County is Cook")
	void CountyOfRecord1574() {
		assertEquals("Cook", customers.get(1573).getCounty());
	}

	@Test
	@DisplayName("Record 1574: State is IL")
	void StateOfRecord1574() {
		assertEquals("IL", customers.get(1573).getState());
	}

	@Test
	@DisplayName("Record 1574: ZIP is 60661")
	void ZIPOfRecord1574() {
		assertEquals("60661", customers.get(1573).getZIP());
	}

	@Test
	@DisplayName("Record 1574: Phone is 312-559-4103")
	void PhoneOfRecord1574() {
		assertEquals("312-559-4103", customers.get(1573).getPhone());
	}

	@Test
	@DisplayName("Record 1574: Fax is 312-559-4237")
	void FaxOfRecord1574() {
		assertEquals("312-559-4237", customers.get(1573).getFax());
	}

	@Test
	@DisplayName("Record 1574: Email is belinda@venable.com")
	void EmailOfRecord1574() {
		assertEquals("belinda@venable.com", customers.get(1573).getEmail());
	}

	@Test
	@DisplayName("Record 1574: Web is http://www.belindavenable.com")
	void WebOfRecord1574() {
		assertEquals("http://www.belindavenable.com", customers.get(1573).getWeb());
	}
}
