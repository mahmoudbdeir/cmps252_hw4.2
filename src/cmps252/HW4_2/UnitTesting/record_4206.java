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

@Tag("2")
class Record_4206 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4206: FirstName is Alvaro")
	void FirstNameOfRecord4206() {
		assertEquals("Alvaro", customers.get(4205).getFirstName());
	}

	@Test
	@DisplayName("Record 4206: LastName is Derkas")
	void LastNameOfRecord4206() {
		assertEquals("Derkas", customers.get(4205).getLastName());
	}

	@Test
	@DisplayName("Record 4206: Company is Diana Henjum Reporting Svc Pc")
	void CompanyOfRecord4206() {
		assertEquals("Diana Henjum Reporting Svc Pc", customers.get(4205).getCompany());
	}

	@Test
	@DisplayName("Record 4206: Address is 2108 Bering Dr")
	void AddressOfRecord4206() {
		assertEquals("2108 Bering Dr", customers.get(4205).getAddress());
	}

	@Test
	@DisplayName("Record 4206: City is San Jose")
	void CityOfRecord4206() {
		assertEquals("San Jose", customers.get(4205).getCity());
	}

	@Test
	@DisplayName("Record 4206: County is Santa Clara")
	void CountyOfRecord4206() {
		assertEquals("Santa Clara", customers.get(4205).getCounty());
	}

	@Test
	@DisplayName("Record 4206: State is CA")
	void StateOfRecord4206() {
		assertEquals("CA", customers.get(4205).getState());
	}

	@Test
	@DisplayName("Record 4206: ZIP is 95131")
	void ZIPOfRecord4206() {
		assertEquals("95131", customers.get(4205).getZIP());
	}

	@Test
	@DisplayName("Record 4206: Phone is 408-436-2486")
	void PhoneOfRecord4206() {
		assertEquals("408-436-2486", customers.get(4205).getPhone());
	}

	@Test
	@DisplayName("Record 4206: Fax is 408-436-1834")
	void FaxOfRecord4206() {
		assertEquals("408-436-1834", customers.get(4205).getFax());
	}

	@Test
	@DisplayName("Record 4206: Email is alvaro@derkas.com")
	void EmailOfRecord4206() {
		assertEquals("alvaro@derkas.com", customers.get(4205).getEmail());
	}

	@Test
	@DisplayName("Record 4206: Web is http://www.alvaroderkas.com")
	void WebOfRecord4206() {
		assertEquals("http://www.alvaroderkas.com", customers.get(4205).getWeb());
	}
}
