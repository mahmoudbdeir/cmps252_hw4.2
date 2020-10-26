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

@Tag("13")
class Record_2776 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2776: FirstName is Bette")
	void FirstNameOfRecord2776() {
		assertEquals("Bette", customers.get(2775).getFirstName());
	}

	@Test
	@DisplayName("Record 2776: LastName is Simington")
	void LastNameOfRecord2776() {
		assertEquals("Simington", customers.get(2775).getLastName());
	}

	@Test
	@DisplayName("Record 2776: Company is Country Hospitality Inn")
	void CompanyOfRecord2776() {
		assertEquals("Country Hospitality Inn", customers.get(2775).getCompany());
	}

	@Test
	@DisplayName("Record 2776: Address is 205 W Crestway Ave")
	void AddressOfRecord2776() {
		assertEquals("205 W Crestway Ave", customers.get(2775).getAddress());
	}

	@Test
	@DisplayName("Record 2776: City is Derby")
	void CityOfRecord2776() {
		assertEquals("Derby", customers.get(2775).getCity());
	}

	@Test
	@DisplayName("Record 2776: County is Sedgwick")
	void CountyOfRecord2776() {
		assertEquals("Sedgwick", customers.get(2775).getCounty());
	}

	@Test
	@DisplayName("Record 2776: State is KS")
	void StateOfRecord2776() {
		assertEquals("KS", customers.get(2775).getState());
	}

	@Test
	@DisplayName("Record 2776: ZIP is 67037")
	void ZIPOfRecord2776() {
		assertEquals("67037", customers.get(2775).getZIP());
	}

	@Test
	@DisplayName("Record 2776: Phone is 316-262-6960")
	void PhoneOfRecord2776() {
		assertEquals("316-262-6960", customers.get(2775).getPhone());
	}

	@Test
	@DisplayName("Record 2776: Fax is 316-262-9148")
	void FaxOfRecord2776() {
		assertEquals("316-262-9148", customers.get(2775).getFax());
	}

	@Test
	@DisplayName("Record 2776: Email is bette@simington.com")
	void EmailOfRecord2776() {
		assertEquals("bette@simington.com", customers.get(2775).getEmail());
	}

	@Test
	@DisplayName("Record 2776: Web is http://www.bettesimington.com")
	void WebOfRecord2776() {
		assertEquals("http://www.bettesimington.com", customers.get(2775).getWeb());
	}
}
