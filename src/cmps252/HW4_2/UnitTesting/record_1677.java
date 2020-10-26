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

@Tag("8")
class Record_1677 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1677: FirstName is Renee")
	void FirstNameOfRecord1677() {
		assertEquals("Renee", customers.get(1676).getFirstName());
	}

	@Test
	@DisplayName("Record 1677: LastName is Losier")
	void LastNameOfRecord1677() {
		assertEquals("Losier", customers.get(1676).getLastName());
	}

	@Test
	@DisplayName("Record 1677: Company is Worth Landscaping")
	void CompanyOfRecord1677() {
		assertEquals("Worth Landscaping", customers.get(1676).getCompany());
	}

	@Test
	@DisplayName("Record 1677: Address is 4424 Vogel Rd  #-302")
	void AddressOfRecord1677() {
		assertEquals("4424 Vogel Rd  #-302", customers.get(1676).getAddress());
	}

	@Test
	@DisplayName("Record 1677: City is Evansville")
	void CityOfRecord1677() {
		assertEquals("Evansville", customers.get(1676).getCity());
	}

	@Test
	@DisplayName("Record 1677: County is Vanderburgh")
	void CountyOfRecord1677() {
		assertEquals("Vanderburgh", customers.get(1676).getCounty());
	}

	@Test
	@DisplayName("Record 1677: State is IN")
	void StateOfRecord1677() {
		assertEquals("IN", customers.get(1676).getState());
	}

	@Test
	@DisplayName("Record 1677: ZIP is 47715")
	void ZIPOfRecord1677() {
		assertEquals("47715", customers.get(1676).getZIP());
	}

	@Test
	@DisplayName("Record 1677: Phone is 812-474-2200")
	void PhoneOfRecord1677() {
		assertEquals("812-474-2200", customers.get(1676).getPhone());
	}

	@Test
	@DisplayName("Record 1677: Fax is 812-474-1408")
	void FaxOfRecord1677() {
		assertEquals("812-474-1408", customers.get(1676).getFax());
	}

	@Test
	@DisplayName("Record 1677: Email is renee@losier.com")
	void EmailOfRecord1677() {
		assertEquals("renee@losier.com", customers.get(1676).getEmail());
	}

	@Test
	@DisplayName("Record 1677: Web is http://www.reneelosier.com")
	void WebOfRecord1677() {
		assertEquals("http://www.reneelosier.com", customers.get(1676).getWeb());
	}
}
