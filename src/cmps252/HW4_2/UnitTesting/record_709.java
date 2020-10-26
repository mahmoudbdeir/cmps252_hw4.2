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
class Record_709 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 709: FirstName is Antionette")
	void FirstNameOfRecord709() {
		assertEquals("Antionette", customers.get(708).getFirstName());
	}

	@Test
	@DisplayName("Record 709: LastName is Belts")
	void LastNameOfRecord709() {
		assertEquals("Belts", customers.get(708).getLastName());
	}

	@Test
	@DisplayName("Record 709: Company is Transportation Services")
	void CompanyOfRecord709() {
		assertEquals("Transportation Services", customers.get(708).getCompany());
	}

	@Test
	@DisplayName("Record 709: Address is 6334 Buford Hwy")
	void AddressOfRecord709() {
		assertEquals("6334 Buford Hwy", customers.get(708).getAddress());
	}

	@Test
	@DisplayName("Record 709: City is Norcross")
	void CityOfRecord709() {
		assertEquals("Norcross", customers.get(708).getCity());
	}

	@Test
	@DisplayName("Record 709: County is Gwinnett")
	void CountyOfRecord709() {
		assertEquals("Gwinnett", customers.get(708).getCounty());
	}

	@Test
	@DisplayName("Record 709: State is GA")
	void StateOfRecord709() {
		assertEquals("GA", customers.get(708).getState());
	}

	@Test
	@DisplayName("Record 709: ZIP is 30071")
	void ZIPOfRecord709() {
		assertEquals("30071", customers.get(708).getZIP());
	}

	@Test
	@DisplayName("Record 709: Phone is 770-448-1684")
	void PhoneOfRecord709() {
		assertEquals("770-448-1684", customers.get(708).getPhone());
	}

	@Test
	@DisplayName("Record 709: Fax is 770-448-0781")
	void FaxOfRecord709() {
		assertEquals("770-448-0781", customers.get(708).getFax());
	}

	@Test
	@DisplayName("Record 709: Email is antionette@belts.com")
	void EmailOfRecord709() {
		assertEquals("antionette@belts.com", customers.get(708).getEmail());
	}

	@Test
	@DisplayName("Record 709: Web is http://www.antionettebelts.com")
	void WebOfRecord709() {
		assertEquals("http://www.antionettebelts.com", customers.get(708).getWeb());
	}
}
