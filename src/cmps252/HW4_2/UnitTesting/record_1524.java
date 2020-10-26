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

@Tag("48")
class Record_1524 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1524: FirstName is Molly")
	void FirstNameOfRecord1524() {
		assertEquals("Molly", customers.get(1523).getFirstName());
	}

	@Test
	@DisplayName("Record 1524: LastName is Lanzillotti")
	void LastNameOfRecord1524() {
		assertEquals("Lanzillotti", customers.get(1523).getLastName());
	}

	@Test
	@DisplayName("Record 1524: Company is Mcmillan, Robert Donald Jr")
	void CompanyOfRecord1524() {
		assertEquals("Mcmillan, Robert Donald Jr", customers.get(1523).getCompany());
	}

	@Test
	@DisplayName("Record 1524: Address is 12843 Ne 14th Pl")
	void AddressOfRecord1524() {
		assertEquals("12843 Ne 14th Pl", customers.get(1523).getAddress());
	}

	@Test
	@DisplayName("Record 1524: City is Bellevue")
	void CityOfRecord1524() {
		assertEquals("Bellevue", customers.get(1523).getCity());
	}

	@Test
	@DisplayName("Record 1524: County is King")
	void CountyOfRecord1524() {
		assertEquals("King", customers.get(1523).getCounty());
	}

	@Test
	@DisplayName("Record 1524: State is WA")
	void StateOfRecord1524() {
		assertEquals("WA", customers.get(1523).getState());
	}

	@Test
	@DisplayName("Record 1524: ZIP is 98005")
	void ZIPOfRecord1524() {
		assertEquals("98005", customers.get(1523).getZIP());
	}

	@Test
	@DisplayName("Record 1524: Phone is 425-454-3340")
	void PhoneOfRecord1524() {
		assertEquals("425-454-3340", customers.get(1523).getPhone());
	}

	@Test
	@DisplayName("Record 1524: Fax is 425-454-2743")
	void FaxOfRecord1524() {
		assertEquals("425-454-2743", customers.get(1523).getFax());
	}

	@Test
	@DisplayName("Record 1524: Email is molly@lanzillotti.com")
	void EmailOfRecord1524() {
		assertEquals("molly@lanzillotti.com", customers.get(1523).getEmail());
	}

	@Test
	@DisplayName("Record 1524: Web is http://www.mollylanzillotti.com")
	void WebOfRecord1524() {
		assertEquals("http://www.mollylanzillotti.com", customers.get(1523).getWeb());
	}
}
