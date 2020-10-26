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

@Tag("49")
class Record_2285 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2285: FirstName is Lauri")
	void FirstNameOfRecord2285() {
		assertEquals("Lauri", customers.get(2284).getFirstName());
	}

	@Test
	@DisplayName("Record 2285: LastName is Sjaarda")
	void LastNameOfRecord2285() {
		assertEquals("Sjaarda", customers.get(2284).getLastName());
	}

	@Test
	@DisplayName("Record 2285: Company is Cipriano, John J Md")
	void CompanyOfRecord2285() {
		assertEquals("Cipriano, John J Md", customers.get(2284).getCompany());
	}

	@Test
	@DisplayName("Record 2285: Address is 6750 E Main St  #-103")
	void AddressOfRecord2285() {
		assertEquals("6750 E Main St  #-103", customers.get(2284).getAddress());
	}

	@Test
	@DisplayName("Record 2285: City is Mesa")
	void CityOfRecord2285() {
		assertEquals("Mesa", customers.get(2284).getCity());
	}

	@Test
	@DisplayName("Record 2285: County is Maricopa")
	void CountyOfRecord2285() {
		assertEquals("Maricopa", customers.get(2284).getCounty());
	}

	@Test
	@DisplayName("Record 2285: State is AZ")
	void StateOfRecord2285() {
		assertEquals("AZ", customers.get(2284).getState());
	}

	@Test
	@DisplayName("Record 2285: ZIP is 85205")
	void ZIPOfRecord2285() {
		assertEquals("85205", customers.get(2284).getZIP());
	}

	@Test
	@DisplayName("Record 2285: Phone is 480-924-8798")
	void PhoneOfRecord2285() {
		assertEquals("480-924-8798", customers.get(2284).getPhone());
	}

	@Test
	@DisplayName("Record 2285: Fax is 480-924-6462")
	void FaxOfRecord2285() {
		assertEquals("480-924-6462", customers.get(2284).getFax());
	}

	@Test
	@DisplayName("Record 2285: Email is lauri@sjaarda.com")
	void EmailOfRecord2285() {
		assertEquals("lauri@sjaarda.com", customers.get(2284).getEmail());
	}

	@Test
	@DisplayName("Record 2285: Web is http://www.laurisjaarda.com")
	void WebOfRecord2285() {
		assertEquals("http://www.laurisjaarda.com", customers.get(2284).getWeb());
	}
}
