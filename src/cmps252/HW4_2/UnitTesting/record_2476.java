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

@Tag("16")
class Record_2476 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2476: FirstName is Beatrice")
	void FirstNameOfRecord2476() {
		assertEquals("Beatrice", customers.get(2475).getFirstName());
	}

	@Test
	@DisplayName("Record 2476: LastName is Orwick")
	void LastNameOfRecord2476() {
		assertEquals("Orwick", customers.get(2475).getLastName());
	}

	@Test
	@DisplayName("Record 2476: Company is Ricks Dairy Inc")
	void CompanyOfRecord2476() {
		assertEquals("Ricks Dairy Inc", customers.get(2475).getCompany());
	}

	@Test
	@DisplayName("Record 2476: Address is 244 Madison Ave")
	void AddressOfRecord2476() {
		assertEquals("244 Madison Ave", customers.get(2475).getAddress());
	}

	@Test
	@DisplayName("Record 2476: City is New York")
	void CityOfRecord2476() {
		assertEquals("New York", customers.get(2475).getCity());
	}

	@Test
	@DisplayName("Record 2476: County is New York")
	void CountyOfRecord2476() {
		assertEquals("New York", customers.get(2475).getCounty());
	}

	@Test
	@DisplayName("Record 2476: State is NY")
	void StateOfRecord2476() {
		assertEquals("NY", customers.get(2475).getState());
	}

	@Test
	@DisplayName("Record 2476: ZIP is 10016")
	void ZIPOfRecord2476() {
		assertEquals("10016", customers.get(2475).getZIP());
	}

	@Test
	@DisplayName("Record 2476: Phone is 212-532-0532")
	void PhoneOfRecord2476() {
		assertEquals("212-532-0532", customers.get(2475).getPhone());
	}

	@Test
	@DisplayName("Record 2476: Fax is 212-532-5697")
	void FaxOfRecord2476() {
		assertEquals("212-532-5697", customers.get(2475).getFax());
	}

	@Test
	@DisplayName("Record 2476: Email is beatrice@orwick.com")
	void EmailOfRecord2476() {
		assertEquals("beatrice@orwick.com", customers.get(2475).getEmail());
	}

	@Test
	@DisplayName("Record 2476: Web is http://www.beatriceorwick.com")
	void WebOfRecord2476() {
		assertEquals("http://www.beatriceorwick.com", customers.get(2475).getWeb());
	}
}
