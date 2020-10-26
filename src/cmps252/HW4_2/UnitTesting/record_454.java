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
class Record_454 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 454: FirstName is Kaitlyn")
	void FirstNameOfRecord454() {
		assertEquals("Kaitlyn", customers.get(453).getFirstName());
	}

	@Test
	@DisplayName("Record 454: LastName is Lygers")
	void LastNameOfRecord454() {
		assertEquals("Lygers", customers.get(453).getLastName());
	}

	@Test
	@DisplayName("Record 454: Company is Mr Chain")
	void CompanyOfRecord454() {
		assertEquals("Mr Chain", customers.get(453).getCompany());
	}

	@Test
	@DisplayName("Record 454: Address is 1610 State Route 27")
	void AddressOfRecord454() {
		assertEquals("1610 State Route 27", customers.get(453).getAddress());
	}

	@Test
	@DisplayName("Record 454: City is North Brunswick")
	void CityOfRecord454() {
		assertEquals("North Brunswick", customers.get(453).getCity());
	}

	@Test
	@DisplayName("Record 454: County is Middlesex")
	void CountyOfRecord454() {
		assertEquals("Middlesex", customers.get(453).getCounty());
	}

	@Test
	@DisplayName("Record 454: State is NJ")
	void StateOfRecord454() {
		assertEquals("NJ", customers.get(453).getState());
	}

	@Test
	@DisplayName("Record 454: ZIP is 8902")
	void ZIPOfRecord454() {
		assertEquals("8902", customers.get(453).getZIP());
	}

	@Test
	@DisplayName("Record 454: Phone is 732-572-3356")
	void PhoneOfRecord454() {
		assertEquals("732-572-3356", customers.get(453).getPhone());
	}

	@Test
	@DisplayName("Record 454: Fax is 732-572-0499")
	void FaxOfRecord454() {
		assertEquals("732-572-0499", customers.get(453).getFax());
	}

	@Test
	@DisplayName("Record 454: Email is kaitlyn@lygers.com")
	void EmailOfRecord454() {
		assertEquals("kaitlyn@lygers.com", customers.get(453).getEmail());
	}

	@Test
	@DisplayName("Record 454: Web is http://www.kaitlynlygers.com")
	void WebOfRecord454() {
		assertEquals("http://www.kaitlynlygers.com", customers.get(453).getWeb());
	}
}
