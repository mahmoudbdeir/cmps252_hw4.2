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

@Tag("2")
class Record_4241 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4241: FirstName is Daniel")
	void FirstNameOfRecord4241() {
		assertEquals("Daniel", customers.get(4240).getFirstName());
	}

	@Test
	@DisplayName("Record 4241: LastName is Alpern")
	void LastNameOfRecord4241() {
		assertEquals("Alpern", customers.get(4240).getLastName());
	}

	@Test
	@DisplayName("Record 4241: Company is Wtrc 1340 Am")
	void CompanyOfRecord4241() {
		assertEquals("Wtrc 1340 Am", customers.get(4240).getCompany());
	}

	@Test
	@DisplayName("Record 4241: Address is 4632 Georgetown Pl")
	void AddressOfRecord4241() {
		assertEquals("4632 Georgetown Pl", customers.get(4240).getAddress());
	}

	@Test
	@DisplayName("Record 4241: City is Stockton")
	void CityOfRecord4241() {
		assertEquals("Stockton", customers.get(4240).getCity());
	}

	@Test
	@DisplayName("Record 4241: County is San Joaquin")
	void CountyOfRecord4241() {
		assertEquals("San Joaquin", customers.get(4240).getCounty());
	}

	@Test
	@DisplayName("Record 4241: State is CA")
	void StateOfRecord4241() {
		assertEquals("CA", customers.get(4240).getState());
	}

	@Test
	@DisplayName("Record 4241: ZIP is 95207")
	void ZIPOfRecord4241() {
		assertEquals("95207", customers.get(4240).getZIP());
	}

	@Test
	@DisplayName("Record 4241: Phone is 209-474-5363")
	void PhoneOfRecord4241() {
		assertEquals("209-474-5363", customers.get(4240).getPhone());
	}

	@Test
	@DisplayName("Record 4241: Fax is 209-474-9552")
	void FaxOfRecord4241() {
		assertEquals("209-474-9552", customers.get(4240).getFax());
	}

	@Test
	@DisplayName("Record 4241: Email is daniel@alpern.com")
	void EmailOfRecord4241() {
		assertEquals("daniel@alpern.com", customers.get(4240).getEmail());
	}

	@Test
	@DisplayName("Record 4241: Web is http://www.danielalpern.com")
	void WebOfRecord4241() {
		assertEquals("http://www.danielalpern.com", customers.get(4240).getWeb());
	}
}
