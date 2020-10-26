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

@Tag("37")
class Record_3061 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3061: FirstName is Jospeh")
	void FirstNameOfRecord3061() {
		assertEquals("Jospeh", customers.get(3060).getFirstName());
	}

	@Test
	@DisplayName("Record 3061: LastName is Selem")
	void LastNameOfRecord3061() {
		assertEquals("Selem", customers.get(3060).getLastName());
	}

	@Test
	@DisplayName("Record 3061: Company is Vogl, Frank E Esq")
	void CompanyOfRecord3061() {
		assertEquals("Vogl, Frank E Esq", customers.get(3060).getCompany());
	}

	@Test
	@DisplayName("Record 3061: Address is 1407 W Washington Blvd")
	void AddressOfRecord3061() {
		assertEquals("1407 W Washington Blvd", customers.get(3060).getAddress());
	}

	@Test
	@DisplayName("Record 3061: City is Chicago")
	void CityOfRecord3061() {
		assertEquals("Chicago", customers.get(3060).getCity());
	}

	@Test
	@DisplayName("Record 3061: County is Cook")
	void CountyOfRecord3061() {
		assertEquals("Cook", customers.get(3060).getCounty());
	}

	@Test
	@DisplayName("Record 3061: State is IL")
	void StateOfRecord3061() {
		assertEquals("IL", customers.get(3060).getState());
	}

	@Test
	@DisplayName("Record 3061: ZIP is 60607")
	void ZIPOfRecord3061() {
		assertEquals("60607", customers.get(3060).getZIP());
	}

	@Test
	@DisplayName("Record 3061: Phone is 312-738-2479")
	void PhoneOfRecord3061() {
		assertEquals("312-738-2479", customers.get(3060).getPhone());
	}

	@Test
	@DisplayName("Record 3061: Fax is 312-738-8543")
	void FaxOfRecord3061() {
		assertEquals("312-738-8543", customers.get(3060).getFax());
	}

	@Test
	@DisplayName("Record 3061: Email is jospeh@selem.com")
	void EmailOfRecord3061() {
		assertEquals("jospeh@selem.com", customers.get(3060).getEmail());
	}

	@Test
	@DisplayName("Record 3061: Web is http://www.jospehselem.com")
	void WebOfRecord3061() {
		assertEquals("http://www.jospehselem.com", customers.get(3060).getWeb());
	}
}
