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

@Tag("49")
class Record_457 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 457: FirstName is Dino")
	void FirstNameOfRecord457() {
		assertEquals("Dino", customers.get(456).getFirstName());
	}

	@Test
	@DisplayName("Record 457: LastName is Rijos")
	void LastNameOfRecord457() {
		assertEquals("Rijos", customers.get(456).getLastName());
	}

	@Test
	@DisplayName("Record 457: Company is Middletown Pub Schls Pupil")
	void CompanyOfRecord457() {
		assertEquals("Middletown Pub Schls Pupil", customers.get(456).getCompany());
	}

	@Test
	@DisplayName("Record 457: Address is 35454 Mound Rd")
	void AddressOfRecord457() {
		assertEquals("35454 Mound Rd", customers.get(456).getAddress());
	}

	@Test
	@DisplayName("Record 457: City is Sterling Hyghts")
	void CityOfRecord457() {
		assertEquals("Sterling Hyghts", customers.get(456).getCity());
	}

	@Test
	@DisplayName("Record 457: County is Macomb")
	void CountyOfRecord457() {
		assertEquals("Macomb", customers.get(456).getCounty());
	}

	@Test
	@DisplayName("Record 457: State is MI")
	void StateOfRecord457() {
		assertEquals("MI", customers.get(456).getState());
	}

	@Test
	@DisplayName("Record 457: ZIP is 48310")
	void ZIPOfRecord457() {
		assertEquals("48310", customers.get(456).getZIP());
	}

	@Test
	@DisplayName("Record 457: Phone is 586-264-0715")
	void PhoneOfRecord457() {
		assertEquals("586-264-0715", customers.get(456).getPhone());
	}

	@Test
	@DisplayName("Record 457: Fax is 586-264-8724")
	void FaxOfRecord457() {
		assertEquals("586-264-8724", customers.get(456).getFax());
	}

	@Test
	@DisplayName("Record 457: Email is dino@rijos.com")
	void EmailOfRecord457() {
		assertEquals("dino@rijos.com", customers.get(456).getEmail());
	}

	@Test
	@DisplayName("Record 457: Web is http://www.dinorijos.com")
	void WebOfRecord457() {
		assertEquals("http://www.dinorijos.com", customers.get(456).getWeb());
	}
}
