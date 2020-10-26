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
class Record_2445 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2445: FirstName is Elvia")
	void FirstNameOfRecord2445() {
		assertEquals("Elvia", customers.get(2444).getFirstName());
	}

	@Test
	@DisplayName("Record 2445: LastName is Krumwiede")
	void LastNameOfRecord2445() {
		assertEquals("Krumwiede", customers.get(2444).getLastName());
	}

	@Test
	@DisplayName("Record 2445: Company is Texoma Psychological Assn")
	void CompanyOfRecord2445() {
		assertEquals("Texoma Psychological Assn", customers.get(2444).getCompany());
	}

	@Test
	@DisplayName("Record 2445: Address is 10905 Beech Ave")
	void AddressOfRecord2445() {
		assertEquals("10905 Beech Ave", customers.get(2444).getAddress());
	}

	@Test
	@DisplayName("Record 2445: City is Fontana")
	void CityOfRecord2445() {
		assertEquals("Fontana", customers.get(2444).getCity());
	}

	@Test
	@DisplayName("Record 2445: County is San Bernardino")
	void CountyOfRecord2445() {
		assertEquals("San Bernardino", customers.get(2444).getCounty());
	}

	@Test
	@DisplayName("Record 2445: State is CA")
	void StateOfRecord2445() {
		assertEquals("CA", customers.get(2444).getState());
	}

	@Test
	@DisplayName("Record 2445: ZIP is 92337")
	void ZIPOfRecord2445() {
		assertEquals("92337", customers.get(2444).getZIP());
	}

	@Test
	@DisplayName("Record 2445: Phone is 909-823-6087")
	void PhoneOfRecord2445() {
		assertEquals("909-823-6087", customers.get(2444).getPhone());
	}

	@Test
	@DisplayName("Record 2445: Fax is 909-823-1441")
	void FaxOfRecord2445() {
		assertEquals("909-823-1441", customers.get(2444).getFax());
	}

	@Test
	@DisplayName("Record 2445: Email is elvia@krumwiede.com")
	void EmailOfRecord2445() {
		assertEquals("elvia@krumwiede.com", customers.get(2444).getEmail());
	}

	@Test
	@DisplayName("Record 2445: Web is http://www.elviakrumwiede.com")
	void WebOfRecord2445() {
		assertEquals("http://www.elviakrumwiede.com", customers.get(2444).getWeb());
	}
}
