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

@Tag("20")
class Record_355 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 355: FirstName is Santo")
	void FirstNameOfRecord355() {
		assertEquals("Santo", customers.get(354).getFirstName());
	}

	@Test
	@DisplayName("Record 355: LastName is Fickas")
	void LastNameOfRecord355() {
		assertEquals("Fickas", customers.get(354).getLastName());
	}

	@Test
	@DisplayName("Record 355: Company is Plastic Suppliers Inc")
	void CompanyOfRecord355() {
		assertEquals("Plastic Suppliers Inc", customers.get(354).getCompany());
	}

	@Test
	@DisplayName("Record 355: Address is 7108 I Hwy 10")
	void AddressOfRecord355() {
		assertEquals("7108 I Hwy 10", customers.get(354).getAddress());
	}

	@Test
	@DisplayName("Record 355: City is Baytown")
	void CityOfRecord355() {
		assertEquals("Baytown", customers.get(354).getCity());
	}

	@Test
	@DisplayName("Record 355: County is Harris")
	void CountyOfRecord355() {
		assertEquals("Harris", customers.get(354).getCounty());
	}

	@Test
	@DisplayName("Record 355: State is TX")
	void StateOfRecord355() {
		assertEquals("TX", customers.get(354).getState());
	}

	@Test
	@DisplayName("Record 355: ZIP is 77521")
	void ZIPOfRecord355() {
		assertEquals("77521", customers.get(354).getZIP());
	}

	@Test
	@DisplayName("Record 355: Phone is 281-421-3860")
	void PhoneOfRecord355() {
		assertEquals("281-421-3860", customers.get(354).getPhone());
	}

	@Test
	@DisplayName("Record 355: Fax is 281-421-2704")
	void FaxOfRecord355() {
		assertEquals("281-421-2704", customers.get(354).getFax());
	}

	@Test
	@DisplayName("Record 355: Email is santo@fickas.com")
	void EmailOfRecord355() {
		assertEquals("santo@fickas.com", customers.get(354).getEmail());
	}

	@Test
	@DisplayName("Record 355: Web is http://www.santofickas.com")
	void WebOfRecord355() {
		assertEquals("http://www.santofickas.com", customers.get(354).getWeb());
	}
}
