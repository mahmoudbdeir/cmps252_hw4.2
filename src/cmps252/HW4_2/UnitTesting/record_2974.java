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

@Tag("10")
class Record_2974 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2974: FirstName is Edmundo")
	void FirstNameOfRecord2974() {
		assertEquals("Edmundo", customers.get(2973).getFirstName());
	}

	@Test
	@DisplayName("Record 2974: LastName is Hemond")
	void LastNameOfRecord2974() {
		assertEquals("Hemond", customers.get(2973).getLastName());
	}

	@Test
	@DisplayName("Record 2974: Company is Armstrong State College")
	void CompanyOfRecord2974() {
		assertEquals("Armstrong State College", customers.get(2973).getCompany());
	}

	@Test
	@DisplayName("Record 2974: Address is 210 Beacham St")
	void AddressOfRecord2974() {
		assertEquals("210 Beacham St", customers.get(2973).getAddress());
	}

	@Test
	@DisplayName("Record 2974: City is Everett")
	void CityOfRecord2974() {
		assertEquals("Everett", customers.get(2973).getCity());
	}

	@Test
	@DisplayName("Record 2974: County is Middlesex")
	void CountyOfRecord2974() {
		assertEquals("Middlesex", customers.get(2973).getCounty());
	}

	@Test
	@DisplayName("Record 2974: State is MA")
	void StateOfRecord2974() {
		assertEquals("MA", customers.get(2973).getState());
	}

	@Test
	@DisplayName("Record 2974: ZIP is 2149")
	void ZIPOfRecord2974() {
		assertEquals("2149", customers.get(2973).getZIP());
	}

	@Test
	@DisplayName("Record 2974: Phone is 617-387-2129")
	void PhoneOfRecord2974() {
		assertEquals("617-387-2129", customers.get(2973).getPhone());
	}

	@Test
	@DisplayName("Record 2974: Fax is 617-387-2006")
	void FaxOfRecord2974() {
		assertEquals("617-387-2006", customers.get(2973).getFax());
	}

	@Test
	@DisplayName("Record 2974: Email is edmundo@hemond.com")
	void EmailOfRecord2974() {
		assertEquals("edmundo@hemond.com", customers.get(2973).getEmail());
	}

	@Test
	@DisplayName("Record 2974: Web is http://www.edmundohemond.com")
	void WebOfRecord2974() {
		assertEquals("http://www.edmundohemond.com", customers.get(2973).getWeb());
	}
}
