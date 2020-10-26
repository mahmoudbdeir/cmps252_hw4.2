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

@Tag("43")
class Record_2416 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2416: FirstName is Donald")
	void FirstNameOfRecord2416() {
		assertEquals("Donald", customers.get(2415).getFirstName());
	}

	@Test
	@DisplayName("Record 2416: LastName is Ronson")
	void LastNameOfRecord2416() {
		assertEquals("Ronson", customers.get(2415).getLastName());
	}

	@Test
	@DisplayName("Record 2416: Company is Cerebral Palsy Assn Grtr Ks Cy")
	void CompanyOfRecord2416() {
		assertEquals("Cerebral Palsy Assn Grtr Ks Cy", customers.get(2415).getCompany());
	}

	@Test
	@DisplayName("Record 2416: Address is 3525 Broad St")
	void AddressOfRecord2416() {
		assertEquals("3525 Broad St", customers.get(2415).getAddress());
	}

	@Test
	@DisplayName("Record 2416: City is Atlanta")
	void CityOfRecord2416() {
		assertEquals("Atlanta", customers.get(2415).getCity());
	}

	@Test
	@DisplayName("Record 2416: County is Dekalb")
	void CountyOfRecord2416() {
		assertEquals("Dekalb", customers.get(2415).getCounty());
	}

	@Test
	@DisplayName("Record 2416: State is GA")
	void StateOfRecord2416() {
		assertEquals("GA", customers.get(2415).getState());
	}

	@Test
	@DisplayName("Record 2416: ZIP is 30341")
	void ZIPOfRecord2416() {
		assertEquals("30341", customers.get(2415).getZIP());
	}

	@Test
	@DisplayName("Record 2416: Phone is 770-320-7304")
	void PhoneOfRecord2416() {
		assertEquals("770-320-7304", customers.get(2415).getPhone());
	}

	@Test
	@DisplayName("Record 2416: Fax is 770-320-0216")
	void FaxOfRecord2416() {
		assertEquals("770-320-0216", customers.get(2415).getFax());
	}

	@Test
	@DisplayName("Record 2416: Email is donald@ronson.com")
	void EmailOfRecord2416() {
		assertEquals("donald@ronson.com", customers.get(2415).getEmail());
	}

	@Test
	@DisplayName("Record 2416: Web is http://www.donaldronson.com")
	void WebOfRecord2416() {
		assertEquals("http://www.donaldronson.com", customers.get(2415).getWeb());
	}
}
