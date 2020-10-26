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

@Tag("19")
class Record_4365 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4365: FirstName is Christin")
	void FirstNameOfRecord4365() {
		assertEquals("Christin", customers.get(4364).getFirstName());
	}

	@Test
	@DisplayName("Record 4365: LastName is Streczywilk")
	void LastNameOfRecord4365() {
		assertEquals("Streczywilk", customers.get(4364).getLastName());
	}

	@Test
	@DisplayName("Record 4365: Company is Uniglobe Travel")
	void CompanyOfRecord4365() {
		assertEquals("Uniglobe Travel", customers.get(4364).getCompany());
	}

	@Test
	@DisplayName("Record 4365: Address is 44 Montgomery St")
	void AddressOfRecord4365() {
		assertEquals("44 Montgomery St", customers.get(4364).getAddress());
	}

	@Test
	@DisplayName("Record 4365: City is San Francisco")
	void CityOfRecord4365() {
		assertEquals("San Francisco", customers.get(4364).getCity());
	}

	@Test
	@DisplayName("Record 4365: County is San Francisco")
	void CountyOfRecord4365() {
		assertEquals("San Francisco", customers.get(4364).getCounty());
	}

	@Test
	@DisplayName("Record 4365: State is CA")
	void StateOfRecord4365() {
		assertEquals("CA", customers.get(4364).getState());
	}

	@Test
	@DisplayName("Record 4365: ZIP is 94104")
	void ZIPOfRecord4365() {
		assertEquals("94104", customers.get(4364).getZIP());
	}

	@Test
	@DisplayName("Record 4365: Phone is 415-421-6259")
	void PhoneOfRecord4365() {
		assertEquals("415-421-6259", customers.get(4364).getPhone());
	}

	@Test
	@DisplayName("Record 4365: Fax is 415-421-2457")
	void FaxOfRecord4365() {
		assertEquals("415-421-2457", customers.get(4364).getFax());
	}

	@Test
	@DisplayName("Record 4365: Email is christin@streczywilk.com")
	void EmailOfRecord4365() {
		assertEquals("christin@streczywilk.com", customers.get(4364).getEmail());
	}

	@Test
	@DisplayName("Record 4365: Web is http://www.christinstreczywilk.com")
	void WebOfRecord4365() {
		assertEquals("http://www.christinstreczywilk.com", customers.get(4364).getWeb());
	}
}
