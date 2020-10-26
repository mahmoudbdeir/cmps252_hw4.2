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

@Tag("12")
class Record_1730 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1730: FirstName is Luigi")
	void FirstNameOfRecord1730() {
		assertEquals("Luigi", customers.get(1729).getFirstName());
	}

	@Test
	@DisplayName("Record 1730: LastName is Vanetta")
	void LastNameOfRecord1730() {
		assertEquals("Vanetta", customers.get(1729).getLastName());
	}

	@Test
	@DisplayName("Record 1730: Company is Water Purification Filter Co")
	void CompanyOfRecord1730() {
		assertEquals("Water Purification Filter Co", customers.get(1729).getCompany());
	}

	@Test
	@DisplayName("Record 1730: Address is Minaret Village")
	void AddressOfRecord1730() {
		assertEquals("Minaret Village", customers.get(1729).getAddress());
	}

	@Test
	@DisplayName("Record 1730: City is Mammoth Lakes")
	void CityOfRecord1730() {
		assertEquals("Mammoth Lakes", customers.get(1729).getCity());
	}

	@Test
	@DisplayName("Record 1730: County is Mono")
	void CountyOfRecord1730() {
		assertEquals("Mono", customers.get(1729).getCounty());
	}

	@Test
	@DisplayName("Record 1730: State is CA")
	void StateOfRecord1730() {
		assertEquals("CA", customers.get(1729).getState());
	}

	@Test
	@DisplayName("Record 1730: ZIP is 93546")
	void ZIPOfRecord1730() {
		assertEquals("93546", customers.get(1729).getZIP());
	}

	@Test
	@DisplayName("Record 1730: Phone is 760-934-5498")
	void PhoneOfRecord1730() {
		assertEquals("760-934-5498", customers.get(1729).getPhone());
	}

	@Test
	@DisplayName("Record 1730: Fax is 760-934-3146")
	void FaxOfRecord1730() {
		assertEquals("760-934-3146", customers.get(1729).getFax());
	}

	@Test
	@DisplayName("Record 1730: Email is luigi@vanetta.com")
	void EmailOfRecord1730() {
		assertEquals("luigi@vanetta.com", customers.get(1729).getEmail());
	}

	@Test
	@DisplayName("Record 1730: Web is http://www.luigivanetta.com")
	void WebOfRecord1730() {
		assertEquals("http://www.luigivanetta.com", customers.get(1729).getWeb());
	}
}
