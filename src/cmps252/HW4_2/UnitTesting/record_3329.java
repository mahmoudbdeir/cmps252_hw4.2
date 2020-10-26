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

@Tag("22")
class Record_3329 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3329: FirstName is Augusta")
	void FirstNameOfRecord3329() {
		assertEquals("Augusta", customers.get(3328).getFirstName());
	}

	@Test
	@DisplayName("Record 3329: LastName is Chalifoux")
	void LastNameOfRecord3329() {
		assertEquals("Chalifoux", customers.get(3328).getLastName());
	}

	@Test
	@DisplayName("Record 3329: Company is Ate Management & Serv Co Inc")
	void CompanyOfRecord3329() {
		assertEquals("Ate Management & Serv Co Inc", customers.get(3328).getCompany());
	}

	@Test
	@DisplayName("Record 3329: Address is 2937 Sw 27th Ave")
	void AddressOfRecord3329() {
		assertEquals("2937 Sw 27th Ave", customers.get(3328).getAddress());
	}

	@Test
	@DisplayName("Record 3329: City is Miami")
	void CityOfRecord3329() {
		assertEquals("Miami", customers.get(3328).getCity());
	}

	@Test
	@DisplayName("Record 3329: County is Miami-Dade")
	void CountyOfRecord3329() {
		assertEquals("Miami-Dade", customers.get(3328).getCounty());
	}

	@Test
	@DisplayName("Record 3329: State is FL")
	void StateOfRecord3329() {
		assertEquals("FL", customers.get(3328).getState());
	}

	@Test
	@DisplayName("Record 3329: ZIP is 33133")
	void ZIPOfRecord3329() {
		assertEquals("33133", customers.get(3328).getZIP());
	}

	@Test
	@DisplayName("Record 3329: Phone is 305-445-0107")
	void PhoneOfRecord3329() {
		assertEquals("305-445-0107", customers.get(3328).getPhone());
	}

	@Test
	@DisplayName("Record 3329: Fax is 305-445-8709")
	void FaxOfRecord3329() {
		assertEquals("305-445-8709", customers.get(3328).getFax());
	}

	@Test
	@DisplayName("Record 3329: Email is augusta@chalifoux.com")
	void EmailOfRecord3329() {
		assertEquals("augusta@chalifoux.com", customers.get(3328).getEmail());
	}

	@Test
	@DisplayName("Record 3329: Web is http://www.augustachalifoux.com")
	void WebOfRecord3329() {
		assertEquals("http://www.augustachalifoux.com", customers.get(3328).getWeb());
	}
}
