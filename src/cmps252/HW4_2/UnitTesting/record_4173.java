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

@Tag("44")
class Record_4173 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4173: FirstName is Tamera")
	void FirstNameOfRecord4173() {
		assertEquals("Tamera", customers.get(4172).getFirstName());
	}

	@Test
	@DisplayName("Record 4173: LastName is Yanetta")
	void LastNameOfRecord4173() {
		assertEquals("Yanetta", customers.get(4172).getLastName());
	}

	@Test
	@DisplayName("Record 4173: Company is Mark Ross & Co")
	void CompanyOfRecord4173() {
		assertEquals("Mark Ross & Co", customers.get(4172).getCompany());
	}

	@Test
	@DisplayName("Record 4173: Address is 135 Broadway")
	void AddressOfRecord4173() {
		assertEquals("135 Broadway", customers.get(4172).getAddress());
	}

	@Test
	@DisplayName("Record 4173: City is Providence")
	void CityOfRecord4173() {
		assertEquals("Providence", customers.get(4172).getCity());
	}

	@Test
	@DisplayName("Record 4173: County is Providence")
	void CountyOfRecord4173() {
		assertEquals("Providence", customers.get(4172).getCounty());
	}

	@Test
	@DisplayName("Record 4173: State is RI")
	void StateOfRecord4173() {
		assertEquals("RI", customers.get(4172).getState());
	}

	@Test
	@DisplayName("Record 4173: ZIP is 2903")
	void ZIPOfRecord4173() {
		assertEquals("2903", customers.get(4172).getZIP());
	}

	@Test
	@DisplayName("Record 4173: Phone is 401-421-6758")
	void PhoneOfRecord4173() {
		assertEquals("401-421-6758", customers.get(4172).getPhone());
	}

	@Test
	@DisplayName("Record 4173: Fax is 401-421-4679")
	void FaxOfRecord4173() {
		assertEquals("401-421-4679", customers.get(4172).getFax());
	}

	@Test
	@DisplayName("Record 4173: Email is tamera@yanetta.com")
	void EmailOfRecord4173() {
		assertEquals("tamera@yanetta.com", customers.get(4172).getEmail());
	}

	@Test
	@DisplayName("Record 4173: Web is http://www.tamerayanetta.com")
	void WebOfRecord4173() {
		assertEquals("http://www.tamerayanetta.com", customers.get(4172).getWeb());
	}
}
