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

@Tag("18")
class Record_963 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 963: FirstName is Elissa")
	void FirstNameOfRecord963() {
		assertEquals("Elissa", customers.get(962).getFirstName());
	}

	@Test
	@DisplayName("Record 963: LastName is Woltjer")
	void LastNameOfRecord963() {
		assertEquals("Woltjer", customers.get(962).getLastName());
	}

	@Test
	@DisplayName("Record 963: Company is Western Publications Assn")
	void CompanyOfRecord963() {
		assertEquals("Western Publications Assn", customers.get(962).getCompany());
	}

	@Test
	@DisplayName("Record 963: Address is 2305 51st Pl")
	void AddressOfRecord963() {
		assertEquals("2305 51st Pl", customers.get(962).getAddress());
	}

	@Test
	@DisplayName("Record 963: City is Hyattsville")
	void CityOfRecord963() {
		assertEquals("Hyattsville", customers.get(962).getCity());
	}

	@Test
	@DisplayName("Record 963: County is Prince Georges")
	void CountyOfRecord963() {
		assertEquals("Prince Georges", customers.get(962).getCounty());
	}

	@Test
	@DisplayName("Record 963: State is MD")
	void StateOfRecord963() {
		assertEquals("MD", customers.get(962).getState());
	}

	@Test
	@DisplayName("Record 963: ZIP is 20781")
	void ZIPOfRecord963() {
		assertEquals("20781", customers.get(962).getZIP());
	}

	@Test
	@DisplayName("Record 963: Phone is 301-772-7103")
	void PhoneOfRecord963() {
		assertEquals("301-772-7103", customers.get(962).getPhone());
	}

	@Test
	@DisplayName("Record 963: Fax is 301-772-3382")
	void FaxOfRecord963() {
		assertEquals("301-772-3382", customers.get(962).getFax());
	}

	@Test
	@DisplayName("Record 963: Email is elissa@woltjer.com")
	void EmailOfRecord963() {
		assertEquals("elissa@woltjer.com", customers.get(962).getEmail());
	}

	@Test
	@DisplayName("Record 963: Web is http://www.elissawoltjer.com")
	void WebOfRecord963() {
		assertEquals("http://www.elissawoltjer.com", customers.get(962).getWeb());
	}
}
