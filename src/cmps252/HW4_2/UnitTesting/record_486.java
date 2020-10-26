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

@Tag("22")
class Record_486 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 486: FirstName is Buck")
	void FirstNameOfRecord486() {
		assertEquals("Buck", customers.get(485).getFirstName());
	}

	@Test
	@DisplayName("Record 486: LastName is Tweet")
	void LastNameOfRecord486() {
		assertEquals("Tweet", customers.get(485).getLastName());
	}

	@Test
	@DisplayName("Record 486: Company is Design Depot Inc")
	void CompanyOfRecord486() {
		assertEquals("Design Depot Inc", customers.get(485).getCompany());
	}

	@Test
	@DisplayName("Record 486: Address is 12155 Magnolia Ave")
	void AddressOfRecord486() {
		assertEquals("12155 Magnolia Ave", customers.get(485).getAddress());
	}

	@Test
	@DisplayName("Record 486: City is Riverside")
	void CityOfRecord486() {
		assertEquals("Riverside", customers.get(485).getCity());
	}

	@Test
	@DisplayName("Record 486: County is Riverside")
	void CountyOfRecord486() {
		assertEquals("Riverside", customers.get(485).getCounty());
	}

	@Test
	@DisplayName("Record 486: State is CA")
	void StateOfRecord486() {
		assertEquals("CA", customers.get(485).getState());
	}

	@Test
	@DisplayName("Record 486: ZIP is 92503")
	void ZIPOfRecord486() {
		assertEquals("92503", customers.get(485).getZIP());
	}

	@Test
	@DisplayName("Record 486: Phone is 951-351-2858")
	void PhoneOfRecord486() {
		assertEquals("951-351-2858", customers.get(485).getPhone());
	}

	@Test
	@DisplayName("Record 486: Fax is 951-351-9229")
	void FaxOfRecord486() {
		assertEquals("951-351-9229", customers.get(485).getFax());
	}

	@Test
	@DisplayName("Record 486: Email is buck@tweet.com")
	void EmailOfRecord486() {
		assertEquals("buck@tweet.com", customers.get(485).getEmail());
	}

	@Test
	@DisplayName("Record 486: Web is http://www.bucktweet.com")
	void WebOfRecord486() {
		assertEquals("http://www.bucktweet.com", customers.get(485).getWeb());
	}
}
