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

@Tag("10")
class Record_3973 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3973: FirstName is Sonny")
	void FirstNameOfRecord3973() {
		assertEquals("Sonny", customers.get(3972).getFirstName());
	}

	@Test
	@DisplayName("Record 3973: LastName is Gabriele")
	void LastNameOfRecord3973() {
		assertEquals("Gabriele", customers.get(3972).getLastName());
	}

	@Test
	@DisplayName("Record 3973: Company is Fleet, Bart H Esq")
	void CompanyOfRecord3973() {
		assertEquals("Fleet, Bart H Esq", customers.get(3972).getCompany());
	}

	@Test
	@DisplayName("Record 3973: Address is 7410 Bustleton Ave")
	void AddressOfRecord3973() {
		assertEquals("7410 Bustleton Ave", customers.get(3972).getAddress());
	}

	@Test
	@DisplayName("Record 3973: City is Philadelphia")
	void CityOfRecord3973() {
		assertEquals("Philadelphia", customers.get(3972).getCity());
	}

	@Test
	@DisplayName("Record 3973: County is Philadelphia")
	void CountyOfRecord3973() {
		assertEquals("Philadelphia", customers.get(3972).getCounty());
	}

	@Test
	@DisplayName("Record 3973: State is PA")
	void StateOfRecord3973() {
		assertEquals("PA", customers.get(3972).getState());
	}

	@Test
	@DisplayName("Record 3973: ZIP is 19152")
	void ZIPOfRecord3973() {
		assertEquals("19152", customers.get(3972).getZIP());
	}

	@Test
	@DisplayName("Record 3973: Phone is 215-742-6353")
	void PhoneOfRecord3973() {
		assertEquals("215-742-6353", customers.get(3972).getPhone());
	}

	@Test
	@DisplayName("Record 3973: Fax is 215-742-3795")
	void FaxOfRecord3973() {
		assertEquals("215-742-3795", customers.get(3972).getFax());
	}

	@Test
	@DisplayName("Record 3973: Email is sonny@gabriele.com")
	void EmailOfRecord3973() {
		assertEquals("sonny@gabriele.com", customers.get(3972).getEmail());
	}

	@Test
	@DisplayName("Record 3973: Web is http://www.sonnygabriele.com")
	void WebOfRecord3973() {
		assertEquals("http://www.sonnygabriele.com", customers.get(3972).getWeb());
	}
}
