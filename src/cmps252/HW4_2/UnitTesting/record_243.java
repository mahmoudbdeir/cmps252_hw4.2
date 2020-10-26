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

@Tag("2")
class Record_243 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 243: FirstName is Mollie")
	void FirstNameOfRecord243() {
		assertEquals("Mollie", customers.get(242).getFirstName());
	}

	@Test
	@DisplayName("Record 243: LastName is Mendonca")
	void LastNameOfRecord243() {
		assertEquals("Mendonca", customers.get(242).getLastName());
	}

	@Test
	@DisplayName("Record 243: Company is Tallman Printing Company")
	void CompanyOfRecord243() {
		assertEquals("Tallman Printing Company", customers.get(242).getCompany());
	}

	@Test
	@DisplayName("Record 243: Address is 14128 N 88th Ave")
	void AddressOfRecord243() {
		assertEquals("14128 N 88th Ave", customers.get(242).getAddress());
	}

	@Test
	@DisplayName("Record 243: City is Peoria")
	void CityOfRecord243() {
		assertEquals("Peoria", customers.get(242).getCity());
	}

	@Test
	@DisplayName("Record 243: County is Maricopa")
	void CountyOfRecord243() {
		assertEquals("Maricopa", customers.get(242).getCounty());
	}

	@Test
	@DisplayName("Record 243: State is AZ")
	void StateOfRecord243() {
		assertEquals("AZ", customers.get(242).getState());
	}

	@Test
	@DisplayName("Record 243: ZIP is 85381")
	void ZIPOfRecord243() {
		assertEquals("85381", customers.get(242).getZIP());
	}

	@Test
	@DisplayName("Record 243: Phone is 623-878-3915")
	void PhoneOfRecord243() {
		assertEquals("623-878-3915", customers.get(242).getPhone());
	}

	@Test
	@DisplayName("Record 243: Fax is 623-878-6107")
	void FaxOfRecord243() {
		assertEquals("623-878-6107", customers.get(242).getFax());
	}

	@Test
	@DisplayName("Record 243: Email is mollie@mendonca.com")
	void EmailOfRecord243() {
		assertEquals("mollie@mendonca.com", customers.get(242).getEmail());
	}

	@Test
	@DisplayName("Record 243: Web is http://www.molliemendonca.com")
	void WebOfRecord243() {
		assertEquals("http://www.molliemendonca.com", customers.get(242).getWeb());
	}
}
