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

@Tag("5")
class Record_420 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 420: FirstName is Paula")
	void FirstNameOfRecord420() {
		assertEquals("Paula", customers.get(419).getFirstName());
	}

	@Test
	@DisplayName("Record 420: LastName is Motts")
	void LastNameOfRecord420() {
		assertEquals("Motts", customers.get(419).getLastName());
	}

	@Test
	@DisplayName("Record 420: Company is Cpm Co")
	void CompanyOfRecord420() {
		assertEquals("Cpm Co", customers.get(419).getCompany());
	}

	@Test
	@DisplayName("Record 420: Address is 1108 E Main St")
	void AddressOfRecord420() {
		assertEquals("1108 E Main St", customers.get(419).getAddress());
	}

	@Test
	@DisplayName("Record 420: City is Richmond")
	void CityOfRecord420() {
		assertEquals("Richmond", customers.get(419).getCity());
	}

	@Test
	@DisplayName("Record 420: County is Richmond City")
	void CountyOfRecord420() {
		assertEquals("Richmond City", customers.get(419).getCounty());
	}

	@Test
	@DisplayName("Record 420: State is VA")
	void StateOfRecord420() {
		assertEquals("VA", customers.get(419).getState());
	}

	@Test
	@DisplayName("Record 420: ZIP is 23219")
	void ZIPOfRecord420() {
		assertEquals("23219", customers.get(419).getZIP());
	}

	@Test
	@DisplayName("Record 420: Phone is 804-643-0213")
	void PhoneOfRecord420() {
		assertEquals("804-643-0213", customers.get(419).getPhone());
	}

	@Test
	@DisplayName("Record 420: Fax is 804-643-6775")
	void FaxOfRecord420() {
		assertEquals("804-643-6775", customers.get(419).getFax());
	}

	@Test
	@DisplayName("Record 420: Email is paula@motts.com")
	void EmailOfRecord420() {
		assertEquals("paula@motts.com", customers.get(419).getEmail());
	}

	@Test
	@DisplayName("Record 420: Web is http://www.paulamotts.com")
	void WebOfRecord420() {
		assertEquals("http://www.paulamotts.com", customers.get(419).getWeb());
	}
}
