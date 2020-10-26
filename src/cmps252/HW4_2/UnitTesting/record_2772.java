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

@Tag("14")
class Record_2772 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2772: FirstName is Lonny")
	void FirstNameOfRecord2772() {
		assertEquals("Lonny", customers.get(2771).getFirstName());
	}

	@Test
	@DisplayName("Record 2772: LastName is Zackery")
	void LastNameOfRecord2772() {
		assertEquals("Zackery", customers.get(2771).getLastName());
	}

	@Test
	@DisplayName("Record 2772: Company is Discala, Francis J Esq")
	void CompanyOfRecord2772() {
		assertEquals("Discala, Francis J Esq", customers.get(2771).getCompany());
	}

	@Test
	@DisplayName("Record 2772: Address is 300 S Court St")
	void AddressOfRecord2772() {
		assertEquals("300 S Court St", customers.get(2771).getAddress());
	}

	@Test
	@DisplayName("Record 2772: City is Visalia")
	void CityOfRecord2772() {
		assertEquals("Visalia", customers.get(2771).getCity());
	}

	@Test
	@DisplayName("Record 2772: County is Tulare")
	void CountyOfRecord2772() {
		assertEquals("Tulare", customers.get(2771).getCounty());
	}

	@Test
	@DisplayName("Record 2772: State is CA")
	void StateOfRecord2772() {
		assertEquals("CA", customers.get(2771).getState());
	}

	@Test
	@DisplayName("Record 2772: ZIP is 93291")
	void ZIPOfRecord2772() {
		assertEquals("93291", customers.get(2771).getZIP());
	}

	@Test
	@DisplayName("Record 2772: Phone is 559-636-7519")
	void PhoneOfRecord2772() {
		assertEquals("559-636-7519", customers.get(2771).getPhone());
	}

	@Test
	@DisplayName("Record 2772: Fax is 559-636-2624")
	void FaxOfRecord2772() {
		assertEquals("559-636-2624", customers.get(2771).getFax());
	}

	@Test
	@DisplayName("Record 2772: Email is lonny@zackery.com")
	void EmailOfRecord2772() {
		assertEquals("lonny@zackery.com", customers.get(2771).getEmail());
	}

	@Test
	@DisplayName("Record 2772: Web is http://www.lonnyzackery.com")
	void WebOfRecord2772() {
		assertEquals("http://www.lonnyzackery.com", customers.get(2771).getWeb());
	}
}
