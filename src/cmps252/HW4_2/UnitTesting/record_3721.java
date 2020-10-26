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

@Tag("42")
class Record_3721 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3721: FirstName is Willard")
	void FirstNameOfRecord3721() {
		assertEquals("Willard", customers.get(3720).getFirstName());
	}

	@Test
	@DisplayName("Record 3721: LastName is Muntean")
	void LastNameOfRecord3721() {
		assertEquals("Muntean", customers.get(3720).getLastName());
	}

	@Test
	@DisplayName("Record 3721: Company is Francis, Michael J Esq")
	void CompanyOfRecord3721() {
		assertEquals("Francis, Michael J Esq", customers.get(3720).getCompany());
	}

	@Test
	@DisplayName("Record 3721: Address is 5595 Federal Blvd")
	void AddressOfRecord3721() {
		assertEquals("5595 Federal Blvd", customers.get(3720).getAddress());
	}

	@Test
	@DisplayName("Record 3721: City is Denver")
	void CityOfRecord3721() {
		assertEquals("Denver", customers.get(3720).getCity());
	}

	@Test
	@DisplayName("Record 3721: County is Adams")
	void CountyOfRecord3721() {
		assertEquals("Adams", customers.get(3720).getCounty());
	}

	@Test
	@DisplayName("Record 3721: State is CO")
	void StateOfRecord3721() {
		assertEquals("CO", customers.get(3720).getState());
	}

	@Test
	@DisplayName("Record 3721: ZIP is 80221")
	void ZIPOfRecord3721() {
		assertEquals("80221", customers.get(3720).getZIP());
	}

	@Test
	@DisplayName("Record 3721: Phone is 303-477-0924")
	void PhoneOfRecord3721() {
		assertEquals("303-477-0924", customers.get(3720).getPhone());
	}

	@Test
	@DisplayName("Record 3721: Fax is 303-477-8639")
	void FaxOfRecord3721() {
		assertEquals("303-477-8639", customers.get(3720).getFax());
	}

	@Test
	@DisplayName("Record 3721: Email is willard@muntean.com")
	void EmailOfRecord3721() {
		assertEquals("willard@muntean.com", customers.get(3720).getEmail());
	}

	@Test
	@DisplayName("Record 3721: Web is http://www.willardmuntean.com")
	void WebOfRecord3721() {
		assertEquals("http://www.willardmuntean.com", customers.get(3720).getWeb());
	}
}
