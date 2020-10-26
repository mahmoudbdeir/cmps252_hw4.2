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

@Tag("45")
class Record_2498 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2498: FirstName is Clara")
	void FirstNameOfRecord2498() {
		assertEquals("Clara", customers.get(2497).getFirstName());
	}

	@Test
	@DisplayName("Record 2498: LastName is Strause")
	void LastNameOfRecord2498() {
		assertEquals("Strause", customers.get(2497).getLastName());
	}

	@Test
	@DisplayName("Record 2498: Company is Colony House Realtors")
	void CompanyOfRecord2498() {
		assertEquals("Colony House Realtors", customers.get(2497).getCompany());
	}

	@Test
	@DisplayName("Record 2498: Address is 412 Harrison Ave")
	void AddressOfRecord2498() {
		assertEquals("412 Harrison Ave", customers.get(2497).getAddress());
	}

	@Test
	@DisplayName("Record 2498: City is Harrison")
	void CityOfRecord2498() {
		assertEquals("Harrison", customers.get(2497).getCity());
	}

	@Test
	@DisplayName("Record 2498: County is Hudson")
	void CountyOfRecord2498() {
		assertEquals("Hudson", customers.get(2497).getCounty());
	}

	@Test
	@DisplayName("Record 2498: State is NJ")
	void StateOfRecord2498() {
		assertEquals("NJ", customers.get(2497).getState());
	}

	@Test
	@DisplayName("Record 2498: ZIP is 7029")
	void ZIPOfRecord2498() {
		assertEquals("7029", customers.get(2497).getZIP());
	}

	@Test
	@DisplayName("Record 2498: Phone is 973-623-8182")
	void PhoneOfRecord2498() {
		assertEquals("973-623-8182", customers.get(2497).getPhone());
	}

	@Test
	@DisplayName("Record 2498: Fax is 973-623-7301")
	void FaxOfRecord2498() {
		assertEquals("973-623-7301", customers.get(2497).getFax());
	}

	@Test
	@DisplayName("Record 2498: Email is clara@strause.com")
	void EmailOfRecord2498() {
		assertEquals("clara@strause.com", customers.get(2497).getEmail());
	}

	@Test
	@DisplayName("Record 2498: Web is http://www.clarastrause.com")
	void WebOfRecord2498() {
		assertEquals("http://www.clarastrause.com", customers.get(2497).getWeb());
	}
}
