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

@Tag("12")
class Record_3036 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3036: FirstName is Dirk")
	void FirstNameOfRecord3036() {
		assertEquals("Dirk", customers.get(3035).getFirstName());
	}

	@Test
	@DisplayName("Record 3036: LastName is Beardslee")
	void LastNameOfRecord3036() {
		assertEquals("Beardslee", customers.get(3035).getLastName());
	}

	@Test
	@DisplayName("Record 3036: Company is Roman Iron Works Inc")
	void CompanyOfRecord3036() {
		assertEquals("Roman Iron Works Inc", customers.get(3035).getCompany());
	}

	@Test
	@DisplayName("Record 3036: Address is 9440 Viscount Blvd")
	void AddressOfRecord3036() {
		assertEquals("9440 Viscount Blvd", customers.get(3035).getAddress());
	}

	@Test
	@DisplayName("Record 3036: City is El Paso")
	void CityOfRecord3036() {
		assertEquals("El Paso", customers.get(3035).getCity());
	}

	@Test
	@DisplayName("Record 3036: County is El Paso")
	void CountyOfRecord3036() {
		assertEquals("El Paso", customers.get(3035).getCounty());
	}

	@Test
	@DisplayName("Record 3036: State is TX")
	void StateOfRecord3036() {
		assertEquals("TX", customers.get(3035).getState());
	}

	@Test
	@DisplayName("Record 3036: ZIP is 79925")
	void ZIPOfRecord3036() {
		assertEquals("79925", customers.get(3035).getZIP());
	}

	@Test
	@DisplayName("Record 3036: Phone is 915-598-7386")
	void PhoneOfRecord3036() {
		assertEquals("915-598-7386", customers.get(3035).getPhone());
	}

	@Test
	@DisplayName("Record 3036: Fax is 915-598-5231")
	void FaxOfRecord3036() {
		assertEquals("915-598-5231", customers.get(3035).getFax());
	}

	@Test
	@DisplayName("Record 3036: Email is dirk@beardslee.com")
	void EmailOfRecord3036() {
		assertEquals("dirk@beardslee.com", customers.get(3035).getEmail());
	}

	@Test
	@DisplayName("Record 3036: Web is http://www.dirkbeardslee.com")
	void WebOfRecord3036() {
		assertEquals("http://www.dirkbeardslee.com", customers.get(3035).getWeb());
	}
}
