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
class Record_4038 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4038: FirstName is Karin")
	void FirstNameOfRecord4038() {
		assertEquals("Karin", customers.get(4037).getFirstName());
	}

	@Test
	@DisplayName("Record 4038: LastName is Baudino")
	void LastNameOfRecord4038() {
		assertEquals("Baudino", customers.get(4037).getLastName());
	}

	@Test
	@DisplayName("Record 4038: Company is Distinctive Printing & Graph")
	void CompanyOfRecord4038() {
		assertEquals("Distinctive Printing & Graph", customers.get(4037).getCompany());
	}

	@Test
	@DisplayName("Record 4038: Address is 1924 B Silver Star Rd")
	void AddressOfRecord4038() {
		assertEquals("1924 B Silver Star Rd", customers.get(4037).getAddress());
	}

	@Test
	@DisplayName("Record 4038: City is Orlando")
	void CityOfRecord4038() {
		assertEquals("Orlando", customers.get(4037).getCity());
	}

	@Test
	@DisplayName("Record 4038: County is Orange")
	void CountyOfRecord4038() {
		assertEquals("Orange", customers.get(4037).getCounty());
	}

	@Test
	@DisplayName("Record 4038: State is FL")
	void StateOfRecord4038() {
		assertEquals("FL", customers.get(4037).getState());
	}

	@Test
	@DisplayName("Record 4038: ZIP is 32804")
	void ZIPOfRecord4038() {
		assertEquals("32804", customers.get(4037).getZIP());
	}

	@Test
	@DisplayName("Record 4038: Phone is 407-425-3662")
	void PhoneOfRecord4038() {
		assertEquals("407-425-3662", customers.get(4037).getPhone());
	}

	@Test
	@DisplayName("Record 4038: Fax is 407-425-5764")
	void FaxOfRecord4038() {
		assertEquals("407-425-5764", customers.get(4037).getFax());
	}

	@Test
	@DisplayName("Record 4038: Email is karin@baudino.com")
	void EmailOfRecord4038() {
		assertEquals("karin@baudino.com", customers.get(4037).getEmail());
	}

	@Test
	@DisplayName("Record 4038: Web is http://www.karinbaudino.com")
	void WebOfRecord4038() {
		assertEquals("http://www.karinbaudino.com", customers.get(4037).getWeb());
	}
}
