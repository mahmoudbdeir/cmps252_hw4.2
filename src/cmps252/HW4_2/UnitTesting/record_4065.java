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

@Tag("44")
class Record_4065 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4065: FirstName is Leslie")
	void FirstNameOfRecord4065() {
		assertEquals("Leslie", customers.get(4064).getFirstName());
	}

	@Test
	@DisplayName("Record 4065: LastName is Copelin")
	void LastNameOfRecord4065() {
		assertEquals("Copelin", customers.get(4064).getLastName());
	}

	@Test
	@DisplayName("Record 4065: Company is Longo, Robert A Esq")
	void CompanyOfRecord4065() {
		assertEquals("Longo, Robert A Esq", customers.get(4064).getCompany());
	}

	@Test
	@DisplayName("Record 4065: Address is 25032 Anza Dr")
	void AddressOfRecord4065() {
		assertEquals("25032 Anza Dr", customers.get(4064).getAddress());
	}

	@Test
	@DisplayName("Record 4065: City is Valencia")
	void CityOfRecord4065() {
		assertEquals("Valencia", customers.get(4064).getCity());
	}

	@Test
	@DisplayName("Record 4065: County is Los Angeles")
	void CountyOfRecord4065() {
		assertEquals("Los Angeles", customers.get(4064).getCounty());
	}

	@Test
	@DisplayName("Record 4065: State is CA")
	void StateOfRecord4065() {
		assertEquals("CA", customers.get(4064).getState());
	}

	@Test
	@DisplayName("Record 4065: ZIP is 91355")
	void ZIPOfRecord4065() {
		assertEquals("91355", customers.get(4064).getZIP());
	}

	@Test
	@DisplayName("Record 4065: Phone is 661-257-0349")
	void PhoneOfRecord4065() {
		assertEquals("661-257-0349", customers.get(4064).getPhone());
	}

	@Test
	@DisplayName("Record 4065: Fax is 661-257-1069")
	void FaxOfRecord4065() {
		assertEquals("661-257-1069", customers.get(4064).getFax());
	}

	@Test
	@DisplayName("Record 4065: Email is leslie@copelin.com")
	void EmailOfRecord4065() {
		assertEquals("leslie@copelin.com", customers.get(4064).getEmail());
	}

	@Test
	@DisplayName("Record 4065: Web is http://www.lesliecopelin.com")
	void WebOfRecord4065() {
		assertEquals("http://www.lesliecopelin.com", customers.get(4064).getWeb());
	}
}
