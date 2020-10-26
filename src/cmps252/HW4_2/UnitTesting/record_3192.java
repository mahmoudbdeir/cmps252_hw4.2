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

@Tag("39")
class Record_3192 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3192: FirstName is Lavern")
	void FirstNameOfRecord3192() {
		assertEquals("Lavern", customers.get(3191).getFirstName());
	}

	@Test
	@DisplayName("Record 3192: LastName is Lighthart")
	void LastNameOfRecord3192() {
		assertEquals("Lighthart", customers.get(3191).getLastName());
	}

	@Test
	@DisplayName("Record 3192: Company is Magnuson, Kent N Esq")
	void CompanyOfRecord3192() {
		assertEquals("Magnuson, Kent N Esq", customers.get(3191).getCompany());
	}

	@Test
	@DisplayName("Record 3192: Address is 3440 Sierra Rd")
	void AddressOfRecord3192() {
		assertEquals("3440 Sierra Rd", customers.get(3191).getAddress());
	}

	@Test
	@DisplayName("Record 3192: City is San Jose")
	void CityOfRecord3192() {
		assertEquals("San Jose", customers.get(3191).getCity());
	}

	@Test
	@DisplayName("Record 3192: County is Santa Clara")
	void CountyOfRecord3192() {
		assertEquals("Santa Clara", customers.get(3191).getCounty());
	}

	@Test
	@DisplayName("Record 3192: State is CA")
	void StateOfRecord3192() {
		assertEquals("CA", customers.get(3191).getState());
	}

	@Test
	@DisplayName("Record 3192: ZIP is 95132")
	void ZIPOfRecord3192() {
		assertEquals("95132", customers.get(3191).getZIP());
	}

	@Test
	@DisplayName("Record 3192: Phone is 408-254-1701")
	void PhoneOfRecord3192() {
		assertEquals("408-254-1701", customers.get(3191).getPhone());
	}

	@Test
	@DisplayName("Record 3192: Fax is 408-254-0073")
	void FaxOfRecord3192() {
		assertEquals("408-254-0073", customers.get(3191).getFax());
	}

	@Test
	@DisplayName("Record 3192: Email is lavern@lighthart.com")
	void EmailOfRecord3192() {
		assertEquals("lavern@lighthart.com", customers.get(3191).getEmail());
	}

	@Test
	@DisplayName("Record 3192: Web is http://www.lavernlighthart.com")
	void WebOfRecord3192() {
		assertEquals("http://www.lavernlighthart.com", customers.get(3191).getWeb());
	}
}
