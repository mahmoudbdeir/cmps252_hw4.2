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

@Tag("18")
class Record_2052 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2052: FirstName is Jefferey")
	void FirstNameOfRecord2052() {
		assertEquals("Jefferey", customers.get(2051).getFirstName());
	}

	@Test
	@DisplayName("Record 2052: LastName is Graniero")
	void LastNameOfRecord2052() {
		assertEquals("Graniero", customers.get(2051).getLastName());
	}

	@Test
	@DisplayName("Record 2052: Company is Utility Tool & Body Co")
	void CompanyOfRecord2052() {
		assertEquals("Utility Tool & Body Co", customers.get(2051).getCompany());
	}

	@Test
	@DisplayName("Record 2052: Address is 2002 S Center St")
	void AddressOfRecord2052() {
		assertEquals("2002 S Center St", customers.get(2051).getAddress());
	}

	@Test
	@DisplayName("Record 2052: City is Tacoma")
	void CityOfRecord2052() {
		assertEquals("Tacoma", customers.get(2051).getCity());
	}

	@Test
	@DisplayName("Record 2052: County is Pierce")
	void CountyOfRecord2052() {
		assertEquals("Pierce", customers.get(2051).getCounty());
	}

	@Test
	@DisplayName("Record 2052: State is WA")
	void StateOfRecord2052() {
		assertEquals("WA", customers.get(2051).getState());
	}

	@Test
	@DisplayName("Record 2052: ZIP is 98409")
	void ZIPOfRecord2052() {
		assertEquals("98409", customers.get(2051).getZIP());
	}

	@Test
	@DisplayName("Record 2052: Phone is 253-572-3092")
	void PhoneOfRecord2052() {
		assertEquals("253-572-3092", customers.get(2051).getPhone());
	}

	@Test
	@DisplayName("Record 2052: Fax is 253-572-0514")
	void FaxOfRecord2052() {
		assertEquals("253-572-0514", customers.get(2051).getFax());
	}

	@Test
	@DisplayName("Record 2052: Email is jefferey@graniero.com")
	void EmailOfRecord2052() {
		assertEquals("jefferey@graniero.com", customers.get(2051).getEmail());
	}

	@Test
	@DisplayName("Record 2052: Web is http://www.jeffereygraniero.com")
	void WebOfRecord2052() {
		assertEquals("http://www.jeffereygraniero.com", customers.get(2051).getWeb());
	}
}
