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

@Tag("47")
class Record_2033 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2033: FirstName is Mohammed")
	void FirstNameOfRecord2033() {
		assertEquals("Mohammed", customers.get(2032).getFirstName());
	}

	@Test
	@DisplayName("Record 2033: LastName is Baires")
	void LastNameOfRecord2033() {
		assertEquals("Baires", customers.get(2032).getLastName());
	}

	@Test
	@DisplayName("Record 2033: Company is Cogley, John F Esq")
	void CompanyOfRecord2033() {
		assertEquals("Cogley, John F Esq", customers.get(2032).getCompany());
	}

	@Test
	@DisplayName("Record 2033: Address is 252 S Imperial Ave")
	void AddressOfRecord2033() {
		assertEquals("252 S Imperial Ave", customers.get(2032).getAddress());
	}

	@Test
	@DisplayName("Record 2033: City is El Centro")
	void CityOfRecord2033() {
		assertEquals("El Centro", customers.get(2032).getCity());
	}

	@Test
	@DisplayName("Record 2033: County is Imperial")
	void CountyOfRecord2033() {
		assertEquals("Imperial", customers.get(2032).getCounty());
	}

	@Test
	@DisplayName("Record 2033: State is CA")
	void StateOfRecord2033() {
		assertEquals("CA", customers.get(2032).getState());
	}

	@Test
	@DisplayName("Record 2033: ZIP is 92243")
	void ZIPOfRecord2033() {
		assertEquals("92243", customers.get(2032).getZIP());
	}

	@Test
	@DisplayName("Record 2033: Phone is 760-352-7552")
	void PhoneOfRecord2033() {
		assertEquals("760-352-7552", customers.get(2032).getPhone());
	}

	@Test
	@DisplayName("Record 2033: Fax is 760-352-9319")
	void FaxOfRecord2033() {
		assertEquals("760-352-9319", customers.get(2032).getFax());
	}

	@Test
	@DisplayName("Record 2033: Email is mohammed@baires.com")
	void EmailOfRecord2033() {
		assertEquals("mohammed@baires.com", customers.get(2032).getEmail());
	}

	@Test
	@DisplayName("Record 2033: Web is http://www.mohammedbaires.com")
	void WebOfRecord2033() {
		assertEquals("http://www.mohammedbaires.com", customers.get(2032).getWeb());
	}
}
