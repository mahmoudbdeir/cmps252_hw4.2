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

@Tag("31")
class Record_106 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 106: FirstName is Emanuel")
	void FirstNameOfRecord106() {
		assertEquals("Emanuel", customers.get(105).getFirstName());
	}

	@Test
	@DisplayName("Record 106: LastName is Joanis")
	void LastNameOfRecord106() {
		assertEquals("Joanis", customers.get(105).getLastName());
	}

	@Test
	@DisplayName("Record 106: Company is Oelwyn Commercial Printing")
	void CompanyOfRecord106() {
		assertEquals("Oelwyn Commercial Printing", customers.get(105).getCompany());
	}

	@Test
	@DisplayName("Record 106: Address is Hwy 71")
	void AddressOfRecord106() {
		assertEquals("Hwy 71", customers.get(105).getAddress());
	}

	@Test
	@DisplayName("Record 106: City is West Fork")
	void CityOfRecord106() {
		assertEquals("West Fork", customers.get(105).getCity());
	}

	@Test
	@DisplayName("Record 106: County is Washington")
	void CountyOfRecord106() {
		assertEquals("Washington", customers.get(105).getCounty());
	}

	@Test
	@DisplayName("Record 106: State is AR")
	void StateOfRecord106() {
		assertEquals("AR", customers.get(105).getState());
	}

	@Test
	@DisplayName("Record 106: ZIP is 72774")
	void ZIPOfRecord106() {
		assertEquals("72774", customers.get(105).getZIP());
	}

	@Test
	@DisplayName("Record 106: Phone is 479-839-3554")
	void PhoneOfRecord106() {
		assertEquals("479-839-3554", customers.get(105).getPhone());
	}

	@Test
	@DisplayName("Record 106: Fax is 479-839-2152")
	void FaxOfRecord106() {
		assertEquals("479-839-2152", customers.get(105).getFax());
	}

	@Test
	@DisplayName("Record 106: Email is emanuel@joanis.com")
	void EmailOfRecord106() {
		assertEquals("emanuel@joanis.com", customers.get(105).getEmail());
	}

	@Test
	@DisplayName("Record 106: Web is http://www.emanueljoanis.com")
	void WebOfRecord106() {
		assertEquals("http://www.emanueljoanis.com", customers.get(105).getWeb());
	}
}
