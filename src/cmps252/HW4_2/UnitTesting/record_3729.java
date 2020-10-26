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

@Tag("31")
class Record_3729 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3729: FirstName is Cassandra")
	void FirstNameOfRecord3729() {
		assertEquals("Cassandra", customers.get(3728).getFirstName());
	}

	@Test
	@DisplayName("Record 3729: LastName is Hinders")
	void LastNameOfRecord3729() {
		assertEquals("Hinders", customers.get(3728).getLastName());
	}

	@Test
	@DisplayName("Record 3729: Company is Winkler, Ronald C")
	void CompanyOfRecord3729() {
		assertEquals("Winkler, Ronald C", customers.get(3728).getCompany());
	}

	@Test
	@DisplayName("Record 3729: Address is 1015 E 8th St")
	void AddressOfRecord3729() {
		assertEquals("1015 E 8th St", customers.get(3728).getAddress());
	}

	@Test
	@DisplayName("Record 3729: City is Kansas City")
	void CityOfRecord3729() {
		assertEquals("Kansas City", customers.get(3728).getCity());
	}

	@Test
	@DisplayName("Record 3729: County is Jackson")
	void CountyOfRecord3729() {
		assertEquals("Jackson", customers.get(3728).getCounty());
	}

	@Test
	@DisplayName("Record 3729: State is MO")
	void StateOfRecord3729() {
		assertEquals("MO", customers.get(3728).getState());
	}

	@Test
	@DisplayName("Record 3729: ZIP is 64106")
	void ZIPOfRecord3729() {
		assertEquals("64106", customers.get(3728).getZIP());
	}

	@Test
	@DisplayName("Record 3729: Phone is 816-842-6652")
	void PhoneOfRecord3729() {
		assertEquals("816-842-6652", customers.get(3728).getPhone());
	}

	@Test
	@DisplayName("Record 3729: Fax is 816-842-1907")
	void FaxOfRecord3729() {
		assertEquals("816-842-1907", customers.get(3728).getFax());
	}

	@Test
	@DisplayName("Record 3729: Email is cassandra@hinders.com")
	void EmailOfRecord3729() {
		assertEquals("cassandra@hinders.com", customers.get(3728).getEmail());
	}

	@Test
	@DisplayName("Record 3729: Web is http://www.cassandrahinders.com")
	void WebOfRecord3729() {
		assertEquals("http://www.cassandrahinders.com", customers.get(3728).getWeb());
	}
}
