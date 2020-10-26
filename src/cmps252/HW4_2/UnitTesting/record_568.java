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

@Tag("25")
class Record_568 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 568: FirstName is Karrie")
	void FirstNameOfRecord568() {
		assertEquals("Karrie", customers.get(567).getFirstName());
	}

	@Test
	@DisplayName("Record 568: LastName is Baroni")
	void LastNameOfRecord568() {
		assertEquals("Baroni", customers.get(567).getLastName());
	}

	@Test
	@DisplayName("Record 568: Company is Glovsky & Glovsky")
	void CompanyOfRecord568() {
		assertEquals("Glovsky & Glovsky", customers.get(567).getCompany());
	}

	@Test
	@DisplayName("Record 568: Address is 5025 State")
	void AddressOfRecord568() {
		assertEquals("5025 State", customers.get(567).getAddress());
	}

	@Test
	@DisplayName("Record 568: City is Montclair")
	void CityOfRecord568() {
		assertEquals("Montclair", customers.get(567).getCity());
	}

	@Test
	@DisplayName("Record 568: County is San Bernardino")
	void CountyOfRecord568() {
		assertEquals("San Bernardino", customers.get(567).getCounty());
	}

	@Test
	@DisplayName("Record 568: State is CA")
	void StateOfRecord568() {
		assertEquals("CA", customers.get(567).getState());
	}

	@Test
	@DisplayName("Record 568: ZIP is 91763")
	void ZIPOfRecord568() {
		assertEquals("91763", customers.get(567).getZIP());
	}

	@Test
	@DisplayName("Record 568: Phone is 909-591-1526")
	void PhoneOfRecord568() {
		assertEquals("909-591-1526", customers.get(567).getPhone());
	}

	@Test
	@DisplayName("Record 568: Fax is 909-591-3118")
	void FaxOfRecord568() {
		assertEquals("909-591-3118", customers.get(567).getFax());
	}

	@Test
	@DisplayName("Record 568: Email is karrie@baroni.com")
	void EmailOfRecord568() {
		assertEquals("karrie@baroni.com", customers.get(567).getEmail());
	}

	@Test
	@DisplayName("Record 568: Web is http://www.karriebaroni.com")
	void WebOfRecord568() {
		assertEquals("http://www.karriebaroni.com", customers.get(567).getWeb());
	}
}
