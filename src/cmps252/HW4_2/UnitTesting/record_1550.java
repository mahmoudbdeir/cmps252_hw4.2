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

@Tag("3")
class Record_1550 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1550: FirstName is Therese")
	void FirstNameOfRecord1550() {
		assertEquals("Therese", customers.get(1549).getFirstName());
	}

	@Test
	@DisplayName("Record 1550: LastName is Scotto")
	void LastNameOfRecord1550() {
		assertEquals("Scotto", customers.get(1549).getLastName());
	}

	@Test
	@DisplayName("Record 1550: Company is Venn, Kathryn K Esq")
	void CompanyOfRecord1550() {
		assertEquals("Venn, Kathryn K Esq", customers.get(1549).getCompany());
	}

	@Test
	@DisplayName("Record 1550: Address is 200 New Rd")
	void AddressOfRecord1550() {
		assertEquals("200 New Rd", customers.get(1549).getAddress());
	}

	@Test
	@DisplayName("Record 1550: City is Linwood")
	void CityOfRecord1550() {
		assertEquals("Linwood", customers.get(1549).getCity());
	}

	@Test
	@DisplayName("Record 1550: County is Atlantic")
	void CountyOfRecord1550() {
		assertEquals("Atlantic", customers.get(1549).getCounty());
	}

	@Test
	@DisplayName("Record 1550: State is NJ")
	void StateOfRecord1550() {
		assertEquals("NJ", customers.get(1549).getState());
	}

	@Test
	@DisplayName("Record 1550: ZIP is 8221")
	void ZIPOfRecord1550() {
		assertEquals("8221", customers.get(1549).getZIP());
	}

	@Test
	@DisplayName("Record 1550: Phone is 609-927-2767")
	void PhoneOfRecord1550() {
		assertEquals("609-927-2767", customers.get(1549).getPhone());
	}

	@Test
	@DisplayName("Record 1550: Fax is 609-927-5449")
	void FaxOfRecord1550() {
		assertEquals("609-927-5449", customers.get(1549).getFax());
	}

	@Test
	@DisplayName("Record 1550: Email is therese@scotto.com")
	void EmailOfRecord1550() {
		assertEquals("therese@scotto.com", customers.get(1549).getEmail());
	}

	@Test
	@DisplayName("Record 1550: Web is http://www.theresescotto.com")
	void WebOfRecord1550() {
		assertEquals("http://www.theresescotto.com", customers.get(1549).getWeb());
	}
}
