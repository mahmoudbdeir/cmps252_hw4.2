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
class Record_3314 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3314: FirstName is Emory")
	void FirstNameOfRecord3314() {
		assertEquals("Emory", customers.get(3313).getFirstName());
	}

	@Test
	@DisplayName("Record 3314: LastName is Mastroianni")
	void LastNameOfRecord3314() {
		assertEquals("Mastroianni", customers.get(3313).getLastName());
	}

	@Test
	@DisplayName("Record 3314: Company is Brummel, Phillip J")
	void CompanyOfRecord3314() {
		assertEquals("Brummel, Phillip J", customers.get(3313).getCompany());
	}

	@Test
	@DisplayName("Record 3314: Address is 270 Benton Dr")
	void AddressOfRecord3314() {
		assertEquals("270 Benton Dr", customers.get(3313).getAddress());
	}

	@Test
	@DisplayName("Record 3314: City is East Longmeadow")
	void CityOfRecord3314() {
		assertEquals("East Longmeadow", customers.get(3313).getCity());
	}

	@Test
	@DisplayName("Record 3314: County is Hampden")
	void CountyOfRecord3314() {
		assertEquals("Hampden", customers.get(3313).getCounty());
	}

	@Test
	@DisplayName("Record 3314: State is MA")
	void StateOfRecord3314() {
		assertEquals("MA", customers.get(3313).getState());
	}

	@Test
	@DisplayName("Record 3314: ZIP is 1028")
	void ZIPOfRecord3314() {
		assertEquals("1028", customers.get(3313).getZIP());
	}

	@Test
	@DisplayName("Record 3314: Phone is 413-525-0996")
	void PhoneOfRecord3314() {
		assertEquals("413-525-0996", customers.get(3313).getPhone());
	}

	@Test
	@DisplayName("Record 3314: Fax is 413-525-0555")
	void FaxOfRecord3314() {
		assertEquals("413-525-0555", customers.get(3313).getFax());
	}

	@Test
	@DisplayName("Record 3314: Email is emory@mastroianni.com")
	void EmailOfRecord3314() {
		assertEquals("emory@mastroianni.com", customers.get(3313).getEmail());
	}

	@Test
	@DisplayName("Record 3314: Web is http://www.emorymastroianni.com")
	void WebOfRecord3314() {
		assertEquals("http://www.emorymastroianni.com", customers.get(3313).getWeb());
	}
}
