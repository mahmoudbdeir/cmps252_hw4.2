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

@Tag("0")
class Record_2298 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2298: FirstName is Teresa")
	void FirstNameOfRecord2298() {
		assertEquals("Teresa", customers.get(2297).getFirstName());
	}

	@Test
	@DisplayName("Record 2298: LastName is Madarang")
	void LastNameOfRecord2298() {
		assertEquals("Madarang", customers.get(2297).getLastName());
	}

	@Test
	@DisplayName("Record 2298: Company is Northwest Fl Engrg & Surv Inc")
	void CompanyOfRecord2298() {
		assertEquals("Northwest Fl Engrg & Surv Inc", customers.get(2297).getCompany());
	}

	@Test
	@DisplayName("Record 2298: Address is 1065 Kapiolani Blvd  #-161")
	void AddressOfRecord2298() {
		assertEquals("1065 Kapiolani Blvd  #-161", customers.get(2297).getAddress());
	}

	@Test
	@DisplayName("Record 2298: City is Honolulu")
	void CityOfRecord2298() {
		assertEquals("Honolulu", customers.get(2297).getCity());
	}

	@Test
	@DisplayName("Record 2298: County is Honolulu")
	void CountyOfRecord2298() {
		assertEquals("Honolulu", customers.get(2297).getCounty());
	}

	@Test
	@DisplayName("Record 2298: State is HI")
	void StateOfRecord2298() {
		assertEquals("HI", customers.get(2297).getState());
	}

	@Test
	@DisplayName("Record 2298: ZIP is 96814")
	void ZIPOfRecord2298() {
		assertEquals("96814", customers.get(2297).getZIP());
	}

	@Test
	@DisplayName("Record 2298: Phone is 808-593-0380")
	void PhoneOfRecord2298() {
		assertEquals("808-593-0380", customers.get(2297).getPhone());
	}

	@Test
	@DisplayName("Record 2298: Fax is 808-593-8062")
	void FaxOfRecord2298() {
		assertEquals("808-593-8062", customers.get(2297).getFax());
	}

	@Test
	@DisplayName("Record 2298: Email is teresa@madarang.com")
	void EmailOfRecord2298() {
		assertEquals("teresa@madarang.com", customers.get(2297).getEmail());
	}

	@Test
	@DisplayName("Record 2298: Web is http://www.teresamadarang.com")
	void WebOfRecord2298() {
		assertEquals("http://www.teresamadarang.com", customers.get(2297).getWeb());
	}
}
