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

@Tag("33")
class Record_1224 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1224: FirstName is Sammie")
	void FirstNameOfRecord1224() {
		assertEquals("Sammie", customers.get(1223).getFirstName());
	}

	@Test
	@DisplayName("Record 1224: LastName is Millwee")
	void LastNameOfRecord1224() {
		assertEquals("Millwee", customers.get(1223).getLastName());
	}

	@Test
	@DisplayName("Record 1224: Company is Wilson, Gary D Esq")
	void CompanyOfRecord1224() {
		assertEquals("Wilson, Gary D Esq", customers.get(1223).getCompany());
	}

	@Test
	@DisplayName("Record 1224: Address is 4858 Central Ave Ne")
	void AddressOfRecord1224() {
		assertEquals("4858 Central Ave Ne", customers.get(1223).getAddress());
	}

	@Test
	@DisplayName("Record 1224: City is Minneapolis")
	void CityOfRecord1224() {
		assertEquals("Minneapolis", customers.get(1223).getCity());
	}

	@Test
	@DisplayName("Record 1224: County is Anoka")
	void CountyOfRecord1224() {
		assertEquals("Anoka", customers.get(1223).getCounty());
	}

	@Test
	@DisplayName("Record 1224: State is MN")
	void StateOfRecord1224() {
		assertEquals("MN", customers.get(1223).getState());
	}

	@Test
	@DisplayName("Record 1224: ZIP is 55421")
	void ZIPOfRecord1224() {
		assertEquals("55421", customers.get(1223).getZIP());
	}

	@Test
	@DisplayName("Record 1224: Phone is 763-574-4931")
	void PhoneOfRecord1224() {
		assertEquals("763-574-4931", customers.get(1223).getPhone());
	}

	@Test
	@DisplayName("Record 1224: Fax is 763-574-4733")
	void FaxOfRecord1224() {
		assertEquals("763-574-4733", customers.get(1223).getFax());
	}

	@Test
	@DisplayName("Record 1224: Email is sammie@millwee.com")
	void EmailOfRecord1224() {
		assertEquals("sammie@millwee.com", customers.get(1223).getEmail());
	}

	@Test
	@DisplayName("Record 1224: Web is http://www.sammiemillwee.com")
	void WebOfRecord1224() {
		assertEquals("http://www.sammiemillwee.com", customers.get(1223).getWeb());
	}
}
