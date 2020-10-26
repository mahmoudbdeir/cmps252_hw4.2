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

@Tag("42")
class Record_3057 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3057: FirstName is Zane")
	void FirstNameOfRecord3057() {
		assertEquals("Zane", customers.get(3056).getFirstName());
	}

	@Test
	@DisplayName("Record 3057: LastName is Tham")
	void LastNameOfRecord3057() {
		assertEquals("Tham", customers.get(3056).getLastName());
	}

	@Test
	@DisplayName("Record 3057: Company is Stevenot Winery")
	void CompanyOfRecord3057() {
		assertEquals("Stevenot Winery", customers.get(3056).getCompany());
	}

	@Test
	@DisplayName("Record 3057: Address is 14310 Lawrence Rd")
	void AddressOfRecord3057() {
		assertEquals("14310 Lawrence Rd", customers.get(3056).getAddress());
	}

	@Test
	@DisplayName("Record 3057: City is Little Rock")
	void CityOfRecord3057() {
		assertEquals("Little Rock", customers.get(3056).getCity());
	}

	@Test
	@DisplayName("Record 3057: County is Pulaski")
	void CountyOfRecord3057() {
		assertEquals("Pulaski", customers.get(3056).getCounty());
	}

	@Test
	@DisplayName("Record 3057: State is AR")
	void StateOfRecord3057() {
		assertEquals("AR", customers.get(3056).getState());
	}

	@Test
	@DisplayName("Record 3057: ZIP is 72206")
	void ZIPOfRecord3057() {
		assertEquals("72206", customers.get(3056).getZIP());
	}

	@Test
	@DisplayName("Record 3057: Phone is 501-888-9755")
	void PhoneOfRecord3057() {
		assertEquals("501-888-9755", customers.get(3056).getPhone());
	}

	@Test
	@DisplayName("Record 3057: Fax is 501-888-0028")
	void FaxOfRecord3057() {
		assertEquals("501-888-0028", customers.get(3056).getFax());
	}

	@Test
	@DisplayName("Record 3057: Email is zane@tham.com")
	void EmailOfRecord3057() {
		assertEquals("zane@tham.com", customers.get(3056).getEmail());
	}

	@Test
	@DisplayName("Record 3057: Web is http://www.zanetham.com")
	void WebOfRecord3057() {
		assertEquals("http://www.zanetham.com", customers.get(3056).getWeb());
	}
}
