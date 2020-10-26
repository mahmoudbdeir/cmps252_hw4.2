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

@Tag("8")
class Record_2107 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2107: FirstName is Collin")
	void FirstNameOfRecord2107() {
		assertEquals("Collin", customers.get(2106).getFirstName());
	}

	@Test
	@DisplayName("Record 2107: LastName is Shambaugh")
	void LastNameOfRecord2107() {
		assertEquals("Shambaugh", customers.get(2106).getLastName());
	}

	@Test
	@DisplayName("Record 2107: Company is Sun Gazette")
	void CompanyOfRecord2107() {
		assertEquals("Sun Gazette", customers.get(2106).getCompany());
	}

	@Test
	@DisplayName("Record 2107: Address is 650 Shady Ln")
	void AddressOfRecord2107() {
		assertEquals("650 Shady Ln", customers.get(2106).getAddress());
	}

	@Test
	@DisplayName("Record 2107: City is Fairfield")
	void CityOfRecord2107() {
		assertEquals("Fairfield", customers.get(2106).getCity());
	}

	@Test
	@DisplayName("Record 2107: County is Butler")
	void CountyOfRecord2107() {
		assertEquals("Butler", customers.get(2106).getCounty());
	}

	@Test
	@DisplayName("Record 2107: State is OH")
	void StateOfRecord2107() {
		assertEquals("OH", customers.get(2106).getState());
	}

	@Test
	@DisplayName("Record 2107: ZIP is 45014")
	void ZIPOfRecord2107() {
		assertEquals("45014", customers.get(2106).getZIP());
	}

	@Test
	@DisplayName("Record 2107: Phone is 513-829-8464")
	void PhoneOfRecord2107() {
		assertEquals("513-829-8464", customers.get(2106).getPhone());
	}

	@Test
	@DisplayName("Record 2107: Fax is 513-829-2439")
	void FaxOfRecord2107() {
		assertEquals("513-829-2439", customers.get(2106).getFax());
	}

	@Test
	@DisplayName("Record 2107: Email is collin@shambaugh.com")
	void EmailOfRecord2107() {
		assertEquals("collin@shambaugh.com", customers.get(2106).getEmail());
	}

	@Test
	@DisplayName("Record 2107: Web is http://www.collinshambaugh.com")
	void WebOfRecord2107() {
		assertEquals("http://www.collinshambaugh.com", customers.get(2106).getWeb());
	}
}
