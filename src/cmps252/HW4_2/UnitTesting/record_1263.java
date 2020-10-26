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
class Record_1263 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1263: FirstName is Joann")
	void FirstNameOfRecord1263() {
		assertEquals("Joann", customers.get(1262).getFirstName());
	}

	@Test
	@DisplayName("Record 1263: LastName is Kuehl")
	void LastNameOfRecord1263() {
		assertEquals("Kuehl", customers.get(1262).getLastName());
	}

	@Test
	@DisplayName("Record 1263: Company is Littman Thomas Agency Inc")
	void CompanyOfRecord1263() {
		assertEquals("Littman Thomas Agency Inc", customers.get(1262).getCompany());
	}

	@Test
	@DisplayName("Record 1263: Address is 2237 E Victory Dr")
	void AddressOfRecord1263() {
		assertEquals("2237 E Victory Dr", customers.get(1262).getAddress());
	}

	@Test
	@DisplayName("Record 1263: City is Savannah")
	void CityOfRecord1263() {
		assertEquals("Savannah", customers.get(1262).getCity());
	}

	@Test
	@DisplayName("Record 1263: County is Chatham")
	void CountyOfRecord1263() {
		assertEquals("Chatham", customers.get(1262).getCounty());
	}

	@Test
	@DisplayName("Record 1263: State is GA")
	void StateOfRecord1263() {
		assertEquals("GA", customers.get(1262).getState());
	}

	@Test
	@DisplayName("Record 1263: ZIP is 31404")
	void ZIPOfRecord1263() {
		assertEquals("31404", customers.get(1262).getZIP());
	}

	@Test
	@DisplayName("Record 1263: Phone is 912-354-4173")
	void PhoneOfRecord1263() {
		assertEquals("912-354-4173", customers.get(1262).getPhone());
	}

	@Test
	@DisplayName("Record 1263: Fax is 912-354-0683")
	void FaxOfRecord1263() {
		assertEquals("912-354-0683", customers.get(1262).getFax());
	}

	@Test
	@DisplayName("Record 1263: Email is joann@kuehl.com")
	void EmailOfRecord1263() {
		assertEquals("joann@kuehl.com", customers.get(1262).getEmail());
	}

	@Test
	@DisplayName("Record 1263: Web is http://www.joannkuehl.com")
	void WebOfRecord1263() {
		assertEquals("http://www.joannkuehl.com", customers.get(1262).getWeb());
	}
}
