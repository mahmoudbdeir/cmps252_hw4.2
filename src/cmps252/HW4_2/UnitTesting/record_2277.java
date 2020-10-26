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

@Tag("6")
class Record_2277 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2277: FirstName is Wanda")
	void FirstNameOfRecord2277() {
		assertEquals("Wanda", customers.get(2276).getFirstName());
	}

	@Test
	@DisplayName("Record 2277: LastName is Westphalen")
	void LastNameOfRecord2277() {
		assertEquals("Westphalen", customers.get(2276).getLastName());
	}

	@Test
	@DisplayName("Record 2277: Company is Ward Machinery Co")
	void CompanyOfRecord2277() {
		assertEquals("Ward Machinery Co", customers.get(2276).getCompany());
	}

	@Test
	@DisplayName("Record 2277: Address is 15 Flanders Netcong Rd")
	void AddressOfRecord2277() {
		assertEquals("15 Flanders Netcong Rd", customers.get(2276).getAddress());
	}

	@Test
	@DisplayName("Record 2277: City is Flanders")
	void CityOfRecord2277() {
		assertEquals("Flanders", customers.get(2276).getCity());
	}

	@Test
	@DisplayName("Record 2277: County is Morris")
	void CountyOfRecord2277() {
		assertEquals("Morris", customers.get(2276).getCounty());
	}

	@Test
	@DisplayName("Record 2277: State is NJ")
	void StateOfRecord2277() {
		assertEquals("NJ", customers.get(2276).getState());
	}

	@Test
	@DisplayName("Record 2277: ZIP is 7836")
	void ZIPOfRecord2277() {
		assertEquals("7836", customers.get(2276).getZIP());
	}

	@Test
	@DisplayName("Record 2277: Phone is 973-347-8144")
	void PhoneOfRecord2277() {
		assertEquals("973-347-8144", customers.get(2276).getPhone());
	}

	@Test
	@DisplayName("Record 2277: Fax is 973-347-3508")
	void FaxOfRecord2277() {
		assertEquals("973-347-3508", customers.get(2276).getFax());
	}

	@Test
	@DisplayName("Record 2277: Email is wanda@westphalen.com")
	void EmailOfRecord2277() {
		assertEquals("wanda@westphalen.com", customers.get(2276).getEmail());
	}

	@Test
	@DisplayName("Record 2277: Web is http://www.wandawestphalen.com")
	void WebOfRecord2277() {
		assertEquals("http://www.wandawestphalen.com", customers.get(2276).getWeb());
	}
}
