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

@Tag("5")
class Record_4317 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4317: FirstName is Tyler")
	void FirstNameOfRecord4317() {
		assertEquals("Tyler", customers.get(4316).getFirstName());
	}

	@Test
	@DisplayName("Record 4317: LastName is Oedekerk")
	void LastNameOfRecord4317() {
		assertEquals("Oedekerk", customers.get(4316).getLastName());
	}

	@Test
	@DisplayName("Record 4317: Company is Ostfeld, Naomi Esq")
	void CompanyOfRecord4317() {
		assertEquals("Ostfeld, Naomi Esq", customers.get(4316).getCompany());
	}

	@Test
	@DisplayName("Record 4317: Address is 3214 Nebraska Ave")
	void AddressOfRecord4317() {
		assertEquals("3214 Nebraska Ave", customers.get(4316).getAddress());
	}

	@Test
	@DisplayName("Record 4317: City is Santa Monica")
	void CityOfRecord4317() {
		assertEquals("Santa Monica", customers.get(4316).getCity());
	}

	@Test
	@DisplayName("Record 4317: County is Los Angeles")
	void CountyOfRecord4317() {
		assertEquals("Los Angeles", customers.get(4316).getCounty());
	}

	@Test
	@DisplayName("Record 4317: State is CA")
	void StateOfRecord4317() {
		assertEquals("CA", customers.get(4316).getState());
	}

	@Test
	@DisplayName("Record 4317: ZIP is 90404")
	void ZIPOfRecord4317() {
		assertEquals("90404", customers.get(4316).getZIP());
	}

	@Test
	@DisplayName("Record 4317: Phone is 310-828-2612")
	void PhoneOfRecord4317() {
		assertEquals("310-828-2612", customers.get(4316).getPhone());
	}

	@Test
	@DisplayName("Record 4317: Fax is 310-828-0975")
	void FaxOfRecord4317() {
		assertEquals("310-828-0975", customers.get(4316).getFax());
	}

	@Test
	@DisplayName("Record 4317: Email is tyler@oedekerk.com")
	void EmailOfRecord4317() {
		assertEquals("tyler@oedekerk.com", customers.get(4316).getEmail());
	}

	@Test
	@DisplayName("Record 4317: Web is http://www.tyleroedekerk.com")
	void WebOfRecord4317() {
		assertEquals("http://www.tyleroedekerk.com", customers.get(4316).getWeb());
	}
}
