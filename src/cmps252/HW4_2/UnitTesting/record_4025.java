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

@Tag("39")
class Record_4025 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4025: FirstName is Francesco")
	void FirstNameOfRecord4025() {
		assertEquals("Francesco", customers.get(4024).getFirstName());
	}

	@Test
	@DisplayName("Record 4025: LastName is Vancott")
	void LastNameOfRecord4025() {
		assertEquals("Vancott", customers.get(4024).getLastName());
	}

	@Test
	@DisplayName("Record 4025: Company is Cobb, Stanton L Pa")
	void CompanyOfRecord4025() {
		assertEquals("Cobb, Stanton L Pa", customers.get(4024).getCompany());
	}

	@Test
	@DisplayName("Record 4025: Address is 917 N 13th St")
	void AddressOfRecord4025() {
		assertEquals("917 N 13th St", customers.get(4024).getAddress());
	}

	@Test
	@DisplayName("Record 4025: City is Abilene")
	void CityOfRecord4025() {
		assertEquals("Abilene", customers.get(4024).getCity());
	}

	@Test
	@DisplayName("Record 4025: County is Taylor")
	void CountyOfRecord4025() {
		assertEquals("Taylor", customers.get(4024).getCounty());
	}

	@Test
	@DisplayName("Record 4025: State is TX")
	void StateOfRecord4025() {
		assertEquals("TX", customers.get(4024).getState());
	}

	@Test
	@DisplayName("Record 4025: ZIP is 79601")
	void ZIPOfRecord4025() {
		assertEquals("79601", customers.get(4024).getZIP());
	}

	@Test
	@DisplayName("Record 4025: Phone is 325-675-4354")
	void PhoneOfRecord4025() {
		assertEquals("325-675-4354", customers.get(4024).getPhone());
	}

	@Test
	@DisplayName("Record 4025: Fax is 325-675-5746")
	void FaxOfRecord4025() {
		assertEquals("325-675-5746", customers.get(4024).getFax());
	}

	@Test
	@DisplayName("Record 4025: Email is francesco@vancott.com")
	void EmailOfRecord4025() {
		assertEquals("francesco@vancott.com", customers.get(4024).getEmail());
	}

	@Test
	@DisplayName("Record 4025: Web is http://www.francescovancott.com")
	void WebOfRecord4025() {
		assertEquals("http://www.francescovancott.com", customers.get(4024).getWeb());
	}
}
