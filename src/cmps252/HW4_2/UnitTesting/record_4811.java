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

@Tag("29")
class Record_4811 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4811: FirstName is Ramona")
	void FirstNameOfRecord4811() {
		assertEquals("Ramona", customers.get(4810).getFirstName());
	}

	@Test
	@DisplayName("Record 4811: LastName is Wilshire")
	void LastNameOfRecord4811() {
		assertEquals("Wilshire", customers.get(4810).getLastName());
	}

	@Test
	@DisplayName("Record 4811: Company is Brailsford Associates Inc")
	void CompanyOfRecord4811() {
		assertEquals("Brailsford Associates Inc", customers.get(4810).getCompany());
	}

	@Test
	@DisplayName("Record 4811: Address is 1406 B Wilson Rd")
	void AddressOfRecord4811() {
		assertEquals("1406 B Wilson Rd", customers.get(4810).getAddress());
	}

	@Test
	@DisplayName("Record 4811: City is Conroe")
	void CityOfRecord4811() {
		assertEquals("Conroe", customers.get(4810).getCity());
	}

	@Test
	@DisplayName("Record 4811: County is Montgomery")
	void CountyOfRecord4811() {
		assertEquals("Montgomery", customers.get(4810).getCounty());
	}

	@Test
	@DisplayName("Record 4811: State is TX")
	void StateOfRecord4811() {
		assertEquals("TX", customers.get(4810).getState());
	}

	@Test
	@DisplayName("Record 4811: ZIP is 77304")
	void ZIPOfRecord4811() {
		assertEquals("77304", customers.get(4810).getZIP());
	}

	@Test
	@DisplayName("Record 4811: Phone is 936-756-2753")
	void PhoneOfRecord4811() {
		assertEquals("936-756-2753", customers.get(4810).getPhone());
	}

	@Test
	@DisplayName("Record 4811: Fax is 936-756-7256")
	void FaxOfRecord4811() {
		assertEquals("936-756-7256", customers.get(4810).getFax());
	}

	@Test
	@DisplayName("Record 4811: Email is ramona@wilshire.com")
	void EmailOfRecord4811() {
		assertEquals("ramona@wilshire.com", customers.get(4810).getEmail());
	}

	@Test
	@DisplayName("Record 4811: Web is http://www.ramonawilshire.com")
	void WebOfRecord4811() {
		assertEquals("http://www.ramonawilshire.com", customers.get(4810).getWeb());
	}
}
