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

@Tag("19")
class Record_2652 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2652: FirstName is Rosendo")
	void FirstNameOfRecord2652() {
		assertEquals("Rosendo", customers.get(2651).getFirstName());
	}

	@Test
	@DisplayName("Record 2652: LastName is Hackmann")
	void LastNameOfRecord2652() {
		assertEquals("Hackmann", customers.get(2651).getLastName());
	}

	@Test
	@DisplayName("Record 2652: Company is Mckenzie Moffett Elias & Books")
	void CompanyOfRecord2652() {
		assertEquals("Mckenzie Moffett Elias & Books", customers.get(2651).getCompany());
	}

	@Test
	@DisplayName("Record 2652: Address is 958 Front St")
	void AddressOfRecord2652() {
		assertEquals("958 Front St", customers.get(2651).getAddress());
	}

	@Test
	@DisplayName("Record 2652: City is Uniondale")
	void CityOfRecord2652() {
		assertEquals("Uniondale", customers.get(2651).getCity());
	}

	@Test
	@DisplayName("Record 2652: County is Nassau")
	void CountyOfRecord2652() {
		assertEquals("Nassau", customers.get(2651).getCounty());
	}

	@Test
	@DisplayName("Record 2652: State is NY")
	void StateOfRecord2652() {
		assertEquals("NY", customers.get(2651).getState());
	}

	@Test
	@DisplayName("Record 2652: ZIP is 11553")
	void ZIPOfRecord2652() {
		assertEquals("11553", customers.get(2651).getZIP());
	}

	@Test
	@DisplayName("Record 2652: Phone is 516-564-5334")
	void PhoneOfRecord2652() {
		assertEquals("516-564-5334", customers.get(2651).getPhone());
	}

	@Test
	@DisplayName("Record 2652: Fax is 516-564-8594")
	void FaxOfRecord2652() {
		assertEquals("516-564-8594", customers.get(2651).getFax());
	}

	@Test
	@DisplayName("Record 2652: Email is rosendo@hackmann.com")
	void EmailOfRecord2652() {
		assertEquals("rosendo@hackmann.com", customers.get(2651).getEmail());
	}

	@Test
	@DisplayName("Record 2652: Web is http://www.rosendohackmann.com")
	void WebOfRecord2652() {
		assertEquals("http://www.rosendohackmann.com", customers.get(2651).getWeb());
	}
}
