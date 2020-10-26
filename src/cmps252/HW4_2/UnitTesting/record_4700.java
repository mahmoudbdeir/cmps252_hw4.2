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

@Tag("27")
class Record_4700 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4700: FirstName is Sophia")
	void FirstNameOfRecord4700() {
		assertEquals("Sophia", customers.get(4699).getFirstName());
	}

	@Test
	@DisplayName("Record 4700: LastName is Defries")
	void LastNameOfRecord4700() {
		assertEquals("Defries", customers.get(4699).getLastName());
	}

	@Test
	@DisplayName("Record 4700: Company is Villa North Motors Inc")
	void CompanyOfRecord4700() {
		assertEquals("Villa North Motors Inc", customers.get(4699).getCompany());
	}

	@Test
	@DisplayName("Record 4700: Address is 390 Middle Country Rd")
	void AddressOfRecord4700() {
		assertEquals("390 Middle Country Rd", customers.get(4699).getAddress());
	}

	@Test
	@DisplayName("Record 4700: City is Middle Island")
	void CityOfRecord4700() {
		assertEquals("Middle Island", customers.get(4699).getCity());
	}

	@Test
	@DisplayName("Record 4700: County is Suffolk")
	void CountyOfRecord4700() {
		assertEquals("Suffolk", customers.get(4699).getCounty());
	}

	@Test
	@DisplayName("Record 4700: State is NY")
	void StateOfRecord4700() {
		assertEquals("NY", customers.get(4699).getState());
	}

	@Test
	@DisplayName("Record 4700: ZIP is 11953")
	void ZIPOfRecord4700() {
		assertEquals("11953", customers.get(4699).getZIP());
	}

	@Test
	@DisplayName("Record 4700: Phone is 631-924-5696")
	void PhoneOfRecord4700() {
		assertEquals("631-924-5696", customers.get(4699).getPhone());
	}

	@Test
	@DisplayName("Record 4700: Fax is 631-924-7853")
	void FaxOfRecord4700() {
		assertEquals("631-924-7853", customers.get(4699).getFax());
	}

	@Test
	@DisplayName("Record 4700: Email is sophia@defries.com")
	void EmailOfRecord4700() {
		assertEquals("sophia@defries.com", customers.get(4699).getEmail());
	}

	@Test
	@DisplayName("Record 4700: Web is http://www.sophiadefries.com")
	void WebOfRecord4700() {
		assertEquals("http://www.sophiadefries.com", customers.get(4699).getWeb());
	}
}
