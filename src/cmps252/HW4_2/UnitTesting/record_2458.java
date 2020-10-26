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

@Tag("47")
class Record_2458 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2458: FirstName is Celestine")
	void FirstNameOfRecord2458() {
		assertEquals("Celestine", customers.get(2457).getFirstName());
	}

	@Test
	@DisplayName("Record 2458: LastName is Brenneman")
	void LastNameOfRecord2458() {
		assertEquals("Brenneman", customers.get(2457).getLastName());
	}

	@Test
	@DisplayName("Record 2458: Company is Mckinnon, Nyl J Esq")
	void CompanyOfRecord2458() {
		assertEquals("Mckinnon, Nyl J Esq", customers.get(2457).getCompany());
	}

	@Test
	@DisplayName("Record 2458: Address is 424 E 92nd St")
	void AddressOfRecord2458() {
		assertEquals("424 E 92nd St", customers.get(2457).getAddress());
	}

	@Test
	@DisplayName("Record 2458: City is New York")
	void CityOfRecord2458() {
		assertEquals("New York", customers.get(2457).getCity());
	}

	@Test
	@DisplayName("Record 2458: County is New York")
	void CountyOfRecord2458() {
		assertEquals("New York", customers.get(2457).getCounty());
	}

	@Test
	@DisplayName("Record 2458: State is NY")
	void StateOfRecord2458() {
		assertEquals("NY", customers.get(2457).getState());
	}

	@Test
	@DisplayName("Record 2458: ZIP is 10128")
	void ZIPOfRecord2458() {
		assertEquals("10128", customers.get(2457).getZIP());
	}

	@Test
	@DisplayName("Record 2458: Phone is 212-348-9530")
	void PhoneOfRecord2458() {
		assertEquals("212-348-9530", customers.get(2457).getPhone());
	}

	@Test
	@DisplayName("Record 2458: Fax is 212-348-7761")
	void FaxOfRecord2458() {
		assertEquals("212-348-7761", customers.get(2457).getFax());
	}

	@Test
	@DisplayName("Record 2458: Email is celestine@brenneman.com")
	void EmailOfRecord2458() {
		assertEquals("celestine@brenneman.com", customers.get(2457).getEmail());
	}

	@Test
	@DisplayName("Record 2458: Web is http://www.celestinebrenneman.com")
	void WebOfRecord2458() {
		assertEquals("http://www.celestinebrenneman.com", customers.get(2457).getWeb());
	}
}
