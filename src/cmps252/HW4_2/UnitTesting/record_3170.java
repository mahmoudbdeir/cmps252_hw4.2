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

@Tag("3")
class Record_3170 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3170: FirstName is Tim")
	void FirstNameOfRecord3170() {
		assertEquals("Tim", customers.get(3169).getFirstName());
	}

	@Test
	@DisplayName("Record 3170: LastName is Wiegard")
	void LastNameOfRecord3170() {
		assertEquals("Wiegard", customers.get(3169).getLastName());
	}

	@Test
	@DisplayName("Record 3170: Company is Young, Thomas M Esq")
	void CompanyOfRecord3170() {
		assertEquals("Young, Thomas M Esq", customers.get(3169).getCompany());
	}

	@Test
	@DisplayName("Record 3170: Address is 279 Bergen Tpke")
	void AddressOfRecord3170() {
		assertEquals("279 Bergen Tpke", customers.get(3169).getAddress());
	}

	@Test
	@DisplayName("Record 3170: City is Ridgefield Park")
	void CityOfRecord3170() {
		assertEquals("Ridgefield Park", customers.get(3169).getCity());
	}

	@Test
	@DisplayName("Record 3170: County is Bergen")
	void CountyOfRecord3170() {
		assertEquals("Bergen", customers.get(3169).getCounty());
	}

	@Test
	@DisplayName("Record 3170: State is NJ")
	void StateOfRecord3170() {
		assertEquals("NJ", customers.get(3169).getState());
	}

	@Test
	@DisplayName("Record 3170: ZIP is 7660")
	void ZIPOfRecord3170() {
		assertEquals("7660", customers.get(3169).getZIP());
	}

	@Test
	@DisplayName("Record 3170: Phone is 201-641-0004")
	void PhoneOfRecord3170() {
		assertEquals("201-641-0004", customers.get(3169).getPhone());
	}

	@Test
	@DisplayName("Record 3170: Fax is 201-641-0794")
	void FaxOfRecord3170() {
		assertEquals("201-641-0794", customers.get(3169).getFax());
	}

	@Test
	@DisplayName("Record 3170: Email is tim@wiegard.com")
	void EmailOfRecord3170() {
		assertEquals("tim@wiegard.com", customers.get(3169).getEmail());
	}

	@Test
	@DisplayName("Record 3170: Web is http://www.timwiegard.com")
	void WebOfRecord3170() {
		assertEquals("http://www.timwiegard.com", customers.get(3169).getWeb());
	}
}
