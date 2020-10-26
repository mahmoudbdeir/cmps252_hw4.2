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

@Tag("30")
class Record_2975 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2975: FirstName is Charlie")
	void FirstNameOfRecord2975() {
		assertEquals("Charlie", customers.get(2974).getFirstName());
	}

	@Test
	@DisplayName("Record 2975: LastName is Woskobojnik")
	void LastNameOfRecord2975() {
		assertEquals("Woskobojnik", customers.get(2974).getLastName());
	}

	@Test
	@DisplayName("Record 2975: Company is Direct Connection Inc")
	void CompanyOfRecord2975() {
		assertEquals("Direct Connection Inc", customers.get(2974).getCompany());
	}

	@Test
	@DisplayName("Record 2975: Address is 2410 W Jefferson Blvd")
	void AddressOfRecord2975() {
		assertEquals("2410 W Jefferson Blvd", customers.get(2974).getAddress());
	}

	@Test
	@DisplayName("Record 2975: City is Fort Wayne")
	void CityOfRecord2975() {
		assertEquals("Fort Wayne", customers.get(2974).getCity());
	}

	@Test
	@DisplayName("Record 2975: County is Allen")
	void CountyOfRecord2975() {
		assertEquals("Allen", customers.get(2974).getCounty());
	}

	@Test
	@DisplayName("Record 2975: State is IN")
	void StateOfRecord2975() {
		assertEquals("IN", customers.get(2974).getState());
	}

	@Test
	@DisplayName("Record 2975: ZIP is 46802")
	void ZIPOfRecord2975() {
		assertEquals("46802", customers.get(2974).getZIP());
	}

	@Test
	@DisplayName("Record 2975: Phone is 260-422-0361")
	void PhoneOfRecord2975() {
		assertEquals("260-422-0361", customers.get(2974).getPhone());
	}

	@Test
	@DisplayName("Record 2975: Fax is 260-422-1016")
	void FaxOfRecord2975() {
		assertEquals("260-422-1016", customers.get(2974).getFax());
	}

	@Test
	@DisplayName("Record 2975: Email is charlie@woskobojnik.com")
	void EmailOfRecord2975() {
		assertEquals("charlie@woskobojnik.com", customers.get(2974).getEmail());
	}

	@Test
	@DisplayName("Record 2975: Web is http://www.charliewoskobojnik.com")
	void WebOfRecord2975() {
		assertEquals("http://www.charliewoskobojnik.com", customers.get(2974).getWeb());
	}
}
