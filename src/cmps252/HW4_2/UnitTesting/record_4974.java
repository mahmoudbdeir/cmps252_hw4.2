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

@Tag("23")
class Record_4974 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4974: FirstName is Ervin")
	void FirstNameOfRecord4974() {
		assertEquals("Ervin", customers.get(4973).getFirstName());
	}

	@Test
	@DisplayName("Record 4974: LastName is Suben")
	void LastNameOfRecord4974() {
		assertEquals("Suben", customers.get(4973).getLastName());
	}

	@Test
	@DisplayName("Record 4974: Company is Sidney Daily News")
	void CompanyOfRecord4974() {
		assertEquals("Sidney Daily News", customers.get(4973).getCompany());
	}

	@Test
	@DisplayName("Record 4974: Address is 8744 Frederick St")
	void AddressOfRecord4974() {
		assertEquals("8744 Frederick St", customers.get(4973).getAddress());
	}

	@Test
	@DisplayName("Record 4974: City is Omaha")
	void CityOfRecord4974() {
		assertEquals("Omaha", customers.get(4973).getCity());
	}

	@Test
	@DisplayName("Record 4974: County is Douglas")
	void CountyOfRecord4974() {
		assertEquals("Douglas", customers.get(4973).getCounty());
	}

	@Test
	@DisplayName("Record 4974: State is NE")
	void StateOfRecord4974() {
		assertEquals("NE", customers.get(4973).getState());
	}

	@Test
	@DisplayName("Record 4974: ZIP is 68124")
	void ZIPOfRecord4974() {
		assertEquals("68124", customers.get(4973).getZIP());
	}

	@Test
	@DisplayName("Record 4974: Phone is 402-397-1853")
	void PhoneOfRecord4974() {
		assertEquals("402-397-1853", customers.get(4973).getPhone());
	}

	@Test
	@DisplayName("Record 4974: Fax is 402-397-2493")
	void FaxOfRecord4974() {
		assertEquals("402-397-2493", customers.get(4973).getFax());
	}

	@Test
	@DisplayName("Record 4974: Email is ervin@suben.com")
	void EmailOfRecord4974() {
		assertEquals("ervin@suben.com", customers.get(4973).getEmail());
	}

	@Test
	@DisplayName("Record 4974: Web is http://www.ervinsuben.com")
	void WebOfRecord4974() {
		assertEquals("http://www.ervinsuben.com", customers.get(4973).getWeb());
	}
}
