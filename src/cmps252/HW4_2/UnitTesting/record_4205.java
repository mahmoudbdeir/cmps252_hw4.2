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

@Tag("11")
class Record_4205 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4205: FirstName is Joe")
	void FirstNameOfRecord4205() {
		assertEquals("Joe", customers.get(4204).getFirstName());
	}

	@Test
	@DisplayName("Record 4205: LastName is Kockler")
	void LastNameOfRecord4205() {
		assertEquals("Kockler", customers.get(4204).getLastName());
	}

	@Test
	@DisplayName("Record 4205: Company is Chiapetta, Vanessa Md")
	void CompanyOfRecord4205() {
		assertEquals("Chiapetta, Vanessa Md", customers.get(4204).getCompany());
	}

	@Test
	@DisplayName("Record 4205: Address is Chestnut Stst")
	void AddressOfRecord4205() {
		assertEquals("Chestnut Stst", customers.get(4204).getAddress());
	}

	@Test
	@DisplayName("Record 4205: City is Philadelphia")
	void CityOfRecord4205() {
		assertEquals("Philadelphia", customers.get(4204).getCity());
	}

	@Test
	@DisplayName("Record 4205: County is Philadelphia")
	void CountyOfRecord4205() {
		assertEquals("Philadelphia", customers.get(4204).getCounty());
	}

	@Test
	@DisplayName("Record 4205: State is PA")
	void StateOfRecord4205() {
		assertEquals("PA", customers.get(4204).getState());
	}

	@Test
	@DisplayName("Record 4205: ZIP is 19115")
	void ZIPOfRecord4205() {
		assertEquals("19115", customers.get(4204).getZIP());
	}

	@Test
	@DisplayName("Record 4205: Phone is 215-922-3551")
	void PhoneOfRecord4205() {
		assertEquals("215-922-3551", customers.get(4204).getPhone());
	}

	@Test
	@DisplayName("Record 4205: Fax is 215-922-3904")
	void FaxOfRecord4205() {
		assertEquals("215-922-3904", customers.get(4204).getFax());
	}

	@Test
	@DisplayName("Record 4205: Email is joe@kockler.com")
	void EmailOfRecord4205() {
		assertEquals("joe@kockler.com", customers.get(4204).getEmail());
	}

	@Test
	@DisplayName("Record 4205: Web is http://www.joekockler.com")
	void WebOfRecord4205() {
		assertEquals("http://www.joekockler.com", customers.get(4204).getWeb());
	}
}
