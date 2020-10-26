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

@Tag("28")
class Record_1526 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1526: FirstName is Lauretta")
	void FirstNameOfRecord1526() {
		assertEquals("Lauretta", customers.get(1525).getFirstName());
	}

	@Test
	@DisplayName("Record 1526: LastName is Skirvin")
	void LastNameOfRecord1526() {
		assertEquals("Skirvin", customers.get(1525).getLastName());
	}

	@Test
	@DisplayName("Record 1526: Company is Barnies Coffee & Tea Co Inc")
	void CompanyOfRecord1526() {
		assertEquals("Barnies Coffee & Tea Co Inc", customers.get(1525).getCompany());
	}

	@Test
	@DisplayName("Record 1526: Address is 940 Town Center Dr")
	void AddressOfRecord1526() {
		assertEquals("940 Town Center Dr", customers.get(1525).getAddress());
	}

	@Test
	@DisplayName("Record 1526: City is Langhorne")
	void CityOfRecord1526() {
		assertEquals("Langhorne", customers.get(1525).getCity());
	}

	@Test
	@DisplayName("Record 1526: County is Bucks")
	void CountyOfRecord1526() {
		assertEquals("Bucks", customers.get(1525).getCounty());
	}

	@Test
	@DisplayName("Record 1526: State is PA")
	void StateOfRecord1526() {
		assertEquals("PA", customers.get(1525).getState());
	}

	@Test
	@DisplayName("Record 1526: ZIP is 19047")
	void ZIPOfRecord1526() {
		assertEquals("19047", customers.get(1525).getZIP());
	}

	@Test
	@DisplayName("Record 1526: Phone is 215-741-8657")
	void PhoneOfRecord1526() {
		assertEquals("215-741-8657", customers.get(1525).getPhone());
	}

	@Test
	@DisplayName("Record 1526: Fax is 215-741-0691")
	void FaxOfRecord1526() {
		assertEquals("215-741-0691", customers.get(1525).getFax());
	}

	@Test
	@DisplayName("Record 1526: Email is lauretta@skirvin.com")
	void EmailOfRecord1526() {
		assertEquals("lauretta@skirvin.com", customers.get(1525).getEmail());
	}

	@Test
	@DisplayName("Record 1526: Web is http://www.laurettaskirvin.com")
	void WebOfRecord1526() {
		assertEquals("http://www.laurettaskirvin.com", customers.get(1525).getWeb());
	}
}
