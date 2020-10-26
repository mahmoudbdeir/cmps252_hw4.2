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
class Record_3071 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3071: FirstName is Gil")
	void FirstNameOfRecord3071() {
		assertEquals("Gil", customers.get(3070).getFirstName());
	}

	@Test
	@DisplayName("Record 3071: LastName is Juedes")
	void LastNameOfRecord3071() {
		assertEquals("Juedes", customers.get(3070).getLastName());
	}

	@Test
	@DisplayName("Record 3071: Company is Ace Bookkeeping & Tax Service")
	void CompanyOfRecord3071() {
		assertEquals("Ace Bookkeeping & Tax Service", customers.get(3070).getCompany());
	}

	@Test
	@DisplayName("Record 3071: Address is 14458 Ventura Blvd")
	void AddressOfRecord3071() {
		assertEquals("14458 Ventura Blvd", customers.get(3070).getAddress());
	}

	@Test
	@DisplayName("Record 3071: City is Sherman Oaks")
	void CityOfRecord3071() {
		assertEquals("Sherman Oaks", customers.get(3070).getCity());
	}

	@Test
	@DisplayName("Record 3071: County is Los Angeles")
	void CountyOfRecord3071() {
		assertEquals("Los Angeles", customers.get(3070).getCounty());
	}

	@Test
	@DisplayName("Record 3071: State is CA")
	void StateOfRecord3071() {
		assertEquals("CA", customers.get(3070).getState());
	}

	@Test
	@DisplayName("Record 3071: ZIP is 91423")
	void ZIPOfRecord3071() {
		assertEquals("91423", customers.get(3070).getZIP());
	}

	@Test
	@DisplayName("Record 3071: Phone is 818-784-1977")
	void PhoneOfRecord3071() {
		assertEquals("818-784-1977", customers.get(3070).getPhone());
	}

	@Test
	@DisplayName("Record 3071: Fax is 818-784-8634")
	void FaxOfRecord3071() {
		assertEquals("818-784-8634", customers.get(3070).getFax());
	}

	@Test
	@DisplayName("Record 3071: Email is gil@juedes.com")
	void EmailOfRecord3071() {
		assertEquals("gil@juedes.com", customers.get(3070).getEmail());
	}

	@Test
	@DisplayName("Record 3071: Web is http://www.giljuedes.com")
	void WebOfRecord3071() {
		assertEquals("http://www.giljuedes.com", customers.get(3070).getWeb());
	}
}
