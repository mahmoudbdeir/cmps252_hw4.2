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

@Tag("26")
class Record_3004 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3004: FirstName is Tom")
	void FirstNameOfRecord3004() {
		assertEquals("Tom", customers.get(3003).getFirstName());
	}

	@Test
	@DisplayName("Record 3004: LastName is Reay")
	void LastNameOfRecord3004() {
		assertEquals("Reay", customers.get(3003).getLastName());
	}

	@Test
	@DisplayName("Record 3004: Company is Sunray Trade Bindery")
	void CompanyOfRecord3004() {
		assertEquals("Sunray Trade Bindery", customers.get(3003).getCompany());
	}

	@Test
	@DisplayName("Record 3004: Address is 3540 Stone Way N")
	void AddressOfRecord3004() {
		assertEquals("3540 Stone Way N", customers.get(3003).getAddress());
	}

	@Test
	@DisplayName("Record 3004: City is Seattle")
	void CityOfRecord3004() {
		assertEquals("Seattle", customers.get(3003).getCity());
	}

	@Test
	@DisplayName("Record 3004: County is King")
	void CountyOfRecord3004() {
		assertEquals("King", customers.get(3003).getCounty());
	}

	@Test
	@DisplayName("Record 3004: State is WA")
	void StateOfRecord3004() {
		assertEquals("WA", customers.get(3003).getState());
	}

	@Test
	@DisplayName("Record 3004: ZIP is 98103")
	void ZIPOfRecord3004() {
		assertEquals("98103", customers.get(3003).getZIP());
	}

	@Test
	@DisplayName("Record 3004: Phone is 206-634-1763")
	void PhoneOfRecord3004() {
		assertEquals("206-634-1763", customers.get(3003).getPhone());
	}

	@Test
	@DisplayName("Record 3004: Fax is 206-634-1169")
	void FaxOfRecord3004() {
		assertEquals("206-634-1169", customers.get(3003).getFax());
	}

	@Test
	@DisplayName("Record 3004: Email is tom@reay.com")
	void EmailOfRecord3004() {
		assertEquals("tom@reay.com", customers.get(3003).getEmail());
	}

	@Test
	@DisplayName("Record 3004: Web is http://www.tomreay.com")
	void WebOfRecord3004() {
		assertEquals("http://www.tomreay.com", customers.get(3003).getWeb());
	}
}
