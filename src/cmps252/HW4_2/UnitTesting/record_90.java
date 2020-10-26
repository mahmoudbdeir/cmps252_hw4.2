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

@Tag("25")
class Record_90 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 90: FirstName is Mason")
	void FirstNameOfRecord90() {
		assertEquals("Mason", customers.get(89).getFirstName());
	}

	@Test
	@DisplayName("Record 90: LastName is Norrick")
	void LastNameOfRecord90() {
		assertEquals("Norrick", customers.get(89).getLastName());
	}

	@Test
	@DisplayName("Record 90: Company is Kgrt Am Fm Radio Station")
	void CompanyOfRecord90() {
		assertEquals("Kgrt Am Fm Radio Station", customers.get(89).getCompany());
	}

	@Test
	@DisplayName("Record 90: Address is 2217 Chico Ave")
	void AddressOfRecord90() {
		assertEquals("2217 Chico Ave", customers.get(89).getAddress());
	}

	@Test
	@DisplayName("Record 90: City is South El Monte")
	void CityOfRecord90() {
		assertEquals("South El Monte", customers.get(89).getCity());
	}

	@Test
	@DisplayName("Record 90: County is Los Angeles")
	void CountyOfRecord90() {
		assertEquals("Los Angeles", customers.get(89).getCounty());
	}

	@Test
	@DisplayName("Record 90: State is CA")
	void StateOfRecord90() {
		assertEquals("CA", customers.get(89).getState());
	}

	@Test
	@DisplayName("Record 90: ZIP is 91733")
	void ZIPOfRecord90() {
		assertEquals("91733", customers.get(89).getZIP());
	}

	@Test
	@DisplayName("Record 90: Phone is 626-283-0247")
	void PhoneOfRecord90() {
		assertEquals("626-283-0247", customers.get(89).getPhone());
	}

	@Test
	@DisplayName("Record 90: Fax is 626-283-6881")
	void FaxOfRecord90() {
		assertEquals("626-283-6881", customers.get(89).getFax());
	}

	@Test
	@DisplayName("Record 90: Email is mason@norrick.com")
	void EmailOfRecord90() {
		assertEquals("mason@norrick.com", customers.get(89).getEmail());
	}

	@Test
	@DisplayName("Record 90: Web is http://www.masonnorrick.com")
	void WebOfRecord90() {
		assertEquals("http://www.masonnorrick.com", customers.get(89).getWeb());
	}
}
