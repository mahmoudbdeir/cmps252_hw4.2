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
class Record_3099 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3099: FirstName is Sam")
	void FirstNameOfRecord3099() {
		assertEquals("Sam", customers.get(3098).getFirstName());
	}

	@Test
	@DisplayName("Record 3099: LastName is Wride")
	void LastNameOfRecord3099() {
		assertEquals("Wride", customers.get(3098).getLastName());
	}

	@Test
	@DisplayName("Record 3099: Company is Brose Poswistilo & Elliott")
	void CompanyOfRecord3099() {
		assertEquals("Brose Poswistilo & Elliott", customers.get(3098).getCompany());
	}

	@Test
	@DisplayName("Record 3099: Address is 1 Hanover Rd")
	void AddressOfRecord3099() {
		assertEquals("1 Hanover Rd", customers.get(3098).getAddress());
	}

	@Test
	@DisplayName("Record 3099: City is Florham Park")
	void CityOfRecord3099() {
		assertEquals("Florham Park", customers.get(3098).getCity());
	}

	@Test
	@DisplayName("Record 3099: County is Morris")
	void CountyOfRecord3099() {
		assertEquals("Morris", customers.get(3098).getCounty());
	}

	@Test
	@DisplayName("Record 3099: State is NJ")
	void StateOfRecord3099() {
		assertEquals("NJ", customers.get(3098).getState());
	}

	@Test
	@DisplayName("Record 3099: ZIP is 7932")
	void ZIPOfRecord3099() {
		assertEquals("7932", customers.get(3098).getZIP());
	}

	@Test
	@DisplayName("Record 3099: Phone is 973-377-6233")
	void PhoneOfRecord3099() {
		assertEquals("973-377-6233", customers.get(3098).getPhone());
	}

	@Test
	@DisplayName("Record 3099: Fax is 973-377-1455")
	void FaxOfRecord3099() {
		assertEquals("973-377-1455", customers.get(3098).getFax());
	}

	@Test
	@DisplayName("Record 3099: Email is sam@wride.com")
	void EmailOfRecord3099() {
		assertEquals("sam@wride.com", customers.get(3098).getEmail());
	}

	@Test
	@DisplayName("Record 3099: Web is http://www.samwride.com")
	void WebOfRecord3099() {
		assertEquals("http://www.samwride.com", customers.get(3098).getWeb());
	}
}
