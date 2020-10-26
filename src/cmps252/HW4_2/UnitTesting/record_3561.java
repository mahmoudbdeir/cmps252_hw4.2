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

@Tag("48")
class Record_3561 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3561: FirstName is Hong")
	void FirstNameOfRecord3561() {
		assertEquals("Hong", customers.get(3560).getFirstName());
	}

	@Test
	@DisplayName("Record 3561: LastName is Coronado")
	void LastNameOfRecord3561() {
		assertEquals("Coronado", customers.get(3560).getLastName());
	}

	@Test
	@DisplayName("Record 3561: Company is Squires Insurance Agency")
	void CompanyOfRecord3561() {
		assertEquals("Squires Insurance Agency", customers.get(3560).getCompany());
	}

	@Test
	@DisplayName("Record 3561: Address is 4053 Union Pacific Ave")
	void AddressOfRecord3561() {
		assertEquals("4053 Union Pacific Ave", customers.get(3560).getAddress());
	}

	@Test
	@DisplayName("Record 3561: City is Los Angeles")
	void CityOfRecord3561() {
		assertEquals("Los Angeles", customers.get(3560).getCity());
	}

	@Test
	@DisplayName("Record 3561: County is Los Angeles")
	void CountyOfRecord3561() {
		assertEquals("Los Angeles", customers.get(3560).getCounty());
	}

	@Test
	@DisplayName("Record 3561: State is CA")
	void StateOfRecord3561() {
		assertEquals("CA", customers.get(3560).getState());
	}

	@Test
	@DisplayName("Record 3561: ZIP is 90023")
	void ZIPOfRecord3561() {
		assertEquals("90023", customers.get(3560).getZIP());
	}

	@Test
	@DisplayName("Record 3561: Phone is 323-268-1365")
	void PhoneOfRecord3561() {
		assertEquals("323-268-1365", customers.get(3560).getPhone());
	}

	@Test
	@DisplayName("Record 3561: Fax is 323-268-5831")
	void FaxOfRecord3561() {
		assertEquals("323-268-5831", customers.get(3560).getFax());
	}

	@Test
	@DisplayName("Record 3561: Email is hong@coronado.com")
	void EmailOfRecord3561() {
		assertEquals("hong@coronado.com", customers.get(3560).getEmail());
	}

	@Test
	@DisplayName("Record 3561: Web is http://www.hongcoronado.com")
	void WebOfRecord3561() {
		assertEquals("http://www.hongcoronado.com", customers.get(3560).getWeb());
	}
}
