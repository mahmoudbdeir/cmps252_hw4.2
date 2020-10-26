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

@Tag("31")
class Record_2784 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2784: FirstName is Scot")
	void FirstNameOfRecord2784() {
		assertEquals("Scot", customers.get(2783).getFirstName());
	}

	@Test
	@DisplayName("Record 2784: LastName is Ozenne")
	void LastNameOfRecord2784() {
		assertEquals("Ozenne", customers.get(2783).getLastName());
	}

	@Test
	@DisplayName("Record 2784: Company is American Recycling")
	void CompanyOfRecord2784() {
		assertEquals("American Recycling", customers.get(2783).getCompany());
	}

	@Test
	@DisplayName("Record 2784: Address is 5830 Andersonville Rd")
	void AddressOfRecord2784() {
		assertEquals("5830 Andersonville Rd", customers.get(2783).getAddress());
	}

	@Test
	@DisplayName("Record 2784: City is Waterford")
	void CityOfRecord2784() {
		assertEquals("Waterford", customers.get(2783).getCity());
	}

	@Test
	@DisplayName("Record 2784: County is Oakland")
	void CountyOfRecord2784() {
		assertEquals("Oakland", customers.get(2783).getCounty());
	}

	@Test
	@DisplayName("Record 2784: State is MI")
	void StateOfRecord2784() {
		assertEquals("MI", customers.get(2783).getState());
	}

	@Test
	@DisplayName("Record 2784: ZIP is 48329")
	void ZIPOfRecord2784() {
		assertEquals("48329", customers.get(2783).getZIP());
	}

	@Test
	@DisplayName("Record 2784: Phone is 248-623-3624")
	void PhoneOfRecord2784() {
		assertEquals("248-623-3624", customers.get(2783).getPhone());
	}

	@Test
	@DisplayName("Record 2784: Fax is 248-623-1347")
	void FaxOfRecord2784() {
		assertEquals("248-623-1347", customers.get(2783).getFax());
	}

	@Test
	@DisplayName("Record 2784: Email is scot@ozenne.com")
	void EmailOfRecord2784() {
		assertEquals("scot@ozenne.com", customers.get(2783).getEmail());
	}

	@Test
	@DisplayName("Record 2784: Web is http://www.scotozenne.com")
	void WebOfRecord2784() {
		assertEquals("http://www.scotozenne.com", customers.get(2783).getWeb());
	}
}
