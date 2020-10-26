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

@Tag("35")
class Record_3826 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3826: FirstName is Birdie")
	void FirstNameOfRecord3826() {
		assertEquals("Birdie", customers.get(3825).getFirstName());
	}

	@Test
	@DisplayName("Record 3826: LastName is Thivierge")
	void LastNameOfRecord3826() {
		assertEquals("Thivierge", customers.get(3825).getLastName());
	}

	@Test
	@DisplayName("Record 3826: Company is Wilson Elliott Trucks")
	void CompanyOfRecord3826() {
		assertEquals("Wilson Elliott Trucks", customers.get(3825).getCompany());
	}

	@Test
	@DisplayName("Record 3826: Address is 11 Thornton Dr")
	void AddressOfRecord3826() {
		assertEquals("11 Thornton Dr", customers.get(3825).getAddress());
	}

	@Test
	@DisplayName("Record 3826: City is Hyannis")
	void CityOfRecord3826() {
		assertEquals("Hyannis", customers.get(3825).getCity());
	}

	@Test
	@DisplayName("Record 3826: County is Barnstable")
	void CountyOfRecord3826() {
		assertEquals("Barnstable", customers.get(3825).getCounty());
	}

	@Test
	@DisplayName("Record 3826: State is MA")
	void StateOfRecord3826() {
		assertEquals("MA", customers.get(3825).getState());
	}

	@Test
	@DisplayName("Record 3826: ZIP is 2601")
	void ZIPOfRecord3826() {
		assertEquals("2601", customers.get(3825).getZIP());
	}

	@Test
	@DisplayName("Record 3826: Phone is 508-775-8862")
	void PhoneOfRecord3826() {
		assertEquals("508-775-8862", customers.get(3825).getPhone());
	}

	@Test
	@DisplayName("Record 3826: Fax is 508-775-6882")
	void FaxOfRecord3826() {
		assertEquals("508-775-6882", customers.get(3825).getFax());
	}

	@Test
	@DisplayName("Record 3826: Email is birdie@thivierge.com")
	void EmailOfRecord3826() {
		assertEquals("birdie@thivierge.com", customers.get(3825).getEmail());
	}

	@Test
	@DisplayName("Record 3826: Web is http://www.birdiethivierge.com")
	void WebOfRecord3826() {
		assertEquals("http://www.birdiethivierge.com", customers.get(3825).getWeb());
	}
}
