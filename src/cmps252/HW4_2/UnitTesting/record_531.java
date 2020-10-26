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

@Tag("29")
class Record_531 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 531: FirstName is Nicole")
	void FirstNameOfRecord531() {
		assertEquals("Nicole", customers.get(530).getFirstName());
	}

	@Test
	@DisplayName("Record 531: LastName is Kniess")
	void LastNameOfRecord531() {
		assertEquals("Kniess", customers.get(530).getLastName());
	}

	@Test
	@DisplayName("Record 531: Company is Liberty Mutual Group")
	void CompanyOfRecord531() {
		assertEquals("Liberty Mutual Group", customers.get(530).getCompany());
	}

	@Test
	@DisplayName("Record 531: Address is 1197 Greg St")
	void AddressOfRecord531() {
		assertEquals("1197 Greg St", customers.get(530).getAddress());
	}

	@Test
	@DisplayName("Record 531: City is Sparks")
	void CityOfRecord531() {
		assertEquals("Sparks", customers.get(530).getCity());
	}

	@Test
	@DisplayName("Record 531: County is Washoe")
	void CountyOfRecord531() {
		assertEquals("Washoe", customers.get(530).getCounty());
	}

	@Test
	@DisplayName("Record 531: State is NV")
	void StateOfRecord531() {
		assertEquals("NV", customers.get(530).getState());
	}

	@Test
	@DisplayName("Record 531: ZIP is 89431")
	void ZIPOfRecord531() {
		assertEquals("89431", customers.get(530).getZIP());
	}

	@Test
	@DisplayName("Record 531: Phone is 775-358-8118")
	void PhoneOfRecord531() {
		assertEquals("775-358-8118", customers.get(530).getPhone());
	}

	@Test
	@DisplayName("Record 531: Fax is 775-358-4087")
	void FaxOfRecord531() {
		assertEquals("775-358-4087", customers.get(530).getFax());
	}

	@Test
	@DisplayName("Record 531: Email is nicole@kniess.com")
	void EmailOfRecord531() {
		assertEquals("nicole@kniess.com", customers.get(530).getEmail());
	}

	@Test
	@DisplayName("Record 531: Web is http://www.nicolekniess.com")
	void WebOfRecord531() {
		assertEquals("http://www.nicolekniess.com", customers.get(530).getWeb());
	}
}
