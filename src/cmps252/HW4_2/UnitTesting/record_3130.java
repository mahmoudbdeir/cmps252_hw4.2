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

@Tag("4")
class Record_3130 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3130: FirstName is Bruce")
	void FirstNameOfRecord3130() {
		assertEquals("Bruce", customers.get(3129).getFirstName());
	}

	@Test
	@DisplayName("Record 3130: LastName is Truka")
	void LastNameOfRecord3130() {
		assertEquals("Truka", customers.get(3129).getLastName());
	}

	@Test
	@DisplayName("Record 3130: Company is Corporon Hoehn Svitavsky")
	void CompanyOfRecord3130() {
		assertEquals("Corporon Hoehn Svitavsky", customers.get(3129).getCompany());
	}

	@Test
	@DisplayName("Record 3130: Address is 1745 114th Ave Se")
	void AddressOfRecord3130() {
		assertEquals("1745 114th Ave Se", customers.get(3129).getAddress());
	}

	@Test
	@DisplayName("Record 3130: City is Bellevue")
	void CityOfRecord3130() {
		assertEquals("Bellevue", customers.get(3129).getCity());
	}

	@Test
	@DisplayName("Record 3130: County is King")
	void CountyOfRecord3130() {
		assertEquals("King", customers.get(3129).getCounty());
	}

	@Test
	@DisplayName("Record 3130: State is WA")
	void StateOfRecord3130() {
		assertEquals("WA", customers.get(3129).getState());
	}

	@Test
	@DisplayName("Record 3130: ZIP is 98004")
	void ZIPOfRecord3130() {
		assertEquals("98004", customers.get(3129).getZIP());
	}

	@Test
	@DisplayName("Record 3130: Phone is 425-646-1439")
	void PhoneOfRecord3130() {
		assertEquals("425-646-1439", customers.get(3129).getPhone());
	}

	@Test
	@DisplayName("Record 3130: Fax is 425-646-6666")
	void FaxOfRecord3130() {
		assertEquals("425-646-6666", customers.get(3129).getFax());
	}

	@Test
	@DisplayName("Record 3130: Email is bruce@truka.com")
	void EmailOfRecord3130() {
		assertEquals("bruce@truka.com", customers.get(3129).getEmail());
	}

	@Test
	@DisplayName("Record 3130: Web is http://www.brucetruka.com")
	void WebOfRecord3130() {
		assertEquals("http://www.brucetruka.com", customers.get(3129).getWeb());
	}
}
