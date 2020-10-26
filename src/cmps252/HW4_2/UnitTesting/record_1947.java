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

@Tag("0")
class Record_1947 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1947: FirstName is Jacquelyn")
	void FirstNameOfRecord1947() {
		assertEquals("Jacquelyn", customers.get(1946).getFirstName());
	}

	@Test
	@DisplayName("Record 1947: LastName is Hartleben")
	void LastNameOfRecord1947() {
		assertEquals("Hartleben", customers.get(1946).getLastName());
	}

	@Test
	@DisplayName("Record 1947: Company is Pearson, Timothy G Esq")
	void CompanyOfRecord1947() {
		assertEquals("Pearson, Timothy G Esq", customers.get(1946).getCompany());
	}

	@Test
	@DisplayName("Record 1947: Address is 1175 Leggett Ave")
	void AddressOfRecord1947() {
		assertEquals("1175 Leggett Ave", customers.get(1946).getAddress());
	}

	@Test
	@DisplayName("Record 1947: City is Bronx")
	void CityOfRecord1947() {
		assertEquals("Bronx", customers.get(1946).getCity());
	}

	@Test
	@DisplayName("Record 1947: County is Bronx")
	void CountyOfRecord1947() {
		assertEquals("Bronx", customers.get(1946).getCounty());
	}

	@Test
	@DisplayName("Record 1947: State is NY")
	void StateOfRecord1947() {
		assertEquals("NY", customers.get(1946).getState());
	}

	@Test
	@DisplayName("Record 1947: ZIP is 10474")
	void ZIPOfRecord1947() {
		assertEquals("10474", customers.get(1946).getZIP());
	}

	@Test
	@DisplayName("Record 1947: Phone is 718-378-2948")
	void PhoneOfRecord1947() {
		assertEquals("718-378-2948", customers.get(1946).getPhone());
	}

	@Test
	@DisplayName("Record 1947: Fax is 718-378-0264")
	void FaxOfRecord1947() {
		assertEquals("718-378-0264", customers.get(1946).getFax());
	}

	@Test
	@DisplayName("Record 1947: Email is jacquelyn@hartleben.com")
	void EmailOfRecord1947() {
		assertEquals("jacquelyn@hartleben.com", customers.get(1946).getEmail());
	}

	@Test
	@DisplayName("Record 1947: Web is http://www.jacquelynhartleben.com")
	void WebOfRecord1947() {
		assertEquals("http://www.jacquelynhartleben.com", customers.get(1946).getWeb());
	}
}
