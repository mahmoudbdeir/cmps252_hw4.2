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

@Tag("13")
class Record_499 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 499: FirstName is Jenny")
	void FirstNameOfRecord499() {
		assertEquals("Jenny", customers.get(498).getFirstName());
	}

	@Test
	@DisplayName("Record 499: LastName is Staubin")
	void LastNameOfRecord499() {
		assertEquals("Staubin", customers.get(498).getLastName());
	}

	@Test
	@DisplayName("Record 499: Company is Rebolini Drapery & Blinds")
	void CompanyOfRecord499() {
		assertEquals("Rebolini Drapery & Blinds", customers.get(498).getCompany());
	}

	@Test
	@DisplayName("Record 499: Address is 72200 Vista Chino")
	void AddressOfRecord499() {
		assertEquals("72200 Vista Chino", customers.get(498).getAddress());
	}

	@Test
	@DisplayName("Record 499: City is Thousand Palms")
	void CityOfRecord499() {
		assertEquals("Thousand Palms", customers.get(498).getCity());
	}

	@Test
	@DisplayName("Record 499: County is Riverside")
	void CountyOfRecord499() {
		assertEquals("Riverside", customers.get(498).getCounty());
	}

	@Test
	@DisplayName("Record 499: State is CA")
	void StateOfRecord499() {
		assertEquals("CA", customers.get(498).getState());
	}

	@Test
	@DisplayName("Record 499: ZIP is 92276")
	void ZIPOfRecord499() {
		assertEquals("92276", customers.get(498).getZIP());
	}

	@Test
	@DisplayName("Record 499: Phone is 760-343-1862")
	void PhoneOfRecord499() {
		assertEquals("760-343-1862", customers.get(498).getPhone());
	}

	@Test
	@DisplayName("Record 499: Fax is 760-343-7691")
	void FaxOfRecord499() {
		assertEquals("760-343-7691", customers.get(498).getFax());
	}

	@Test
	@DisplayName("Record 499: Email is jenny@staubin.com")
	void EmailOfRecord499() {
		assertEquals("jenny@staubin.com", customers.get(498).getEmail());
	}

	@Test
	@DisplayName("Record 499: Web is http://www.jennystaubin.com")
	void WebOfRecord499() {
		assertEquals("http://www.jennystaubin.com", customers.get(498).getWeb());
	}
}
