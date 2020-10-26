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

@Tag("1")
class Record_1113 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1113: FirstName is Lori")
	void FirstNameOfRecord1113() {
		assertEquals("Lori", customers.get(1112).getFirstName());
	}

	@Test
	@DisplayName("Record 1113: LastName is Langelier")
	void LastNameOfRecord1113() {
		assertEquals("Langelier", customers.get(1112).getLastName());
	}

	@Test
	@DisplayName("Record 1113: Company is Camelot Of Staten Island Inc")
	void CompanyOfRecord1113() {
		assertEquals("Camelot Of Staten Island Inc", customers.get(1112).getCompany());
	}

	@Test
	@DisplayName("Record 1113: Address is 1130 20th Pl")
	void AddressOfRecord1113() {
		assertEquals("1130 20th Pl", customers.get(1112).getAddress());
	}

	@Test
	@DisplayName("Record 1113: City is Vero Beach")
	void CityOfRecord1113() {
		assertEquals("Vero Beach", customers.get(1112).getCity());
	}

	@Test
	@DisplayName("Record 1113: County is Indian River")
	void CountyOfRecord1113() {
		assertEquals("Indian River", customers.get(1112).getCounty());
	}

	@Test
	@DisplayName("Record 1113: State is FL")
	void StateOfRecord1113() {
		assertEquals("FL", customers.get(1112).getState());
	}

	@Test
	@DisplayName("Record 1113: ZIP is 32960")
	void ZIPOfRecord1113() {
		assertEquals("32960", customers.get(1112).getZIP());
	}

	@Test
	@DisplayName("Record 1113: Phone is 772-562-3510")
	void PhoneOfRecord1113() {
		assertEquals("772-562-3510", customers.get(1112).getPhone());
	}

	@Test
	@DisplayName("Record 1113: Fax is 772-562-2542")
	void FaxOfRecord1113() {
		assertEquals("772-562-2542", customers.get(1112).getFax());
	}

	@Test
	@DisplayName("Record 1113: Email is lori@langelier.com")
	void EmailOfRecord1113() {
		assertEquals("lori@langelier.com", customers.get(1112).getEmail());
	}

	@Test
	@DisplayName("Record 1113: Web is http://www.lorilangelier.com")
	void WebOfRecord1113() {
		assertEquals("http://www.lorilangelier.com", customers.get(1112).getWeb());
	}
}
