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

@Tag("34")
class Record_3137 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3137: FirstName is Rosalind")
	void FirstNameOfRecord3137() {
		assertEquals("Rosalind", customers.get(3136).getFirstName());
	}

	@Test
	@DisplayName("Record 3137: LastName is Macklem")
	void LastNameOfRecord3137() {
		assertEquals("Macklem", customers.get(3136).getLastName());
	}

	@Test
	@DisplayName("Record 3137: Company is Evergreen Real Estate")
	void CompanyOfRecord3137() {
		assertEquals("Evergreen Real Estate", customers.get(3136).getCompany());
	}

	@Test
	@DisplayName("Record 3137: Address is 725 Cloud Springs Rd")
	void AddressOfRecord3137() {
		assertEquals("725 Cloud Springs Rd", customers.get(3136).getAddress());
	}

	@Test
	@DisplayName("Record 3137: City is Rossville")
	void CityOfRecord3137() {
		assertEquals("Rossville", customers.get(3136).getCity());
	}

	@Test
	@DisplayName("Record 3137: County is Walker")
	void CountyOfRecord3137() {
		assertEquals("Walker", customers.get(3136).getCounty());
	}

	@Test
	@DisplayName("Record 3137: State is GA")
	void StateOfRecord3137() {
		assertEquals("GA", customers.get(3136).getState());
	}

	@Test
	@DisplayName("Record 3137: ZIP is 30741")
	void ZIPOfRecord3137() {
		assertEquals("30741", customers.get(3136).getZIP());
	}

	@Test
	@DisplayName("Record 3137: Phone is 706-866-5329")
	void PhoneOfRecord3137() {
		assertEquals("706-866-5329", customers.get(3136).getPhone());
	}

	@Test
	@DisplayName("Record 3137: Fax is 706-866-3228")
	void FaxOfRecord3137() {
		assertEquals("706-866-3228", customers.get(3136).getFax());
	}

	@Test
	@DisplayName("Record 3137: Email is rosalind@macklem.com")
	void EmailOfRecord3137() {
		assertEquals("rosalind@macklem.com", customers.get(3136).getEmail());
	}

	@Test
	@DisplayName("Record 3137: Web is http://www.rosalindmacklem.com")
	void WebOfRecord3137() {
		assertEquals("http://www.rosalindmacklem.com", customers.get(3136).getWeb());
	}
}
