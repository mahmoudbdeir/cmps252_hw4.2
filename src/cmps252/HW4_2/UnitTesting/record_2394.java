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
class Record_2394 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2394: FirstName is Darrell")
	void FirstNameOfRecord2394() {
		assertEquals("Darrell", customers.get(2393).getFirstName());
	}

	@Test
	@DisplayName("Record 2394: LastName is Maynor")
	void LastNameOfRecord2394() {
		assertEquals("Maynor", customers.get(2393).getLastName());
	}

	@Test
	@DisplayName("Record 2394: Company is Alps Boulder Canyon Inn")
	void CompanyOfRecord2394() {
		assertEquals("Alps Boulder Canyon Inn", customers.get(2393).getCompany());
	}

	@Test
	@DisplayName("Record 2394: Address is 1015 Lancaster Ave")
	void AddressOfRecord2394() {
		assertEquals("1015 Lancaster Ave", customers.get(2393).getAddress());
	}

	@Test
	@DisplayName("Record 2394: City is Wilmington")
	void CityOfRecord2394() {
		assertEquals("Wilmington", customers.get(2393).getCity());
	}

	@Test
	@DisplayName("Record 2394: County is New Castle")
	void CountyOfRecord2394() {
		assertEquals("New Castle", customers.get(2393).getCounty());
	}

	@Test
	@DisplayName("Record 2394: State is DE")
	void StateOfRecord2394() {
		assertEquals("DE", customers.get(2393).getState());
	}

	@Test
	@DisplayName("Record 2394: ZIP is 19805")
	void ZIPOfRecord2394() {
		assertEquals("19805", customers.get(2393).getZIP());
	}

	@Test
	@DisplayName("Record 2394: Phone is 302-655-9134")
	void PhoneOfRecord2394() {
		assertEquals("302-655-9134", customers.get(2393).getPhone());
	}

	@Test
	@DisplayName("Record 2394: Fax is 302-655-5535")
	void FaxOfRecord2394() {
		assertEquals("302-655-5535", customers.get(2393).getFax());
	}

	@Test
	@DisplayName("Record 2394: Email is darrell@maynor.com")
	void EmailOfRecord2394() {
		assertEquals("darrell@maynor.com", customers.get(2393).getEmail());
	}

	@Test
	@DisplayName("Record 2394: Web is http://www.darrellmaynor.com")
	void WebOfRecord2394() {
		assertEquals("http://www.darrellmaynor.com", customers.get(2393).getWeb());
	}
}
