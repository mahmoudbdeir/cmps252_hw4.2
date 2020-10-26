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
class Record_592 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 592: FirstName is Eliseo")
	void FirstNameOfRecord592() {
		assertEquals("Eliseo", customers.get(591).getFirstName());
	}

	@Test
	@DisplayName("Record 592: LastName is Housner")
	void LastNameOfRecord592() {
		assertEquals("Housner", customers.get(591).getLastName());
	}

	@Test
	@DisplayName("Record 592: Company is Arnett & Foster")
	void CompanyOfRecord592() {
		assertEquals("Arnett & Foster", customers.get(591).getCompany());
	}

	@Test
	@DisplayName("Record 592: Address is 278 Secaucus Rd")
	void AddressOfRecord592() {
		assertEquals("278 Secaucus Rd", customers.get(591).getAddress());
	}

	@Test
	@DisplayName("Record 592: City is Secaucus")
	void CityOfRecord592() {
		assertEquals("Secaucus", customers.get(591).getCity());
	}

	@Test
	@DisplayName("Record 592: County is Hudson")
	void CountyOfRecord592() {
		assertEquals("Hudson", customers.get(591).getCounty());
	}

	@Test
	@DisplayName("Record 592: State is NJ")
	void StateOfRecord592() {
		assertEquals("NJ", customers.get(591).getState());
	}

	@Test
	@DisplayName("Record 592: ZIP is 7094")
	void ZIPOfRecord592() {
		assertEquals("7094", customers.get(591).getZIP());
	}

	@Test
	@DisplayName("Record 592: Phone is 201-863-5649")
	void PhoneOfRecord592() {
		assertEquals("201-863-5649", customers.get(591).getPhone());
	}

	@Test
	@DisplayName("Record 592: Fax is 201-863-5672")
	void FaxOfRecord592() {
		assertEquals("201-863-5672", customers.get(591).getFax());
	}

	@Test
	@DisplayName("Record 592: Email is eliseo@housner.com")
	void EmailOfRecord592() {
		assertEquals("eliseo@housner.com", customers.get(591).getEmail());
	}

	@Test
	@DisplayName("Record 592: Web is http://www.eliseohousner.com")
	void WebOfRecord592() {
		assertEquals("http://www.eliseohousner.com", customers.get(591).getWeb());
	}
}
