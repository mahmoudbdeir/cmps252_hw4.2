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
class Record_976 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 976: FirstName is Wilber")
	void FirstNameOfRecord976() {
		assertEquals("Wilber", customers.get(975).getFirstName());
	}

	@Test
	@DisplayName("Record 976: LastName is Mikkola")
	void LastNameOfRecord976() {
		assertEquals("Mikkola", customers.get(975).getLastName());
	}

	@Test
	@DisplayName("Record 976: Company is Segota, Dennis Esq")
	void CompanyOfRecord976() {
		assertEquals("Segota, Dennis Esq", customers.get(975).getCompany());
	}

	@Test
	@DisplayName("Record 976: Address is 612 Creek Rd")
	void AddressOfRecord976() {
		assertEquals("612 Creek Rd", customers.get(975).getAddress());
	}

	@Test
	@DisplayName("Record 976: City is Bellmawr")
	void CityOfRecord976() {
		assertEquals("Bellmawr", customers.get(975).getCity());
	}

	@Test
	@DisplayName("Record 976: County is Camden")
	void CountyOfRecord976() {
		assertEquals("Camden", customers.get(975).getCounty());
	}

	@Test
	@DisplayName("Record 976: State is NJ")
	void StateOfRecord976() {
		assertEquals("NJ", customers.get(975).getState());
	}

	@Test
	@DisplayName("Record 976: ZIP is 8031")
	void ZIPOfRecord976() {
		assertEquals("8031", customers.get(975).getZIP());
	}

	@Test
	@DisplayName("Record 976: Phone is 856-931-8973")
	void PhoneOfRecord976() {
		assertEquals("856-931-8973", customers.get(975).getPhone());
	}

	@Test
	@DisplayName("Record 976: Fax is 856-931-7558")
	void FaxOfRecord976() {
		assertEquals("856-931-7558", customers.get(975).getFax());
	}

	@Test
	@DisplayName("Record 976: Email is wilber@mikkola.com")
	void EmailOfRecord976() {
		assertEquals("wilber@mikkola.com", customers.get(975).getEmail());
	}

	@Test
	@DisplayName("Record 976: Web is http://www.wilbermikkola.com")
	void WebOfRecord976() {
		assertEquals("http://www.wilbermikkola.com", customers.get(975).getWeb());
	}
}
