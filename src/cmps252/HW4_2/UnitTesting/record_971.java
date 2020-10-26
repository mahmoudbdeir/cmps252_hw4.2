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

@Tag("40")
class Record_971 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 971: FirstName is Carolyn")
	void FirstNameOfRecord971() {
		assertEquals("Carolyn", customers.get(970).getFirstName());
	}

	@Test
	@DisplayName("Record 971: LastName is Stidam")
	void LastNameOfRecord971() {
		assertEquals("Stidam", customers.get(970).getLastName());
	}

	@Test
	@DisplayName("Record 971: Company is Wallace Computer Services Inc")
	void CompanyOfRecord971() {
		assertEquals("Wallace Computer Services Inc", customers.get(970).getCompany());
	}

	@Test
	@DisplayName("Record 971: Address is 3975 University Dr")
	void AddressOfRecord971() {
		assertEquals("3975 University Dr", customers.get(970).getAddress());
	}

	@Test
	@DisplayName("Record 971: City is Fairfax")
	void CityOfRecord971() {
		assertEquals("Fairfax", customers.get(970).getCity());
	}

	@Test
	@DisplayName("Record 971: County is Fairfax City")
	void CountyOfRecord971() {
		assertEquals("Fairfax City", customers.get(970).getCounty());
	}

	@Test
	@DisplayName("Record 971: State is VA")
	void StateOfRecord971() {
		assertEquals("VA", customers.get(970).getState());
	}

	@Test
	@DisplayName("Record 971: ZIP is 22030")
	void ZIPOfRecord971() {
		assertEquals("22030", customers.get(970).getZIP());
	}

	@Test
	@DisplayName("Record 971: Phone is 703-385-1535")
	void PhoneOfRecord971() {
		assertEquals("703-385-1535", customers.get(970).getPhone());
	}

	@Test
	@DisplayName("Record 971: Fax is 703-385-7375")
	void FaxOfRecord971() {
		assertEquals("703-385-7375", customers.get(970).getFax());
	}

	@Test
	@DisplayName("Record 971: Email is carolyn@stidam.com")
	void EmailOfRecord971() {
		assertEquals("carolyn@stidam.com", customers.get(970).getEmail());
	}

	@Test
	@DisplayName("Record 971: Web is http://www.carolynstidam.com")
	void WebOfRecord971() {
		assertEquals("http://www.carolynstidam.com", customers.get(970).getWeb());
	}
}
