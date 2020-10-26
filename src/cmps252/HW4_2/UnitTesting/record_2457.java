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

@Tag("6")
class Record_2457 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2457: FirstName is Martina")
	void FirstNameOfRecord2457() {
		assertEquals("Martina", customers.get(2456).getFirstName());
	}

	@Test
	@DisplayName("Record 2457: LastName is Zappia")
	void LastNameOfRecord2457() {
		assertEquals("Zappia", customers.get(2456).getLastName());
	}

	@Test
	@DisplayName("Record 2457: Company is Crown Group Incorporated")
	void CompanyOfRecord2457() {
		assertEquals("Crown Group Incorporated", customers.get(2456).getCompany());
	}

	@Test
	@DisplayName("Record 2457: Address is 6161 Busch Blvd")
	void AddressOfRecord2457() {
		assertEquals("6161 Busch Blvd", customers.get(2456).getAddress());
	}

	@Test
	@DisplayName("Record 2457: City is Columbus")
	void CityOfRecord2457() {
		assertEquals("Columbus", customers.get(2456).getCity());
	}

	@Test
	@DisplayName("Record 2457: County is Franklin")
	void CountyOfRecord2457() {
		assertEquals("Franklin", customers.get(2456).getCounty());
	}

	@Test
	@DisplayName("Record 2457: State is OH")
	void StateOfRecord2457() {
		assertEquals("OH", customers.get(2456).getState());
	}

	@Test
	@DisplayName("Record 2457: ZIP is 43229")
	void ZIPOfRecord2457() {
		assertEquals("43229", customers.get(2456).getZIP());
	}

	@Test
	@DisplayName("Record 2457: Phone is 614-888-4985")
	void PhoneOfRecord2457() {
		assertEquals("614-888-4985", customers.get(2456).getPhone());
	}

	@Test
	@DisplayName("Record 2457: Fax is 614-888-7305")
	void FaxOfRecord2457() {
		assertEquals("614-888-7305", customers.get(2456).getFax());
	}

	@Test
	@DisplayName("Record 2457: Email is martina@zappia.com")
	void EmailOfRecord2457() {
		assertEquals("martina@zappia.com", customers.get(2456).getEmail());
	}

	@Test
	@DisplayName("Record 2457: Web is http://www.martinazappia.com")
	void WebOfRecord2457() {
		assertEquals("http://www.martinazappia.com", customers.get(2456).getWeb());
	}
}
