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
class Record_3518 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3518: FirstName is Darryl")
	void FirstNameOfRecord3518() {
		assertEquals("Darryl", customers.get(3517).getFirstName());
	}

	@Test
	@DisplayName("Record 3518: LastName is Crutchev")
	void LastNameOfRecord3518() {
		assertEquals("Crutchev", customers.get(3517).getLastName());
	}

	@Test
	@DisplayName("Record 3518: Company is Mitchell, Gregory R Esq")
	void CompanyOfRecord3518() {
		assertEquals("Mitchell, Gregory R Esq", customers.get(3517).getCompany());
	}

	@Test
	@DisplayName("Record 3518: Address is 114 Gaither Dr")
	void AddressOfRecord3518() {
		assertEquals("114 Gaither Dr", customers.get(3517).getAddress());
	}

	@Test
	@DisplayName("Record 3518: City is Mount Laurel")
	void CityOfRecord3518() {
		assertEquals("Mount Laurel", customers.get(3517).getCity());
	}

	@Test
	@DisplayName("Record 3518: County is Burlington")
	void CountyOfRecord3518() {
		assertEquals("Burlington", customers.get(3517).getCounty());
	}

	@Test
	@DisplayName("Record 3518: State is NJ")
	void StateOfRecord3518() {
		assertEquals("NJ", customers.get(3517).getState());
	}

	@Test
	@DisplayName("Record 3518: ZIP is 8054")
	void ZIPOfRecord3518() {
		assertEquals("8054", customers.get(3517).getZIP());
	}

	@Test
	@DisplayName("Record 3518: Phone is 856-727-6862")
	void PhoneOfRecord3518() {
		assertEquals("856-727-6862", customers.get(3517).getPhone());
	}

	@Test
	@DisplayName("Record 3518: Fax is 856-727-1889")
	void FaxOfRecord3518() {
		assertEquals("856-727-1889", customers.get(3517).getFax());
	}

	@Test
	@DisplayName("Record 3518: Email is darryl@crutchev.com")
	void EmailOfRecord3518() {
		assertEquals("darryl@crutchev.com", customers.get(3517).getEmail());
	}

	@Test
	@DisplayName("Record 3518: Web is http://www.darrylcrutchev.com")
	void WebOfRecord3518() {
		assertEquals("http://www.darrylcrutchev.com", customers.get(3517).getWeb());
	}
}
