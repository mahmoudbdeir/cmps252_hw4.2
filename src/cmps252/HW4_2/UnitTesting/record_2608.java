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

@Tag("19")
class Record_2608 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2608: FirstName is Herb")
	void FirstNameOfRecord2608() {
		assertEquals("Herb", customers.get(2607).getFirstName());
	}

	@Test
	@DisplayName("Record 2608: LastName is Boutiette")
	void LastNameOfRecord2608() {
		assertEquals("Boutiette", customers.get(2607).getLastName());
	}

	@Test
	@DisplayName("Record 2608: Company is Bargiel, Charles S Esq")
	void CompanyOfRecord2608() {
		assertEquals("Bargiel, Charles S Esq", customers.get(2607).getCompany());
	}

	@Test
	@DisplayName("Record 2608: Address is 106 Hoyt Ave")
	void AddressOfRecord2608() {
		assertEquals("106 Hoyt Ave", customers.get(2607).getAddress());
	}

	@Test
	@DisplayName("Record 2608: City is Saginaw")
	void CityOfRecord2608() {
		assertEquals("Saginaw", customers.get(2607).getCity());
	}

	@Test
	@DisplayName("Record 2608: County is Saginaw")
	void CountyOfRecord2608() {
		assertEquals("Saginaw", customers.get(2607).getCounty());
	}

	@Test
	@DisplayName("Record 2608: State is MI")
	void StateOfRecord2608() {
		assertEquals("MI", customers.get(2607).getState());
	}

	@Test
	@DisplayName("Record 2608: ZIP is 48607")
	void ZIPOfRecord2608() {
		assertEquals("48607", customers.get(2607).getZIP());
	}

	@Test
	@DisplayName("Record 2608: Phone is 989-754-5403")
	void PhoneOfRecord2608() {
		assertEquals("989-754-5403", customers.get(2607).getPhone());
	}

	@Test
	@DisplayName("Record 2608: Fax is 989-754-9993")
	void FaxOfRecord2608() {
		assertEquals("989-754-9993", customers.get(2607).getFax());
	}

	@Test
	@DisplayName("Record 2608: Email is herb@boutiette.com")
	void EmailOfRecord2608() {
		assertEquals("herb@boutiette.com", customers.get(2607).getEmail());
	}

	@Test
	@DisplayName("Record 2608: Web is http://www.herbboutiette.com")
	void WebOfRecord2608() {
		assertEquals("http://www.herbboutiette.com", customers.get(2607).getWeb());
	}
}
