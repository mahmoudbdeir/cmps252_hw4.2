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

@Tag("36")
class Record_265 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 265: FirstName is Trenton")
	void FirstNameOfRecord265() {
		assertEquals("Trenton", customers.get(264).getFirstName());
	}

	@Test
	@DisplayName("Record 265: LastName is Ranildi")
	void LastNameOfRecord265() {
		assertEquals("Ranildi", customers.get(264).getLastName());
	}

	@Test
	@DisplayName("Record 265: Company is Kurzrock, Laurene B Esq")
	void CompanyOfRecord265() {
		assertEquals("Kurzrock, Laurene B Esq", customers.get(264).getCompany());
	}

	@Test
	@DisplayName("Record 265: Address is 15134 Downey Ave")
	void AddressOfRecord265() {
		assertEquals("15134 Downey Ave", customers.get(264).getAddress());
	}

	@Test
	@DisplayName("Record 265: City is Paramount")
	void CityOfRecord265() {
		assertEquals("Paramount", customers.get(264).getCity());
	}

	@Test
	@DisplayName("Record 265: County is Los Angeles")
	void CountyOfRecord265() {
		assertEquals("Los Angeles", customers.get(264).getCounty());
	}

	@Test
	@DisplayName("Record 265: State is CA")
	void StateOfRecord265() {
		assertEquals("CA", customers.get(264).getState());
	}

	@Test
	@DisplayName("Record 265: ZIP is 90723")
	void ZIPOfRecord265() {
		assertEquals("90723", customers.get(264).getZIP());
	}

	@Test
	@DisplayName("Record 265: Phone is 562-531-5807")
	void PhoneOfRecord265() {
		assertEquals("562-531-5807", customers.get(264).getPhone());
	}

	@Test
	@DisplayName("Record 265: Fax is 562-531-4626")
	void FaxOfRecord265() {
		assertEquals("562-531-4626", customers.get(264).getFax());
	}

	@Test
	@DisplayName("Record 265: Email is trenton@ranildi.com")
	void EmailOfRecord265() {
		assertEquals("trenton@ranildi.com", customers.get(264).getEmail());
	}

	@Test
	@DisplayName("Record 265: Web is http://www.trentonranildi.com")
	void WebOfRecord265() {
		assertEquals("http://www.trentonranildi.com", customers.get(264).getWeb());
	}
}
