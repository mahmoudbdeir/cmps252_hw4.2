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

@Tag("44")
class Record_329 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 329: FirstName is Katina")
	void FirstNameOfRecord329() {
		assertEquals("Katina", customers.get(328).getFirstName());
	}

	@Test
	@DisplayName("Record 329: LastName is Apodaca")
	void LastNameOfRecord329() {
		assertEquals("Apodaca", customers.get(328).getLastName());
	}

	@Test
	@DisplayName("Record 329: Company is Wtgi Tv Channel 61")
	void CompanyOfRecord329() {
		assertEquals("Wtgi Tv Channel 61", customers.get(328).getCompany());
	}

	@Test
	@DisplayName("Record 329: Address is 15252 Valley Blvd")
	void AddressOfRecord329() {
		assertEquals("15252 Valley Blvd", customers.get(328).getAddress());
	}

	@Test
	@DisplayName("Record 329: City is La Puente")
	void CityOfRecord329() {
		assertEquals("La Puente", customers.get(328).getCity());
	}

	@Test
	@DisplayName("Record 329: County is Los Angeles")
	void CountyOfRecord329() {
		assertEquals("Los Angeles", customers.get(328).getCounty());
	}

	@Test
	@DisplayName("Record 329: State is CA")
	void StateOfRecord329() {
		assertEquals("CA", customers.get(328).getState());
	}

	@Test
	@DisplayName("Record 329: ZIP is 91746")
	void ZIPOfRecord329() {
		assertEquals("91746", customers.get(328).getZIP());
	}

	@Test
	@DisplayName("Record 329: Phone is 626-336-5573")
	void PhoneOfRecord329() {
		assertEquals("626-336-5573", customers.get(328).getPhone());
	}

	@Test
	@DisplayName("Record 329: Fax is 626-336-1312")
	void FaxOfRecord329() {
		assertEquals("626-336-1312", customers.get(328).getFax());
	}

	@Test
	@DisplayName("Record 329: Email is katina@apodaca.com")
	void EmailOfRecord329() {
		assertEquals("katina@apodaca.com", customers.get(328).getEmail());
	}

	@Test
	@DisplayName("Record 329: Web is http://www.katinaapodaca.com")
	void WebOfRecord329() {
		assertEquals("http://www.katinaapodaca.com", customers.get(328).getWeb());
	}
}
