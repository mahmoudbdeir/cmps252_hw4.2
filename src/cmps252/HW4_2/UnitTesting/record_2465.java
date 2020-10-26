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

@Tag("13")
class Record_2465 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2465: FirstName is Buck")
	void FirstNameOfRecord2465() {
		assertEquals("Buck", customers.get(2464).getFirstName());
	}

	@Test
	@DisplayName("Record 2465: LastName is Blatchford")
	void LastNameOfRecord2465() {
		assertEquals("Blatchford", customers.get(2464).getLastName());
	}

	@Test
	@DisplayName("Record 2465: Company is Jensen, James B Jr")
	void CompanyOfRecord2465() {
		assertEquals("Jensen, James B Jr", customers.get(2464).getCompany());
	}

	@Test
	@DisplayName("Record 2465: Address is 2075 Liddell Dr Ne")
	void AddressOfRecord2465() {
		assertEquals("2075 Liddell Dr Ne", customers.get(2464).getAddress());
	}

	@Test
	@DisplayName("Record 2465: City is Atlanta")
	void CityOfRecord2465() {
		assertEquals("Atlanta", customers.get(2464).getCity());
	}

	@Test
	@DisplayName("Record 2465: County is Fulton")
	void CountyOfRecord2465() {
		assertEquals("Fulton", customers.get(2464).getCounty());
	}

	@Test
	@DisplayName("Record 2465: State is GA")
	void StateOfRecord2465() {
		assertEquals("GA", customers.get(2464).getState());
	}

	@Test
	@DisplayName("Record 2465: ZIP is 30324")
	void ZIPOfRecord2465() {
		assertEquals("30324", customers.get(2464).getZIP());
	}

	@Test
	@DisplayName("Record 2465: Phone is 404-876-4254")
	void PhoneOfRecord2465() {
		assertEquals("404-876-4254", customers.get(2464).getPhone());
	}

	@Test
	@DisplayName("Record 2465: Fax is 404-876-5698")
	void FaxOfRecord2465() {
		assertEquals("404-876-5698", customers.get(2464).getFax());
	}

	@Test
	@DisplayName("Record 2465: Email is buck@blatchford.com")
	void EmailOfRecord2465() {
		assertEquals("buck@blatchford.com", customers.get(2464).getEmail());
	}

	@Test
	@DisplayName("Record 2465: Web is http://www.buckblatchford.com")
	void WebOfRecord2465() {
		assertEquals("http://www.buckblatchford.com", customers.get(2464).getWeb());
	}
}
