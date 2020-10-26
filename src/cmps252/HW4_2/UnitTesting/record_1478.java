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

@Tag("42")
class Record_1478 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1478: FirstName is Mary")
	void FirstNameOfRecord1478() {
		assertEquals("Mary", customers.get(1477).getFirstName());
	}

	@Test
	@DisplayName("Record 1478: LastName is Polintan")
	void LastNameOfRecord1478() {
		assertEquals("Polintan", customers.get(1477).getLastName());
	}

	@Test
	@DisplayName("Record 1478: Company is Portage Casting & Mold Inc")
	void CompanyOfRecord1478() {
		assertEquals("Portage Casting & Mold Inc", customers.get(1477).getCompany());
	}

	@Test
	@DisplayName("Record 1478: Address is 12 Cleveland Pl")
	void AddressOfRecord1478() {
		assertEquals("12 Cleveland Pl", customers.get(1477).getAddress());
	}

	@Test
	@DisplayName("Record 1478: City is Gloucester")
	void CityOfRecord1478() {
		assertEquals("Gloucester", customers.get(1477).getCity());
	}

	@Test
	@DisplayName("Record 1478: County is Essex")
	void CountyOfRecord1478() {
		assertEquals("Essex", customers.get(1477).getCounty());
	}

	@Test
	@DisplayName("Record 1478: State is MA")
	void StateOfRecord1478() {
		assertEquals("MA", customers.get(1477).getState());
	}

	@Test
	@DisplayName("Record 1478: ZIP is 1930")
	void ZIPOfRecord1478() {
		assertEquals("1930", customers.get(1477).getZIP());
	}

	@Test
	@DisplayName("Record 1478: Phone is 978-281-4265")
	void PhoneOfRecord1478() {
		assertEquals("978-281-4265", customers.get(1477).getPhone());
	}

	@Test
	@DisplayName("Record 1478: Fax is 978-281-3083")
	void FaxOfRecord1478() {
		assertEquals("978-281-3083", customers.get(1477).getFax());
	}

	@Test
	@DisplayName("Record 1478: Email is mary@polintan.com")
	void EmailOfRecord1478() {
		assertEquals("mary@polintan.com", customers.get(1477).getEmail());
	}

	@Test
	@DisplayName("Record 1478: Web is http://www.marypolintan.com")
	void WebOfRecord1478() {
		assertEquals("http://www.marypolintan.com", customers.get(1477).getWeb());
	}
}
