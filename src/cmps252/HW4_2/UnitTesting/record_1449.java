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

@Tag("36")
class Record_1449 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1449: FirstName is Tim")
	void FirstNameOfRecord1449() {
		assertEquals("Tim", customers.get(1448).getFirstName());
	}

	@Test
	@DisplayName("Record 1449: LastName is Lalonde")
	void LastNameOfRecord1449() {
		assertEquals("Lalonde", customers.get(1448).getLastName());
	}

	@Test
	@DisplayName("Record 1449: Company is Prentice Hall Information Svc")
	void CompanyOfRecord1449() {
		assertEquals("Prentice Hall Information Svc", customers.get(1448).getCompany());
	}

	@Test
	@DisplayName("Record 1449: Address is 11835 Queens Blvd")
	void AddressOfRecord1449() {
		assertEquals("11835 Queens Blvd", customers.get(1448).getAddress());
	}

	@Test
	@DisplayName("Record 1449: City is Forest Hills")
	void CityOfRecord1449() {
		assertEquals("Forest Hills", customers.get(1448).getCity());
	}

	@Test
	@DisplayName("Record 1449: County is Queens")
	void CountyOfRecord1449() {
		assertEquals("Queens", customers.get(1448).getCounty());
	}

	@Test
	@DisplayName("Record 1449: State is NY")
	void StateOfRecord1449() {
		assertEquals("NY", customers.get(1448).getState());
	}

	@Test
	@DisplayName("Record 1449: ZIP is 11375")
	void ZIPOfRecord1449() {
		assertEquals("11375", customers.get(1448).getZIP());
	}

	@Test
	@DisplayName("Record 1449: Phone is 718-793-7820")
	void PhoneOfRecord1449() {
		assertEquals("718-793-7820", customers.get(1448).getPhone());
	}

	@Test
	@DisplayName("Record 1449: Fax is 718-793-2187")
	void FaxOfRecord1449() {
		assertEquals("718-793-2187", customers.get(1448).getFax());
	}

	@Test
	@DisplayName("Record 1449: Email is tim@lalonde.com")
	void EmailOfRecord1449() {
		assertEquals("tim@lalonde.com", customers.get(1448).getEmail());
	}

	@Test
	@DisplayName("Record 1449: Web is http://www.timlalonde.com")
	void WebOfRecord1449() {
		assertEquals("http://www.timlalonde.com", customers.get(1448).getWeb());
	}
}
