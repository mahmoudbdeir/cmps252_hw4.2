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

@Tag("38")
class Record_2503 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2503: FirstName is Yolanda")
	void FirstNameOfRecord2503() {
		assertEquals("Yolanda", customers.get(2502).getFirstName());
	}

	@Test
	@DisplayName("Record 2503: LastName is Divens")
	void LastNameOfRecord2503() {
		assertEquals("Divens", customers.get(2502).getLastName());
	}

	@Test
	@DisplayName("Record 2503: Company is Dale E Young & Sons Inc")
	void CompanyOfRecord2503() {
		assertEquals("Dale E Young & Sons Inc", customers.get(2502).getCompany());
	}

	@Test
	@DisplayName("Record 2503: Address is 23015 Del Lago Dr")
	void AddressOfRecord2503() {
		assertEquals("23015 Del Lago Dr", customers.get(2502).getAddress());
	}

	@Test
	@DisplayName("Record 2503: City is Laguna Hills")
	void CityOfRecord2503() {
		assertEquals("Laguna Hills", customers.get(2502).getCity());
	}

	@Test
	@DisplayName("Record 2503: County is Orange")
	void CountyOfRecord2503() {
		assertEquals("Orange", customers.get(2502).getCounty());
	}

	@Test
	@DisplayName("Record 2503: State is CA")
	void StateOfRecord2503() {
		assertEquals("CA", customers.get(2502).getState());
	}

	@Test
	@DisplayName("Record 2503: ZIP is 92653")
	void ZIPOfRecord2503() {
		assertEquals("92653", customers.get(2502).getZIP());
	}

	@Test
	@DisplayName("Record 2503: Phone is 949-581-5839")
	void PhoneOfRecord2503() {
		assertEquals("949-581-5839", customers.get(2502).getPhone());
	}

	@Test
	@DisplayName("Record 2503: Fax is 949-581-6296")
	void FaxOfRecord2503() {
		assertEquals("949-581-6296", customers.get(2502).getFax());
	}

	@Test
	@DisplayName("Record 2503: Email is yolanda@divens.com")
	void EmailOfRecord2503() {
		assertEquals("yolanda@divens.com", customers.get(2502).getEmail());
	}

	@Test
	@DisplayName("Record 2503: Web is http://www.yolandadivens.com")
	void WebOfRecord2503() {
		assertEquals("http://www.yolandadivens.com", customers.get(2502).getWeb());
	}
}
