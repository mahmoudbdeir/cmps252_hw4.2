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

@Tag("13")
class Record_29 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 29: FirstName is Benito")
	void FirstNameOfRecord29() {
		assertEquals("Benito", customers.get(28).getFirstName());
	}

	@Test
	@DisplayName("Record 29: LastName is Eleam")
	void LastNameOfRecord29() {
		assertEquals("Eleam", customers.get(28).getLastName());
	}

	@Test
	@DisplayName("Record 29: Company is First Federal Savings Bank The")
	void CompanyOfRecord29() {
		assertEquals("First Federal Savings Bank The", customers.get(28).getCompany());
	}

	@Test
	@DisplayName("Record 29: Address is 1110 Batavia Farm Rd")
	void AddressOfRecord29() {
		assertEquals("1110 Batavia Farm Rd", customers.get(28).getAddress());
	}

	@Test
	@DisplayName("Record 29: City is Rosedale")
	void CityOfRecord29() {
		assertEquals("Rosedale", customers.get(28).getCity());
	}

	@Test
	@DisplayName("Record 29: County is Baltimore")
	void CountyOfRecord29() {
		assertEquals("Baltimore", customers.get(28).getCounty());
	}

	@Test
	@DisplayName("Record 29: State is MD")
	void StateOfRecord29() {
		assertEquals("MD", customers.get(28).getState());
	}

	@Test
	@DisplayName("Record 29: ZIP is 21237")
	void ZIPOfRecord29() {
		assertEquals("21237", customers.get(28).getZIP());
	}

	@Test
	@DisplayName("Record 29: Phone is 410-687-1070")
	void PhoneOfRecord29() {
		assertEquals("410-687-1070", customers.get(28).getPhone());
	}

	@Test
	@DisplayName("Record 29: Fax is 410-687-0123")
	void FaxOfRecord29() {
		assertEquals("410-687-0123", customers.get(28).getFax());
	}

	@Test
	@DisplayName("Record 29: Email is benito@eleam.com")
	void EmailOfRecord29() {
		assertEquals("benito@eleam.com", customers.get(28).getEmail());
	}

	@Test
	@DisplayName("Record 29: Web is http://www.benitoeleam.com")
	void WebOfRecord29() {
		assertEquals("http://www.benitoeleam.com", customers.get(28).getWeb());
	}
}
