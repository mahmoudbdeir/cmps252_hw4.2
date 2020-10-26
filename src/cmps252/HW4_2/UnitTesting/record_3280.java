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

@Tag("26")
class Record_3280 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3280: FirstName is Hortencia")
	void FirstNameOfRecord3280() {
		assertEquals("Hortencia", customers.get(3279).getFirstName());
	}

	@Test
	@DisplayName("Record 3280: LastName is Tavera")
	void LastNameOfRecord3280() {
		assertEquals("Tavera", customers.get(3279).getLastName());
	}

	@Test
	@DisplayName("Record 3280: Company is Cousins, R B Esq")
	void CompanyOfRecord3280() {
		assertEquals("Cousins, R B Esq", customers.get(3279).getCompany());
	}

	@Test
	@DisplayName("Record 3280: Address is 230 5th Ave")
	void AddressOfRecord3280() {
		assertEquals("230 5th Ave", customers.get(3279).getAddress());
	}

	@Test
	@DisplayName("Record 3280: City is New York")
	void CityOfRecord3280() {
		assertEquals("New York", customers.get(3279).getCity());
	}

	@Test
	@DisplayName("Record 3280: County is New York")
	void CountyOfRecord3280() {
		assertEquals("New York", customers.get(3279).getCounty());
	}

	@Test
	@DisplayName("Record 3280: State is NY")
	void StateOfRecord3280() {
		assertEquals("NY", customers.get(3279).getState());
	}

	@Test
	@DisplayName("Record 3280: ZIP is 10001")
	void ZIPOfRecord3280() {
		assertEquals("10001", customers.get(3279).getZIP());
	}

	@Test
	@DisplayName("Record 3280: Phone is 212-969-4439")
	void PhoneOfRecord3280() {
		assertEquals("212-969-4439", customers.get(3279).getPhone());
	}

	@Test
	@DisplayName("Record 3280: Fax is 212-969-2214")
	void FaxOfRecord3280() {
		assertEquals("212-969-2214", customers.get(3279).getFax());
	}

	@Test
	@DisplayName("Record 3280: Email is hortencia@tavera.com")
	void EmailOfRecord3280() {
		assertEquals("hortencia@tavera.com", customers.get(3279).getEmail());
	}

	@Test
	@DisplayName("Record 3280: Web is http://www.hortenciatavera.com")
	void WebOfRecord3280() {
		assertEquals("http://www.hortenciatavera.com", customers.get(3279).getWeb());
	}
}
